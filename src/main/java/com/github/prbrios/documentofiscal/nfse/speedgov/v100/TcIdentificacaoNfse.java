package com.github.prbrios.documentofiscal.nfse.speedgov.v100;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TcIdentificacaoNfse {

	@Namespace(reference = "http://ws.speedgov.com.br/tipos_v1.xsd")
	@JsonProperty(value = "numero", required = false)
	@Element(name = "Numero", required = false)
	private String numero;
	
	@Namespace(reference = "http://ws.speedgov.com.br/tipos_v1.xsd")
	@JsonProperty(value = "cnpj", required = false)
	@Element(name = "Cnpj", required = false)
	private String cnpj;
	
	@Namespace(reference = "http://ws.speedgov.com.br/tipos_v1.xsd")
	@JsonProperty(value = "inscricaoMunicipal", required = false)
	@Element(name = "InscricaoMunicipal", required = false)
	private String inscricaoMunicipal;
	
	@Namespace(reference = "http://ws.speedgov.com.br/tipos_v1.xsd")
	@JsonProperty(value = "codigoMunicipio", required = false)
	@Element(name = "CodigoMunicipio", required = false)
	private String codigoMunicipio;

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

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

	public String getCodigoMunicipio() {
		return codigoMunicipio;
	}

	public void setCodigoMunicipio(String codigoMunicipio) {
		this.codigoMunicipio = codigoMunicipio;
	}
	
}
