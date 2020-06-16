package com.github.prbrios.documentofiscal.cte;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "ICMS60")
public class CTeInfCteImpICMSICMS60 {

	@Element(name = "CST", required = false)
	private String CST;

	@Element(name = "vBCSTRet", required = false)
	private String vBCSTRet;

	@Element(name = "vICMSSTRet", required = false)
	private String vICMSSTRet;

	@Element(name = "pICMSSTRet", required = false)
	private String pICMSSTRet;

	@Element(name = "vCred", required = false)
	private String vCred;

	public String getCST() {
		return CST;
	}

	public void setCST(String cST) {
		CST = cST;
	}

	public String getvBCSTRet() {
		return vBCSTRet;
	}

	public void setvBCSTRet(String vBCSTRet) {
		this.vBCSTRet = vBCSTRet;
	}

	public String getvICMSSTRet() {
		return vICMSSTRet;
	}

	public void setvICMSSTRet(String vICMSSTRet) {
		this.vICMSSTRet = vICMSSTRet;
	}

	public String getpICMSSTRet() {
		return pICMSSTRet;
	}

	public void setpICMSSTRet(String pICMSSTRet) {
		this.pICMSSTRet = pICMSSTRet;
	}

	public String getvCred() {
		return vCred;
	}

	public void setvCred(String vCred) {
		this.vCred = vCred;
	}

}
