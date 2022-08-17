package com.github.prbrios.documentofiscal.nfe.distribuicao;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("conschnfe")
@Root(name = "consChNFe")
public class DistDFeIntConsChNFe {

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("chnfe")
    @Element(name = "chNFe", required = false)
	private String chNFe;

	public String getChNFe() {
		return chNFe;
	}

	public void setChNFe(String chNFe) {
		this.chNFe = chNFe;
	}

}
