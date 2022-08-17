package com.github.prbrios.documentofiscal.nfe.distribuicao;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("distnsu")
@Root(name = "distNSU")
public class DistDFeIntDistNSU {

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("ultnsu")
    @Element(name = "ultNSU", required = false)
	private String ultNSU;

	public String getUltNSU() {
		return ultNSU;
	}

	public void setUltNSU(String ultNSU) {
		this.ultNSU = ultNSU;
	}

}
