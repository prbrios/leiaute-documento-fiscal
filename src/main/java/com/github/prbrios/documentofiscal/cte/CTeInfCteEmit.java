package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "emit")
public class CTeInfCteEmit {

	@Element(name = "CNPJ", required = false)
	private String CNPJ;

	@Element(name = "IE", required = false)
	private String IE;

	@Element(name = "IEST", required = false)
	private String IEST;

	@Element(name = "xNome", required = false)
	private String xNome;

	@Element(name = "xFant", required = false)
	private String xFant;

	@Element(name = "enderEmit", required = false)
	private CTeInfCteEmitEnderEmit enderEmit;

}
