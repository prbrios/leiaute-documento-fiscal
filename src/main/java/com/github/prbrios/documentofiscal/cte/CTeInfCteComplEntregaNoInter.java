package com.github.prbrios.documentofiscal.cte;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "noInter")
public class CTeInfCteComplEntregaNoInter {

	@Element(name = "tpHor", required = false)
	private String tpHor;

	@Element(name = "hini", required = false)
	private String hini;

	@Element(name = "hFim", required = false)
	private String hFim;

	public String getTpHor() {
		return tpHor;
	}

	public void setTpHor(String tpHor) {
		this.tpHor = tpHor;
	}

	public String getHini() {
		return hini;
	}

	public void setHini(String hini) {
		this.hini = hini;
	}

	public String gethFim() {
		return hFim;
	}

	public void sethFim(String hFim) {
		this.hFim = hFim;
	}
	
}
