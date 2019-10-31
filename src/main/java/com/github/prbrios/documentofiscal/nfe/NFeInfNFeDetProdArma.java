package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "arma")
public class NFeInfNFeDetProdArma {

    @Element(name = "tpArma", required = false)
    private String tpArma;

    @Element(name = "nSerie", required = false)
    private String nSerie;

    @Element(name = "nCano", required = false)
    private String nCano;

    @Element(name = "descr", required = false)
    private String descr;

    public NFeInfNFeDetProdArma() {}

    /**
     *
     * @param tpArma
     * @param nSerie
     * @param nCano
     * @param descr
     */
    public NFeInfNFeDetProdArma(String tpArma, String nSerie, String nCano, String descr) {
        this.tpArma = tpArma;
        this.nSerie = nSerie;
        this.nCano = nCano;
        this.descr = descr;
    }

}
