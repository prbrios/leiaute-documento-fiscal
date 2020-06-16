package com.github.prbrios.documentofiscal.cte;

import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(name = "aquav")
public class CTeInfCteInfCTeNormInfModalAquav {

	@Element(name = "vPrest", required = false)
	private String vPrest;

	@Element(name = "vAFRMM", required = false)
	private String vAFRMM;

	@Element(name = "xNavio", required = false)
	private String xNavio;

	@ElementList(name = "balsa", required = false, inline = true)
	private List<CTeInfCteInfCTeNormInfModalAquavBalsa> balsa
			= new ArrayList<CTeInfCteInfCTeNormInfModalAquavBalsa>();

	@Element(name = "nViag", required = false)
	private String nViag;

	@Element(name = "direc", required = false)
	private String direc;

	@Element(name = "irin", required = false)
	private String irin;

	@ElementList(name = "detCont", required = false, inline = true)
	private List<CTeInfCteInfCTeNormInfModalAquavDetCont> detCont
			= new ArrayList<CTeInfCteInfCTeNormInfModalAquavDetCont>();
	private String tpNav;
	public String getvPrest() {
		return vPrest;
	}
	public void setvPrest(String vPrest) {
		this.vPrest = vPrest;
	}
	public String getvAFRMM() {
		return vAFRMM;
	}
	public void setvAFRMM(String vAFRMM) {
		this.vAFRMM = vAFRMM;
	}
	public String getxNavio() {
		return xNavio;
	}
	public void setxNavio(String xNavio) {
		this.xNavio = xNavio;
	}
	public List<CTeInfCteInfCTeNormInfModalAquavBalsa> getBalsa() {
		return balsa;
	}
	public void setBalsa(List<CTeInfCteInfCTeNormInfModalAquavBalsa> balsa) {
		this.balsa = balsa;
	}
	public String getnViag() {
		return nViag;
	}
	public void setnViag(String nViag) {
		this.nViag = nViag;
	}
	public String getDirec() {
		return direc;
	}
	public void setDirec(String direc) {
		this.direc = direc;
	}
	public String getIrin() {
		return irin;
	}
	public void setIrin(String irin) {
		this.irin = irin;
	}
	public List<CTeInfCteInfCTeNormInfModalAquavDetCont> getDetCont() {
		return detCont;
	}
	public void setDetCont(List<CTeInfCteInfCTeNormInfModalAquavDetCont> detCont) {
		this.detCont = detCont;
	}
	public String getTpNav() {
		return tpNav;
	}
	public void setTpNav(String tpNav) {
		this.tpNav = tpNav;
	}
	
}
