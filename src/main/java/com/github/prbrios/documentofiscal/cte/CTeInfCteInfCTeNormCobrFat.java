package com.github.prbrios.documentofiscal.cte;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "fat")
public class CTeInfCteInfCTeNormCobrFat {

	@Element(name = "nFat", required = false)
	private String nFat;

	@Element(name = "vOrig", required = false)
	private String vOrig;

	@Element(name = "vDesc", required = false)
	private String vDesc;

	@Element(name = "vLiq", required = false)
	private String vLiq;

	public String getnFat() {
		return nFat;
	}

	public void setnFat(String nFat) {
		this.nFat = nFat;
	}

	public String getvOrig() {
		return vOrig;
	}

	public void setvOrig(String vOrig) {
		this.vOrig = vOrig;
	}

	public String getvDesc() {
		return vDesc;
	}

	public void setvDesc(String vDesc) {
		this.vDesc = vDesc;
	}

	public String getvLiq() {
		return vLiq;
	}

	public void setvLiq(String vLiq) {
		this.vLiq = vLiq;
	}
	
}
