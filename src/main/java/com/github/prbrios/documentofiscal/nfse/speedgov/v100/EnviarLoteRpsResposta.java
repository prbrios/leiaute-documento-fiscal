package com.github.prbrios.documentofiscal.nfse.speedgov.v100;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import com.fasterxml.jackson.annotation.JsonProperty;

@Root(name = "EnviarLoteRpsResposta")
public class EnviarLoteRpsResposta {

	@JsonProperty(value = "numerolote", required = false)
	@Element(name = "NumeroLote", required = false)
	private String numeroLote;
	
	@JsonProperty(value = "datarecebimento", required = false)
	@Element(name = "DataRecebimento", required = false)
	private String dataRecebimento;
	
	@JsonProperty(value = "protocolo", required = false)
	@Element(name = "Protocolo", required = false)
	private String protocolo;
	
	@JsonProperty(value = "listamensagemretorno", required = false)
	@Element(name = "ListaMensagemRetorno", required = false)
	private ListaMensagemRetorno listaMensagemRetorno;

	public String getNumeroLote() {
		return numeroLote;
	}

	public void setNumeroLote(String numeroLote) {
		this.numeroLote = numeroLote;
	}

	public String getDataRecebimento() {
		return dataRecebimento;
	}

	public void setDataRecebimento(String dataRecebimento) {
		this.dataRecebimento = dataRecebimento;
	}

	public String getProtocolo() {
		return protocolo;
	}

	public void setProtocolo(String protocolo) {
		this.protocolo = protocolo;
	}

	public ListaMensagemRetorno getListaMensagemRetorno() {
		return listaMensagemRetorno;
	}

	public void setListaMensagemRetorno(ListaMensagemRetorno listaMensagemRetorno) {
		this.listaMensagemRetorno = listaMensagemRetorno;
	}
	
	
}
