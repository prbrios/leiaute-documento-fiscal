package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "duto")
public class CTeInfCteInfCTeNormInfModalDuto {

	@Element(name = "vTar", required = false)
	private String vTar;

	@Element(name = "dIni", required = false)
	private String dIni;

	@Element(name = "dFim", required = false)
	private String dFim;

}
