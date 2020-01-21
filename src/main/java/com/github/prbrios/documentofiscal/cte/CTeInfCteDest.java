package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "dest")
public class CTeInfCteDest {

	@Element(name = "CNPJ", required = false)
	private String CNPJ;

	@Element(name = "CPF", required = false)
	private String CPF;

	@Element(name = "IE", required = false)
	private String IE;

	@Element(name = "xNome", required = false)
	private String xNome;

	@Element(name = "fone", required = false)
	private String fone;

	@Element(name = "ISUF", required = false)
	private String ISUF;

	@Element(name = "enderDest", required = false)
	private CTeInfCteEmitEnderDest enderDest;

	@Element(name = "email", required = false)
	private String email;

}
