package com.github.prbrios.documentofiscal.cte;

import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(name = "cobr")
public class CTeInfCteInfCTeNormCobr {

	@Element(name = "fat", required = false)
	private CTeInfCteInfCTeNormCobrFat fat;

	@ElementList(name = "dup", required = false, inline = true)
	private List<CTeInfCteInfCTeNormCobrDup> dup
			= new ArrayList<CTeInfCteInfCTeNormCobrDup>();

	public CTeInfCteInfCTeNormCobrFat getFat() {
		return fat;
	}

	public void setFat(CTeInfCteInfCTeNormCobrFat fat) {
		this.fat = fat;
	}

	public List<CTeInfCteInfCTeNormCobrDup> getDup() {
		return dup;
	}

	public void setDup(List<CTeInfCteInfCTeNormCobrDup> dup) {
		this.dup = dup;
	}

}
