package com.github.prbrios.documentofiscal.nfse.pe.recife.v100;

import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TcLoteRps {

	@JsonProperty(value = "id", required = false)
	@Attribute(name = "Id", required = false)
	private String id;
	
	@JsonProperty(value = "versao", required = false)
	@Attribute(name = "versao", required = false)
	private String versao;
	
	@JsonProperty(value = "numerolote", required = false)
	@Element(name = "NumeroLote", required = false)
	private String numeroLote;
	
	@JsonProperty(value = "cnpj", required = false)
	@Element(name = "Cnpj", required = false)
	private String cnpj;
	
	@JsonProperty(value = "inscricaomunicipal", required = false)
	@Element(name = "InscricaoMunicipal", required = false)
	private String inscricaoMunicipal;
	
	@JsonProperty(value = "quantidaderps", required = false)
	@Element(name = "QuantidadeRps", required = false)
	private String quantidadeRps;
	
	@JsonProperty(value = "listarps", required = false)
	@Element(name = "ListaRps", required = false)
	private ListaRps listaRps;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public String getNumeroLote() {
		return numeroLote;
	}

	public void setNumeroLote(String numeroLote) {
		this.numeroLote = numeroLote;
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

	public String getQuantidadeRps() {
		return quantidadeRps;
	}

	public void setQuantidadeRps(String quantidadeRps) {
		this.quantidadeRps = quantidadeRps;
	}

	public ListaRps getListaRps() {
		return listaRps;
	}

	public void setListaRps(ListaRps listaRps) {
		this.listaRps = listaRps;
	}

	public static class ListaRps {
		
		@JsonProperty(value = "rps", required = false)
		@ElementList(name = "Rps", required = false, inline = true)
		private List<TcRps> rps;

		public List<TcRps> getRps() {
			return rps;
		}

		public void setRps(List<TcRps> rps) {
			this.rps = rps;
		}
		
	}
}
