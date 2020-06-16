package com.github.prbrios.documentofiscal.cte;

import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(name = "rodo")
public class CTeInfCteInfCTeNormInfModalRodo {

	@Element(name = "RNTRC", required = false)
	private String RNTRC;

	@ElementList(name = "occ", required = false, inline = true)
	private List<CTeInfCteInfCTeNormInfModalRodoOcc> occ
			= new ArrayList<CTeInfCteInfCTeNormInfModalRodoOcc>();

	public String getRNTRC() {
		return RNTRC;
	}

	public void setRNTRC(String rNTRC) {
		RNTRC = rNTRC;
	}

	public List<CTeInfCteInfCTeNormInfModalRodoOcc> getOcc() {
		return occ;
	}

	public void setOcc(List<CTeInfCteInfCTeNormInfModalRodoOcc> occ) {
		this.occ = occ;
	}

}
