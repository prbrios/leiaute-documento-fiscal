package com.github.prbrios.documentofiscal.cte;

import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(name = "natCarga")
public class CTeInfCteInfCTeNormInfModalAereoNatCarga {

	@Element(name = "xDime", required = false)
	private String xDime;

	@ElementList(name = "cInfManu", required = false, inline = true)
	private List<String> cInfManu = new ArrayList<String>();

	public String getxDime() {
		return xDime;
	}

	public void setxDime(String xDime) {
		this.xDime = xDime;
	}

	public List<String> getcInfManu() {
		return cInfManu;
	}

	public void setcInfManu(List<String> cInfManu) {
		this.cInfManu = cInfManu;
	}

}
