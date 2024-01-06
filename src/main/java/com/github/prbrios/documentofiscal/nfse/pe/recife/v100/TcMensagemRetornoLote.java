package com.github.prbrios.documentofiscal.nfse.pe.recife.v100;

import org.simpleframework.xml.Element;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TcMensagemRetornoLote {

	@JsonProperty(value = "identificacaorps", required = false)
	@Element(name = "IdentificacaoRps", required = false)
	private TcIdentificacaoRps identificacaoRps;
	
	@JsonProperty(value = "codigo", required = false)
	@Element(name = "Codigo", required = false)
	private String codigo;
	
	@JsonProperty(value = "mensagem", required = false)
	@Element(name = "Mensagem", required = false)
	private String mensagem;

	public TcIdentificacaoRps getIdentificacaoRps() {
		return identificacaoRps;
	}

	public void setIdentificacaoRps(TcIdentificacaoRps identificacaoRps) {
		this.identificacaoRps = identificacaoRps;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
}
