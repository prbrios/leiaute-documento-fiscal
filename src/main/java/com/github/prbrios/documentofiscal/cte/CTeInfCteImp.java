package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "imp")
public class CTeInfCteImp {

	@Element(name = "ICMS", required = false)
	private CTeInfCteImpICMS ICMS;

	@Element(name = "vTotTrib", required = false)
	private String vTotTrib;

	@Element(name = "infAdFisco", required = false)
	private String infAdFisco;

	@Element(name = "ICMSUFFim", required = false)
	private CTeInfCteImpICMSUFFim ICMSUFFim;

}
