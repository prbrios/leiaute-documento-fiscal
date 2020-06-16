package com.github.prbrios.documentofiscal.cte;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "lacUnidTransp")
public class CTeInfCteInfCTeNormInfDocInfNFInfUnidTranspLacUnidTransp {

	@Element(name = "nLacre", required = false)
	private String nLacre;

	public String getnLacre() {
		return nLacre;
	}

	public void setnLacre(String nLacre) {
		this.nLacre = nLacre;
	}

}
