package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "idDocAntEle")
public class CTeInfCteInfCTeNormDocAntEmiDocAntIdDocAntIdDocAntEle {

	@Element(name = "chCTe", required = false)
	private String chCTe;

}