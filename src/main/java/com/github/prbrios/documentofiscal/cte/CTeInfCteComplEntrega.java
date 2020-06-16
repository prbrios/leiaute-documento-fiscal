package com.github.prbrios.documentofiscal.cte;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

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

	public CTeInfCteComplEntregaSemdata getSemData() {
		return semData;
	}

	public void setSemData(CTeInfCteComplEntregaSemdata semData) {
		this.semData = semData;
	}

	public CTeInfCteComplEntregaComData getComData() {
		return comData;
	}

	public void setComData(CTeInfCteComplEntregaComData comData) {
		this.comData = comData;
	}

	public CTeInfCteComplEntregaNoPeriodo getNoPeriodo() {
		return noPeriodo;
	}

	public void setNoPeriodo(CTeInfCteComplEntregaNoPeriodo noPeriodo) {
		this.noPeriodo = noPeriodo;
	}

	public CTeInfCteComplEntregaSemHora getSemHora() {
		return semHora;
	}

	public void setSemHora(CTeInfCteComplEntregaSemHora semHora) {
		this.semHora = semHora;
	}

	public CTeInfCteComplEntregaComHora getComHora() {
		return comHora;
	}

	public void setComHora(CTeInfCteComplEntregaComHora comHora) {
		this.comHora = comHora;
	}

	public CTeInfCteComplEntregaNoInter getNoInter() {
		return noInter;
	}

	public void setNoInter(CTeInfCteComplEntregaNoInter noInter) {
		this.noInter = noInter;
	}
	
}
