package com.github.prbrios.documentofiscal.cte;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "comHora")
public class CTeInfCteComplEntregaComHora {

	@Element(name = "tpHor", required = false)
	private String tpHor;

	@Element(name = "hProg", required = false)
	private String hProg;

	public String getTpHor() {
		return tpHor;
	}

	public void setTpHor(String tpHor) {
		this.tpHor = tpHor;
	}

	public String gethProg() {
		return hProg;
	}

	public void sethProg(String hProg) {
		this.hProg = hProg;
	}
	
}
