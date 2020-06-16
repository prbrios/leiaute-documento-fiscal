package com.github.prbrios.documentofiscal.cte;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "infModal")
public class CTeInfCteInfCTeNormInfModal {

	@Attribute(name = "versaoModal", required = false)
	private String versaoModal;

	@Element(name = "aereo", required = false)
	private CTeInfCteInfCTeNormInfModalAereo aereo;

	@Element(name = "aquav", required = false)
	private CTeInfCteInfCTeNormInfModalAquav aquav;

	@Element(name = "duto", required = false)
	private CTeInfCteInfCTeNormInfModalDuto duto;

	@Element(name = "ferrov", required = false)
	private CTeInfCteInfCTeNormInfModalFerrov ferrov;

	@Element(name = "rodo", required = false)
	private CTeInfCteInfCTeNormInfModalRodo rodo;

	public String getVersaoModal() {
		return versaoModal;
	}

	public void setVersaoModal(String versaoModal) {
		this.versaoModal = versaoModal;
	}

	public CTeInfCteInfCTeNormInfModalAereo getAereo() {
		return aereo;
	}

	public void setAereo(CTeInfCteInfCTeNormInfModalAereo aereo) {
		this.aereo = aereo;
	}

	public CTeInfCteInfCTeNormInfModalAquav getAquav() {
		return aquav;
	}

	public void setAquav(CTeInfCteInfCTeNormInfModalAquav aquav) {
		this.aquav = aquav;
	}

	public CTeInfCteInfCTeNormInfModalDuto getDuto() {
		return duto;
	}

	public void setDuto(CTeInfCteInfCTeNormInfModalDuto duto) {
		this.duto = duto;
	}

	public CTeInfCteInfCTeNormInfModalFerrov getFerrov() {
		return ferrov;
	}

	public void setFerrov(CTeInfCteInfCTeNormInfModalFerrov ferrov) {
		this.ferrov = ferrov;
	}

	public CTeInfCteInfCTeNormInfModalRodo getRodo() {
		return rodo;
	}

	public void setRodo(CTeInfCteInfCTeNormInfModalRodo rodo) {
		this.rodo = rodo;
	}

}
