package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "comHora")
public class CTeInfCteComplEntregaComHora {

	@Element(name = "tpHor", required = false)
	private String tpHor;

	@Element(name = "hProg", required = false)
	private String hProg;

}
