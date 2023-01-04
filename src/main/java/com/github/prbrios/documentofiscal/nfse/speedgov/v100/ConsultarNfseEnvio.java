package com.github.prbrios.documentofiscal.nfse.speedgov.v100;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import com.fasterxml.jackson.annotation.JsonProperty;

@Root(name = "ConsultarNfseEnvio")
public class ConsultarNfseEnvio {

	@JsonProperty(value = "prestador", required = false)
	@Element(name = "Prestador", required = false)
	private TcIdentificacaoPrestador prestador;
	
	@JsonProperty(value = "numeronfse", required = false)
	@Element(name = "NumeroNfse", required = false)
	private String numeroNfse;
	
	@JsonProperty(value = "periodoemissao", required = false)
	@Element(name = "PeriodoEmissao", required = false)
	private PeriodoEmissao periodoEmissao;
	
	@JsonProperty(value = "tomador", required = false)
	@Element(name = "Tomador", required = false)
	private TcIdentificacaoTomador tomador;
	
	@JsonProperty(value = "intermediarioservico", required = false)
	@Element(name = "IntermediarioServico", required = false)
	private TcIdentificacaoIntermediarioServico intermediarioServico;
	
	public TcIdentificacaoPrestador getPrestador() {
		return prestador;
	}

	public void setPrestador(TcIdentificacaoPrestador prestador) {
		this.prestador = prestador;
	}

	public String getNumeroNfse() {
		return numeroNfse;
	}

	public void setNumeroNfse(String numeroNfse) {
		this.numeroNfse = numeroNfse;
	}

	public PeriodoEmissao getPeriodoEmissao() {
		return periodoEmissao;
	}

	public void setPeriodoEmissao(PeriodoEmissao periodoEmissao) {
		this.periodoEmissao = periodoEmissao;
	}

	public TcIdentificacaoTomador getTomador() {
		return tomador;
	}

	public void setTomador(TcIdentificacaoTomador tomador) {
		this.tomador = tomador;
	}

	public TcIdentificacaoIntermediarioServico getIntermediarioServico() {
		return intermediarioServico;
	}

	public void setIntermediarioServico(TcIdentificacaoIntermediarioServico intermediarioServico) {
		this.intermediarioServico = intermediarioServico;
	}

	public static class PeriodoEmissao {
		
		@JsonProperty(value = "datainicial", required = false)
		@Element(name = "DataInicial", required = false)
		private String dataInicial;
		
		@JsonProperty(value = "datafinal", required = false)
		@Element(name = "DataFinal", required = false)
		private String dataFinal;

		public String getDataInicial() {
			return dataInicial;
		}

		public void setDataInicial(String dataInicial) {
			this.dataInicial = dataInicial;
		}

		public String getDataFinal() {
			return dataFinal;
		}

		public void setDataFinal(String dataFinal) {
			this.dataFinal = dataFinal;
		}
		
	}
}
