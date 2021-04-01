package com.github.prbrios.documentofiscal.nfse.ce.fortaleza.v3;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

@JsonRootName("loterps")
@Root(name = "LoteRps")
public class LoteRps {

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("id")
	@Attribute(name = "Id", required = false)
	protected String id;

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("numerolote")
	@Element(name = "NumeroLote", required = false)
	@Namespace(reference = "http://www.ginfes.com.br/tipos_v03.xsd")
	protected String numeroLote;

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("cnpj")
	@Element(name = "Cnpj", required = false)
	@Namespace(reference = "http://www.ginfes.com.br/tipos_v03.xsd")
	protected String cnpj;

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("inscricaomunicipal")
	@Element(name = "InscricaoMunicipal", required = false)
	@Namespace(reference = "http://www.ginfes.com.br/tipos_v03.xsd")
	protected String inscricaoMunicipal;

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("quantidaderps")
	@Element(name = "QuantidadeRps", required = false)
	@Namespace(reference = "http://www.ginfes.com.br/tipos_v03.xsd")
	protected String quantidadeRps;

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("listarps")
	@Element(name = "ListaRps", required = false)
	protected LoteRps.ListaRps listaRps;
	
	@JsonRootName("listarps")
	@Root(name = "ListaRps")
	@Namespace(reference = "http://www.ginfes.com.br/tipos_v03.xsd")
	public static class ListaRps {

		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("rps")
		@ElementList(name = "Rps", required = false, inline = true)
		protected List<Rps> rps = new ArrayList<Rps>();

		public List<Rps> getRps() {
			return rps;
		}

		public void setRps(List<Rps> rps) {
			this.rps = rps;
		}

	}

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

	public LoteRps.ListaRps getListaRps() {
		return listaRps;
	}

	public void setListaRps(LoteRps.ListaRps listaRps) {
		this.listaRps = listaRps;
	}

}
