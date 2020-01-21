package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "semData")
public class CTeInfCteComplEntregaSemdata {

	@Element(name = "tpPer", required = false)
	private String tpPer;

}
