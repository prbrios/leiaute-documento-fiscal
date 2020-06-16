package com.github.prbrios.documentofiscal.assinatura;

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

	public SignedInfo getSignedInfo() {
		return signedInfo;
	}

	public void setSignedInfo(SignedInfo signedInfo) {
		this.signedInfo = signedInfo;
	}

	public String getSignatureValue() {
		return signatureValue;
	}

	public void setSignatureValue(String signatureValue) {
		this.signatureValue = signatureValue;
	}

	public KeyInfo getKeyInfo() {
		return keyInfo;
	}

	public void setKeyInfo(KeyInfo keyInfo) {
		this.keyInfo = keyInfo;
	}

}