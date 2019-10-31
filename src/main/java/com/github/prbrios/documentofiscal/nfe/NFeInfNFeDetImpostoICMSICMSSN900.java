package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "ICMSSN900")
public class NFeInfNFeDetImpostoICMSICMSSN900 {

    @Element(name = "orig", required = false)
    private String orig;

    @Element(name = "CSOSN", required = false)
    private String CSOSN;


    @Element(name = "modBC", required = false)
    private String modBC;

    @Element(name = "vBC", required = false)
    private String vBC;

    @Element(name = "pRedBC", required = false)
    private String pRedBC;

    @Element(name = "pICMS", required = false)
    private String pICMS;

    @Element(name = "vICMS", required = false)
    private String vICMS;


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


    @Element(name = "pCredSN", required = false)
    private String pCredSN;

    @Element(name = "vCredICMSSN", required = false)
    private String vCredICMSSN;

    public NFeInfNFeDetImpostoICMSICMSSN900() {}

    /**
     *
     * @param orig
     * @param CSOSN
     * @param modBC
     * @param vBC
     * @param pRedBC
     * @param pICMS
     * @param vICMS
     * @param modBCST
     * @param pMVAST
     * @param pRedBCST
     * @param vBCST
     * @param pICMSST
     * @param vICMSST
     * @param vBCFCPST
     * @param pFCPST
     * @param vFCPST
     * @param pCredSN
     * @param vCredICMSSN
     */
    public NFeInfNFeDetImpostoICMSICMSSN900(String orig, String CSOSN, String modBC, String vBC, String pRedBC, String pICMS, String vICMS, String modBCST, String pMVAST, String pRedBCST, String vBCST, String pICMSST, String vICMSST, String vBCFCPST, String pFCPST, String vFCPST, String pCredSN, String vCredICMSSN) {
        this.orig = orig;
        this.CSOSN = CSOSN;
        this.modBC = modBC;
        this.vBC = vBC;
        this.pRedBC = pRedBC;
        this.pICMS = pICMS;
        this.vICMS = vICMS;
        this.modBCST = modBCST;
        this.pMVAST = pMVAST;
        this.pRedBCST = pRedBCST;
        this.vBCST = vBCST;
        this.pICMSST = pICMSST;
        this.vICMSST = vICMSST;
        this.vBCFCPST = vBCFCPST;
        this.pFCPST = pFCPST;
        this.vFCPST = vFCPST;
        this.pCredSN = pCredSN;
        this.vCredICMSSN = vCredICMSSN;
    }

}
