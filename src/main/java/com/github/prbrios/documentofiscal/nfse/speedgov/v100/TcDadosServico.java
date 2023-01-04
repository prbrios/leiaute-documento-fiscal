package com.github.prbrios.documentofiscal.nfse.speedgov.v100;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TcDadosServico {
	
	@JsonProperty(value = "valores", required = false)
	@Element(name = "Valores", required = false)
	private TcValores valores;
	
	@JsonProperty(value = "itemlistaservico", required = false)
	@Element(name = "ItemListaServico", required = false)
	private String itemListaServico;
	
	@JsonProperty(value = "codigocnae", required = false)
	@Element(name = "CodigoCnae", required = false)
	private String codigoCnae;
	
	@JsonProperty(value = "codigotributacaomunicipio", required = false)
	@Element(name = "CodigoTributacaoMunicipio", required = false)
	private String codigoTributacaoMunicipio;
	
	@JsonProperty(value = "discriminacao", required = false)
	@Element(name = "Discriminacao", required = false)
	private String discriminacao;
	
	@JsonProperty(value = "codigomunicipio", required = false)
	@Element(name = "CodigoMunicipio", required = false)
	private String codigoMunicipio;

	public TcValores getValores() {
		return valores;
	}

	public void setValores(TcValores valores) {
		this.valores = valores;
	}

	public String getItemListaServico() {
		return itemListaServico;
	}

	public void setItemListaServico(String itemListaServico) {
		this.itemListaServico = itemListaServico;
	}

	public String getCodigoCnae() {
		return codigoCnae;
	}

	public void setCodigoCnae(String codigoCnae) {
		this.codigoCnae = codigoCnae;
	}

	public String getCodigoTributacaoMunicipio() {
		return codigoTributacaoMunicipio;
	}

	public void setCodigoTributacaoMunicipio(String codigoTributacaoMunicipio) {
		this.codigoTributacaoMunicipio = codigoTributacaoMunicipio;
	}

	public String getDiscriminacao() {
		return discriminacao;
	}

	public void setDiscriminacao(String discriminacao) {
		this.discriminacao = discriminacao;
	}

	public String getCodigoMunicipio() {
		return codigoMunicipio;
	}

	public void setCodigoMunicipio(String codigoMunicipio) {
		this.codigoMunicipio = codigoMunicipio;
	}

}
