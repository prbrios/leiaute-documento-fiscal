package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "ICMS30")
public class NFeInfNFeDetImpostoICMSICMS30 {

    @Element(name = "orig", required = false)
    private String orig;

    @Element(name = "CST", required = false)
    private String CST;

    @Element(name = "modBCST", required = false)
    private String modBCST;

    @Element(name = "pMVAST", required = false)
    private String pMVAST;

    @Element(name = "pRedBCST", required = false)
    private String pRedBCST;

    @Element(name = "vBCST", required = false)
    private String vBCST;

    @Element(name = "pICMSST", required = false)
    private String pICMSST;

    @Element(name = "vICMSST", required = false)
    private String vICMSST;


    @Element(name = "vBCFCPST", required = false)
    private String vBCFCPST;

    @Element(name = "pFCPST", required = false)
    private String pFCPST;

    @Element(name = "vFCPST", required = false)
    private String vFCPST;


    @Element(name = "vICMSDeson", required = false)
    private String vICMSDeson;

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
