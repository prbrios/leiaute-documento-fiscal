package com.github.prbrios.documentofiscal.nfe;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("icms61")
@Root(name = "ICMS61")
public class NFeInfNFeDetImpostoICMSICMS61 {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("orig")
    @Element(name = "orig", required = false)
    private String orig;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cst")
    @Element(name = "CST", required = false)
    private String CST;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("qbcmonoret")
    @Element(name = "qBCMonoRet", required = false)
    private String qBCMonoRet;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("adremicmsret")
    @Element(name = "adRemICMSRet", required = false)
    private String adRemICMSRet;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vicmsmonoret")
    @Element(name = "vICMSMonoRet", required = false)
    private String vICMSMonoRet;

    public NFeInfNFeDetImpostoICMSICMS61() {
    }

    /**
     * 
     * @param orig
     * @param cST
     * @param qBCMonoRet
     * @param adRemICMSRet
     * @param vICMSMonoRet
     */
    public NFeInfNFeDetImpostoICMSICMS61(String orig, String cST, String qBCMonoRet, String adRemICMSRet,
            String vICMSMonoRet) {
        this.orig = orig;
        this.CST = cST;
        this.qBCMonoRet = qBCMonoRet;
        this.adRemICMSRet = adRemICMSRet;
        this.vICMSMonoRet = vICMSMonoRet;
    }

    public String getOrig() {
        return orig;
    }

    public void setOrig(String orig) {
        this.orig = orig;
    }

    public String getCST() {
        return CST;
    }

    public void setCST(String cST) {
        CST = cST;
    }

    public String getAdRemICMSRet() {
        return adRemICMSRet;
    }

    public void setAdRemICMSRet(String adRemICMSRet) {
        this.adRemICMSRet = adRemICMSRet;
    }

    public String getvICMSMonoRet() {
        return vICMSMonoRet;
    }

    public void setvICMSMonoRet(String vICMSMonoRet) {
        this.vICMSMonoRet = vICMSMonoRet;
    }

    public String getqBCMonoRet() {
        return qBCMonoRet;
    }

    public void setqBCMonoRet(String qBCMonoRet) {
        this.qBCMonoRet = qBCMonoRet;
    }

}
