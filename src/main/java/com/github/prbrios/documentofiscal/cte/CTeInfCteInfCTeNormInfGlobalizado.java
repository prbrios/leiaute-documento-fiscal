package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "infGlobalizado")
public class CTeInfCteInfCTeNormInfGlobalizado {

	@Element(name = "xObs", required = false)
	private String xObs;

}
