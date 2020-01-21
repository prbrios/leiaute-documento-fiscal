package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;

@Data
@Root(name = "trafMut")
public class CTeInfCteInfCTeNormInfModalFerrovTrafMut {

	@Element(name = "respFat", required = false)
	private String respFat;

	@Element(name = "ferrEmi", required = false)
	private String ferrEmi;

	@Element(name = "vFrete", required = false)
	private String vFrete;

	@Element(name = "chCTeFerroOrigem", required = false)
	private String chCTeFerroOrigem;

	@ElementList(name = "ferroEnv", required = false, inline = true)
	private List<CTeInfCteInfCTeNormInfModalFerrovTrafMutFerroEnv> ferroEnv
			= new ArrayList<CTeInfCteInfCTeNormInfModalFerrovTrafMutFerroEnv>();

}
