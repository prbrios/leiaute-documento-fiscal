package com.github.prbrios.documentofiscal.cte;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "pass")
public class CTeInfCteComplFluxoPass {

	@Element(name = "xPass", required = false)
	private String xPass;

	public String getxPass() {
		return xPass;
	}

	public void setxPass(String xPass) {
		this.xPass = xPass;
	}
	
}
