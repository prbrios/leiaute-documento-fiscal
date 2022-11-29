package com.github.prbrios.documentofiscal.nfse.ginfes.v3.tipos;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@JsonRootName("infrps")
@Root(name = "InfRps")
public class InfRps {

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("id")
	@Attribute(name = "Id", required = false)
	protected String id;

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("identificacaorps")
	@Element(name = "IdentificacaoRps", required = false)
	protected IdentificacaoRps identificacaoRps;

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("dataemissao")
	@Element(name = "DataEmissao", required = false)
	protected String dataEmissao; 

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("naturezaoperacao")
	@Element(name = "NaturezaOperacao", required = false)
	protected String naturezaOperacao;

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("regimeespecialtributacao")
	@Element(name = "RegimeEspecialTributacao", required = false)
	protected String regimeEspecialTributacao;

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("optantesimplesnacional")
	@Element(name = "OptanteSimplesNacional", required = false)
	protected String optanteSimplesNacional; 

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("incentivadorcultural")
	@Element(name = "IncentivadorCultural", required = false)
	protected String incentivadorCultural;

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("status")
	@Element(name = "Status", required = false)
	protected String status;

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("rpssubstituido")
	@Element(name = "RpsSubstituido", required = false)
	protected IdentificacaoRps rpsSubstituido;

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("servico")
	@Element(name = "Servico", required = false)
	protected DadosServico servico;

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("prestador")
	@Element(name = "Prestador", required = false)
	protected IdentificacaoPrestador prestador;

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("tomador")
	@Element(name = "Tomador", required = false)
	protected DadosTomador tomador;

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("intermediarioservico")
	@Element(name = "IntermediarioServico", required = false)
	protected IdentificacaoIntermediarioServico intermediarioServico;

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("construcaocivil")
	@Element(name = "ConstrucaoCivil", required = false)
	protected DadosConstrucaoCivil construcaoCivil;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public IdentificacaoRps getIdentificacaoRps() {
		return identificacaoRps;
	}

	public void setIdentificacaoRps(IdentificacaoRps identificacaoRps) {
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

	public IdentificacaoRps getRpsSubstituido() {
		return rpsSubstituido;
	}

	public void setRpsSubstituido(IdentificacaoRps rpsSubstituido) {
		this.rpsSubstituido = rpsSubstituido;
	}

	public DadosServico getServico() {
		return servico;
	}

	public void setServico(DadosServico servico) {
		this.servico = servico;
	}

	public IdentificacaoPrestador getPrestador() {
		return prestador;
	}

	public void setPrestador(IdentificacaoPrestador prestador) {
		this.prestador = prestador;
	}

	public DadosTomador getTomador() {
		return tomador;
	}

	public void setTomador(DadosTomador tomador) {
		this.tomador = tomador;
	}

	public IdentificacaoIntermediarioServico getIntermediarioServico() {
		return intermediarioServico;
	}

	public void setIntermediarioServico(IdentificacaoIntermediarioServico intermediarioServico) {
		this.intermediarioServico = intermediarioServico;
	}

	public DadosConstrucaoCivil getConstrucaoCivil() {
		return construcaoCivil;
	}

	public void setConstrucaoCivil(DadosConstrucaoCivil construcaoCivil) {
		this.construcaoCivil = construcaoCivil;
	}

}
