package com.github.prbrios.documentofiscal.cte;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "tarifa")
public class CTeInfCteInfCTeNormInfModalAereoTarifa {

	@Element(name = "CL", required = false)
	private String CL;

	@Element(name = "cTar", required = false)
	private String cTar;

	@Element(name = "vTar", required = false)
	private String vTar;

	public String getCL() {
		return CL;
	}

	public void setCL(String cL) {
		CL = cL;
	}

	public String getcTar() {
		return cTar;
	}

	public void setcTar(String cTar) {
		this.cTar = cTar;
	}

	public String getvTar() {
		return vTar;
	}

	public void setvTar(String vTar) {
		this.vTar = vTar;
	}

}
