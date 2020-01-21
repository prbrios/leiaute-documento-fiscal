package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "Entrega")
public class CTeInfCteComplEntrega {

	@Element(name = "semData", required = false)
	private CTeInfCteComplEntregaSemdata semData;

	@Element(name = "comData", required = false)
	private CTeInfCteComplEntregaComData comData;

	@Element(name = "noPeriodo", required = false)
	private CTeInfCteComplEntregaNoPeriodo noPeriodo;

	@Element(name = "semHora", required = false)
	private CTeInfCteComplEntregaSemHora semHora;

	@Element(name = "comHora", required = false)
	private CTeInfCteComplEntregaComHora comHora;

	@Element(name = "noInter", required = false)
	private CTeInfCteComplEntregaNoInter noInter;

}
