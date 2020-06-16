package com.github.prbrios.documentofiscal.cte;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "infCTeAnu")
public class CTeInfCteInfCteAnu {

	@Element(name = "chCte", required = false)
	private String chCte;

	@Element(name = "dEmi", required = false)
	private String dEmi;

	public String getChCte() {
		return chCte;
	}

	public void setChCte(String chCte) {
		this.chCte = chCte;
	}

	public String getdEmi() {
		return dEmi;
	}

	public void setdEmi(String dEmi) {
		this.dEmi = dEmi;
	}

}
