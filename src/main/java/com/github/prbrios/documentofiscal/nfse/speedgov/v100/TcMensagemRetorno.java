package com.github.prbrios.documentofiscal.nfse.speedgov.v100;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import com.fasterxml.jackson.annotation.JsonProperty;

@Root(name = "MensagemRetorno")
public class TcMensagemRetorno {

	@JsonProperty(value = "codigo", required = false)
	@Element(name = "Codigo", required = false)
	private String codigo;
	
	@JsonProperty(value = "mensagem", required = false)
	@Element(name = "Mensagem", required = false)
	private String mensagem;
	
	@JsonProperty(value = "correcao", required = false)
	@Element(name = "Correcao", required = false)
	private String correcao;

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

	public String getCorrecao() {
		return correcao;
	}

	public void setCorrecao(String correcao) {
		this.correcao = correcao;
	}
	
}
