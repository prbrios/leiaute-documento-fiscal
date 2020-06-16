package com.github.prbrios.documentofiscal.cte;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "balsa")
public class CTeInfCteInfCTeNormInfModalAquavBalsa {

	@Element(name = "xBalsa", required = false)
	private String xBalsa;

	public String getxBalsa() {
		return xBalsa;
	}

	public void setxBalsa(String xBalsa) {
		this.xBalsa = xBalsa;
	}

}
