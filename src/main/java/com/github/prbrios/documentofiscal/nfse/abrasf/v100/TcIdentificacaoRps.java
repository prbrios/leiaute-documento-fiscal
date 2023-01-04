package com.github.prbrios.documentofiscal.nfse.abrasf.v100;

import org.simpleframework.xml.Element;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TcIdentificacaoRps {

	@JsonProperty(value = "numero", required = false)
	@Element(name = "Numero", required = false)
	private String numero;
	
	@JsonProperty(value = "serie", required = false)
	@Element(name = "Serie", required = false)
	private String serie;
	
	@JsonProperty(value = "tipo", required = false)
	@Element(name = "Tipo", required = false)
	private String tipo;

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
