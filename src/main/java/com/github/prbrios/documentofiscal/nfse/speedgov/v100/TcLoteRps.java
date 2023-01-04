package com.github.prbrios.documentofiscal.nfse.speedgov.v100;

import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TcLoteRps {

	@JsonProperty(value = "id", required = false)
	@Attribute(name = "Id", required = false)
	private String id;
	
	@Namespace(reference = "http://ws.speedgov.com.br/tipos_v1.xsd")
	@JsonProperty(value = "numerolote", required = false)
	@Element(name = "NumeroLote", required = false)
	private String numeroLote;
	
	@Namespace(reference = "http://ws.speedgov.com.br/tipos_v1.xsd")
	@JsonProperty(value = "cnpj", required = false)
	@Element(name = "Cnpj", required = false)
	private String cnpj;
	
	@Namespace(reference = "http://ws.speedgov.com.br/tipos_v1.xsd")
	@JsonProperty(value = "inscricaomunicipal", required = false)
	@Element(name = "InscricaoMunicipal", required = false)
	private String inscricaoMunicipal;
	
	@Namespace(reference = "http://ws.speedgov.com.br/tipos_v1.xsd")
	@JsonProperty(value = "quantidaderps", required = false)
	@Element(name = "QuantidadeRps", required = false)
	private String quantidadeRps;
	
	@Namespace(reference = "http://ws.speedgov.com.br/tipos_v1.xsd")
	@JsonProperty(value = "listarps", required = false)
	@Element(name = "ListaRps", required = false)
	private ListaRps listaRps;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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
