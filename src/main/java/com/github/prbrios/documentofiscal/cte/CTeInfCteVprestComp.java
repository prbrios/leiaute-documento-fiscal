package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "Comp")
public class CTeInfCteVprestComp {

	@Element(name = "xNome", required = false)
	private String xNome;

	@Element(name = "vComp", required = false)
	private String vComp;

}
