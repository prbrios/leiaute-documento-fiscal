package com.github.prbrios.documentofiscal.cte;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "infCTeSupl")
public class CTeInfCTeSupl {

	@Element(name = "qrCodCTe", required = false)
	private String qrCodCTe;

	public String getQrCodCTe() {
		return qrCodCTe;
	}

	public void setQrCodCTe(String qrCodCTe) {
		this.qrCodCTe = qrCodCTe;
	}

}
