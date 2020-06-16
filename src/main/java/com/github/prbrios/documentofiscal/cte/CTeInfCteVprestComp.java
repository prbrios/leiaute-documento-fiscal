package com.github.prbrios.documentofiscal.cte;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "Comp")
public class CTeInfCteVprestComp {

	@Element(name = "xNome", required = false)
	private String xNome;

	@Element(name = "vComp", required = false)
	private String vComp;

	public String getxNome() {
		return xNome;
	}

	public void setxNome(String xNome) {
		this.xNome = xNome;
	}

	public String getvComp() {
		return vComp;
	}

	public void setvComp(String vComp) {
		this.vComp = vComp;
	}

}
