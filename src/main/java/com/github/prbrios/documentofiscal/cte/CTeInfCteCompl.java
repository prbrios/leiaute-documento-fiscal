package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;

@Data
@Root(name = "compl")
public class CTeInfCteCompl {

	@Element(name = "xCaracAd", required = false)
	private String xCaracAd;

	@Element(name = "xCaracSer", required = false)
	private String xCaracSer;

	@Element(name = "xEmi", required = false)
	private String xEmi;

	@Element(name = "fluxo", required = false)
	private CTeInfCteComplFluxo fluxo;

	@Element(name = "Entrega", required = false)
	private CTeInfCteComplEntrega Entrega;

	@Element(name = "origCalc", required = false)
	private String origCalc;

	@Element(name = "destCalc", required = false)
	private String destCalc;

	@Element(name = "xObs", required = false)
	private String xObs;

	@ElementList(name = "ObsCont", required = false, inline = true)
	private List<CTeInfCteComplObsCont> obsCont = new ArrayList<CTeInfCteComplObsCont>();

	@ElementList(name = "ObsFisco", required = false, inline = true)
	private List<CTeInfCteComplObsFisco> obsFisco = new ArrayList<CTeInfCteComplObsFisco>();

}
