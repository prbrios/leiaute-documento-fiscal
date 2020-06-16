package com.github.prbrios.documentofiscal.cte;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "infNFe")
public class CTeInfCteInfCTeNormInfModalAquavDetContInfDocInfNFe {

	@Element(name = "chave", required = false)
	private String chave;

	@Element(name = "unidRat", required = false)
	private String unidRat;

	public String getChave() {
		return chave;
	}

	public void setChave(String chave) {
		this.chave = chave;
	}

	public String getUnidRat() {
		return unidRat;
	}

	public void setUnidRat(String unidRat) {
		this.unidRat = unidRat;
	}

}
