package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "infCTeMultimodal")
public class CTeInfCteInfCTeNormInfServVincInfCTeMultimodal {

	@Element(name = "chCTeMultimodal", required = false)
	private String chCTeMultimodal;

}
