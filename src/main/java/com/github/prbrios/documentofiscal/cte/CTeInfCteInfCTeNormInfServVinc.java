package com.github.prbrios.documentofiscal.cte;

import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(name = "infServVinc")
public class CTeInfCteInfCTeNormInfServVinc {

	@ElementList(name = "infCTeMultimodal", required = false, inline = true)
	private List<CTeInfCteInfCTeNormInfServVincInfCTeMultimodal> infCTeMultimodal
			= new ArrayList<CTeInfCteInfCTeNormInfServVincInfCTeMultimodal>();

	public List<CTeInfCteInfCTeNormInfServVincInfCTeMultimodal> getInfCTeMultimodal() {
		return infCTeMultimodal;
	}

	public void setInfCTeMultimodal(List<CTeInfCteInfCTeNormInfServVincInfCTeMultimodal> infCTeMultimodal) {
		this.infCTeMultimodal = infCTeMultimodal;
	}

}
