package com.github.prbrios.documentofiscal.mdfe.v300a;

import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

public class TUnidadeTransp {

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("tpunidtransp")
	@Element(name = "tpUnidTransp", required = false)
	protected String tpUnidTransp;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("idunidtransp")
	@Element(name = "idUnidTransp", required = false)
	protected String idUnidTransp;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("lacunidtransp")
	@ElementList(name = "lacUnidTransp", required = false, inline = true)
	protected List<TUnidadeTransp.LacUnidTransp> lacUnidTransp = new ArrayList<TUnidadeTransp.LacUnidTransp>();
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("infunidcarga")
	@ElementList(name = "infUnidCarga", required = false, inline = true)
	protected List<TUnidadeTransp.InfUnidCarga> infUnidCarga = new ArrayList<TUnidadeTransp.InfUnidCarga>();
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("qtdrat")
	@Element(name = "qtdRat", required = false)
	protected String qtdRat;

	public String getTpUnidTransp() {
		return tpUnidTransp;
	}

	public void setTpUnidTransp(String tpUnidTransp) {
		this.tpUnidTransp = tpUnidTransp;
	}

	public String getIdUnidTransp() {
		return idUnidTransp;
	}

	public void setIdUnidTransp(String idUnidTransp) {
		this.idUnidTransp = idUnidTransp;
	}

	public List<TUnidadeTransp.LacUnidTransp> getLacUnidTransp() {
		return lacUnidTransp;
	}

	public void setLacUnidTransp(List<TUnidadeTransp.LacUnidTransp> lacUnidTransp) {
		this.lacUnidTransp = lacUnidTransp;
	}

	public List<TUnidadeTransp.InfUnidCarga> getInfUnidCarga() {
		return infUnidCarga;
	}

	public void setInfUnidCarga(List<TUnidadeTransp.InfUnidCarga> infUnidCarga) {
		this.infUnidCarga = infUnidCarga;
	}

	public String getQtdRat() {
		return qtdRat;
	}

	public void setQtdRat(String qtdRat) {
		this.qtdRat = qtdRat;
	}

	@JsonRootName("infunidcarga")
	@Root(name = "infUnidCarga")
	public static class InfUnidCarga extends TUnidCarga {
		
	}
	
	@JsonRootName("lacunidtransp")
	@Root(name = "lacUnidTransp")
	public static class LacUnidTransp {
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("nlacre")
		@Element(name = "nLacre", required = false)
		protected String nLacre;
	}
}
