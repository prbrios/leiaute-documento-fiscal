package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "detPag")
public class NFeInfNFePagDetPag {

    @Element(name = "indPag", required = false)
    private String indPag;

    @Element(name = "tPag", required = false)
    private String tPag;

    @Element(name = "vPag", required = false)
    private String vPag;

    @Element(name = "card", required = false)
    private NFeInfNFePagDetPagCard card;

    public NFeInfNFePagDetPag() {}

    /**
     *
     * @param indPag
     * @param tPag
     * @param vPag
     * @param card
     */
    public NFeInfNFePagDetPag(String indPag, String tPag, String vPag, NFeInfNFePagDetPagCard card) {
        this.indPag = indPag;
        this.tPag = tPag;
        this.vPag = vPag;
        this.card = card;
    }

}
