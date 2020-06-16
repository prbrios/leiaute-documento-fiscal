package com.github.prbrios.documentofiscal.cte;

import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(name = "idDocAnt")
public class CTeInfCteInfCTeNormDocAntEmiDocAntIdDocAnt {

	@ElementList(name = "idDocAntPap", required = false, inline = true)
	private List<CTeInfCteInfCTeNormDocAntEmiDocAntIdDocAntIdDocAntPap> idDocAntPap
			= new ArrayList<CTeInfCteInfCTeNormDocAntEmiDocAntIdDocAntIdDocAntPap>();

	@ElementList(name = "idDocAntEle", required = false, inline = true)
	private List<CTeInfCteInfCTeNormDocAntEmiDocAntIdDocAntIdDocAntEle> idDocAntEle
			= new ArrayList<CTeInfCteInfCTeNormDocAntEmiDocAntIdDocAntIdDocAntEle>();

	public List<CTeInfCteInfCTeNormDocAntEmiDocAntIdDocAntIdDocAntPap> getIdDocAntPap() {
		return idDocAntPap;
	}

	public void setIdDocAntPap(List<CTeInfCteInfCTeNormDocAntEmiDocAntIdDocAntIdDocAntPap> idDocAntPap) {
		this.idDocAntPap = idDocAntPap;
	}

	public List<CTeInfCteInfCTeNormDocAntEmiDocAntIdDocAntIdDocAntEle> getIdDocAntEle() {
		return idDocAntEle;
	}

	public void setIdDocAntEle(List<CTeInfCteInfCTeNormDocAntEmiDocAntIdDocAntIdDocAntEle> idDocAntEle) {
		this.idDocAntEle = idDocAntEle;
	}

}
