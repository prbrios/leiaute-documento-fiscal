package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "ICMSSN102")
public class NFeInfNFeDetImpostoICMSICMSSN102 {

    @Element(name = "orig", required = false)
    private String orig;

    @Element(name = "CSOSN", required = false)
    private String CSOSN;

    public NFeInfNFeDetImpostoICMSICMSSN102() {}

    /**
     *
     * @param orig
     * @param CSOSN
     */
    public NFeInfNFeDetImpostoICMSICMSSN102(String orig, String CSOSN) {
        this.orig = orig;
        this.CSOSN = CSOSN;
    }

}
