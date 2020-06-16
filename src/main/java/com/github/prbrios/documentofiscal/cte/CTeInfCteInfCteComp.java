package com.github.prbrios.documentofiscal.cte;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "infCteComp")
public class CTeInfCteInfCteComp {

	@Element(name = "chCTe")
	private String chCTe;

	public String getChCTe() {
		return chCTe;
	}

	public void setChCTe(String chCTe) {
		this.chCTe = chCTe;
	}

}
