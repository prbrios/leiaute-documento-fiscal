package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "infCteSub")
public class CTeInfCteInfCTeNormInfCteSub {

	@Element(name = "chCte", required = false)
	private String chCte;

	@Element(name = "refCteAnu", required = false)
	private String refCteAnu;

	@Element(name = "tomaICMS", required = false)
	private CTeInfCteInfCTeNormInfCteSubTomaICMS tomaICMS;

	@Element(name = "indAlteraToma", required = false)
	private String indAlteraToma;
}
