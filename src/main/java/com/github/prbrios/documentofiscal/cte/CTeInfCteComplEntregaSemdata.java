package com.github.prbrios.documentofiscal.cte;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "semData")
public class CTeInfCteComplEntregaSemdata {

	@Element(name = "tpPer", required = false)
	private String tpPer;

	public String getTpPer() {
		return tpPer;
	}

	public void setTpPer(String tpPer) {
		this.tpPer = tpPer;
	}
	
}
