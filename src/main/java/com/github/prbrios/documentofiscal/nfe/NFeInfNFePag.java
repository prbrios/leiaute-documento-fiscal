package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;

@JsonRootName("pag")
@Root(name = "pag")
public class NFeInfNFePag {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("detpag")
    @ElementList(name = "detPag", required = false, inline = true)
    private List<NFeInfNFePagDetPag> detPag = new ArrayList<NFeInfNFePagDetPag>();

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vtroco")
    @Element(name = "vTroco", required = false)
    private String vTroco;

    public NFeInfNFePag() {}

    /**
     *
     * @param detPag
     * @param vTroco
     */
    public NFeInfNFePag(List<NFeInfNFePagDetPag> detPag, String vTroco) {
        this.detPag = detPag;
        this.vTroco = vTroco;
    }

	public List<NFeInfNFePagDetPag> getDetPag() {
		return detPag;
	}

	public void setDetPag(List<NFeInfNFePagDetPag> detPag) {
		this.detPag = detPag;
	}

	public String getvTroco() {
		return vTroco;
	}

	public void setvTroco(String vTroco) {
		this.vTroco = vTroco;
	}

}
