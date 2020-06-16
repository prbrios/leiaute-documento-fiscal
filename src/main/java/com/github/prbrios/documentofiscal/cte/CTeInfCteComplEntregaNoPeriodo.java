package com.github.prbrios.documentofiscal.cte;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "noPeriodo")
public class CTeInfCteComplEntregaNoPeriodo {

	@Element(name = "tpPer", required = false)
	private String tpPer;

	@Element(name = "dini", required = false)
	private String dini;

	@Element(name = "dFim", required = false)
	private String dFim;

	public String getTpPer() {
		return tpPer;
	}

	public void setTpPer(String tpPer) {
		this.tpPer = tpPer;
	}

	public String getDini() {
		return dini;
	}

	public void setDini(String dini) {
		this.dini = dini;
	}

	public String getdFim() {
		return dFim;
	}

	public void setdFim(String dFim) {
		this.dFim = dFim;
	}
	
}
