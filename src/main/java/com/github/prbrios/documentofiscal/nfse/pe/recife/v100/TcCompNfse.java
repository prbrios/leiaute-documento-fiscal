package com.github.prbrios.documentofiscal.nfse.pe.recife.v100;

import org.simpleframework.xml.Element;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TcCompNfse {

	@JsonProperty(value = "nfse", required = false)
	@Element(name = "Nfse", required = false)
	private TcNfse nfse;
	
	@JsonProperty(value = "nfsecancelamento", required = false)
	@Element(name = "NfseCancelamento", required = false)
	private TcCancelamentoNfse nfseCancelamento;
	
	@JsonProperty(value = "nfsesubstituicao", required = false)
	@Element(name = "NfseSubstituicao", required = false)
	private TcSubstituicaoNfse nfseSubstituicao;

	public TcNfse getNfse() {
		return nfse;
	}

	public void setNfse(TcNfse nfse) {
		this.nfse = nfse;
	}

	public TcCancelamentoNfse getNfseCancelamento() {
		return nfseCancelamento;
	}

	public void setNfseCancelamento(TcCancelamentoNfse nfseCancelamento) {
		this.nfseCancelamento = nfseCancelamento;
	}

	public TcSubstituicaoNfse getNfseSubstituicao() {
		return nfseSubstituicao;
	}

	public void setNfseSubstituicao(TcSubstituicaoNfse nfseSubstituicao) {
		this.nfseSubstituicao = nfseSubstituicao;
	}
	
}
