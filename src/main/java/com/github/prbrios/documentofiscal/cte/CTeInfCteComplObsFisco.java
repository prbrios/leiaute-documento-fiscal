package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "ObsFisco")
public class CTeInfCteComplObsFisco {

	@Element(name = "xTexto", required = false)
	private String xTexto;

}
