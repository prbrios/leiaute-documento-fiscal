package com.github.prbrios.documentofiscal.nfse.abrasf.v100;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import com.fasterxml.jackson.annotation.JsonProperty;

@Root(name = "ConsultarSituacaoLoteRpsResposta")
public class ConsultarSituacaoLoteRpsResposta {

	@JsonProperty(value = "numerolote", required = false)
	@Element(name = "NumeroLote", required = false)
	private String numeroLote;
	
	@JsonProperty(value = "situacao", required = false)
	@Element(name = "Situacao", required = false)
	private String situacao;
	
	@JsonProperty(value = "listamensagemretorno", required = false)
	@Element(name = "ListaMensagemRetorno", required = false)
	private ListaMensagemRetorno listaMensagemRetorno;

	public String getNumeroLote() {
		return numeroLote;
	}

	public void setNumeroLote(String numeroLote) {
		this.numeroLote = numeroLote;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public ListaMensagemRetorno getListaMensagemRetorno() {
		return listaMensagemRetorno;
	}

	public void setListaMensagemRetorno(ListaMensagemRetorno listaMensagemRetorno) {
		this.listaMensagemRetorno = listaMensagemRetorno;
	}
	
}
