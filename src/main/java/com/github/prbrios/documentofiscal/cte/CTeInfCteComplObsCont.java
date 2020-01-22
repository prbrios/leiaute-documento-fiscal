package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "ObsCont")
public class CTeInfCteComplObsCont {

	@Attribute(name = "xCampo", required = false)
	private String xCampo;

	@Element(name = "xTexto", required = false)
	private String xTexto;

}
