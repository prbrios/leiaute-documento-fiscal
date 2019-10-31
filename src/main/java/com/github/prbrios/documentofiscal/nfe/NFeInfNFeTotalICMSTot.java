package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "ICMSTot")
public class NFeInfNFeTotalICMSTot {

    @Element(name = "vBC", required = false)
    private String vBC;

    @Element(name = "vICMS", required = false)
    private String vICMS;

    @Element(name = "vICMSDeson", required = false)
    private String vICMSDeson;

    @Element(name = "vFCPUFDest", required = false)
    private String vFCPUFDest;

    @Element(name = "vICMSUFDest", required = false)
    private String vICMSUFDest;

    @Element(name = "vICMSUFRemet", required = false)
    private String vICMSUFRemet;

    @Element(name = "vFCP", required = false)
    private String vFCP;

    @Element(name = "vBCST", required = false)
    private String vBCST;

    @Element(name = "vST", required = false)
    private String vST;

    @Element(name = "vFCPST", required = false)
    private String vFCPST;

    @Element(name = "vFCPSTRet", required = false)
    private String vFCPSTRet;

    @Element(name = "vProd", required = false)
    private String vProd;

    @Element(name = "vFrete", required = false)
    private String vFrete;

    @Element(name = "vSeg", required = false)
    private String vSeg;

    @Element(name = "vDesc", required = false)
    private String vDesc;

    @Element(name = "vII", required = false)
    private String vII;

    @Element(name = "vIPI", required = false)
    private String vIPI;

    @Element(name = "vIPIDevol", required = false)
    private String vIPIDevol;

    @Element(name = "vPIS", required = false)
    private String vPIS;

    @Element(name = "vCOFINS", required = false)
    private String vCOFINS;

    @Element(name = "vOutro", required = false)
    private String vOutro;

    @Element(name = "vNF", required = false)
    private String vNF;

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
