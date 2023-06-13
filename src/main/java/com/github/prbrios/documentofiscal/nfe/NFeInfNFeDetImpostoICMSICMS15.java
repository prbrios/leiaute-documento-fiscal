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
    @JsonProperty("adremicms")
    @Element(name = "adRemICMS", required = false)
    private String adRemICMS;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vicmsmono")
    @Element(name = "vICMSMono", required = false)
    private String vICMSMono;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("adremicmsreten")
    @Element(name = "adRemICMSReten", required = false)
    private String adRemICMSReten;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vicmsmonoreten")
    @Element(name = "vICMSMonoReten", required = false)
    private String vICMSMonoReten;

    public NFeInfNFeDetImpostoICMSICMS15() {
    }

    /**
     * @param orig
     * @param cST
     * @param adRemICMS
     * @param vICMSMono
     * @param adRemICMSReten
     * @param vICMSMonoReten
     */
    public NFeInfNFeDetImpostoICMSICMS15(String orig, String cST, String adRemICMS, String vICMSMono,
            String adRemICMSReten, String vICMSMonoReten) {
        this.orig = orig;
        this.CST = cST;
        this.adRemICMS = adRemICMS;
        this.vICMSMono = vICMSMono;
        this.adRemICMSReten = adRemICMSReten;
        this.vICMSMonoReten = vICMSMonoReten;
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

}
