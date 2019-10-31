package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "ICMS00")
public class NFeInfNFeDetImpostoICMSICMS00 {

    @Element(name = "orig", required = false)
    private String orig;

    @Element(name = "CST", required = false)
    private String CST;

    @Element(name = "modBC", required = false)
    private String modBC;

    @Element(name = "vBC", required = false)
    private String vBC;

    @Element(name = "pICMS", required = false)
    private String pICMS;

    @Element(name = "vICMS", required = false)
    private String vICMS;


    @Element(name = "pFCP", required = false)
    private String pFCP;

    @Element(name = "vFCP", required = false)
    private String vFCP;

    public NFeInfNFeDetImpostoICMSICMS00() {}

    /**
     *
     * @param orig
     * @param CST
     * @param modBC
     * @param vBC
     * @param pICMS
     * @param vICMS
     * @param pFCP
     * @param vFCP
     */
    public NFeInfNFeDetImpostoICMSICMS00(String orig, String CST, String modBC, String vBC, String pICMS, String vICMS, String pFCP, String vFCP) {
        this.orig = orig;
        this.CST = CST;
        this.modBC = modBC;
        this.vBC = vBC;
        this.pICMS = pICMS;
        this.vICMS = vICMS;
        this.pFCP = pFCP;
        this.vFCP = vFCP;
    }

}
