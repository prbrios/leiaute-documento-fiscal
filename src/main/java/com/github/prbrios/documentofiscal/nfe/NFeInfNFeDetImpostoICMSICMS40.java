package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "ICMS40")
public class NFeInfNFeDetImpostoICMSICMS40 {

    @Element(name = "orig", required = false)
    private String orig;

    @Element(name = "CST", required = false)
    private String CST;


    @Element(name = "vICMSDeson", required = false)
    private String vICMSDeson;

    @Element(name = "motDesICMS", required = false)
    private String motDesICMS;

    public NFeInfNFeDetImpostoICMSICMS40() {}

    /**
     *
     * @param orig
     * @param CST
     * @param vICMSDeson
     * @param motDesICMS
     */
    public NFeInfNFeDetImpostoICMSICMS40(String orig, String CST, String vICMSDeson, String motDesICMS) {
        this.orig = orig;
        this.CST = CST;
        this.vICMSDeson = vICMSDeson;
        this.motDesICMS = motDesICMS;
    }

}
