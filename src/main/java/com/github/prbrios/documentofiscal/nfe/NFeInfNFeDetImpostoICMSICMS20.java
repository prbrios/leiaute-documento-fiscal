package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@JsonRootName("icms20")
@Data
@Root(name = "ICMS20")
public class NFeInfNFeDetImpostoICMSICMS20 {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("orig")
    @Element(name = "orig", required = false)
    private String orig;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cst")
    @Element(name = "CST", required = false)
    private String CST;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("modbc")
    @Element(name = "modBC", required = false)
    private String modBC;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("predbc")
    @Element(name = "pRedBC", required = false)
    private String pRedBC;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vbc")
    @Element(name = "vBC", required = false)
    private String vBC;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("picms")
    @Element(name = "pICMS", required = false)
    private String pICMS;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vicms")
    @Element(name = "vICMS", required = false)
    private String vICMS;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vbcfcp")
    @Element(name = "vBCFCP", required = false)
    private String vBCFCP;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("pfcp")
    @Element(name = "pFCP", required = false)
    private String pFCP;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vfcp")
    @Element(name = "vFCP", required = false)
    private String vFCP;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vicmsdeson")
    @Element(name = "vICMSDeson", required = false)
    private String vICMSDeson;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("motdesicms")
    @Element(name = "motDesICMS", required = false)
    private String motDesICMS;

    public NFeInfNFeDetImpostoICMSICMS20() {}

    /**
     *
     * @param orig
     * @param CST
     * @param modBC
     * @param pRedBC
     * @param vBC
     * @param pICMS
     * @param vICMS
     * @param vBCFCP
     * @param pFCP
     * @param vFCP
     * @param vICMSDeson
     * @param motDesICMS
     */
    public NFeInfNFeDetImpostoICMSICMS20(String orig, String CST, String modBC, String pRedBC, String vBC, String pICMS, String vICMS, String vBCFCP, String pFCP, String vFCP, String vICMSDeson, String motDesICMS) {
        this.orig = orig;
        this.CST = CST;
        this.modBC = modBC;
        this.pRedBC = pRedBC;
        this.vBC = vBC;
        this.pICMS = pICMS;
        this.vICMS = vICMS;
        this.vBCFCP = vBCFCP;
        this.pFCP = pFCP;
        this.vFCP = vFCP;
        this.vICMSDeson = vICMSDeson;
        this.motDesICMS = motDesICMS;
    }

}
