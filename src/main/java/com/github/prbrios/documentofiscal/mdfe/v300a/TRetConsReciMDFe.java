package com.github.prbrios.documentofiscal.mdfe.v300a;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("retconsrecimdfe")
@Root(name = "retConsReciMDFe")
public class TRetConsReciMDFe {

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("versao")
	@Attribute(name = "versao", required = false)
	protected String versao;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("tpamb")
	@Element(name = "tpAmb", required = false)
	protected String tpAmb;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("veraplic")
	@Element(name = "verAplic", required = false)
	protected String verAplic;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("nrec")
	@Element(name = "nRec", required = false)
	protected String nRec;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("cstat")
	@Element(name = "cStat", required = false)
	protected String cStat;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("xmotivo")
	@Element(name = "xMotivo", required = false)
	protected String xMotivo;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("cuf")
	@Element(name = "cUF", required = false)
	protected String cUF;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("protmdfe")
	@Element(name = "protMDFe", required = false)
	protected TProtMDFe protMDFe;

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
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

	public String getnRec() {
		return nRec;
	}

	public void setnRec(String nRec) {
		this.nRec = nRec;
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

	public String getcUF() {
		return cUF;
	}

	public void setcUF(String cUF) {
		this.cUF = cUF;
	}

	public TProtMDFe getProtMDFe() {
		return protMDFe;
	}

	public void setProtMDFe(TProtMDFe protMDFe) {
		this.protMDFe = protMDFe;
	}

}
