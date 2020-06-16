package com.github.prbrios.documentofiscal.cte;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import com.github.prbrios.documentofiscal.assinatura.Signature;

@Root(name = "CTe")
@Namespace(reference = "http://www.portalfiscal.inf.br/cte")
public class CTe {

	@Element(name = "infCte", required = false)
	private CTeInfCte infCte;

	@Element(name = "infCTeSupl", required = false)
	private CTeInfCTeSupl infCTeSupl;

	@Element(name = "Signature", required = false)
	private Signature signature;

	public CTeInfCte getInfCte() {
		return infCte;
	}

	public void setInfCte(CTeInfCte infCte) {
		this.infCte = infCte;
	}

	public CTeInfCTeSupl getInfCTeSupl() {
		return infCTeSupl;
	}

	public void setInfCTeSupl(CTeInfCTeSupl infCTeSupl) {
		this.infCTeSupl = infCTeSupl;
	}

	public Signature getSignature() {
		return signature;
	}

	public void setSignature(Signature signature) {
		this.signature = signature;
	}
	

}
