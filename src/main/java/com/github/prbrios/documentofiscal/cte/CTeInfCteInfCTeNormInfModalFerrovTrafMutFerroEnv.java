package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Data
@Root(name = "ferroEnv")
public class CTeInfCteInfCTeNormInfModalFerrovTrafMutFerroEnv {

	@Element(name = "CNPJ", required = false)
	private String CNPJ;

	@Element(name = "cInt", required = false)
	private String cInt;

	@Element(name = "IE", required = false)
	private String IE;

	@Element(name = "xNome", required = false)
	private String xNome;

	@Element(name = "enderFerro", required = false)
	private CTeInfCteInfCTeNormInfModalFerrovTrafMutFerroEnvEnderFerro enderFerro;
}
