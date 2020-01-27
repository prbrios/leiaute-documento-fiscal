package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "emiOcc")
public class CTeInfCteInfCTeNormInfModalRodoOccEmiOcc {

	@Element(name = "CNPJ", required = false)
	private String CNPJ;

	@Element(name = "cInt", required = false)
	private String cInt;

	@Element(name = "IE", required = false)
	private String IE;

	@Element(name = "UF", required = false)
	private String UF;

	@Element(name = "fone", required = false)
	private String fone;

}
