package com.github.prbrios.documentofiscal.mdfe.v300a;

import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("aquav")
@Root(name = "aquav")
public class Aquav {

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("irin")
	@Element(name = "irin", required = false)
	protected String irin;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("tpemb")
	@Element(name = "tpEmb", required = false)
	protected String tpEmb;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("cembar")
	@Element(name = "cEmbar", required = false)
	protected String cEmbar;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("xembar")
	@Element(name = "xEmbar", required = false)
	protected String xEmbar;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("nviag")
	@Element(name = "nViag", required = false)
	protected String nViag;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("cprtemb")
	@Element(name = "cPrtEmb", required = false)
	protected String cPrtEmb;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("cprtdest")
	@Element(name = "cPrtDest", required = false)
	protected String cPrtDest;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("prttrans")
	@Element(name = "prtTrans", required = false)
	protected String prtTrans;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("tpnav")
	@Element(name = "tpNav", required = false)
	protected String tpNav;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("inftermcarreg")
	@ElementList(name = "infTermCarreg", required = false, inline = true)
	protected List<Aquav.InfTermCarreg> infTermCarreg = new ArrayList<Aquav.InfTermCarreg>();
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("inftermdescarreg")
	@ElementList(name = "infTermDescarreg", required = false, inline = true)
	protected List<Aquav.InfTermDescarreg> infTermDescarreg = new ArrayList<Aquav.InfTermDescarreg>();
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("infembcomb")
	@ElementList(name = "infEmbComb", required = false, inline = true)
	protected List<Aquav.InfEmbComb> infEmbComb = new ArrayList<Aquav.InfEmbComb>();
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("infunidcargavazia")
	@ElementList(name = "infUnidCargaVazia", required = false, inline = true)
	protected List<Aquav.InfUnidCargaVazia> infUnidCargaVazia = new ArrayList<Aquav.InfUnidCargaVazia>();
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("infunidtranspvazia")
	@ElementList(name = "infUnidTranspVazia", required = false, inline = true)
	protected List<Aquav.InfUnidTranspVazia> infUnidTranspVazia = new ArrayList<Aquav.InfUnidTranspVazia>();
	
	public String getIrin() {
		return irin;
	}

	public void setIrin(String irin) {
		this.irin = irin;
	}

	public String getTpEmb() {
		return tpEmb;
	}

	public void setTpEmb(String tpEmb) {
		this.tpEmb = tpEmb;
	}

	public String getcEmbar() {
		return cEmbar;
	}

	public void setcEmbar(String cEmbar) {
		this.cEmbar = cEmbar;
	}

	public String getxEmbar() {
		return xEmbar;
	}

	public void setxEmbar(String xEmbar) {
		this.xEmbar = xEmbar;
	}

	public String getnViag() {
		return nViag;
	}

	public void setnViag(String nViag) {
		this.nViag = nViag;
	}

	public String getcPrtEmb() {
		return cPrtEmb;
	}

	public void setcPrtEmb(String cPrtEmb) {
		this.cPrtEmb = cPrtEmb;
	}

	public String getcPrtDest() {
		return cPrtDest;
	}

	public void setcPrtDest(String cPrtDest) {
		this.cPrtDest = cPrtDest;
	}

	public String getPrtTrans() {
		return prtTrans;
	}

	public void setPrtTrans(String prtTrans) {
		this.prtTrans = prtTrans;
	}

	public String getTpNav() {
		return tpNav;
	}

	public void setTpNav(String tpNav) {
		this.tpNav = tpNav;
	}

	public List<Aquav.InfTermCarreg> getInfTermCarreg() {
		return infTermCarreg;
	}

	public void setInfTermCarreg(List<Aquav.InfTermCarreg> infTermCarreg) {
		this.infTermCarreg = infTermCarreg;
	}

	public List<Aquav.InfTermDescarreg> getInfTermDescarreg() {
		return infTermDescarreg;
	}

	public void setInfTermDescarreg(List<Aquav.InfTermDescarreg> infTermDescarreg) {
		this.infTermDescarreg = infTermDescarreg;
	}

	public List<Aquav.InfEmbComb> getInfEmbComb() {
		return infEmbComb;
	}

	public void setInfEmbComb(List<Aquav.InfEmbComb> infEmbComb) {
		this.infEmbComb = infEmbComb;
	}

	public List<Aquav.InfUnidCargaVazia> getInfUnidCargaVazia() {
		return infUnidCargaVazia;
	}

