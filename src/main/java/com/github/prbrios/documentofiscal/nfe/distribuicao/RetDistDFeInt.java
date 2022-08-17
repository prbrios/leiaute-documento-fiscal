package com.github.prbrios.documentofiscal.nfe.distribuicao;

import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("retdistdfeint")
@Root(name = "retDistDFeInt")
public class RetDistDFeInt {

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("versao")
    @Attribute(name="versao", required = false)
	private String versao;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("tpamb")
    @Element(name = "tpAmb", required = false)
	private String tpAmb;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("veraplic")
    @Element(name = "verAplic", required = false)
	private String verAplic;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cstat")
    @Element(name = "cStat", required = false)
	private String cStat;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("xmotivo")
    @Element(name = "xMotivo", required = false)
	private String xMotivo;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("dhresp")
    @Element(name = "dhResp", required = false)
	private String dhResp;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("ultnsu")
    @Element(name = "ultNSU", required = false)
	private String ultNSU;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("maxnsu")
    @Element(name = "maxNSU", required = false)
	private String maxNSU;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("lotedistdfeint")
    @Element(name = "loteDistDFeInt", required = false)
	private RetDistDFeIntLoteDistDFeInt loteDistDFeInt;

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

	public String getDhResp() {
		return dhResp;
	}

	public void setDhResp(String dhResp) {
		this.dhResp = dhResp;
	}

	public String getUltNSU() {
		return ultNSU;
	}

	public void setUltNSU(String ultNSU) {
		this.ultNSU = ultNSU;
	}

	public String getMaxNSU() {
		return maxNSU;
	}

	public void setMaxNSU(String maxNSU) {
		this.maxNSU = maxNSU;
	}

	public RetDistDFeIntLoteDistDFeInt getLoteDistDFeInt() {
		return loteDistDFeInt;
	}

	public void setLoteDistDFeInt(RetDistDFeIntLoteDistDFeInt loteDistDFeInt) {
		this.loteDistDFeInt = loteDistDFeInt;
	}
}
