package com.github.prbrios.documentofiscal.cte;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "fluxo")
public class CTeInfCteComplFluxo {

	@Element(name = "xOrig", required = false)
	private String xOrig;

	@Element(name = "pass", required = false)
	private CTeInfCteComplFluxoPass pass;

	@Element(name = "xDest", required = false)
	private String xDest;

	@Element(name = "xRota", required = false)
	private String xRota;

	public String getxOrig() {
		return xOrig;
	}

	public void setxOrig(String xOrig) {
		this.xOrig = xOrig;
	}

	public CTeInfCteComplFluxoPass getPass() {
		return pass;
	}

	public void setPass(CTeInfCteComplFluxoPass pass) {
		this.pass = pass;
	}

	public String getxDest() {
		return xDest;
	}

	public void setxDest(String xDest) {
		this.xDest = xDest;
	}

	public String getxRota() {
		return xRota;
	}

	public void setxRota(String xRota) {
		this.xRota = xRota;
	}
	
}
