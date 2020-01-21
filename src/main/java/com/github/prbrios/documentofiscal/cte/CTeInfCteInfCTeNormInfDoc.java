package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;

@Data
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

}
