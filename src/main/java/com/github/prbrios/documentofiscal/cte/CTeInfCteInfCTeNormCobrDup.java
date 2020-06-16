package com.github.prbrios.documentofiscal.cte;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "dup")
public class CTeInfCteInfCTeNormCobrDup {

	@Element(name = "nDup", required = false)
	private String nDup;

	@Element(name = "dVenc", required = false)
	private String dVenc;

	@Element(name = "vDup", required = false)
	private String vDup;

	public String getnDup() {
		return nDup;
	}

	public void setnDup(String nDup) {
		this.nDup = nDup;
	}

	public String getdVenc() {
		return dVenc;
	}

	public void setdVenc(String dVenc) {
		this.dVenc = dVenc;
	}

	public String getvDup() {
		return vDup;
	}

	public void setvDup(String vDup) {
		this.vDup = vDup;
	}
	
}
