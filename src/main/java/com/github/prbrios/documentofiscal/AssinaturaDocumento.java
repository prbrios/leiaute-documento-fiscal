package com.github.prbrios.documentofiscal;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import javax.xml.crypto.dsig.*;
import javax.xml.crypto.dsig.dom.DOMSignContext;
import javax.xml.crypto.dsig.keyinfo.KeyInfo;
import javax.xml.crypto.dsig.keyinfo.KeyInfoFactory;
import javax.xml.crypto.dsig.keyinfo.X509Data;
import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;
import javax.xml.crypto.dsig.spec.TransformParameterSpec;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableEntryException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AssinaturaDocumento {

    private String certificado;
    private String senha;

    public AssinaturaDocumento(String certificado, String senha){
        this.certificado = certificado;
        this.senha = senha;
    }

    private static final String C14N_TRANSFORM_METHOD = "http://www.w3.org/TR/2001/REC-xml-c14n-20010315";
    private static final String[] ELEMENTOS_ASSINAVEIS = new String[]{"infEvento", "infCanc", "infNFe", "infInut", "infMDFe", "infCte"};

    public String assinarDocumento(final String conteudoXml) throws Exception {
        return this.assinarDocumento(conteudoXml, AssinaturaDocumento.ELEMENTOS_ASSINAVEIS);
    }

    public String assinarDocumento(final String conteudoXml, final String... elementosAssinaveis) throws Exception {
        try (StringReader reader = new StringReader(conteudoXml)) {
            try (StringWriter writer = new StringWriter()) {
                this.assinarDocumento(reader, writer, elementosAssinaveis);
                return writer.toString();
            }
        }
    }

    public void assinarDocumento(Reader xmlReader, Writer xmlAssinado, final String... elementosAssinaveis) throws Exception {

        final KeyStore.PrivateKeyEntry keyEntry = this.getPrivateKeyEntry();
        final XMLSignatureFactory signatureFactory = XMLSignatureFactory.getInstance("DOM");
        final List<Transform> transforms = new ArrayList<>(2);
        transforms.add(signatureFactory.newTransform(Transform.ENVELOPED, (TransformParameterSpec) null));
        transforms.add(signatureFactory.newTransform(AssinaturaDocumento.C14N_TRANSFORM_METHOD, (TransformParameterSpec) null));
        final KeyInfoFactory keyInfoFactory = signatureFactory.getKeyInfoFactory();
        final X509Data x509Data = keyInfoFactory.newX509Data(Collections.singletonList((X509Certificate) keyEntry.getCertificate()));
        final KeyInfo keyInfo = keyInfoFactory.newKeyInfo(Collections.singletonList(x509Data));
        final DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        documentBuilderFactory.setNamespaceAware(true);
        final Document document = documentBuilderFactory.newDocumentBuilder().parse(new InputSource(xmlReader));
        for (final String elementoAssinavel : elementosAssinaveis) {
            final NodeList elements = document.getElementsByTagName(elementoAssinavel);
            for (int i = 0; i < elements.getLength(); i++) {
                final Element element = (Element) elements.item(i);
                final String id = element.getAttribute("Id");
                element.setIdAttribute("Id", true);
                final Reference reference = signatureFactory.newReference("#" + id, signatureFactory.newDigestMethod(DigestMethod.SHA1, null), transforms, null, null);
                final SignedInfo signedInfo = signatureFactory.newSignedInfo(signatureFactory.newCanonicalizationMethod(CanonicalizationMethod.INCLUSIVE, (C14NMethodParameterSpec) null), signatureFactory.newSignatureMethod(SignatureMethod.RSA_SHA1, null), Collections.singletonList(reference));
                final XMLSignature signature = signatureFactory.newXMLSignature(signedInfo, keyInfo);
                signature.sign(new DOMSignContext(keyEntry.getPrivateKey(), element.getParentNode()));
            }
        }

        final Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
        transformer.setOutputProperty(OutputKeys.ENCODING, "ISO-8859-1");
        transformer.transform(new DOMSource(document), new StreamResult(xmlAssinado));

    }

    private KeyStore.PrivateKeyEntry getPrivateKeyEntry() throws KeyStoreException, NoSuchAlgorithmException, UnrecoverableEntryException, IOException, CertificateException {

        KeyStore keyStoreCertificado = KeyStore.getInstance("PKCS12");
        InputStream certificadoStream = new FileInputStream(this.certificado);
        keyStoreCertificado.load(certificadoStream, this.senha.toCharArray());

        final KeyStore.PasswordProtection passwordProtection = new KeyStore.PasswordProtection(this.senha.toCharArray());
        return (KeyStore.PrivateKeyEntry) keyStoreCertificado.getEntry(keyStoreCertificado.aliases().nextElement(), passwordProtection);
    }

}
