package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Data
@Root(name = "infNF")
public class CTeInfCteInfCTeNormInfModalAquavDetContInfDocInfNF {

	@Element(name = "serie", required = false)
	private String serie;

	@Element(name = "nDoc", required = false)
	private String nDoc;

	@Element(name = "unidRat", required = false)
	private String unidRat;

}
