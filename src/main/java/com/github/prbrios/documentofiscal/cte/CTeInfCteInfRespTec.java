package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "infRespTec")
public class CTeInfCteInfRespTec {

	@Element(name = "CNPJ", required = false)
	private String CNPJ;

	@Element(name = "xContato", required = false)
	private String xContato;

	@Element(name = "email", required = false)
	private String email;

	@Element(name = "fone", required = false)
	private String fone;

	@Element(name = "idCSRT", required = false)
	private String idCSRT;

	@Element(name = "hashCSRT", required = false)
	private String hashCSRT;

}
