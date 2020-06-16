package com.github.prbrios.documentofiscal.cte;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "ICMSUFFim")
public class CTeInfCteImpICMSUFFim {

	@Element(name = "vBCUFFim", required = false)
	private String vBCUFFim;

	@Element(name = "pFCPUFFim", required = false)
	private String pFCPUFFim;

	@Element(name = "pICMSUFFim", required = false)
	private String pICMSUFFim;

	@Element(name = "pICMSInter", required = false)
	private String pICMSInter;

	@Element(name = "vFCPUFFim", required = false)
	private String vFCPUFFim;

	@Element(name = "vICMSUFFim", required = false)
	private String vICMSUFFim;

	@Element(name = "vICMSUFIni", required = false)
	private String vICMSUFIni;

	public String getvBCUFFim() {
		return vBCUFFim;
	}

	public void setvBCUFFim(String vBCUFFim) {
		this.vBCUFFim = vBCUFFim;
	}

	public String getpFCPUFFim() {
		return pFCPUFFim;
	}

	public void setpFCPUFFim(String pFCPUFFim) {
		this.pFCPUFFim = pFCPUFFim;
	}

	public String getpICMSUFFim() {
		return pICMSUFFim;
	}

	public void setpICMSUFFim(String pICMSUFFim) {
		this.pICMSUFFim = pICMSUFFim;
	}

	public String getpICMSInter() {
		return pICMSInter;
	}

	public void setpICMSInter(String pICMSInter) {
		this.pICMSInter = pICMSInter;
	}

	public String getvFCPUFFim() {
		return vFCPUFFim;
	}

	public void setvFCPUFFim(String vFCPUFFim) {
		this.vFCPUFFim = vFCPUFFim;
	}

	public String getvICMSUFFim() {
		return vICMSUFFim;
	}

	public void setvICMSUFFim(String vICMSUFFim) {
		this.vICMSUFFim = vICMSUFFim;
	}

	public String getvICMSUFIni() {
		return vICMSUFIni;
	}

	public void setvICMSUFIni(String vICMSUFIni) {
		this.vICMSUFIni = vICMSUFIni;
	}
	
}
