package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "balsa")
public class CTeInfCteInfCTeNormInfModalAquavBalsa {

	@Element(name = "xBalsa", required = false)
	private String xBalsa;

}
