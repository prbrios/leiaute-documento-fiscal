package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "tarifa")
public class CTeInfCteInfCTeNormInfModalAereoTarifa {

	@Element(name = "CL", required = false)
	private String CL;

	@Element(name = "cTar", required = false)
	private String cTar;

	@Element(name = "vTar", required = false)
	private String vTar;

}
