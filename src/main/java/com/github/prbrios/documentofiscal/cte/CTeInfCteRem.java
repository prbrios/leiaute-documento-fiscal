package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "rem")
public class CTeInfCteRem {

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

	@Element(name = "enderReme", required = false)
	private CTeInfCteEmitEnderReme enderReme;

	@Element(name = "email", required = false)
	private String email;

}
