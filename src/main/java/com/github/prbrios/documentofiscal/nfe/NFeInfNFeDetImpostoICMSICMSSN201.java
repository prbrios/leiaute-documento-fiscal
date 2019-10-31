package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "ICMSSN201")
public class NFeInfNFeDetImpostoICMSICMSSN201 {

    @Element(name = "orig", required = false)
    private String orig;

    @Element(name = "CSOSN", required = false)
    private String CSOSN;

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

    public NFeInfNFeDetImpostoICMSICMSSN201() {}

    /**
     *
     * @param orig
     * @param CSOSN
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
    public NFeInfNFeDetImpostoICMSICMSSN201(String orig, String CSOSN, String modBCST, String pMVAST, String pRedBCST, String vBCST, String pICMSST, String vICMSST, String vBCFCPST, String pFCPST, String vFCPST, String pCredSN, String vCredICMSSN) {
        this.orig = orig;
        this.CSOSN = CSOSN;
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
