package com.github.prbrios.documentofiscal.cte;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "lacUnidCarga")
public class CTeInfCteInfCTeNormInfDocInfOutrosInfUnidCargaLacUnidCarga {

	@Element(name= "nLacre", required = false)
	private String nLacre;

	public String getnLacre() {
		return nLacre;
	}

	public void setnLacre(String nLacre) {
		this.nLacre = nLacre;
	}

}
