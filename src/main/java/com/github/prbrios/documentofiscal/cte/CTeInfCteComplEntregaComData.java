package com.github.prbrios.documentofiscal.cte;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "comData")
public class CTeInfCteComplEntregaComData {

	@Element(name = "tpPer", required = false)
	private String tpPer;

	@Element(name = "dProg", required = false)
	private String dProg;

	public String getTpPer() {
		return tpPer;
	}

	public void setTpPer(String tpPer) {
		this.tpPer = tpPer;
	}

	public String getdProg() {
		return dProg;
	}

	public void setdProg(String dProg) {
		this.dProg = dProg;
	}
	
}
