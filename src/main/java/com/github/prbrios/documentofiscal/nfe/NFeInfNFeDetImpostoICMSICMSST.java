package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "ICMSST")
public class NFeInfNFeDetImpostoICMSICMSST {

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


    @Element(name = "vBCSTDest", required = false)
    private String vBCSTDest;

    @Element(name = "vICMSSTDest", required = false)
    private String vICMSSTDest;


    @Element(name = "pRedBCEfet", required = false)
    private String pRedBCEfet;

    @Element(name = "vBCEfet", required = false)
    private String vBCEfet;

    @Element(name = "pICMSEfet", required = false)
    private String pICMSEfet;

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
