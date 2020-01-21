package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "infCteComp")
public class CTeInfCteInfCteComp {

	@Element(name = "chCTe")
	private String chCTe;

}
