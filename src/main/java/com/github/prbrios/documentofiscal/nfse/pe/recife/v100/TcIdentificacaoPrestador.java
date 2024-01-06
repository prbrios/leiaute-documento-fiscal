package com.github.prbrios.documentofiscal.nfse.pe.recife.v100;

import org.simpleframework.xml.Element;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TcIdentificacaoPrestador {

	@JsonProperty(value = "cnpj", required = false)
	@Element(name = "Cnpj", required = false)
	private String cnpj;
	
	@JsonProperty(value = "inscricaomunicipal", required = false)
	@Element(name = "InscricaoMunicipal", required = false)
	private String inscricaoMunicipal;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getInscricaoMunicipal() {
		return inscricaoMunicipal;
	}

	public void setInscricaoMunicipal(String inscricaoMunicipal) {
		this.inscricaoMunicipal = inscricaoMunicipal;
	}
	
}
