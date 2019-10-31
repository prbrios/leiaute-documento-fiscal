package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "avulsa")
public class NFeInfNFeAvulsa {

    @Element(name = "CNPJ", required = false)
    private String CNPJ;

    @Element(name = "xOrgao", required = false)
    private String xOrgao;

    @Element(name = "matr", required = false)
    private String matr;

    @Element(name = "xAgente", required = false)
    private String xAgente;

    @Element(name = "fone", required = false)
    private String fone;

    @Element(name = "UF", required = false)
    private String UF;

    @Element(name = "nDAR", required = false)
    private String nDAR;

    @Element(name = "dEmi", required = false)
    private String dEmi;

    @Element(name = "vDAR", required = false)
    private String vDAR;

    @Element(name = "repEmi", required = false)
    private String repEmi;

    @Element(name = "dPag", required = false)
    private String dPag;

    public NFeInfNFeAvulsa() {}

    /**
     *
     * @param CNPJ
     * @param xOrgao
     * @param matr
     * @param xAgente
     * @param fone
     * @param UF
     * @param nDAR
     * @param dEmi
     * @param vDAR
     * @param repEmi
     * @param dPag
     */
    public NFeInfNFeAvulsa(String CNPJ, String xOrgao, String matr, String xAgente, String fone, String UF, String nDAR, String dEmi, String vDAR, String repEmi, String dPag) {
        this.CNPJ = CNPJ;
        this.xOrgao = xOrgao;
        this.matr = matr;
        this.xAgente = xAgente;
        this.fone = fone;
        this.UF = UF;
        this.nDAR = nDAR;
        this.dEmi = dEmi;
        this.vDAR = vDAR;
        this.repEmi = repEmi;
        this.dPag = dPag;
    }

}
