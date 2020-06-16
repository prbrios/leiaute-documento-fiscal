package com.github.prbrios.documentofiscal.cte;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "infGlobalizado")
public class CTeInfCteInfCTeNormInfGlobalizado {

	@Element(name = "xObs", required = false)
	private String xObs;

	public String getxObs() {
		return xObs;
	}

	public void setxObs(String xObs) {
		this.xObs = xObs;
	}

}
