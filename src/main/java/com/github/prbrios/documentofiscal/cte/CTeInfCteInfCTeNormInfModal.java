package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "infModal")
public class CTeInfCteInfCTeNormInfModal {

	@Attribute(name = "versaoModal", required = false)
	private String versaoModal;

	@Element(name = "aereo", required = false)
	private CTeInfCteInfCTeNormInfModalAereo aereo;

	@Element(name = "aquav", required = false)
	private CTeInfCteInfCTeNormInfModalAquav aquav;

	@Element(name = "duto", required = false)
	private CTeInfCteInfCTeNormInfModalDuto duto;

	@Element(name = "ferrov", required = false)
	private CTeInfCteInfCTeNormInfModalFerrov ferrov;

	@Element(name = "rodo", required = false)
	private CTeInfCteInfCTeNormInfModalRodo rodo;

}
