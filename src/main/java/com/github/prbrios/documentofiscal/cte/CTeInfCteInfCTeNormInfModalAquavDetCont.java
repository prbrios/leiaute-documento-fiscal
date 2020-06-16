package com.github.prbrios.documentofiscal.cte;

import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(name = "detCont")
public class CTeInfCteInfCTeNormInfModalAquavDetCont {

	@Element(name = "nCont", required = false)
	private String nCont;

	@ElementList(name = "lacre", required = false, inline = true)
	private List<CTeInfCteInfCTeNormInfModalAquavDetContLacre> lacre
			= new ArrayList<CTeInfCteInfCTeNormInfModalAquavDetContLacre>();

	@ElementList(name = "infDoc", required = false, inline = true)
	private List<CTeInfCteInfCTeNormInfModalAquavDetContInfDoc> infDoc
			= new ArrayList<CTeInfCteInfCTeNormInfModalAquavDetContInfDoc>();

	public String getnCont() {
		return nCont;
	}

	public void setnCont(String nCont) {
		this.nCont = nCont;
	}

	public List<CTeInfCteInfCTeNormInfModalAquavDetContLacre> getLacre() {
		return lacre;
	}

	public void setLacre(List<CTeInfCteInfCTeNormInfModalAquavDetContLacre> lacre) {
		this.lacre = lacre;
	}

	public List<CTeInfCteInfCTeNormInfModalAquavDetContInfDoc> getInfDoc() {
		return infDoc;
	}

	public void setInfDoc(List<CTeInfCteInfCTeNormInfModalAquavDetContInfDoc> infDoc) {
		this.infDoc = infDoc;
	}

}
