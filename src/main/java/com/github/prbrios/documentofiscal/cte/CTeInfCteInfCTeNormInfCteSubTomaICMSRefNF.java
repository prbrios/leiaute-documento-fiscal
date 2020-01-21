package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "refNF")
public class CTeInfCteInfCTeNormInfCteSubTomaICMSRefNF {

	@Element(name = "CNPJ", required = false)
	private String CNPJ;

	@Element(name = "CPF", required = false)
	private String CPF;

	@Element(name = "mod", required = false)
	private String mod;

	@Element(name = "serie", required = false)
	private String serie;

	@Element(name = "subserie", required = false)
	private String subserie;

	@Element(name = "nro", required = false)
	private String nro;

	@Element(name = "valor", required = false)
	private String valor;

	@Element(name = "dEmi", required = false)
	private String dEmi;

}
