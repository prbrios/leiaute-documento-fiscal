package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "ICMSPart")
public class NFeInfNFeDetImpostoICMSICMSPart {

    @Element(name = "orig", required = false)
    private String orig;

    @Element(name = "CST", required = false)
    private String CST;

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

    @Element(name = "pBCOp", required = false)
    private String pBCOp;

    @Element(name = "UFST", required = false)
    private String UFST;

    public NFeInfNFeDetImpostoICMSICMSPart() {}

    /**
     *
     * @param orig
     * @param CST
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
     * @param pBCOp
     * @param UFST
     */
    public NFeInfNFeDetImpostoICMSICMSPart(String orig, String CST, String modBC, String vBC, String pRedBC, String pICMS, String vICMS, String modBCST, String pMVAST, String pRedBCST, String vBCST, String pICMSST, String vICMSST, String pBCOp, String UFST) {
        this.orig = orig;
        this.CST = CST;
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
        this.pBCOp = pBCOp;
        this.UFST = UFST;
    }

}
