package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "tomaICMS")
public class CTeInfCteInfCTeNormInfCteSubTomaICMS {

	@Element(name = "refNFe", required = false)
	private String refNFe;

	@Element(name = "refNF", required = false)
	private CTeInfCteInfCTeNormInfCteSubTomaICMSRefNF refNF;

	@Element(name = "refCte", required = false)
	private String refCte;
}
