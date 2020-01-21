package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "fat")
public class CTeInfCteInfCTeNormCobrFat {

	@Element(name = "nFat", required = false)
	private String nFat;

	@Element(name = "vOrig", required = false)
	private String vOrig;

	@Element(name = "vDesc", required = false)
	private String vDesc;

	@Element(name = "vLiq", required = false)
	private String vLiq;
}
