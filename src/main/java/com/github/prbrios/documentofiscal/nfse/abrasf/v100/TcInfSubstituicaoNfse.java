package com.github.prbrios.documentofiscal.nfse.abrasf.v100;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TcInfSubstituicaoNfse {

	@JsonProperty(value = "id", required = false)
	@Attribute(name = "Id", required = false)
	private String id;
	
	@JsonProperty(value = "nfsesubstituidora", required = false)
	@Element(name = "NfseSubstituidora", required = false)
	private String nfseSubstituidora;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNfseSubstituidora() {
		return nfseSubstituidora;
	}

	public void setNfseSubstituidora(String nfseSubstituidora) {
		this.nfseSubstituidora = nfseSubstituidora;
	}
	
}
