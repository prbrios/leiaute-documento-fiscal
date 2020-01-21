package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;

@Data
@Root(name = "ferrov")
public class CTeInfCteInfCTeNormInfModalFerrov {

	@Element(name = "tpTraf", required = false)
	private String tpTraf;

	@ElementList(name = "trafMut", required = false, inline = true)
	private List<CTeInfCteInfCTeNormInfModalFerrovTrafMut> trafMut
			= new ArrayList<CTeInfCteInfCTeNormInfModalFerrovTrafMut>();

	@Element(name = "fluxo", required = false)
	private String fluxo;
}
