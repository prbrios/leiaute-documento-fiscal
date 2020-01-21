package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "idDocAntPap")
public class CTeInfCteInfCTeNormDocAntEmiDocAntIdDocAntIdDocAntPap {

	@Element(name = "tpDoc", required = false)
	private String tpDoc;

	@Element(name = "serie", required = false)
	private String serie;

	@Element(name = "subser", required = false)
	private String subser;

	@Element(name = "nDoc", required = false)
	private String nDoc;

	@Element(name = "dEmi", required = false)
	private String dEmi;

}
