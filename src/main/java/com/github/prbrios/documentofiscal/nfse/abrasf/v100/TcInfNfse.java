package com.github.prbrios.documentofiscal.nfse.abrasf.v100;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TcInfNfse {

	@JsonProperty(value = "id", required = false)
	@Attribute(name = "Id", required = false)
	private String id;
	
	@JsonProperty(value = "numero", required = false)
	@Element(name = "Numero", required = false)
	private String numero;
	
	@JsonProperty(value = "codigoverificacao", required = false)
	@Element(name = "CodigoVerificacao", required = false)
    private String codigoVerificacao;
	
	@JsonProperty(value = "dataemissao", required = false)
	@Element(name = "DataEmissao", required = false)
    private String dataEmissao;
	
	@JsonProperty(value = "identificacaorps", required = false)
	@Element(name = "IdentificacaoRps", required = false)
    private TcIdentificacaoRps identificacaoRps;
	
	@JsonProperty(value = "dataemissaorps", required = false)
	@Element(name = "DataEmissaoRps", required = false)
    private String dataEmissaoRps;
	
	@JsonProperty(value = "naturezaoperacao", required = false)
	@Element(name = "NaturezaOperacao", required = false)
    private String naturezaOperacao;
	
	@JsonProperty(value = "regimeespecialtributacao", required = false)
	@Element(name = "RegimeEspecialTributacao", required = false)
    private String regimeEspecialTributacao;
	
	@JsonProperty(value = "optantesimplesnacional", required = false)
	@Element(name = "OptanteSimplesNacional", required = false)
    private String optanteSimplesNacional;
	
	@JsonProperty(value = "incentivadorcultural", required = false)
	@Element(name = "IncentivadorCultural", required = false)
    private String incentivadorCultural;
	
	@JsonProperty(value = "competencia", required = false)
	@Element(name = "Competencia", required = false)
    private String competencia;
	
	@JsonProperty(value = "nfsesubstituida", required = false)
	@Element(name = "NfseSubstituida", required = false)
    private String nfseSubstituida;
	
	@JsonProperty(value = "outrasinformacoes", required = false)
	@Element(name = "OutrasInformacoes", required = false)
    private String outrasInformacoes;
	
	@JsonProperty(value = "servico", required = false)
	@Element(name = "Servico", required = false)
    private TcDadosServico servico;
	
	@JsonProperty(value = "valorcredito", required = false)
	@Element(name = "ValorCredito", required = false)
    private String valorCredito;
	
	@JsonProperty(value = "prestadorservico", required = false)
	@Element(name = "PrestadorServico", required = false)
    private TcDadosPrestador prestadorServico;
	
	@JsonProperty(value = "tomadorservico", required = false)
	@Element(name = "TomadorServico", required = false)
    private TcDadosTomador tomadorServico;
	
	@JsonProperty(value = "intermediarioservico", required = false)
	@Element(name = "IntermediarioServico", required = false)
    private TcIdentificacaoIntermediarioServico intermediarioServico;
	
	@JsonProperty(value = "orgaogerador", required = false)
	@Element(name = "OrgaoGerador", required = false)
    private TcIdentificacaoOrgaoGerador orgaoGerador;
	
	@JsonProperty(value = "contrucaocivil", required = false)
	@Element(name = "ContrucaoCivil", required = false)
    private TcDadosConstrucaoCivil contrucaoCivil;

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCodigoVerificacao() {
		return codigoVerificacao;
	}

	public void setCodigoVerificacao(String codigoVerificacao) {
		this.codigoVerificacao = codigoVerificacao;
	}

	public String getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(String dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public TcIdentificacaoRps getIdentificacaoRps() {
		return identificacaoRps;
	}

	public void setIdentificacaoRps(TcIdentificacaoRps identificacaoRps) {
		this.identificacaoRps = identificacaoRps;
	}

	public String getDataEmissaoRps() {
		return dataEmissaoRps;
	}

	public void setDataEmissaoRps(String dataEmissaoRps) {
		this.dataEmissaoRps = dataEmissaoRps;
	}

	public String getNaturezaOperacao() {
		return naturezaOperacao;
	}

	public void setNaturezaOperacao(String naturezaOperacao) {
		this.naturezaOperacao = naturezaOperacao;
	}

	public String getRegimeEspecialTributacao() {
		return regimeEspecialTributacao;
	}

	public void setRegimeEspecialTributacao(String regimeEspecialTributacao) {
		this.regimeEspecialTributacao = regimeEspecialTributacao;
	}

	public String getOptanteSimplesNacional() {
		return optanteSimplesNacional;
	}

	public void setOptanteSimplesNacional(String optanteSimplesNacional) {
		this.optanteSimplesNacional = optanteSimplesNacional;
	}

	public String getIncentivadorCultural() {
		return incentivadorCultural;
	}

	public void setIncentivadorCultural(String incentivadorCultural) {
		this.incentivadorCultural = incentivadorCultural;
	}

	public String getCompetencia() {
		return competencia;
	}

	public void setCompetencia(String competencia) {
		this.competencia = competencia;
	}

	public String getNfseSubstituida() {
		return nfseSubstituida;
	}

	public void setNfseSubstituida(String nfseSubstituida) {
		this.nfseSubstituida = nfseSubstituida;
	}

	public String getOutrasInformacoes() {
		return outrasInformacoes;
	}

	public void setOutrasInformacoes(String outrasInformacoes) {
		this.outrasInformacoes = outrasInformacoes;
	}

	public TcDadosServico getServico() {
		return servico;
	}

	public void setServico(TcDadosServico servico) {
		this.servico = servico;
	}

	public String getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(String valorCredito) {
		this.valorCredito = valorCredito;
	}

	public TcDadosPrestador getPrestadorServico() {
		return prestadorServico;
	}

	public void setPrestadorServico(TcDadosPrestador prestadorServico) {
		this.prestadorServico = prestadorServico;
	}

	public TcDadosTomador getTomadorServico() {
		return tomadorServico;
	}

	public void setTomadorServico(TcDadosTomador tomadorServico) {
		this.tomadorServico = tomadorServico;
	}

	public TcIdentificacaoIntermediarioServico getIntermediarioServico() {
		return intermediarioServico;
	}

	public void setIntermediarioServico(TcIdentificacaoIntermediarioServico intermediarioServico) {
		this.intermediarioServico = intermediarioServico;
	}

	public TcIdentificacaoOrgaoGerador getOrgaoGerador() {
		return orgaoGerador;
	}

	public void setOrgaoGerador(TcIdentificacaoOrgaoGerador orgaoGerador) {
		this.orgaoGerador = orgaoGerador;
	}

	public TcDadosConstrucaoCivil getContrucaoCivil() {
		return contrucaoCivil;
	}

	public void setContrucaoCivil(TcDadosConstrucaoCivil contrucaoCivil) {
		this.contrucaoCivil = contrucaoCivil;
	}
    
}
