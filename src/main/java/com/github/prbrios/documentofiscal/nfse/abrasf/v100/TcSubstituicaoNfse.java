package com.github.prbrios.documentofiscal.nfse.abrasf.v100;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.prbrios.documentofiscal.assinatura.Signature;

public class TcSubstituicaoNfse {

	@JsonProperty(value = "versao", required = false)
	@Attribute(name = "versao", required = false)
	private String versao;
	
	@JsonProperty(value = "substituicaonfse", required = false)
	@Element(name = "SubstituicaoNfse", required = false)
	private TcInfSubstituicaoNfse substituicaoNfse;
	
	@JsonProperty(value = "signature", required = false)
	@Element(name = "Signature", required = false)
	private Signature signature;

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public TcInfSubstituicaoNfse getSubstituicaoNfse() {
		return substituicaoNfse;
	}

	public void setSubstituicaoNfse(TcInfSubstituicaoNfse substituicaoNfse) {
		this.substituicaoNfse = substituicaoNfse;
	}

	public Signature getSignature() {
		return signature;
	}

	public void setSignature(Signature signature) {
		this.signature = signature;
	}

}
