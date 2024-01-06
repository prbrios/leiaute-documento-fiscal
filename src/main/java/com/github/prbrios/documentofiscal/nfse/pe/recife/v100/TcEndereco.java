package com.github.prbrios.documentofiscal.nfse.pe.recife.v100;

import org.simpleframework.xml.Element;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TcEndereco {

	@JsonProperty(value = "endereco", required = false)
	@Element(name = "Endereco", required = false)
	private String endereco;
	
	@JsonProperty(value = "numero", required = false)
	@Element(name = "Numero", required = false)
	private String numero;
	
	@JsonProperty(value = "complemento", required = false)
	@Element(name = "Complemento", required = false)
	private String complemento;
	
	@JsonProperty(value = "bairro", required = false)
	@Element(name = "Bairro", required = false)
	private String bairro;
	
	@JsonProperty(value = "codigomunicipio", required = false)
	@Element(name = "CodigoMunicipio", required = false)
	private String codigoMunicipio;
	
	@JsonProperty(value = "uf", required = false)
	@Element(name = "Uf", required = false)
	private String uf;
	
	@JsonProperty(value = "cep", required = false)
	@Element(name = "Cep", required = false)
	private String cep;

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

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

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
}
