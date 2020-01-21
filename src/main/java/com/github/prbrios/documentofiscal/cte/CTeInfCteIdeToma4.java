package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "toma4")
public class CTeInfCteIdeToma4 {

	@Element(name = "toma", required = false)
	private String toma;

	@Element(name = "CNPJ", required = false)
	private String CNPJ;

	@Element(name = "CPF", required = false)
	private String CPF;

	@Element(name = "IE", required = false)
	private String IE;

	@Element(name = "xNome", required = false)
	private String xNome;

	@Element(name = "xFant", required = false)
	private String xFant;

	@Element(name = "fone", required = false)
	private String fone;

	@Element(name = "enderToma", required = false)
	private CTeInfCteIdeToma4EnderToma enderToma;

	@Element(name = "email", required = false)
	private String email;

}
