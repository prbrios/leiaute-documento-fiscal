package com.github.prbrios.documentofiscal.mdfe.v300a;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.github.prbrios.documentofiscal.assinatura.Signature;

@JsonRootName("reteventomdfe")
@Root(name = "retEventoMDFe")
@Namespace(reference = "http://www.portalfiscal.inf.br/mdfe")
public class TRetEvento {

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("versao")
	@Attribute(name = "versao", required = false)
	protected String versao;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("infevento")
	@Element(name = "infEvento", required = false)
	protected TRetEvento.InfEvento infEvento;
	
	@JsonIgnore
	@Element(name = "Signature", required = false)
	protected Signature signature;
	
	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public TRetEvento.InfEvento getInfEvento() {
		return infEvento;
	}

	public void setInfEvento(TRetEvento.InfEvento infEvento) {
		this.infEvento = infEvento;
	}

	public Signature getSignature() {
		return signature;
	}

	public void setSignature(Signature signature) {
		this.signature = signature;
	}

	@JsonRootName("infevento")
	@Root(name = "infEvento")
	public static class InfEvento {
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("id")
		@Attribute(name = "Id", required = false)
		protected String id;
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("tpamb")
		@Element(name = "tpAmb", required = false)
		protected String tpAmb;
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("veraplic")
		@Element(name = "verAplic", required = false)
		protected String verAplic;
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("corgao")
		@Element(name = "cOrgao", required = false)
		protected String cOrgao;
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("cstat")
		@Element(name = "cStat", required = false)
		protected String cStat;
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("xmotivo")
		@Element(name = "xMotivo", required = false)
		protected String xMotivo;
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("chmdfe")
		@Element(name = "chMDFe", required = false)
		protected String chMDFe;
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("tpevento")
		@Element(name = "tpEvento", required = false)
		protected String tpEvento;
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("xevento")
		@Element(name = "xEvento", required = false)
		protected String xEvento;
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("nseqevento")
		@Element(name = "nSeqEvento", required = false)
		protected String nSeqEvento;
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("dhregevento")
		@Element(name = "dhRegEvento", required = false)
		protected String dhRegEvento;
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("nprot")
		@Element(name = "nProt", required = false)
		protected String nProt;

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
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

		public String getcOrgao() {
			return cOrgao;
		}

		public void setcOrgao(String cOrgao) {
			this.cOrgao = cOrgao;
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

		public String getChMDFe() {
			return chMDFe;
		}

		public void setChMDFe(String chMDFe) {
			this.chMDFe = chMDFe;
		}

		public String getTpEvento() {
			return tpEvento;
		}

		public void setTpEvento(String tpEvento) {
			this.tpEvento = tpEvento;
		}

		public String getxEvento() {
			return xEvento;
		}

		public void setxEvento(String xEvento) {
			this.xEvento = xEvento;
		}

		public String getnSeqEvento() {
			return nSeqEvento;
		}

		public void setnSeqEvento(String nSeqEvento) {
			this.nSeqEvento = nSeqEvento;
		}

		public String getDhRegEvento() {
			return dhRegEvento;
		}

		public void setDhRegEvento(String dhRegEvento) {
			this.dhRegEvento = dhRegEvento;
		}

		public String getnProt() {
			return nProt;
		}

		public void setnProt(String nProt) {
			this.nProt = nProt;
		}
	}
}
