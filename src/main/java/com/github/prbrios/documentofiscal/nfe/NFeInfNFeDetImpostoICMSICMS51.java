package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@JsonRootName("icms51")
@Data
@Root(name = "ICMS51")
public class NFeInfNFeDetImpostoICMSICMS51 {

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
    @JsonProperty("vicmsop")
    @Element(name = "vICMSOp", required = false)
    private String vICMSOp;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("pdif")
    @Element(name = "pDif", required = false)
    private String pDif;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vicmsdif")
    @Element(name = "vICMSDif", required = false)
    private String vICMSDif;

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

    public NFeInfNFeDetImpostoICMSICMS51() {}

    /**
     *
     * @param orig
     * @param CST
     * @param modBC
     * @param pRedBC
     * @param vBC
     * @param pICMS
     * @param vICMSOp
     * @param pDif
     * @param vICMSDif
     * @param vICMS
     * @param vBCFCP
     * @param pFCP
     * @param vFCP
     */
    public NFeInfNFeDetImpostoICMSICMS51(String orig, String CST, String modBC, String pRedBC, String vBC, String pICMS, String vICMSOp, String pDif, String vICMSDif, String vICMS, String vBCFCP, String pFCP, String vFCP) {
        this.orig = orig;
        this.CST = CST;
        this.modBC = modBC;
        this.pRedBC = pRedBC;
        this.vBC = vBC;
        this.pICMS = pICMS;
        this.vICMSOp = vICMSOp;
        this.pDif = pDif;
        this.vICMSDif = vICMSDif;
        this.vICMS = vICMS;
        this.vBCFCP = vBCFCP;
        this.pFCP = pFCP;
        this.vFCP = vFCP;
    }

}
