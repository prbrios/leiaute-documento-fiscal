package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "dup")
public class CTeInfCteInfCTeNormCobrDup {

	@Element(name = "nDup", required = false)
	private String nDup;

	@Element(name = "dVenc", required = false)
	private String dVenc;

	@Element(name = "vDup", required = false)
	private String vDup;
}
