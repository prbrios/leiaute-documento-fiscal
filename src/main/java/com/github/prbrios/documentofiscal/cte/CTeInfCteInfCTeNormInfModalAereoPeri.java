package com.github.prbrios.documentofiscal.cte;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "peri")
public class CTeInfCteInfCTeNormInfModalAereoPeri {

	@Element(name = "nONU", required = false)
	private String nONU;

	@Element(name = "qTotEmb", required = false)
	private String qTotEmb;

	@Element(name = "infTotAP", required = false)
	private CTeInfCteInfCTeNormInfModalAereoPeriInfTotAP infTotAP;

	public String getnONU() {
		return nONU;
	}

	public void setnONU(String nONU) {
		this.nONU = nONU;
	}

	public String getqTotEmb() {
		return qTotEmb;
	}

	public void setqTotEmb(String qTotEmb) {
		this.qTotEmb = qTotEmb;
	}

	public CTeInfCteInfCTeNormInfModalAereoPeriInfTotAP getInfTotAP() {
		return infTotAP;
	}

	public void setInfTotAP(CTeInfCteInfCTeNormInfModalAereoPeriInfTotAP infTotAP) {
		this.infTotAP = infTotAP;
	}

}
