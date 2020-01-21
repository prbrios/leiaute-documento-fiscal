package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Data
@Root(name = "lacUnidTransp")
public class CTeInfCteInfCTeNormInfDocInfOutrosInfUnidTranspLacUnidTransp {

	@Element(name = "nLacre", required = false)
	private String nLacre;

}
