package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "infTotAP")
public class CTeInfCteInfCTeNormInfModalAereoPeriInfTotAP {

	@Element(name = "qTotProd", required = false)
	private String qTotProd;

	@Element(name = "uniAP", required = false)
	private String uniAP;

}
