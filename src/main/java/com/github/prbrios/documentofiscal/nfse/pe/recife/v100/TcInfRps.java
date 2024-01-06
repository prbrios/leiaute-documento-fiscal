package com.github.prbrios.documentofiscal.nfse.pe.recife.v100;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;

import com.fasterxml.jackson.annotation.JsonProperty;

@Namespace(reference = "http://www.abrasf.org.br/ABRASF/arquivos/nfse.xsd")
public class TcInfRps {

	@JsonProperty(value = "id", required = false)
	@Attribute(name = "Id", required = false)
	private String id;
	
	@JsonProperty(value = "identificacaorps", required = false)
	@Element(name = "IdentificacaoRps", required = false)
	private TcIdentificacaoRps identificacaoRps;
	
	@JsonProperty(value = "dataemissao", required = false)
	@Element(name = "DataEmissao", required = false)
   	private String dataEmissao;
	
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
	
	@JsonProperty(value = "status", required = false)
	@Element(name = "Status", required = false)
   	private String status;
	
	@JsonProperty(value = "rpssubstituido", required = false)
	@Element(name = "RpsSubstituido", required = false)
   	private TcIdentificacaoRps rpsSubstituido;
	
	@JsonProperty(value = "servico", required = false)
	@Element(name = "Servico", required = false)
   	private TcDadosServico servico;
	
	@JsonProperty(value = "prestador", required = false)
	@Element(name = "Prestador", required = false)
   	private TcIdentificacaoPrestador prestador;
	
	@JsonProperty(value = "tomador", required = false)
	@Element(name = "Tomador", required = false)
   	private TcDadosTomador tomador;
   	
   	@JsonProperty(value = "intermediarioservico", required = false)
   	@Element(name = "IntermediarioServico", required = false)
   	private TcIdentificacaoIntermediarioServico intermediarioServico;
   	
   	@JsonProperty(value = "contrucaocivil", required = false)
   	@Element(name = "ContrucaoCivil", required = false)
   	private TcDadosConstrucaoCivil contrucaoCivil;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public TcIdentificacaoRps getIdentificacaoRps() {
		return identificacaoRps;
	}

	public void setIdentificacaoRps(TcIdentificacaoRps identificacaoRps) {
		this.identificacaoRps = identificacaoRps;
	}

	public String getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(String dataEmissao) {
		this.dataEmissao = dataEmissao;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public TcIdentificacaoRps getRpsSubstituido() {
		return rpsSubstituido;
	}

	public void setRpsSubstituido(TcIdentificacaoRps rpsSubstituido) {
		this.rpsSubstituido = rpsSubstituido;
	}

	public TcDadosServico getServico() {
		return servico;
	}

	public void setServico(TcDadosServico servico) {
		this.servico = servico;
	}

	public TcIdentificacaoPrestador getPrestador() {
		return prestador;
	}

	public void setPrestador(TcIdentificacaoPrestador prestador) {
		this.prestador = prestador;
	}

	public TcDadosTomador getTomador() {
		return tomador;
	}

	public void setTomador(TcDadosTomador tomador) {
		this.tomador = tomador;
	}

	public TcIdentificacaoIntermediarioServico getIntermediarioServico() {
		return intermediarioServico;
	}

	public void setIntermediarioServico(TcIdentificacaoIntermediarioServico intermediarioServico) {
		this.intermediarioServico = intermediarioServico;
	}

	public TcDadosConstrucaoCivil getContrucaoCivil() {
		return contrucaoCivil;
	}

	public void setContrucaoCivil(TcDadosConstrucaoCivil contrucaoCivil) {
		this.contrucaoCivil = contrucaoCivil;
	}
   	
}
