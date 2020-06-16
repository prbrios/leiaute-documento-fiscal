package com.github.prbrios.documentofiscal.cte;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "veicNovos")
public class CTeInfCteInfCTeNormVeicNovos {

	@Element(name = "chassi", required = false)
	private String chassi;

	@Element(name = "cCor", required = false)
	private String cCor;

	@Element(name = "xCor", required = false)
	private String xCor;

	@Element(name = "cMod", required = false)
	private String cMod;

	@Element(name = "vUnit", required = false)
	private String vUnit;

	@Element(name = "vFrete", required = false)
	private String vFrete;

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getcCor() {
		return cCor;
	}

	public void setcCor(String cCor) {
		this.cCor = cCor;
	}

	public String getxCor() {
		return xCor;
	}

	public void setxCor(String xCor) {
		this.xCor = xCor;
	}

	public String getcMod() {
		return cMod;
	}

	public void setcMod(String cMod) {
		this.cMod = cMod;
	}

	public String getvUnit() {
		return vUnit;
	}

	public void setvUnit(String vUnit) {
		this.vUnit = vUnit;
	}

	public String getvFrete() {
		return vFrete;
	}

	public void setvFrete(String vFrete) {
		this.vFrete = vFrete;
	}

}
