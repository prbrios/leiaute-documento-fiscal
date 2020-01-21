package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;

@Data
@Root(name = "infCTeNorm")
public class CTeInfCteInfCTeNorm {

	@Element(name = "infCarga", required = false)
	private CTeInfCteInfCTeNormInfCarga infCarga;

	@Element(name = "infDoc", required = false)
	private CTeInfCteInfCTeNormInfDoc infDoc;

	@Element(name = "docAnt", required = false)
	private CTeInfCteInfCTeNormDocAnt docAnt;

	//TODO verificar isso
	@Element(name = "infModal", required = false)
	private CTeInfCteInfCTeNormInfModal infModal;

	@ElementList(name = "veicNovos", required = false, inline = true)
	private List<CTeInfCteInfCTeNormVeicNovos> veicNovos
			= new ArrayList<CTeInfCteInfCTeNormVeicNovos>();

	@Element(name = "cobr", required = false)
	private CTeInfCteInfCTeNormCobr cobr;

	@Element(name = "infCteSub", required = false)
	private CTeInfCteInfCTeNormInfCteSub infCteSub;

	@Element(name = "infGlobalizado", required = false)
	private CTeInfCteInfCTeNormInfGlobalizado infGlobalizado;

	@Element(name = "infServVinc", required = false)
	private CTeInfCteInfCTeNormInfServVinc infServVinc;

}
