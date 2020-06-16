package com.github.prbrios.documentofiscal.cte;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "imp")
public class CTeInfCteImp {

	@Element(name = "ICMS", required = false)
	private CTeInfCteImpICMS ICMS;

	@Element(name = "vTotTrib", required = false)
	private String vTotTrib;

	@Element(name = "infAdFisco", required = false)
	private String infAdFisco;

	@Element(name = "ICMSUFFim", required = false)
	private CTeInfCteImpICMSUFFim ICMSUFFim;

	public CTeInfCteImpICMS getICMS() {
		return ICMS;
	}

	public void setICMS(CTeInfCteImpICMS iCMS) {
		ICMS = iCMS;
	}

	public String getvTotTrib() {
		return vTotTrib;
	}

	public void setvTotTrib(String vTotTrib) {
		this.vTotTrib = vTotTrib;
	}

	public String getInfAdFisco() {
		return infAdFisco;
	}

	public void setInfAdFisco(String infAdFisco) {
		this.infAdFisco = infAdFisco;
	}

	public CTeInfCteImpICMSUFFim getICMSUFFim() {
		return ICMSUFFim;
	}

	public void setICMSUFFim(CTeInfCteImpICMSUFFim iCMSUFFim) {
		ICMSUFFim = iCMSUFFim;
	}

}
