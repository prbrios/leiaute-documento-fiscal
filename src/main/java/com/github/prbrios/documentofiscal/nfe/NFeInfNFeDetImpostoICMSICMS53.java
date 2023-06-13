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
    @JsonProperty("adremicmsdif")
    @Element(name = "adRemICMSDif", required = false)
    private String adRemICMSDif;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vicmsmonodif")
    @Element(name = "vICMSMonoDif", required = false)
    private String vICMSMonoDif;

    public NFeInfNFeDetImpostoICMSICMS53() {
    }

    public NFeInfNFeDetImpostoICMSICMS53(String orig, String cST, String adRemICMSDif, String vICMSMonoDif) {
        this.orig = orig;
        this.CST = cST;
        this.adRemICMSDif = adRemICMSDif;
        this.vICMSMonoDif = vICMSMonoDif;
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

    public String getAdRemICMSDif() {
        return adRemICMSDif;
    }

    public void setAdRemICMSDif(String adRemICMSDif) {
        this.adRemICMSDif = adRemICMSDif;
    }

    public String getvICMSMonoDif() {
        return vICMSMonoDif;
    }

    public void setvICMSMonoDif(String vICMSMonoDif) {
        this.vICMSMonoDif = vICMSMonoDif;
    }

}
