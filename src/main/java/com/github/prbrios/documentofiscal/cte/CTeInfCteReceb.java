package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "receb")
public class CTeInfCteReceb {

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

	@Element(name = "enderReceb", required = false)
	private CTeInfCteEmitEnderReceb enderReceb;

	@Element(name = "email", required = false)
	private String email;

}
