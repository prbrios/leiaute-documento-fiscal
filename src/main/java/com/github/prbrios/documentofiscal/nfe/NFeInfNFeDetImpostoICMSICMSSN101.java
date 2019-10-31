package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "ICMSSN101")
public class NFeInfNFeDetImpostoICMSICMSSN101 {

    @Element(name = "orig", required = false)
    private String orig;

    @Element(name = "CSOSN", required = false)
    private String CSOSN;

    @Element(name = "pCredSN", required = false)
    private String pCredSN;

    @Element(name = "vCredICMSSN", required = false)
    private String vCredICMSSN;

    public NFeInfNFeDetImpostoICMSICMSSN101() {}

    /**
     *
     * @param orig
     * @param CSOSN
     * @param pCredSN
     * @param vCredICMSSN
     */
    public NFeInfNFeDetImpostoICMSICMSSN101(String orig, String CSOSN, String pCredSN, String vCredICMSSN) {
        this.orig = orig;
        this.CSOSN = CSOSN;
        this.pCredSN = pCredSN;
        this.vCredICMSSN = vCredICMSSN;
    }

}
