package com.github.prbrios.documentofiscal.cte;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "semHora")
public class CTeInfCteComplEntregaSemHora {

	@Element(name = "tpHor", required = false)
	private String tpHor;

	public String getTpHor() {
		return tpHor;
	}

	public void setTpHor(String tpHor) {
		this.tpHor = tpHor;
	}
	
}
