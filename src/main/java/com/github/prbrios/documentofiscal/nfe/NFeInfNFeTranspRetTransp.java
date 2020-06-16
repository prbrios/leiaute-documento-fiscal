package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@JsonRootName("rettransp")
@Root(name = "retTransp")
public class NFeInfNFeTranspRetTransp {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vserv")
    @Element(name = "vServ", required = false)
    private String vServ;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vbcret")
    @Element(name = "vBCRet", required = false)
    private String vBCRet;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("picmsret")
    @Element(name = "pICMSRet", required = false)
    private String pICMSRet;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vicmsret")
    @Element(name = "vICMSRet", required = false)
    private String vICMSRet;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cfop")
    @Element(name = "CFOP", required = false)
    private String CFOP;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cmunfg")
    @Element(name = "cMunFG", required = false)
    private String cMunFG;

    public NFeInfNFeTranspRetTransp() {}

    /**
     *
     * @param vServ
     * @param vBCRet
     * @param pICMSRet
     * @param vICMSRet
     * @param CFOP
     * @param cMunFG
     */
    public NFeInfNFeTranspRetTransp(String vServ, String vBCRet, String pICMSRet, String vICMSRet, String CFOP, String cMunFG) {
        this.vServ = vServ;
        this.vBCRet = vBCRet;
        this.pICMSRet = pICMSRet;
        this.vICMSRet = vICMSRet;
        this.CFOP = CFOP;
        this.cMunFG = cMunFG;
    }

	public String getvServ() {
		return vServ;
	}

	public void setvServ(String vServ) {
		this.vServ = vServ;
	}

	public String getvBCRet() {
		return vBCRet;
	}

	public void setvBCRet(String vBCRet) {
		this.vBCRet = vBCRet;
	}

	public String getpICMSRet() {
		return pICMSRet;
	}

	public void setpICMSRet(String pICMSRet) {
		this.pICMSRet = pICMSRet;
	}

	public String getvICMSRet() {
		return vICMSRet;
	}

	public void setvICMSRet(String vICMSRet) {
		this.vICMSRet = vICMSRet;
	}

	public String getCFOP() {
		return CFOP;
	}

	public void setCFOP(String cFOP) {
		CFOP = cFOP;
	}

	public String getcMunFG() {
		return cMunFG;
	}

	public void setcMunFG(String cMunFG) {
		this.cMunFG = cMunFG;
	}

}
