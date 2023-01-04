package com.github.prbrios.documentofiscal.nfse.speedgov.v100;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.prbrios.documentofiscal.assinatura.Signature;

public class TcCancelamentoNfse {

	@JsonProperty(value = "versao", required = false)
	@Attribute(name = "versao", required = false)
	private String versao;
	
	@JsonProperty(value = "confirmacao", required = false)
	@Element(name = "Confirmacao", required = false)
	private TcConfirmacaoCancelamento confirmacao;
	
	@JsonProperty(value = "signature", required = false)
	@Element(name = "Signature", required = false)
	private Signature signature;

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public TcConfirmacaoCancelamento getConfirmacao() {
		return confirmacao;
	}

	public void setConfirmacao(TcConfirmacaoCancelamento confirmacao) {
		this.confirmacao = confirmacao;
	}

	public Signature getSignature() {
		return signature;
	}

	public void setSignature(Signature signature) {
		this.signature = signature;
	}
	
	
}
