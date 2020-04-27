package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@JsonRootName("icms30")
@Data
@Root(name = "ICMS30")
public class NFeInfNFeDetImpostoICMSICMS30 {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("orig")
    @Element(name = "orig", required = false)
    private String orig;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cst")
    @Element(name = "CST", required = false)
    private String CST;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("modbcst")
    @Element(name = "modBCST", required = false)
    private String modBCST;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("pmvast")
    @Element(name = "pMVAST", required = false)
    private String pMVAST;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("predbcst")
    @Element(name = "pRedBCST", required = false)
    private String pRedBCST;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vbcst")
    @Element(name = "vBCST", required = false)
    private String vBCST;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("picmsst")
    @Element(name = "pICMSST", required = false)
    private String pICMSST;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vicmsst")
    @Element(name = "vICMSST", required = false)
    private String vICMSST;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vbcfcpst")
    @Element(name = "vBCFCPST", required = false)
    private String vBCFCPST;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("pfcpst")
    @Element(name = "pFCPST", required = false)
    private String pFCPST;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vfcpst")
    @Element(name = "vFCPST", required = false)
    private String vFCPST;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vicmsdeson")
    @Element(name = "vICMSDeson", required = false)
    private String vICMSDeson;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("motdesicms")
    @Element(name = "motDesICMS", required = false)
    private String motDesICMS;

    public NFeInfNFeDetImpostoICMSICMS30() {}

    /**
     *
     * @param orig
     * @param CST
     * @param modBCST
     * @param pMVAST
     * @param pRedBCST
     * @param vBCST
     * @param pICMSST
     * @param vICMSST
     * @param vBCFCPST
     * @param pFCPST
     * @param vFCPST
     * @param vICMSDeson
     * @param motDesICMS
     */
    public NFeInfNFeDetImpostoICMSICMS30(String orig, String CST, String modBCST, String pMVAST, String pRedBCST, String vBCST, String pICMSST, String vICMSST, String vBCFCPST, String pFCPST, String vFCPST, String vICMSDeson, String motDesICMS) {
        this.orig = orig;
        this.CST = CST;
        this.modBCST = modBCST;
        this.pMVAST = pMVAST;
        this.pRedBCST = pRedBCST;
        this.vBCST = vBCST;
        this.pICMSST = pICMSST;
        this.vICMSST = vICMSST;
        this.vBCFCPST = vBCFCPST;
        this.pFCPST = pFCPST;
        this.vFCPST = vFCPST;
        this.vICMSDeson = vICMSDeson;
        this.motDesICMS = motDesICMS;
    }

}
