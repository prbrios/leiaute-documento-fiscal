package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "refNFP")
public class NFeInfNFeIdeNFrefRefNFP {

    @Element(name = "cUF", required = false)
    private String cUF;

    @Element(name = "AAMM", required = false)
    private String AAMM;

    @Element(name = "CNPJ", required = false)
    private String CNPJ;

    @Element(name = "CPF", required = false)
    private String CPF;

    @Element(name = "IE", required = false)
    private String IE;

    @Element(name = "mod", required = false)
    private String mod;

    @Element(name = "serie", required = false)
    private String serie;

    @Element(name = "nNF", required = false)
    private String nNF;

    public NFeInfNFeIdeNFrefRefNFP() {}

    /**
     *
     * @param cUF
     * @param AAMM
     * @param CNPJ
     * @param CPF
     * @param IE
     * @param mod
     * @param serie
     * @param nNF
     */
    public NFeInfNFeIdeNFrefRefNFP(String cUF, String AAMM, String CNPJ, String CPF, String IE, String mod, String serie, String nNF) {
        this.cUF = cUF;
        this.AAMM = AAMM;
        this.CNPJ = CNPJ;
        this.CPF = CPF;
        this.IE = IE;
        this.mod = mod;
        this.serie = serie;
        this.nNF = nNF;
    }

}
