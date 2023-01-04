package com.github.prbrios.documentofiscal.nfse.abrasf.v100;

import org.simpleframework.xml.Element;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TcIdentificacaoOrgaoGerador {

	@JsonProperty(value = "codigomunicipio", required = false)
	@Element(name = "CodigoMunicipio", required = false)
	private String codigoMunicipio;
	
	@JsonProperty(value = "uf", required = false)
	@Element(name = "Uf", required = false)
	private String uf;

	public String getCodigoMunicipio() {
		return codigoMunicipio;
	}

	public void setCodigoMunicipio(String codigoMunicipio) {
		this.codigoMunicipio = codigoMunicipio;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}
	
}
