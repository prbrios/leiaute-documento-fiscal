package com.github.prbrios.documentofiscal.cte;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "duto")
public class CTeInfCteInfCTeNormInfModalDuto {

	@Element(name = "vTar", required = false)
	private String vTar;

	@Element(name = "dIni", required = false)
	private String dIni;

	@Element(name = "dFim", required = false)
	private String dFim;

	public String getvTar() {
		return vTar;
	}

	public void setvTar(String vTar) {
		this.vTar = vTar;
	}

	public String getdIni() {
		return dIni;
	}

	public void setdIni(String dIni) {
		this.dIni = dIni;
	}

	public String getdFim() {
		return dFim;
	}

	public void setdFim(String dFim) {
		this.dFim = dFim;
	}

}
