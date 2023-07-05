package com.github.prbrios.documentofiscal.nfe;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("icms15")
@Root(name = "ICMS15")
public class NFeInfNFeDetImpostoICMSICMS15 {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("orig")
    @Element(name = "orig", required = false)
    private String orig;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cst")
    @Element(name = "CST", required = false)
    private String CST;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("qbcmono")
    @Element(name = "qBCMono", required = false)
    private String qBCMono;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("adremicms")
    @Element(name = "adRemICMS", required = false)
    private String adRemICMS;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vicmsmono")
    @Element(name = "vICMSMono", required = false)
    private String vICMSMono;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("qbcmonoreten")
    @Element(name = "qBCMonoReten", required = false)
    private String qBCMonoReten;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("adremicmsreten")
    @Element(name = "adRemICMSReten", required = false)
    private String adRemICMSReten;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vicmsmonoreten")
    @Element(name = "vICMSMonoReten", required = false)
    private String vICMSMonoReten;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("predadrem")
    @Element(name = "pRedAdRem", required = false)
    private String pRedAdRem;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("motredadrem")
    @Element(name = "motRedAdRem", required = false)
    private String motRedAdRem;

    public NFeInfNFeDetImpostoICMSICMS15() {
    }

    /**
     * 
     * @param orig
     * @param cST
     * @param qBCMono
     * @param adRemICMS
     * @param vICMSMono
     * @param qBCMonoReten
     * @param adRemICMSReten
     * @param vICMSMonoReten
     * @param pRedAdRem
     * @param motRedAdRem
     */
    public NFeInfNFeDetImpostoICMSICMS15(String orig, String cST, String qBCMono, String adRemICMS, String vICMSMono,
            String qBCMonoReten, String adRemICMSReten, String vICMSMonoReten, String pRedAdRem, String motRedAdRem) {
        this.orig = orig;
        CST = cST;
        this.qBCMono = qBCMono;
        this.adRemICMS = adRemICMS;
        this.vICMSMono = vICMSMono;
        this.qBCMonoReten = qBCMonoReten;
        this.adRemICMSReten = adRemICMSReten;
        this.vICMSMonoReten = vICMSMonoReten;
        this.pRedAdRem = pRedAdRem;
        this.motRedAdRem = motRedAdRem;
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

    public String getqBCMono() {
        return qBCMono;
    }

    public void setqBCMono(String qBCMono) {
        this.qBCMono = qBCMono;
    }

    public String getAdRemICMS() {
        return adRemICMS;
    }

    public void setAdRemICMS(String adRemICMS) {
        this.adRemICMS = adRemICMS;
    }

    public String getvICMSMono() {
        return vICMSMono;
    }

    public void setvICMSMono(String vICMSMono) {
        this.vICMSMono = vICMSMono;
    }

    public String getqBCMonoReten() {
        return qBCMonoReten;
    }

    public void setqBCMonoReten(String qBCMonoReten) {
        this.qBCMonoReten = qBCMonoReten;
    }

    public String getAdRemICMSReten() {
        return adRemICMSReten;
    }

    public void setAdRemICMSReten(String adRemICMSReten) {
        this.adRemICMSReten = adRemICMSReten;
    }

    public String getvICMSMonoReten() {
        return vICMSMonoReten;
    }

    public void setvICMSMonoReten(String vICMSMonoReten) {
        this.vICMSMonoReten = vICMSMonoReten;
    }

    public String getpRedAdRem() {
        return pRedAdRem;
    }

    public void setpRedAdRem(String pRedAdRem) {
        this.pRedAdRem = pRedAdRem;
    }

    public String getMotRedAdRem() {
        return motRedAdRem;
    }

    public void setMotRedAdRem(String motRedAdRem) {
        this.motRedAdRem = motRedAdRem;
    }

}
