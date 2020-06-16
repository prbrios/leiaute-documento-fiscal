package com.github.prbrios.documentofiscal.cte;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "enderFerro")
public class CTeInfCteInfCTeNormInfModalFerrovTrafMutFerroEnvEnderFerro {

	@Element(name = "xLgr", required = false)
	private String xLgr;

	@Element(name = "nro", required = false)
	private String nro;

	@Element(name = "xCpl", required = false)
	private String xCpl;

	@Element(name = "xBairro", required = false)
	private String xBairro;

	@Element(name = "cMun", required = false)
	private String cMun;

	@Element(name = "xMun", required = false)
	private String xMun;

	@Element(name = "CEP", required = false)
	private String CEP;

	@Element(name = "UF", required = false)
	private String UF;

	public String getxLgr() {
		return xLgr;
	}

	public void setxLgr(String xLgr) {
		this.xLgr = xLgr;
	}

	public String getNro() {
		return nro;
	}

	public void setNro(String nro) {
		this.nro = nro;
	}

	public String getxCpl() {
		return xCpl;
	}

	public void setxCpl(String xCpl) {
		this.xCpl = xCpl;
	}

	public String getxBairro() {
		return xBairro;
	}

	public void setxBairro(String xBairro) {
		this.xBairro = xBairro;
	}

	public String getcMun() {
		return cMun;
	}

	public void setcMun(String cMun) {
		this.cMun = cMun;
	}

	public String getxMun() {
		return xMun;
	}

	public void setxMun(String xMun) {
		this.xMun = xMun;
	}

	public String getCEP() {
		return CEP;
	}

	public void setCEP(String cEP) {
		CEP = cEP;
	}

	public String getUF() {
		return UF;
	}

	public void setUF(String uF) {
		UF = uF;
	}

}
