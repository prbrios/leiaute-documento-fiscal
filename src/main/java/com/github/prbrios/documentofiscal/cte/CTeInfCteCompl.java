package com.github.prbrios.documentofiscal.cte;

import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

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

	public String getxCaracAd() {
		return xCaracAd;
	}

	public void setxCaracAd(String xCaracAd) {
		this.xCaracAd = xCaracAd;
	}

	public String getxCaracSer() {
		return xCaracSer;
	}

	public void setxCaracSer(String xCaracSer) {
		this.xCaracSer = xCaracSer;
	}

	public String getxEmi() {
		return xEmi;
	}

	public void setxEmi(String xEmi) {
		this.xEmi = xEmi;
	}

	public CTeInfCteComplFluxo getFluxo() {
		return fluxo;
	}

	public void setFluxo(CTeInfCteComplFluxo fluxo) {
		this.fluxo = fluxo;
	}

	public CTeInfCteComplEntrega getEntrega() {
		return Entrega;
	}

	public void setEntrega(CTeInfCteComplEntrega entrega) {
		Entrega = entrega;
	}

	public String getOrigCalc() {
		return origCalc;
	}

	public void setOrigCalc(String origCalc) {
		this.origCalc = origCalc;
	}

	public String getDestCalc() {
		return destCalc;
	}

	public void setDestCalc(String destCalc) {
		this.destCalc = destCalc;
	}

	public String getxObs() {
		return xObs;
	}

	public void setxObs(String xObs) {
		this.xObs = xObs;
	}

	public List<CTeInfCteComplObsCont> getObsCont() {
		return obsCont;
	}

	public void setObsCont(List<CTeInfCteComplObsCont> obsCont) {
		this.obsCont = obsCont;
	}

	public List<CTeInfCteComplObsFisco> getObsFisco() {
		return obsFisco;
	}

	public void setObsFisco(List<CTeInfCteComplObsFisco> obsFisco) {
		this.obsFisco = obsFisco;
	}
	
}
