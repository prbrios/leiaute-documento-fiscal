package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "semHora")
public class CTeInfCteComplEntregaSemHora {

	@Element(name = "tpHor", required = false)
	private String tpHor;

}
