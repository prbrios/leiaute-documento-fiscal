package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "ICMS20")
public class NFeInfNFeDetImpostoICMSICMS20 {

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

    @Element(name = "vICMS", required = false)
    private String vICMS;


    @Element(name = "vBCFCP", required = false)
    private String vBCFCP;

    @Element(name = "pFCP", required = false)
    private String pFCP;

    @Element(name = "vFCP", required = false)
    private String vFCP;


    @Element(name = "vICMSDeson", required = false)
    private String vICMSDeson;

    @Element(name = "motDesICMS", required = false)
    private String motDesICMS;

    public NFeInfNFeDetImpostoICMSICMS20() {}

    /**
     *
     * @param orig
     * @param CST
     * @param modBC
     * @param pRedBC
     * @param vBC
     * @param pICMS
     * @param vICMS
     * @param vBCFCP
     * @param pFCP
     * @param vFCP
     * @param vICMSDeson
     * @param motDesICMS
     */
    public NFeInfNFeDetImpostoICMSICMS20(String orig, String CST, String modBC, String pRedBC, String vBC, String pICMS, String vICMS, String vBCFCP, String pFCP, String vFCP, String vICMSDeson, String motDesICMS) {
        this.orig = orig;
        this.CST = CST;
        this.modBC = modBC;
        this.pRedBC = pRedBC;
        this.vBC = vBC;
        this.pICMS = pICMS;
        this.vICMS = vICMS;
        this.vBCFCP = vBCFCP;
        this.pFCP = pFCP;
        this.vFCP = vFCP;
        this.vICMSDeson = vICMSDeson;
        this.motDesICMS = motDesICMS;
    }

}
