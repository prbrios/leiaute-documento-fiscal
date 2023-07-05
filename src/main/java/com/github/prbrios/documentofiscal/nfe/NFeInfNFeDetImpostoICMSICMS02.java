package com.github.prbrios.documentofiscal.nfe;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("icms02")
@Root(name = "ICMS02")
public class NFeInfNFeDetImpostoICMSICMS02 {

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

    public NFeInfNFeDetImpostoICMSICMS02() {
    }

    public NFeInfNFeDetImpostoICMSICMS02(String orig, String cST, String qBCMono, String adRemICMS, String vICMSMono) {
        this.orig = orig;
        this.CST = cST;
        this.qBCMono = qBCMono;
        this.adRemICMS = adRemICMS;
        this.vICMSMono = vICMSMono;
    }

    public String getOrig() {
        return orig;
    }

    public void setOrig(String orig) {
        this.orig = orig;
    }

    public String getCST() {
        return this.CST;
    }

    public void setCST(String cST) {
        this.CST = cST;
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

}
