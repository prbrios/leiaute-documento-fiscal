package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "rastro")
public class NFeInfNFeDetProdRastro {

    @Element(name = "nLote", required = false)
    private String nLote;

    @Element(name = "qLote", required = false)
    private String qLote;

    @Element(name = "dFab", required = false)
    private String dFab;

    @Element(name = "dVal", required = false)
    private String dVal;

    @Element(name = "cAgreg", required = false)
    private String cAgreg;

    public NFeInfNFeDetProdRastro() {}

    /**
     *
     * @param nLote
     * @param qLote
     * @param dFab
     * @param dVal
     * @param cAgreg
     */
    public NFeInfNFeDetProdRastro(String nLote, String qLote, String dFab, String dVal, String cAgreg) {
        this.nLote = nLote;
        this.qLote = qLote;
        this.dFab = dFab;
        this.dVal = dVal;
        this.cAgreg = cAgreg;
    }

}
