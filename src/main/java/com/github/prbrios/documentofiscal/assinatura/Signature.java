package com.github.prbrios.documentofiscal.assinatura;

import lombok.Getter;
import lombok.Setter;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;

@Namespace(reference = "http://www.w3.org/2000/09/xmldsig#")
public class Signature {


    @Element(name = "SignedInfo", required = false)
    private SignedInfo signedInfo;


    @Element(name = "SignatureValue", required = false)
    private String signatureValue;


    @Element(name = "KeyInfo", required = false)
    private KeyInfo keyInfo;

}