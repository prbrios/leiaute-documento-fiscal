package com.github.prbrios.documentofiscal.cte;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "infNF")
public class CTeInfCteInfCTeNormInfModalAquavDetContInfDocInfNF {

	@Element(name = "serie", required = false)
	private String serie;

	@Element(name = "nDoc", required = false)
	private String nDoc;

	@Element(name = "unidRat", required = false)
	private String unidRat;

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getnDoc() {
		return nDoc;
	}

	public void setnDoc(String nDoc) {
		this.nDoc = nDoc;
	}

	public String getUnidRat() {
		return unidRat;
	}

	public void setUnidRat(String unidRat) {
		this.unidRat = unidRat;
	}

}
