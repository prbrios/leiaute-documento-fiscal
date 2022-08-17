package com.github.prbrios.documentofiscal.nfe.distribuicao;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("consnsu")
@Root(name = "consNSU")
public class DistDFeIntConsNSU {

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("nsu")
    @Element(name = "NSU", required = false)
	private String NSU;

	public String getNSU() {
		return NSU;
	}

	public void setNSU(String nSU) {
		NSU = nSU;
	}

}
