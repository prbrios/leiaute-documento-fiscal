package com.github.prbrios.documentofiscal.nfse.speedgov.v100;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.prbrios.documentofiscal.assinatura.Signature;

@Root(name = "Nfse")
public class TcNfse {
	
	@JsonProperty(value = "versao", required = false)
	@Attribute(name = "versao", required = false)
	private String versao;
	
	@JsonProperty(value = "infnfse", required = false)
	@Element(name = "InfNfse", required = false)
	private TcInfNfse infNfse;
	
	@JsonProperty(value = "signature", required = false)
	@Element(name = "Signature", required = false)
	private Signature signature;

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public TcInfNfse getInfNfse() {
		return infNfse;
	}

	public void setInfNfse(TcInfNfse infNfse) {
		this.infNfse = infNfse;
	}

	public Signature getSignature() {
		return signature;
	}

	public void setSignature(Signature signature) {
		this.signature = signature;
	}
	

}
