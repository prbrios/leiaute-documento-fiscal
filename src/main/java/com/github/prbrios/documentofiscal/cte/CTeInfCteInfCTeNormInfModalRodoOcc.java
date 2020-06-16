package com.github.prbrios.documentofiscal.cte;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "occ")
public class CTeInfCteInfCTeNormInfModalRodoOcc {

	@Element(name = "serie", required = false)
	private String serie;

	@Element(name = "nOcc", required = false)
	private String nOcc;

	@Element(name = "dEmi", required = false)
	private String dEmi;

	@Element(name = "emiOcc", required = false)
	private CTeInfCteInfCTeNormInfModalRodoOccEmiOcc emiOcc;

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getnOcc() {
		return nOcc;
	}

	public void setnOcc(String nOcc) {
		this.nOcc = nOcc;
	}

	public String getdEmi() {
		return dEmi;
	}

	public void setdEmi(String dEmi) {
		this.dEmi = dEmi;
	}

	public CTeInfCteInfCTeNormInfModalRodoOccEmiOcc getEmiOcc() {
		return emiOcc;
	}

	public void setEmiOcc(CTeInfCteInfCTeNormInfModalRodoOccEmiOcc emiOcc) {
		this.emiOcc = emiOcc;
	}

}
