package com.github.prbrios.documentofiscal.cte;

import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(name = "docAnt")
public class CTeInfCteInfCTeNormDocAnt {

	@ElementList(name = "emiDocAnt")
	private List<CTeInfCteInfCTeNormDocAntEmiDocAnt> emiDocAnt
			= new ArrayList<CTeInfCteInfCTeNormDocAntEmiDocAnt>();

	public List<CTeInfCteInfCTeNormDocAntEmiDocAnt> getEmiDocAnt() {
		return emiDocAnt;
	}

	public void setEmiDocAnt(List<CTeInfCteInfCTeNormDocAntEmiDocAnt> emiDocAnt) {
		this.emiDocAnt = emiDocAnt;
	}

}
