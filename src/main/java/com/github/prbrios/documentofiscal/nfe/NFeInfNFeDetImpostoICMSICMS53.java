package com.github.prbrios.documentofiscal.nfe;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("icms53")
@Root(name = "ICMS53")
public class NFeInfNFeDetImpostoICMSICMS53 {

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
    @JsonProperty("vicmsmonoop")
    @Element(name = "vICMSMonoOp", required = false)
    private String vICMSMonoOp;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("pdif")
    @Element(name = "pDif", required = false)
    private String pDif;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vicmsmonodif")
    @Element(name = "vICMSMonoDif", required = false)
    private String vICMSMonoDif;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vicmsmono")
    @Element(name = "vICMSMono", required = false)
    private String vICMSMono;

    public NFeInfNFeDetImpostoICMSICMS53() {
    }

    /**
     * 
     * @param orig
     * @param cST
     * @param qBCMono
     * @param adRemICMS
     * @param vICMSMonoOp
     * @param pDif
     * @param vICMSMonoDif
     * @param vICMSMono
     */
    public NFeInfNFeDetImpostoICMSICMS53(String orig, String cST, String qBCMono, String adRemICMS, String vICMSMonoOp,
            String pDif, String vICMSMonoDif, String vICMSMono) {
        this.orig = orig;
        CST = cST;
        this.qBCMono = qBCMono;
        this.adRemICMS = adRemICMS;
        this.vICMSMonoOp = vICMSMonoOp;
        this.pDif = pDif;
        this.vICMSMonoDif = vICMSMonoDif;
        this.vICMSMono = vICMSMono;
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

    public String getvICMSMonoOp() {
        return vICMSMonoOp;
    }

    public void setvICMSMonoOp(String vICMSMonoOp) {
        this.vICMSMonoOp = vICMSMonoOp;
    }

    public String getpDif() {
        return pDif;
    }

    public void setpDif(String pDif) {
        this.pDif = pDif;
    }

    public String getvICMSMonoDif() {
        return vICMSMonoDif;
    }

    public void setvICMSMonoDif(String vICMSMonoDif) {
        this.vICMSMonoDif = vICMSMonoDif;
    }

    public String getvICMSMono() {
        return vICMSMono;
    }

    public void setvICMSMono(String vICMSMono) {
        this.vICMSMono = vICMSMono;
    }

}
