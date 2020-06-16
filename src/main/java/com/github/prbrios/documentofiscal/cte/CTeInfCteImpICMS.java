package com.github.prbrios.documentofiscal.cte;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "ICMS")
public class CTeInfCteImpICMS {

	@Element(name = "ICMS00", required = false)
	private CTeInfCteImpICMSICMS00 ICMS00;

	@Element(name = "ICMS20", required = false)
	private CTeInfCteImpICMSICMS20 ICMS20;

	@Element(name = "ICMS45", required = false)
	private CTeInfCteImpICMSICMS45 ICMS45;

	@Element(name = "ICMS60", required = false)
	private CTeInfCteImpICMSICMS60 ICMS60;

	@Element(name = "ICMS90", required = false)
	private CTeInfCteImpICMSICMS90 ICMS90;

	@Element(name = "ICMSOutraUF", required = false)
	private CTeInfCteImpICMSICMSOutraUF ICMSOutraUF;

	@Element(name = "ICMSSN", required = false)
	private CTeInfCteImpICMSICMSSN ICMSSN;

	public CTeInfCteImpICMSICMS00 getICMS00() {
		return ICMS00;
	}

	public void setICMS00(CTeInfCteImpICMSICMS00 iCMS00) {
		ICMS00 = iCMS00;
	}

	public CTeInfCteImpICMSICMS20 getICMS20() {
		return ICMS20;
	}

	public void setICMS20(CTeInfCteImpICMSICMS20 iCMS20) {
		ICMS20 = iCMS20;
	}

	public CTeInfCteImpICMSICMS45 getICMS45() {
		return ICMS45;
	}

	public void setICMS45(CTeInfCteImpICMSICMS45 iCMS45) {
		ICMS45 = iCMS45;
	}

	public CTeInfCteImpICMSICMS60 getICMS60() {
		return ICMS60;
	}

	public void setICMS60(CTeInfCteImpICMSICMS60 iCMS60) {
		ICMS60 = iCMS60;
	}

	public CTeInfCteImpICMSICMS90 getICMS90() {
		return ICMS90;
	}

	public void setICMS90(CTeInfCteImpICMSICMS90 iCMS90) {
		ICMS90 = iCMS90;
	}

	public CTeInfCteImpICMSICMSOutraUF getICMSOutraUF() {
		return ICMSOutraUF;
	}

	public void setICMSOutraUF(CTeInfCteImpICMSICMSOutraUF iCMSOutraUF) {
		ICMSOutraUF = iCMSOutraUF;
	}

	public CTeInfCteImpICMSICMSSN getICMSSN() {
		return ICMSSN;
	}

	public void setICMSSN(CTeInfCteImpICMSICMSSN iCMSSN) {
		ICMSSN = iCMSSN;
	}

}
