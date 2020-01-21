package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "veicNovos")
public class CTeInfCteInfCTeNormVeicNovos {

	@Element(name = "chassi", required = false)
	private String chassi;

	@Element(name = "cCor", required = false)
	private String cCor;

	@Element(name = "xCor", required = false)
	private String xCor;

	@Element(name = "cMod", required = false)
	private String cMod;

	@Element(name = "vUnit", required = false)
	private String vUnit;

	@Element(name = "vFrete", required = false)
	private String vFrete;

}
