package com.github.prbrios.documentofiscal.cte;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "infCteSub")
public class CTeInfCteInfCTeNormInfCteSub {

	@Element(name = "chCte", required = false)
	private String chCte;

	@Element(name = "refCteAnu", required = false)
	private String refCteAnu;

	@Element(name = "tomaICMS", required = false)
	private CTeInfCteInfCTeNormInfCteSubTomaICMS tomaICMS;

	@Element(name = "indAlteraToma", required = false)
	private String indAlteraToma;

	public String getChCte() {
		return chCte;
	}

	public void setChCte(String chCte) {
		this.chCte = chCte;
	}

	public String getRefCteAnu() {
		return refCteAnu;
	}

	public void setRefCteAnu(String refCteAnu) {
		this.refCteAnu = refCteAnu;
	}

	public CTeInfCteInfCTeNormInfCteSubTomaICMS getTomaICMS() {
		return tomaICMS;
	}

	public void setTomaICMS(CTeInfCteInfCTeNormInfCteSubTomaICMS tomaICMS) {
		this.tomaICMS = tomaICMS;
	}

	public String getIndAlteraToma() {
		return indAlteraToma;
	}

	public void setIndAlteraToma(String indAlteraToma) {
		this.indAlteraToma = indAlteraToma;
	}
	
}
