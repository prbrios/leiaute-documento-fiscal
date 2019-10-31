package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "ICMS60")
public class NFeInfNFeDetImpostoICMSICMS60 {

    @Element(name = "orig", required = false)
    private String orig;

    @Element(name = "CST", required = false)
    private String CST;


    @Element(name = "vBCSTRet", required = false)
    private String vBCSTRet;

    @Element(name = "pST", required = false)
    private String pST;

    @Element(name = "vICMSSubstituto", required = false)
    private String vICMSSubstituto;

    @Element(name = "vICMSSTRet", required = false)
    private String vICMSSTRet;


    @Element(name = "vBCFCPSTRet", required = false)
    private String vBCFCPSTRet;

    @Element(name = "pFCPSTRet", required = false)
    private String pFCPSTRet;

    @Element(name = "vFCPSTRet", required = false)
    private String vFCPSTRet;


    @Element(name = "pRedBCEfet", required = false)
    private String pRedBCEfet;

    @Element(name = "vBCEfet", required = false)
    private String vBCEfet;

    @Element(name = "pICMSEfet", required = false)
    private String pICMSEfet;

    @Element(name = "vICMSEfet", required = false)
    private String vICMSEfet;

    public NFeInfNFeDetImpostoICMSICMS60() {}

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
     * @param pRedBCEfet
     * @param vBCEfet
     * @param pICMSEfet
     * @param vICMSEfet
     */
    public NFeInfNFeDetImpostoICMSICMS60(String orig, String CST, String vBCSTRet, String pST, String vICMSSubstituto, String vICMSSTRet, String vBCFCPSTRet, String pFCPSTRet, String vFCPSTRet, String pRedBCEfet, String vBCEfet, String pICMSEfet, String vICMSEfet) {
        this.orig = orig;
        this.CST = CST;
        this.vBCSTRet = vBCSTRet;
        this.pST = pST;
        this.vICMSSubstituto = vICMSSubstituto;
        this.vICMSSTRet = vICMSSTRet;
        this.vBCFCPSTRet = vBCFCPSTRet;
        this.pFCPSTRet = pFCPSTRet;
        this.vFCPSTRet = vFCPSTRet;
        this.pRedBCEfet = pRedBCEfet;
        this.vBCEfet = vBCEfet;
        this.pICMSEfet = pICMSEfet;
        this.vICMSEfet = vICMSEfet;
    }

}
