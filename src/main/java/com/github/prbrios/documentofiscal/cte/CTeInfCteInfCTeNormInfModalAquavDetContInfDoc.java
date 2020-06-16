package com.github.prbrios.documentofiscal.cte;

import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(name = "infDoc")
public class CTeInfCteInfCTeNormInfModalAquavDetContInfDoc {

	@ElementList(name = "infNF", required = false, inline = true)
	private List<CTeInfCteInfCTeNormInfModalAquavDetContInfDocInfNF> infNF
		= new ArrayList<CTeInfCteInfCTeNormInfModalAquavDetContInfDocInfNF>();

	@ElementList(name = "infNFe", required = false, inline = true)
	private List<CTeInfCteInfCTeNormInfModalAquavDetContInfDocInfNFe> infNFe
			= new ArrayList<CTeInfCteInfCTeNormInfModalAquavDetContInfDocInfNFe>();

	public List<CTeInfCteInfCTeNormInfModalAquavDetContInfDocInfNF> getInfNF() {
		return infNF;
	}

	public void setInfNF(List<CTeInfCteInfCTeNormInfModalAquavDetContInfDocInfNF> infNF) {
		this.infNF = infNF;
	}

	public List<CTeInfCteInfCTeNormInfModalAquavDetContInfDocInfNFe> getInfNFe() {
		return infNFe;
	}

	public void setInfNFe(List<CTeInfCteInfCTeNormInfModalAquavDetContInfDocInfNFe> infNFe) {
		this.infNFe = infNFe;
	}

}
