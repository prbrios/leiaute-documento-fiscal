package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "comb")
public class NFeInfNFeDetProdComb {

    @Element(name = "cProdANP", required = false)
    private String cProdANP;

    @Element(name = "descANP", required = false)
    private String descANP;

    @Element(name = "pGLP", required = false)
    private String pGLP;

    @Element(name = "pGNn", required = false)
    private String pGNn;

    @Element(name = "pGNi", required = false)
    private String pGNi;

    @Element(name = "vPart", required = false)
    private String vPart;

    @Element(name = "CODIF", required = false)
    private String CODIF;

    @Element(name = "qTemp", required = false)
    private String qTemp;

    @Element(name = "UFCons", required = false)
    private String UFCons;

    @Element(name = "CIDE", required = false)
    private NFeInfNFeDetProdCombCIDE CIDE;

    @Element(name = "encerrante", required = false)
    private NFeInfNFeDetProdCombEncerrante encerrante;

    public NFeInfNFeDetProdComb() {}

    /**
     *
     * @param cProdANP
     * @param descANP
     * @param pGLP
     * @param pGNn
     * @param pGNi
     * @param vPart
     * @param CODIF
     * @param qTemp
     * @param UFCons
     * @param CIDE
     * @param encerrante
     */
    public NFeInfNFeDetProdComb(String cProdANP, String descANP, String pGLP, String pGNn, String pGNi, String vPart, String CODIF, String qTemp, String UFCons, NFeInfNFeDetProdCombCIDE CIDE, NFeInfNFeDetProdCombEncerrante encerrante) {
        this.cProdANP = cProdANP;
        this.descANP = descANP;
        this.pGLP = pGLP;
        this.pGNn = pGNn;
        this.pGNi = pGNi;
        this.vPart = vPart;
        this.CODIF = CODIF;
        this.qTemp = qTemp;
        this.UFCons = UFCons;
        this.CIDE = CIDE;
        this.encerrante = encerrante;
    }

}
