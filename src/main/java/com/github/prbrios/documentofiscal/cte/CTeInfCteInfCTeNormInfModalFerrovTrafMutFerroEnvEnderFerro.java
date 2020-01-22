package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "enderFerro")
public class CTeInfCteInfCTeNormInfModalFerrovTrafMutFerroEnvEnderFerro {

	@Element(name = "xLgr", required = false)
	private String xLgr;

	@Element(name = "nro", required = false)
	private String nro;

	@Element(name = "xCpl", required = false)
	private String xCpl;

	@Element(name = "xBairro", required = false)
	private String xBairro;

	@Element(name = "cMun", required = false)
	private String cMun;

	@Element(name = "xMun", required = false)
	private String xMun;

	@Element(name = "CEP", required = false)
	private String CEP;

	@Element(name = "UF", required = false)
	private String UF;

}