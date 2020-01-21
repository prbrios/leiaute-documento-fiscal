package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;

@Data
@Root(name = "emiDocAnt")
public class CTeInfCteInfCTeNormDocAntEmiDocAnt {

	@Element(name = "CNPJ", required = false)
	private String CNPJ;

	@Element(name = "CPF", required = false)
	private String CPF;

	@Element(name = "IE", required = false)
	private String IE;

	@Element(name = "UF", required = false)
	private String UF;

	@Element(name = "xNome", required = false)
	private String xNome;

	@ElementList(name = "idDocAnt", required = false, inline = true)
	private List<CTeInfCteInfCTeNormDocAntEmiDocAntIdDocAnt> idDocAnt
			= new ArrayList<CTeInfCteInfCTeNormDocAntEmiDocAntIdDocAnt>();

}
