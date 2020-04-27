package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@JsonRootName("detpag")
@Data
@Root(name = "detPag")
public class NFeInfNFePagDetPag {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("indpag")
    @Element(name = "indPag", required = false)
    private String indPag;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("tpg")
    @Element(name = "tPag", required = false)
    private String tPag;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vpag")
    @Element(name = "vPag", required = false)
    private String vPag;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("card")
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
