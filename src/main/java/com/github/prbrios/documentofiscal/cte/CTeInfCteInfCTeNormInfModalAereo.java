package com.github.prbrios.documentofiscal.cte;

import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(name = "aereo")
public class CTeInfCteInfCTeNormInfModalAereo {

	@Element(name = "nMinu", required = false)
	private String nMinu;

	@Element(name = "nOCA", required = false)
	private String nOCA;

	@Element(name = "dPrevAereo")
	private String dPrevAereo;

	@Element(name = "natCarga", required = false)
	private CTeInfCteInfCTeNormInfModalAereoNatCarga natCarga;

	@Element(name = "tarifa", required = false)
	private CTeInfCteInfCTeNormInfModalAereoTarifa tarifa;

	@ElementList(name = "peri", required = false, inline = true)
	private List<CTeInfCteInfCTeNormInfModalAereoPeri> peri
			= new ArrayList<CTeInfCteInfCTeNormInfModalAereoPeri>();

	public String getnMinu() {
		return nMinu;
	}

	public void setnMinu(String nMinu) {
		this.nMinu = nMinu;
	}

	public String getnOCA() {
		return nOCA;
	}

	public void setnOCA(String nOCA) {
		this.nOCA = nOCA;
	}

	public String getdPrevAereo() {
		return dPrevAereo;
	}

	public void setdPrevAereo(String dPrevAereo) {
		this.dPrevAereo = dPrevAereo;
	}

	public CTeInfCteInfCTeNormInfModalAereoNatCarga getNatCarga() {
		return natCarga;
	}

	public void setNatCarga(CTeInfCteInfCTeNormInfModalAereoNatCarga natCarga) {
		this.natCarga = natCarga;
	}

	public CTeInfCteInfCTeNormInfModalAereoTarifa getTarifa() {
		return tarifa;
	}

	public void setTarifa(CTeInfCteInfCTeNormInfModalAereoTarifa tarifa) {
		this.tarifa = tarifa;
	}

	public List<CTeInfCteInfCTeNormInfModalAereoPeri> getPeri() {
		return peri;
	}

	public void setPeri(List<CTeInfCteInfCTeNormInfModalAereoPeri> peri) {
		this.peri = peri;
	}

}
