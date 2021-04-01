package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@JsonRootName("detpag")
@Root(name = "detPag")
public class NFeInfNFePagDetPag {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("indpag")
    @Element(name = "indPag", required = false)
    private String indPag;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("tpag")
    @Element(name = "tPag", required = false)
    private String tPag;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("xpag")
    @Element(name = "xPag", required = false)
    private String xPag;
    
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

	public String getIndPag() {
		return indPag;
	}

	public void setIndPag(String indPag) {
		this.indPag = indPag;
	}

	public String gettPag() {
		return tPag;
	}

	public void settPag(String tPag) {
		this.tPag = tPag;
	}

	public String getxPag() {
		return xPag;
	}

	public void setxPag(String xPag) {
		this.xPag = xPag;
	}

	public String getvPag() {
		return vPag;
	}

	public void setvPag(String vPag) {
		this.vPag = vPag;
	}

	public NFeInfNFePagDetPagCard getCard() {
		return card;
	}

	public void setCard(NFeInfNFePagDetPagCard card) {
		this.card = card;
	}

}
