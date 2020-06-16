package com.github.prbrios.documentofiscal.cte;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "ICMS45")
public class CTeInfCteImpICMSICMS45 {

	@Element(name = "CST", required = false)
	private String CST;

	public String getCST() {
		return CST;
	}

	public void setCST(String cST) {
		CST = cST;
	}

}
