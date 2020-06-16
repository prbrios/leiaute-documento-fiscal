package com.github.prbrios.documentofiscal.cte;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "toma3")
public class CTeInfCteIdeToma3 {

	@Element(name = "toma", required = false)
	private String toma;

	public String getToma() {
		return toma;
	}

	public void setToma(String toma) {
		this.toma = toma;
	}

}
