package com.github.prbrios.documentofiscal.cte;

import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(name = "infDoc")
public class CTeInfCteInfCTeNormInfDoc {

	@ElementList(name = "infNF", required = false, inline = true)
	private List<CTeInfCteInfCTeNormInfDocInfNF> infNF
			= new ArrayList<CTeInfCteInfCTeNormInfDocInfNF>();

	@ElementList(name = "infNFe", required = false, inline = true)
	private List<CTeInfCteInfCTeNormInfDocInfNFe>  infNFe
			= new ArrayList<CTeInfCteInfCTeNormInfDocInfNFe>();

	@ElementList(name = "infOutros", required = false, inline = true)
	private List<CTeInfCteInfCTeNormInfDocInfOutros>  infOutros
			= new ArrayList<CTeInfCteInfCTeNormInfDocInfOutros>();

	public List<CTeInfCteInfCTeNormInfDocInfNF> getInfNF() {
		return infNF;
	}

	public void setInfNF(List<CTeInfCteInfCTeNormInfDocInfNF> infNF) {
		this.infNF = infNF;
	}

	public List<CTeInfCteInfCTeNormInfDocInfNFe> getInfNFe() {
		return infNFe;
	}

	public void setInfNFe(List<CTeInfCteInfCTeNormInfDocInfNFe> infNFe) {
		this.infNFe = infNFe;
	}

	public List<CTeInfCteInfCTeNormInfDocInfOutros> getInfOutros() {
		return infOutros;
	}

	public void setInfOutros(List<CTeInfCteInfCTeNormInfDocInfOutros> infOutros) {
		this.infOutros = infOutros;
	}

}
