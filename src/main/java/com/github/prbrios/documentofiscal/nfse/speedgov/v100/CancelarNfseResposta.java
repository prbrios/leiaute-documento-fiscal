package com.github.prbrios.documentofiscal.nfse.speedgov.v100;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import com.fasterxml.jackson.annotation.JsonProperty;

@Root(name = "CancelarNfseResposta")
public class CancelarNfseResposta {

	@JsonProperty(value = "retcancelamento", required = false)
	@Element(name = "RetCancelamento", required = false)
	private RetCancelamento retCancelamento;
	
	@JsonProperty(value = "listamensagemretorno", required = false)
	@Element(name = "ListaMensagemRetorno", required = false)
	private ListaMensagemRetorno listaMensagemRetorno;

	public RetCancelamento getRetCancelamento() {
		return retCancelamento;
	}

	public void setRetCancelamento(RetCancelamento retCancelamento) {
		this.retCancelamento = retCancelamento;
	}

	public ListaMensagemRetorno getListaMensagemRetorno() {
		return listaMensagemRetorno;
	}

	public void setListaMensagemRetorno(ListaMensagemRetorno listaMensagemRetorno) {
		this.listaMensagemRetorno = listaMensagemRetorno;
	}
	
}
