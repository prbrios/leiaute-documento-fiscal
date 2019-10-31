package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "card")
public class NFeInfNFePagDetPagCard {

    @Element(name = "tpIntegra", required = false)
    private String tpIntegra;

    @Element(name = "CNPJ", required = false)
    private String CNPJ;

    @Element(name = "tBand", required = false)
    private String tBand;

    @Element(name = "cAut", required = false)
    private String cAut;

    public NFeInfNFePagDetPagCard() {}

    /**
     *
     * @param tpIntegra
     * @param CNPJ
     * @param tBand
     * @param cAut
     */
    public NFeInfNFePagDetPagCard(String tpIntegra, String CNPJ, String tBand, String cAut) {
        this.tpIntegra = tpIntegra;
        this.CNPJ = CNPJ;
        this.tBand = tBand;
        this.cAut = cAut;
    }

}
