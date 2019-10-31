package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "adi")
public class NFeInfNFeDetProdDIAdi {

    @Element(name = "nAdicao", required = false)
    private String nAdicao;

    @Element(name = "nSeqAdic", required = false)
    private String nSeqAdic;

    @Element(name = "cFabricante", required = false)
    private String cFabricante;

    @Element(name = "vDescDI", required = false)
    private String vDescDI;

    @Element(name = "nDraw", required = false)
    private String nDraw;

    public NFeInfNFeDetProdDIAdi() {}

    /**
     *
     * @param nAdicao
     * @param nSeqAdic
     * @param cFabricante
     * @param vDescDI
     * @param nDraw
     */
    public NFeInfNFeDetProdDIAdi(String nAdicao, String nSeqAdic, String cFabricante, String vDescDI, String nDraw) {
        this.nAdicao = nAdicao;
        this.nSeqAdic = nSeqAdic;
        this.cFabricante = cFabricante;
        this.vDescDI = vDescDI;
        this.nDraw = nDraw;
    }

}
