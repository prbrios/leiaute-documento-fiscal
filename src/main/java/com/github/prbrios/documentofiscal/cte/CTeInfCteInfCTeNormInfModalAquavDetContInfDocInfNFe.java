package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "infNFe")
public class CTeInfCteInfCTeNormInfModalAquavDetContInfDocInfNFe {

	@Element(name = "chave", required = false)
	private String chave;

	@Element(name = "unidRat", required = false)
	private String unidRat;

}
