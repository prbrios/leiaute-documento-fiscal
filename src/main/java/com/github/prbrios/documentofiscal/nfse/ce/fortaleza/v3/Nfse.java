package com.github.prbrios.documentofiscal.nfse.ce.fortaleza.v3;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import com.github.prbrios.documentofiscal.assinatura.Signature;

@Root(name = "Nfse")
public class Nfse {
	
	@Element(name = "InfNfse", required = false)
	private InfNfse infNfse;
	
	@Element(name = "Signature", required = false)
	private Signature signature;

	public InfNfse getInfNfse() {
		return infNfse;
	}

	public void setInfNfse(InfNfse infNfse) {
		this.infNfse = infNfse;
	}

	public Signature getSignature() {
		return signature;
	}

	public void setSignature(Signature signature) {
		this.signature = signature;
	}
}
