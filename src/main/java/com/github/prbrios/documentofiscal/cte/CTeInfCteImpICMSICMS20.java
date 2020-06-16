package com.github.prbrios.documentofiscal.cte;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "ICMS20")
public class CTeInfCteImpICMSICMS20 {

	@Element(name = "CST", required = false)
	private String  CST;

	@Element(name = "pRedBC", required = false)
	private String pRedBC;

	@Element(name = "vBC", required = false)
	private String vBC;

	@Element(name = "pICMS", required = false)
	private String pICMS;

	@Element(name = "vICMS", required = false)
	private String vICMS;

	public String getCST() {
		return CST;
	}

	public void setCST(String cST) {
		CST = cST;
	}

	public String getpRedBC() {
		return pRedBC;
	}

	public void setpRedBC(String pRedBC) {
		this.pRedBC = pRedBC;
	}

	public String getvBC() {
		return vBC;
	}

	public void setvBC(String vBC) {
		this.vBC = vBC;
	}

	public String getpICMS() {
		return pICMS;
	}

	public void setpICMS(String pICMS) {
		this.pICMS = pICMS;
	}

	public String getvICMS() {
		return vICMS;
	}

	public void setvICMS(String vICMS) {
		this.vICMS = vICMS;
	}

}
