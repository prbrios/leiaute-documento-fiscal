package com.github.prbrios.documentofiscal.cte;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "idDocAntPap")
public class CTeInfCteInfCTeNormDocAntEmiDocAntIdDocAntIdDocAntPap {

	@Element(name = "tpDoc", required = false)
	private String tpDoc;

	@Element(name = "serie", required = false)
	private String serie;

	@Element(name = "subser", required = false)
	private String subser;

	@Element(name = "nDoc", required = false)
	private String nDoc;

	@Element(name = "dEmi", required = false)
	private String dEmi;

	public String getTpDoc() {
		return tpDoc;
	}

	public void setTpDoc(String tpDoc) {
		this.tpDoc = tpDoc;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getSubser() {
		return subser;
	}

	public void setSubser(String subser) {
		this.subser = subser;
	}

	public String getnDoc() {
		return nDoc;
	}

	public void setnDoc(String nDoc) {
		this.nDoc = nDoc;
	}

	public String getdEmi() {
		return dEmi;
	}

	public void setdEmi(String dEmi) {
		this.dEmi = dEmi;
	}

}
