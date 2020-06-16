package com.github.prbrios.documentofiscal.cte;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "infQ")
public class CTeInfCteInfCTeNormInfCargaInfQ {

	@Element(name = "cUnid", required = false)
	private String cUnid;

	@Element(name = "tpMed", required = false)
	private String tpMed;

	@Element(name = "qCarga", required = false)
	private String qCarga;

	public String getcUnid() {
		return cUnid;
	}

	public void setcUnid(String cUnid) {
		this.cUnid = cUnid;
	}

	public String getTpMed() {
		return tpMed;
	}

	public void setTpMed(String tpMed) {
		this.tpMed = tpMed;
	}

	public String getqCarga() {
		return qCarga;
	}

	public void setqCarga(String qCarga) {
		this.qCarga = qCarga;
	}

}
