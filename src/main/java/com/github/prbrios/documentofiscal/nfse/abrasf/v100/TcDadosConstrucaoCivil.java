package com.github.prbrios.documentofiscal.nfse.abrasf.v100;

import org.simpleframework.xml.Element;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TcDadosConstrucaoCivil {
	
	@JsonProperty(value = "codigoobra", required = false)
	@Element(name = "CodigoObra", required = false)
	private String codigoObra;
	
	@JsonProperty(value = "art", required = false)
	@Element(name = "Art", required = false)
	private String art;

	public String getCodigoObra() {
		return codigoObra;
	}

	public void setCodigoObra(String codigoObra) {
		this.codigoObra = codigoObra;
	}

	public String getArt() {
		return art;
	}

	public void setArt(String art) {
		this.art = art;
	}
	

}
