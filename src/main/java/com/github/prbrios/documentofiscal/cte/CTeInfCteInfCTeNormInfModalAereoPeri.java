package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "peri")
public class CTeInfCteInfCTeNormInfModalAereoPeri {

	@Element(name = "nONU", required = false)
	private String nONU;

	@Element(name = "qTotEmb", required = false)
	private String qTotEmb;

	@Element(name = "infTotAP", required = false)
	private CTeInfCteInfCTeNormInfModalAereoPeriInfTotAP infTotAP;

}
