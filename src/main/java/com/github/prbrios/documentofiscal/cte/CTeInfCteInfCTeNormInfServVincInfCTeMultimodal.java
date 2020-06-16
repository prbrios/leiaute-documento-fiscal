package com.github.prbrios.documentofiscal.cte;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "infCTeMultimodal")
public class CTeInfCteInfCTeNormInfServVincInfCTeMultimodal {

	@Element(name = "chCTeMultimodal", required = false)
	private String chCTeMultimodal;

	public String getChCTeMultimodal() {
		return chCTeMultimodal;
	}

	public void setChCTeMultimodal(String chCTeMultimodal) {
		this.chCTeMultimodal = chCTeMultimodal;
	}

}
