package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "pass")
public class CTeInfCteComplFluxoPass {

	@Element(name = "xPass", required = false)
	private String xPass;
}
