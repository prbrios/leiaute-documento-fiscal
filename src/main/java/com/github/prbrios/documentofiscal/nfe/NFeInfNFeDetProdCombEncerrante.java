package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "encerrante")
public class NFeInfNFeDetProdCombEncerrante {

    @Element(name = "nBico", required = false)
    private String nBico;

    @Element(name = "nBomba", required = false)
    private String nBomba;

    @Element(name = "nTanque", required = false)
    private String nTanque;

    @Element(name = "vEncIni", required = false)
    private String vEncIni;

    @Element(name = "vEncFin", required = false)
    private String vEncFin;

    public NFeInfNFeDetProdCombEncerrante() {}

    /**
     *
     * @param nBico
     * @param nBomba
     * @param nTanque
     * @param vEncIni
     * @param vEncFin
     */
    public NFeInfNFeDetProdCombEncerrante(String nBico, String nBomba, String nTanque, String vEncIni, String vEncFin) {
        this.nBico = nBico;
        this.nBomba = nBomba;
        this.nTanque = nTanque;
        this.vEncIni = vEncIni;
        this.vEncFin = vEncFin;
    }

}
