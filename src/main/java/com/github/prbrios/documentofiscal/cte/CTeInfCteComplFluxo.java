package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "fluxo")
public class CTeInfCteComplFluxo {

	@Element(name = "xOrig", required = false)
	private String xOrig;

	@Element(name = "pass", required = false)
	private CTeInfCteComplFluxoPass pass;

	@Element(name = "xDest", required = false)
	private String xDest;

	@Element(name = "xRota", required = false)
	private String xRota;

}
