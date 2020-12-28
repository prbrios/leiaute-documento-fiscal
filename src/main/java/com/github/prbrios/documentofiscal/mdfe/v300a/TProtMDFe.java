package com.github.prbrios.documentofiscal.mdfe.v300a;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.github.prbrios.documentofiscal.assinatura.Signature;

@JsonRootName("protmdfe")
@Root(name = "protMDFe")
public
class TProtMDFe {

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("versao")
	@Attribute(name = "versao", required = false)
	protected String versao;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("infprot")
	@Element(name = "infProt", required = false)
	protected TProtMDFe.InfProt infProt;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("inffisco")
	@Element(name = "infFiscl", required = false)
	protected TProtMDFe.InfFisco infFisco;
	
	protected Signature signature;
	
	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public TProtMDFe.InfProt getInfProt() {
		return infProt;
	}

	public void setInfProt(TProtMDFe.InfProt infProt) {
		this.infProt = infProt;
	}

	public TProtMDFe.InfFisco getInfFisco() {
		return infFisco;
	}

	public void setInfFisco(TProtMDFe.InfFisco infFisco) {
		this.infFisco = infFisco;
	}

	public Signature getSignature() {
		return signature;
	}

	public void setSignature(Signature signature) {
		this.signature = signature;
	}

	protected TProtMDFe() {
		
	}

	@JsonRootName("infprot")
	@Root(name = "infProt")
	public static class InfProt {
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("id")
		@Attribute(name = "Id", required = false)
		protected String Id;
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("tpamb")
		@Element(name = "tpAmb", required = false)
		protected String tpAmb;
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("veraplic")
		@Element(name = "verAplic", required = false)
		protected String verAplic;
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("chmdfe")
		@Element(name = "chMDFe", required = false)
		protected String chMDFe;
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("dhrecbto")
		@Element(name = "dhRecbto", required = false)
		protected String dhRecbto;
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("nprot")
		@Element(name = "nProt", required = false)
		protected String nProt;
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("digval")
		@Element(name = "digVal", required = false)
		protected String digVal;
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("cstat")
		@Element(name = "cStat", required = false)
		protected String cStat;
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("xmotivo")
		@Element(name = "xMotivo", required = false)
		protected String xMotivo;

		public String getId() {
			return Id;
		}

		public void setId(String id) {
			Id = id;
		}

		public String getTpAmb() {
			return tpAmb;
		}

		public void setTpAmb(String tpAmb) {
			this.tpAmb = tpAmb;
		}

		public String getVerAplic() {
			return verAplic;
		}

		public void setVerAplic(String verAplic) {
			this.verAplic = verAplic;
		}

		public String getChMDFe() {
			return chMDFe;
		}

		public void setChMDFe(String chMDFe) {
			this.chMDFe = chMDFe;
		}

		public String getDhRecbto() {
			return dhRecbto;
		}

		public void setDhRecbto(String dhRecbto) {
			this.dhRecbto = dhRecbto;
		}

		public String getnProt() {
			return nProt;
		}

		public void setnProt(String nProt) {
			this.nProt = nProt;
		}

		public String getDigVal() {
			return digVal;
		}

		public void setDigVal(String digVal) {
			this.digVal = digVal;
		}

		public String getcStat() {
			return cStat;
		}

		public void setcStat(String cStat) {
			this.cStat = cStat;
		}

		public String getxMotivo() {
			return xMotivo;
		}

		public void setxMotivo(String xMotivo) {
			this.xMotivo = xMotivo;
		}
	}
	
	@JsonRootName("inffisco")
	@Root(name = "infFisco")
	public static class InfFisco {
	
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("cmsg")
		@Element(name = "cMsg", required = false)
		protected String cMsg;
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("xmsg")
		@Element(name = "xMsg", required = false)
		protected String xMsg;

		public String getcMsg() {
			return cMsg;
		}

		public void setcMsg(String cMsg) {
			this.cMsg = cMsg;
		}

		public String getxMsg() {
			return xMsg;
		}

		public void setxMsg(String xMsg) {
			this.xMsg = xMsg;
		}
	}
}
