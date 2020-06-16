package com.github.prbrios.documentofiscal.cte;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "tomaICMS")
public class CTeInfCteInfCTeNormInfCteSubTomaICMS {

	@Element(name = "refNFe", required = false)
	private String refNFe;

	@Element(name = "refNF", required = false)
	private CTeInfCteInfCTeNormInfCteSubTomaICMSRefNF refNF;

	@Element(name = "refCte", required = false)
	private String refCte;

	public String getRefNFe() {
		return refNFe;
	}

	public void setRefNFe(String refNFe) {
		this.refNFe = refNFe;
	}

	public CTeInfCteInfCTeNormInfCteSubTomaICMSRefNF getRefNF() {
		return refNF;
	}

	public void setRefNF(CTeInfCteInfCTeNormInfCteSubTomaICMSRefNF refNF) {
		this.refNF = refNF;
	}

	public String getRefCte() {
		return refCte;
	}

	public void setRefCte(String refCte) {
		this.refCte = refCte;
	}
	
}
