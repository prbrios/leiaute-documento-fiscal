package com.github.prbrios.documentofiscal.cte;

import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(name = "ferrov")
public class CTeInfCteInfCTeNormInfModalFerrov {

	@Element(name = "tpTraf", required = false)
	private String tpTraf;

	@ElementList(name = "trafMut", required = false, inline = true)
	private List<CTeInfCteInfCTeNormInfModalFerrovTrafMut> trafMut
			= new ArrayList<CTeInfCteInfCTeNormInfModalFerrovTrafMut>();

	@Element(name = "fluxo", required = false)
	private String fluxo;

	public String getTpTraf() {
		return tpTraf;
	}

	public void setTpTraf(String tpTraf) {
		this.tpTraf = tpTraf;
	}

	public List<CTeInfCteInfCTeNormInfModalFerrovTrafMut> getTrafMut() {
		return trafMut;
	}

	public void setTrafMut(List<CTeInfCteInfCTeNormInfModalFerrovTrafMut> trafMut) {
		this.trafMut = trafMut;
	}

	public String getFluxo() {
		return fluxo;
	}

	public void setFluxo(String fluxo) {
		this.fluxo = fluxo;
	}
	
}
