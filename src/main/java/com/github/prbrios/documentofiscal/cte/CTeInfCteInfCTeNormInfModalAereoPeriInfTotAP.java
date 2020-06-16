package com.github.prbrios.documentofiscal.cte;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "infTotAP")
public class CTeInfCteInfCTeNormInfModalAereoPeriInfTotAP {

	@Element(name = "qTotProd", required = false)
	private String qTotProd;

	@Element(name = "uniAP", required = false)
	private String uniAP;

	public String getqTotProd() {
		return qTotProd;
	}

	public void setqTotProd(String qTotProd) {
		this.qTotProd = qTotProd;
	}

	public String getUniAP() {
		return uniAP;
	}

	public void setUniAP(String uniAP) {
		this.uniAP = uniAP;
	}

}
