package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "comData")
public class CTeInfCteComplEntregaComData {

	@Element(name = "tpPer", required = false)
	private String tpPer;

	@Element(name = "dProg", required = false)
	private String dProg;

}
