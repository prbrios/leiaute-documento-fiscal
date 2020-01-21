package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;

@Data
@Root(name = "infDoc")
public class CTeInfCteInfCTeNormInfModalAquavDetContInfDoc {

	@ElementList(name = "infNF", required = false, inline = true)
	private List<CTeInfCteInfCTeNormInfModalAquavDetContInfDocInfNF> infNF
		= new ArrayList<CTeInfCteInfCTeNormInfModalAquavDetContInfDocInfNF>();

	@ElementList(name = "infNFe", required = false, inline = true)
	private List<CTeInfCteInfCTeNormInfModalAquavDetContInfDocInfNFe> infNFe
			= new ArrayList<CTeInfCteInfCTeNormInfModalAquavDetContInfDocInfNFe>();

}
