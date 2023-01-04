package com.github.prbrios.documentofiscal.nfse.abrasf.v100;

import org.simpleframework.xml.Element;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TcValores {
	
	@JsonProperty(value = "valorservicos", required = false)
	@Element(name = "ValorServicos", required = false)
	private String valorServicos;
	
	@JsonProperty(value = "valordeducoes", required = false)
	@Element(name = "ValorDeducoes", required = false)
	private String valorDeducoes;
	
	@JsonProperty(value = "valorpis", required = false)
	@Element(name = "ValorPis", required = false)
	private String valorPis;
	
	@JsonProperty(value = "valorcofins", required = false)
	@Element(name = "ValorCofins", required = false)
	private String valorCofins;
	
	@JsonProperty(value = "valorinss", required = false)
	@Element(name = "ValorInss", required = false)
	private String valorInss;
	
	@JsonProperty(value = "valorir", required = false)
	@Element(name = "ValorIr", required = false)
	private String valorIr;
	
	@JsonProperty(value = "valorcsll", required = false)
	@Element(name = "ValorCsll", required = false)
	private String valorCsll;
	
	@JsonProperty(value = "issretido", required = false)
	@Element(name = "IssRetido", required = false)
	private String issRetido;
	
	@JsonProperty(value = "valoriss", required = false)
	@Element(name = "ValorIss", required = false)
	private String valorIss;
	
	@JsonProperty(value = "valorissretido", required = false)
	@Element(name = "ValorIssRetido", required = false)
	private String valorIssRetido;
	
	@JsonProperty(value = "outrasretencoes", required = false)
	@Element(name = "OutrasRetencoes", required = false)
	private String outrasRetencoes;
	
	@JsonProperty(value = "basecalculo", required = false)
	@Element(name = "BaseCalculo", required = false)
	private String baseCalculo;
	
	@JsonProperty(value = "aliquota", required = false)
	@Element(name = "Aliquota", required = false)
	private String aliquota;
	
	@JsonProperty(value = "valorliquidonfse", required = false)
	@Element(name = "ValorLiquidoNfse", required = false)
	private String valorLiquidoNfse;
	
	@JsonProperty(value = "descontoincondicionado", required = false)
	@Element(name = "DescontoIncondicionado", required = false)
	private String descontoIncondicionado;
	
	@JsonProperty(value = "descontocondicionado", required = false)
	@Element(name = "DescontoCondicionado", required = false)
	private String descontoCondicionado;

	public String getValorServicos() {
		return valorServicos;
	}

	public void setValorServicos(String valorServicos) {
		this.valorServicos = valorServicos;
	}

	public String getValorDeducoes() {
		return valorDeducoes;
	}

	public void setValorDeducoes(String valorDeducoes) {
		this.valorDeducoes = valorDeducoes;
	}

	public String getValorPis() {
		return valorPis;
	}

	public void setValorPis(String valorPis) {
		this.valorPis = valorPis;
	}

	public String getValorCofins() {
		return valorCofins;
	}

	public void setValorCofins(String valorCofins) {
		this.valorCofins = valorCofins;
	}

	public String getValorInss() {
		return valorInss;
	}

	public void setValorInss(String valorInss) {
		this.valorInss = valorInss;
	}

	public String getValorIr() {
		return valorIr;
	}

	public void setValorIr(String valorIr) {
		this.valorIr = valorIr;
	}

	public String getValorCsll() {
		return valorCsll;
	}

	public void setValorCsll(String valorCsll) {
		this.valorCsll = valorCsll;
	}

	public String getIssRetido() {
		return issRetido;
	}

	public void setIssRetido(String issRetido) {
		this.issRetido = issRetido;
	}

	public String getValorIss() {
		return valorIss;
	}

	public void setValorIss(String valorIss) {
		this.valorIss = valorIss;
	}

	public String getValorIssRetido() {
		return valorIssRetido;
	}

	public void setValorIssRetido(String valorIssRetido) {
		this.valorIssRetido = valorIssRetido;
	}

	public String getOutrasRetencoes() {
		return outrasRetencoes;
	}

	public void setOutrasRetencoes(String outrasRetencoes) {
		this.outrasRetencoes = outrasRetencoes;
	}

	public String getBaseCalculo() {
		return baseCalculo;
	}

	public void setBaseCalculo(String baseCalculo) {
		this.baseCalculo = baseCalculo;
	}

	public String getAliquota() {
		return aliquota;
	}

	public void setAliquota(String aliquota) {
		this.aliquota = aliquota;
	}

	public String getValorLiquidoNfse() {
		return valorLiquidoNfse;
	}

	public void setValorLiquidoNfse(String valorLiquidoNfse) {
		this.valorLiquidoNfse = valorLiquidoNfse;
	}

	public String getDescontoIncondicionado() {
		return descontoIncondicionado;
	}

	public void setDescontoIncondicionado(String descontoIncondicionado) {
		this.descontoIncondicionado = descontoIncondicionado;
	}

	public String getDescontoCondicionado() {
		return descontoCondicionado;
	}

	public void setDescontoCondicionado(String descontoCondicionado) {
		this.descontoCondicionado = descontoCondicionado;
	}

}
