package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "noPeriodo")
public class CTeInfCteComplEntregaNoPeriodo {

	@Element(name = "tpPer", required = false)
	private String tpPer;

	@Element(name = "dini", required = false)
	private String dini;

	@Element(name = "dFim", required = false)
	private String dFim;

}
