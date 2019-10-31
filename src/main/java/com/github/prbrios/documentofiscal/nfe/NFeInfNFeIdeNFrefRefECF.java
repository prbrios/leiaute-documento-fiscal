package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "refECF")
public class NFeInfNFeIdeNFrefRefECF {

    @Element(name = "mod", required = false)
    private String mod;

    @Element(name = "nECF", required = false)
    private String nECF;

    @Element(name = "nCOO", required = false)
    private String nCOO;

    public NFeInfNFeIdeNFrefRefECF() {}

    /**
     *
     * @param mod
     * @param nECF
     * @param nCOO
     */
    public NFeInfNFeIdeNFrefRefECF(String mod, String nECF, String nCOO) {
        this.mod = mod;
        this.nECF = nECF;
        this.nCOO = nCOO;
    }

}
