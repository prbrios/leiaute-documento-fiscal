package com.github.prbrios.documentofiscal.cte;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "ICMSOutraUF")
public class CTeInfCteImpICMSICMSOutraUF {

	@Element(name = "CST", required = false)
	private String CST;

	@Element(name = "pRedBCOutraUF", required = false)
	private String pRedBCOutraUF;

	@Element(name = "vBCOutraUF", required = false)
	private String vBCOutraUF;

	@Element(name = "pICMSOutraUF", required = false)
	private String pICMSOutraUF;

	@Element(name = "vICMSOutraUF", required = false)
	private String vICMSOutraUF;

	public String getCST() {
		return CST;
	}

	public void setCST(String cST) {
		CST = cST;
	}

	public String getpRedBCOutraUF() {
		return pRedBCOutraUF;
	}

	public void setpRedBCOutraUF(String pRedBCOutraUF) {
		this.pRedBCOutraUF = pRedBCOutraUF;
	}

	public String getvBCOutraUF() {
		return vBCOutraUF;
	}

	public void setvBCOutraUF(String vBCOutraUF) {
		this.vBCOutraUF = vBCOutraUF;
	}

	public String getpICMSOutraUF() {
		return pICMSOutraUF;
	}

	public void setpICMSOutraUF(String pICMSOutraUF) {
		this.pICMSOutraUF = pICMSOutraUF;
	}

	public String getvICMSOutraUF() {
		return vICMSOutraUF;
	}

	public void setvICMSOutraUF(String vICMSOutraUF) {
		this.vICMSOutraUF = vICMSOutraUF;
	}

}
