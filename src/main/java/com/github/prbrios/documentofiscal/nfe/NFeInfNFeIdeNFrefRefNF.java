package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name ="refNF")
public class NFeInfNFeIdeNFrefRefNF {

    @Element(name = "cUF", required = false)
    private String cUF;

    @Element(name = "AAMM", required = false)
    private String AAMM;

    @Element(name = "CNPJ", required = false)
    private String CNPJ;

    @Element(name = "mod", required = false)
    private String mod;

    @Element(name = "serie", required = false)
    private String serie;

    @Element(name = "nNF", required = false)
    private String nNF;

    public NFeInfNFeIdeNFrefRefNF() {}

    /**
     *
     * @param cUF
     * @param AAMM
     * @param CNPJ
     * @param mod
     * @param serie
     * @param nNF
     */
    public NFeInfNFeIdeNFrefRefNF(String cUF, String AAMM, String CNPJ, String mod, String serie, String nNF) {
        this.cUF = cUF;
        this.AAMM = AAMM;
        this.CNPJ = CNPJ;
        this.mod = mod;
        this.serie = serie;
        this.nNF = nNF;
    }

}
