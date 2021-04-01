package com.github.prbrios.documentofiscal.nfe.retorno;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("infRec")
@Root(name = "infRec")
public class RetEnviNFeInfRec {

	@Element(name = "nRec", required = false)
	private String nRec;
	
	@Element(name = "tMed", required = false)
    private String tMed;

	public String getnRec() {
		return nRec;
	}

	public void setnRec(String nRec) {
		this.nRec = nRec;
	}

	public String gettMed() {
		return tMed;
	}

	public void settMed(String tMed) {
		this.tMed = tMed;
	}

}