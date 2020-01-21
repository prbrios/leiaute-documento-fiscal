package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "infCTeAnu")
public class CTeInfCteInfCteAnu {

	@Element(name = "chCte", required = false)
	private String chCte;

	@Element(name = "dEmi", required = false)
	private String dEmi;

}
