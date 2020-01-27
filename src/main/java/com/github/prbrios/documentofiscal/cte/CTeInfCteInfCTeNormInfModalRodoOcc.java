package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "occ")
public class CTeInfCteInfCTeNormInfModalRodoOcc {

	@Element(name = "serie", required = false)
	private String serie;

	@Element(name = "nOcc", required = false)
	private String nOcc;

	@Element(name = "dEmi", required = false)
	private String dEmi;

	@Element(name = "emiOcc", required = false)
	private CTeInfCteInfCTeNormInfModalRodoOccEmiOcc emiOcc;

}
