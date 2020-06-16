package com.github.prbrios.documentofiscal.cte;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "idDocAntEle")
public class CTeInfCteInfCTeNormDocAntEmiDocAntIdDocAntIdDocAntEle {

	@Element(name = "chCTe", required = false)
	private String chCTe;

	public String getChCTe() {
		return chCTe;
	}

	public void setChCTe(String chCTe) {
		this.chCTe = chCTe;
	}

}
