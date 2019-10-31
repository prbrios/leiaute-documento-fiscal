package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "ICMS51")
public class NFeInfNFeDetImpostoICMSICMS51 {

    @Element(name = "orig", required = false)
    private String orig;

    @Element(name = "CST", required = false)
    private String CST;

    @Element(name = "modBC", required = false)
    private String modBC;

    @Element(name = "pRedBC", required = false)
    private String pRedBC;

    @Element(name = "vBC", required = false)
    private String vBC;

    @Element(name = "pICMS", required = false)
    private String pICMS;

    @Element(name = "vICMSOp", required = false)
    private String vICMSOp;

    @Element(name = "pDif", required = false)
    private String pDif;

    @Element(name = "vICMSDif", required = false)
    private String vICMSDif;

    @Element(name = "vICMS", required = false)
    private String vICMS;


    @Element(name = "vBCFCP", required = false)
    private String vBCFCP;

    @Element(name = "pFCP", required = false)
    private String pFCP;

    @Element(name = "vFCP", required = false)
    private String vFCP;

    public NFeInfNFeDetImpostoICMSICMS51() {}

    /**
     *
     * @param orig
     * @param CST
     * @param modBC
     * @param pRedBC
     * @param vBC
     * @param pICMS
     * @param vICMSOp
     * @param pDif
     * @param vICMSDif
     * @param vICMS
     * @param vBCFCP
     * @param pFCP
     * @param vFCP
     */
    public NFeInfNFeDetImpostoICMSICMS51(String orig, String CST, String modBC, String pRedBC, String vBC, String pICMS, String vICMSOp, String pDif, String vICMSDif, String vICMS, String vBCFCP, String pFCP, String vFCP) {
        this.orig = orig;
        this.CST = CST;
        this.modBC = modBC;
        this.pRedBC = pRedBC;
        this.vBC = vBC;
        this.pICMS = pICMS;
        this.vICMSOp = vICMSOp;
        this.pDif = pDif;
        this.vICMSDif = vICMSDif;
        this.vICMS = vICMS;
        this.vBCFCP = vBCFCP;
        this.pFCP = pFCP;
        this.vFCP = vFCP;
    }

}
