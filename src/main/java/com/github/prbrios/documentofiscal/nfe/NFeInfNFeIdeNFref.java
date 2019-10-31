package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "NFref")
public class NFeInfNFeIdeNFref {

    @Element(name = "refNFe", required = false)
    private String refNFe;

    @Element(name = "refNF", required = false)
    private NFeInfNFeIdeNFrefRefNF refNF;

    @Element(name = "refNFP", required = false)
    private NFeInfNFeIdeNFrefRefNFP refNFP;

    @Element(name = "refCTe", required = false)
    private String refCTe;

    @Element(name = "refECF", required = false)
    private NFeInfNFeIdeNFrefRefECF refECF;

    public NFeInfNFeIdeNFref() {}

    /**
     *
     * @param refNFe
     * @param refNF
     * @param refNFP
     * @param refCTe
     * @param refECF
     */
    public NFeInfNFeIdeNFref(String refNFe, NFeInfNFeIdeNFrefRefNF refNF, NFeInfNFeIdeNFrefRefNFP refNFP, String refCTe, NFeInfNFeIdeNFrefRefECF refECF) {
        this.refNFe = refNFe;
        this.refNF = refNF;
        this.refNFP = refNFP;
        this.refCTe = refCTe;
        this.refECF = refECF;
    }

}
