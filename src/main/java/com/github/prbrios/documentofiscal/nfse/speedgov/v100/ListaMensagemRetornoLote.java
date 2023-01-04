package com.github.prbrios.documentofiscal.nfse.speedgov.v100;

import java.util.List;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import com.fasterxml.jackson.annotation.JsonProperty;

@Root(name = "ListaMensagemRetornoLote")
public class ListaMensagemRetornoLote {

	@JsonProperty(value = "mensagemretorno", required = false)
	@ElementList(name = "MensagemRetorno", required = false, inline = true)
	private List<TcMensagemRetornoLote> mensagemRetorno;

	public List<TcMensagemRetornoLote> getMensagemRetorno() {
		return mensagemRetorno;
	}

	public void setMensagemRetorno(List<TcMensagemRetornoLote> mensagemRetorno) {
		this.mensagemRetorno = mensagemRetorno;
	}
	
}
