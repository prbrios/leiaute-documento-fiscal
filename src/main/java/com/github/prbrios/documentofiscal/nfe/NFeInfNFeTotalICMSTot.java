package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@JsonRootName("icmstot")
@Data
@Root(name = "ICMSTot")
public class NFeInfNFeTotalICMSTot {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vbc")
    @Element(name = "vBC", required = false)
    private String vBC;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vicms")
    @Element(name = "vICMS", required = false)
    private String vICMS;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vicmsdeson")
    @Element(name = "vICMSDeson", required = false)
    private String vICMSDeson;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vfcpufdest")
    @Element(name = "vFCPUFDest", required = false)
    private String vFCPUFDest;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vicmsufdest")
    @Element(name = "vICMSUFDest", required = false)
    private String vICMSUFDest;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vicmsufremet")
    @Element(name = "vICMSUFRemet", required = false)
    private String vICMSUFRemet;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vfcp")
    @Element(name = "vFCP", required = false)
    private String vFCP;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vbcst")
    @Element(name = "vBCST", required = false)
    private String vBCST;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vst")
    @Element(name = "vST", required = false)
    private String vST;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vfcpst")
    @Element(name = "vFCPST", required = false)
    private String vFCPST;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vfcpstret")
    @Element(name = "vFCPSTRet", required = false)
    private String vFCPSTRet;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vprod")
    @Element(name = "vProd", required = false)
    private String vProd;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vfrete")
    @Element(name = "vFrete", required = false)
    private String vFrete;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vseg")
    @Element(name = "vSeg", required = false)
    private String vSeg;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vdesc")
    @Element(name = "vDesc", required = false)
    private String vDesc;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vii")
    @Element(name = "vII", required = false)
    private String vII;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vipi")
    @Element(name = "vIPI", required = false)
    private String vIPI;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vipidevol")
    @Element(name = "vIPIDevol", required = false)
    private String vIPIDevol;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vpis")
    @Element(name = "vPIS", required = false)
    private String vPIS;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vcofins")
    @Element(name = "vCOFINS", required = false)
    private String vCOFINS;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("voutro")
    @Element(name = "vOutro", required = false)
    private String vOutro;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vnf")
    @Element(name = "vNF", required = false)
    private String vNF;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vtottrib")
    @Element(name = "vTotTrib", required = false)
    private String vTotTrib;

    public NFeInfNFeTotalICMSTot() {}

    /**
     *
     * @param vBC
     * @param vICMS
     * @param vICMSDeson
     * @param vFCPUFDest
     * @param vICMSUFDest
     * @param vICMSUFRemet
     * @param vFCP
     * @param vBCST
     * @param vST
     * @param vFCPST
     * @param vFCPSTRet
     * @param vProd
     * @param vFrete
     * @param vSeg
     * @param vDesc
     * @param vII
     * @param vIPI
     * @param vIPIDevol
     * @param vPIS
     * @param vCOFINS
     * @param vOutro
     * @param vNF
     * @param vTotTrib
     */
    public NFeInfNFeTotalICMSTot(String vBC, String vICMS, String vICMSDeson, String vFCPUFDest, String vICMSUFDest, String vICMSUFRemet, String vFCP, String vBCST, String vST, String vFCPST, String vFCPSTRet, String vProd, String vFrete, String vSeg, String vDesc, String vII, String vIPI, String vIPIDevol, String vPIS, String vCOFINS, String vOutro, String vNF, String vTotTrib) {
        this.vBC = vBC;
        this.vICMS = vICMS;
        this.vICMSDeson = vICMSDeson;
        this.vFCPUFDest = vFCPUFDest;
        this.vICMSUFDest = vICMSUFDest;
        this.vICMSUFRemet = vICMSUFRemet;
        this.vFCP = vFCP;
        this.vBCST = vBCST;
        this.vST = vST;
        this.vFCPST = vFCPST;
        this.vFCPSTRet = vFCPSTRet;
        this.vProd = vProd;
        this.vFrete = vFrete;
        this.vSeg = vSeg;
        this.vDesc = vDesc;
        this.vII = vII;
        this.vIPI = vIPI;
        this.vIPIDevol = vIPIDevol;
        this.vPIS = vPIS;
        this.vCOFINS = vCOFINS;
        this.vOutro = vOutro;
        this.vNF = vNF;
        this.vTotTrib = vTotTrib;
    }

}
