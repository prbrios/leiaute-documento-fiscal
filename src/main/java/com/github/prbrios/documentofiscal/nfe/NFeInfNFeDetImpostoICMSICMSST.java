package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@JsonRootName("icmsst")
@Data
@Root(name = "ICMSST")
public class NFeInfNFeDetImpostoICMSICMSST {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("orig")
    @Element(name = "orig", required = false)
    private String orig;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cst")
    @Element(name = "CST", required = false)
    private String CST;


    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vbcstret")
    @Element(name = "vBCSTRet", required = false)
    private String vBCSTRet;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("pst")
    @Element(name = "pST", required = false)
    private String pST;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vicmssubstituto")
    @Element(name = "vICMSSubstituto", required = false)
    private String vICMSSubstituto;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vicmsstret")
    @Element(name = "vICMSSTRet", required = false)
    private String vICMSSTRet;


    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vbcfcpstret")
    @Element(name = "vBCFCPSTRet", required = false)
    private String vBCFCPSTRet;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("pfcpstret")
    @Element(name = "pFCPSTRet", required = false)
    private String pFCPSTRet;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vfcpstret")
    @Element(name = "vFCPSTRet", required = false)
    private String vFCPSTRet;


    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vbcstdest")
    @Element(name = "vBCSTDest", required = false)
    private String vBCSTDest;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vicmsstdest")
    @Element(name = "vICMSSTDest", required = false)
    private String vICMSSTDest;


    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("predbcefet")
    @Element(name = "pRedBCEfet", required = false)
    private String pRedBCEfet;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vbcefet")
    @Element(name = "vBCEfet", required = false)
    private String vBCEfet;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("picmsefet")
    @Element(name = "pICMSEfet", required = false)
    private String pICMSEfet;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vicmsefet")
    @Element(name = "vICMSEfet", required = false)
    private String vICMSEfet;

    public NFeInfNFeDetImpostoICMSICMSST() {}

    /**
     *
     * @param orig
     * @param CST
     * @param vBCSTRet
     * @param pST
     * @param vICMSSubstituto
     * @param vICMSSTRet
     * @param vBCFCPSTRet
     * @param pFCPSTRet
     * @param vFCPSTRet
     * @param vBCSTDest
     * @param vICMSSTDest
     * @param pRedBCEfet
     * @param vBCEfet
     * @param pICMSEfet
     * @param vICMSEfet
     */
    public NFeInfNFeDetImpostoICMSICMSST(String orig, String CST, String vBCSTRet, String pST, String vICMSSubstituto, String vICMSSTRet, String vBCFCPSTRet, String pFCPSTRet, String vFCPSTRet, String vBCSTDest, String vICMSSTDest, String pRedBCEfet, String vBCEfet, String pICMSEfet, String vICMSEfet) {
        this.orig = orig;
        this.CST = CST;
        this.vBCSTRet = vBCSTRet;
        this.pST = pST;
        this.vICMSSubstituto = vICMSSubstituto;
        this.vICMSSTRet = vICMSSTRet;
        this.vBCFCPSTRet = vBCFCPSTRet;
        this.pFCPSTRet = pFCPSTRet;
        this.vFCPSTRet = vFCPSTRet;
        this.vBCSTDest = vBCSTDest;
        this.vICMSSTDest = vICMSSTDest;
        this.pRedBCEfet = pRedBCEfet;
        this.vBCEfet = vBCEfet;
        this.pICMSEfet = pICMSEfet;
        this.vICMSEfet = vICMSEfet;
    }

}
