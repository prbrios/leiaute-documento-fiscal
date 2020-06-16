package com.github.prbrios.documentofiscal.cte;

import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(name = "infCarga")
public class CTeInfCteInfCTeNormInfCarga {

	@Element(name = "vCarga", required = false)
	private String vCarga;

	@Element(name = "proPred", required = false)
	private String proPred;

	@Element(name = "xOutCat", required = false)
	private String xOutCat;

	@ElementList(name = "infQ", required = false, inline = true)
	private List<CTeInfCteInfCTeNormInfCargaInfQ> infQ = new ArrayList<CTeInfCteInfCTeNormInfCargaInfQ>();

	@Element(name = "vCargaAverb", required = false)
	private String vCargaAverb;

	public String getvCarga() {
		return vCarga;
	}

	public void setvCarga(String vCarga) {
		this.vCarga = vCarga;
	}

	public String getProPred() {
		return proPred;
	}

	public void setProPred(String proPred) {
		this.proPred = proPred;
	}

	public String getxOutCat() {
		return xOutCat;
	}

	public void setxOutCat(String xOutCat) {
		this.xOutCat = xOutCat;
	}

	public List<CTeInfCteInfCTeNormInfCargaInfQ> getInfQ() {
		return infQ;
	}

	public void setInfQ(List<CTeInfCteInfCTeNormInfCargaInfQ> infQ) {
		this.infQ = infQ;
	}

	public String getvCargaAverb() {
		return vCargaAverb;
	}

	public void setvCargaAverb(String vCargaAverb) {
		this.vCargaAverb = vCargaAverb;
	}

}
