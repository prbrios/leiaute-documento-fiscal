package com.github.prbrios.documentofiscal.cte;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "ICMSSN")
public class CTeInfCteImpICMSICMSSN {

	@Element(name = "CST", required = false)
	private String CST;

	@Element(name = "indSN", required = false)
	private String indSN;

	public String getCST() {
		return CST;
	}

	public void setCST(String cST) {
		CST = cST;
	}

	public String getIndSN() {
		return indSN;
	}

	public void setIndSN(String indSN) {
		this.indSN = indSN;
	}

}
