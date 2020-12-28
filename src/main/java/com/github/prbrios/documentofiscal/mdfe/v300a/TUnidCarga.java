package com.github.prbrios.documentofiscal.mdfe.v300a;

import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

public class TUnidCarga {

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("tpunidcarga")
	@Element(name = "tpUnidCarga", required = false)
	protected String tpUnidCarga;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("idunidcarga")
	@Element(name = "idUnidCarga", required = false)
	protected String idUnidCarga;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("lacunidcarga")
	@ElementList(name = "lacUnidCarga", required = false, inline = true)
	protected List<TUnidCarga.LacUnidCarga> lacUnidCarga = new ArrayList<TUnidCarga.LacUnidCarga>();
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("qtdrat")
	@Element(name = "qtdRat", required = false)
	protected String qtdRat;
	
	public String getTpUnidCarga() {
		return tpUnidCarga;
	}

	public void setTpUnidCarga(String tpUnidCarga) {
		this.tpUnidCarga = tpUnidCarga;
	}

	public String getIdUnidCarga() {
		return idUnidCarga;
	}

	public void setIdUnidCarga(String idUnidCarga) {
		this.idUnidCarga = idUnidCarga;
	}

	public List<TUnidCarga.LacUnidCarga> getLacUnidCarga() {
		return lacUnidCarga;
	}

	public void setLacUnidCarga(List<TUnidCarga.LacUnidCarga> lacUnidCarga) {
		this.lacUnidCarga = lacUnidCarga;
	}

	public String getQtdRat() {
		return qtdRat;
	}

	public void setQtdRat(String qtdRat) {
		this.qtdRat = qtdRat;
	}

	@JsonRootName("lacunidcarga")
	@Root(name = "lacUnidCarga")
	public static class LacUnidCarga {
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("nlacre")
		@Element(name = "nLacre", required = false)
		protected String nLacre;
	}
}
