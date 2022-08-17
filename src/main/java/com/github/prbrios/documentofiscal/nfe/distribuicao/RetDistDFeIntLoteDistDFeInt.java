package com.github.prbrios.documentofiscal.nfe.distribuicao;

import java.util.List;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("lotedistdfeint")
@Root(name = "loteDistDFeInt")
public class RetDistDFeIntLoteDistDFeInt {

	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("doczip")
    @ElementList(name = "docZip", required = false, inline = true)
	private List<RetDistDFeIntLoteDistDFeIntDocZip> docZip;

	public List<RetDistDFeIntLoteDistDFeIntDocZip> getDocZip() {
		return docZip;
	}

	public void setDocZip(List<RetDistDFeIntLoteDistDFeIntDocZip> docZip) {
		this.docZip = docZip;
	}

}
