package com.github.prbrios.documentofiscal.nfe.status.retorno;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class RetConsStatServ {
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("versao")
	@Attribute(name = "versao")
	private String versao;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("tpAmb")
	@Element(name = "tpAmb")
	private String tpAmb;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("verAplic")
	@Element(name = "verAplic")
	private String verAplic;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cStat")
	@Element(name = "cStat")
	private String cStat;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("xMotivo")
	@Element(name = "xMotivo")
	private String xMotivo;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cUF")
	@Element(name = "cUF")
	private String cUF;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("dhRecbto")
	@Element(name = "dhRecbto")
	private String dhRecbto;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("dhRetorno")
	@Element(name = "dhRetorno", required = false)
	private String dhRetorno;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("xObs")
	@Element(name = "xObs", required = false)
	private String xObs;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("tMed")
	@Element(name = "tMed", required = false)
	private String tMed;

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

	public String getDhRecbto() {
		return dhRecbto;
	}

	public void setDhRecbto(String dhRecbto) {
		this.dhRecbto = dhRecbto;
	}

	public String getDhRetorno() {
		return dhRetorno;
	}

	public void setDhRetorno(String dhRetorno) {
		this.dhRetorno = dhRetorno;
	}

	public String getxObs() {
		return xObs;
	}

	public void setxObs(String xObs) {
		this.xObs = xObs;
	}

	public String gettMed() {
		return tMed;
	}

	public void settMed(String tMed) {
		this.tMed = tMed;
	}

}