	public void setInfUnidCargaVazia(List<Aquav.InfUnidCargaVazia> infUnidCargaVazia) {
		this.infUnidCargaVazia = infUnidCargaVazia;
	}

	public List<Aquav.InfUnidTranspVazia> getInfUnidTranspVazia() {
		return infUnidTranspVazia;
	}

	public void setInfUnidTranspVazia(List<Aquav.InfUnidTranspVazia> infUnidTranspVazia) {
		this.infUnidTranspVazia = infUnidTranspVazia;
	}

	@JsonRootName("inftermcarreg")
	@Root(name = "infTermCarreg")
	public static class InfTermCarreg {
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("ctermcarreg")
		@Element(name = "cTermCarreg", required = false)
		protected String cTermCarreg;
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("xtermcarreg")
		@Element(name = "xTermCarreg", required = false)
		protected String xTermCarreg;

		public String getcTermCarreg() {
			return cTermCarreg;
		}

		public void setcTermCarreg(String cTermCarreg) {
			this.cTermCarreg = cTermCarreg;
		}

		public String getxTermCarreg() {
			return xTermCarreg;
		}

		public void setxTermCarreg(String xTermCarreg) {
			this.xTermCarreg = xTermCarreg;
		}
	}
	
	@JsonRootName("inftermdescarreg")
	@Root(name = "infTermDescarreg")
	public static class InfTermDescarreg {
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("ctermdescarreg")
		@Element(name = "cTermDescarreg", required = false)
		protected String cTermDescarreg;
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("xtermdescarreg")
		@Element(name = "xTermDescarreg", required = false)
		protected String xTermDescarreg;

		public String getcTermDescarreg() {
			return cTermDescarreg;
		}

		public void setcTermDescarreg(String cTermDescarreg) {
			this.cTermDescarreg = cTermDescarreg;
		}

		public String getxTermDescarreg() {
			return xTermDescarreg;
		}

		public void setxTermDescarreg(String xTermDescarreg) {
			this.xTermDescarreg = xTermDescarreg;
		}
	}
	
	@JsonRootName("infembcomb")
	@Root(name = "infEmbComb")
	public static class InfEmbComb {
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("cembcomb")
		@Element(name = "cEmbComb", required = false)
		protected String cEmbComb;
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("xbalsa")
		@Element(name = "xBalsa", required = false)
		protected String xBalsa;

		public String getcEmbComb() {
			return cEmbComb;
		}

		public void setcEmbComb(String cEmbComb) {
			this.cEmbComb = cEmbComb;
		}

		public String getxBalsa() {
			return xBalsa;
		}

		public void setxBalsa(String xBalsa) {
			this.xBalsa = xBalsa;
		}
	}
	
	@JsonRootName("infunidcargavazia")
	@Root(name = "infUnidCargaVazia")
	public static class InfUnidCargaVazia {
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("idunidcargavazia")
		@Element(name = "idUnidCargaVazia", required = false)
		protected String idUnidCargaVazia;
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("tpunidcargavazia")
		@Element(name = "tpUnidCargaVazia", required = false)
		protected String tpUnidCargaVazia;

		public String getIdUnidCargaVazia() {
			return idUnidCargaVazia;
		}

		public void setIdUnidCargaVazia(String idUnidCargaVazia) {
			this.idUnidCargaVazia = idUnidCargaVazia;
		}

		public String getTpUnidCargaVazia() {
			return tpUnidCargaVazia;
		}

		public void setTpUnidCargaVazia(String tpUnidCargaVazia) {
			this.tpUnidCargaVazia = tpUnidCargaVazia;
		}
	}
	
	@JsonRootName("infunidtranspvazia")
	@Root(name = "infUnidTranspVazia")
	public static class InfUnidTranspVazia {
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("idunidtranspvazia")
		@Element(name = "idUnidTranspVazia", required = false)
		protected String idUnidTranspVazia;
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("tpunidtranspvazia")
		@Element(name = "tpUnidTranspVazia", required = false)
		protected String tpUnidTranspVazia;

		public String getIdUnidTranspVazia() {
			return idUnidTranspVazia;
		}

		public void setIdUnidTranspVazia(String idUnidTranspVazia) {
			this.idUnidTranspVazia = idUnidTranspVazia;
		}

		public String getTpUnidTranspVazia() {
			return tpUnidTranspVazia;
		}

		public void setTpUnidTranspVazia(String tpUnidTranspVazia) {
			this.tpUnidTranspVazia = tpUnidTranspVazia;
		}
	}
}
