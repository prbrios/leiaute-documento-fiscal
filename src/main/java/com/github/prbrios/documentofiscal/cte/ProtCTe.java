package com.github.prbrios.documentofiscal.cte;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import com.github.prbrios.documentofiscal.assinatura.Signature;

@Root(name = "protCTe")
public class ProtCTe {

	@Attribute(name = "versao", required = false)
	private String versao;

	@Element(name = "infProt", required = false)
	private ProtCTeInfProt infProt;

	@Element(name = "infFisco", required = false)
	private ProtCTeInfFisco infFisco;

	@Element(name = "Signature", required = false)
	private Signature signature;

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public ProtCTeInfProt getInfProt() {
		return infProt;
	}

	public void setInfProt(ProtCTeInfProt infProt) {
		this.infProt = infProt;
	}

	public ProtCTeInfFisco getInfFisco() {
		return infFisco;
	}

	public void setInfFisco(ProtCTeInfFisco infFisco) {
		this.infFisco = infFisco;
	}

	public Signature getSignature() {
		return signature;
	}

	public void setSignature(Signature signature) {
		this.signature = signature;
	}

}
