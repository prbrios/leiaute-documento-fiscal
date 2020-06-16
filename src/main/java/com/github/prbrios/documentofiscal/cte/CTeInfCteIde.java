package com.github.prbrios.documentofiscal.cte;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "ide")
public class CTeInfCteIde {

	@Element(name = "cUF", required = false)
	private String cUF;

	@Element(name = "cCT", required = false)
	private String cCT;

	@Element(name = "CFOP", required = false)
	private String CFOP;

	@Element(name = "natOp", required = false)
	private String natOp;

	@Element(name = "mod", required = false)
	private String mod;

	@Element(name = "serie", required = false)
	private String serie;

	@Element(name = "nCT", required = false)
	private String nCT;

	@Element(name = "dhEmi", required = false)
	private String dhEmi;

	@Element(name = "tpImp", required = false)
	private String tpImp;

	@Element(name = "tpEmis", required = false)
	private String tpEmis;

	@Element(name = "cDV", required = false)
	private String cDV;

	@Element(name = "tpAmb", required = false)
	private String tpAmb;

	@Element(name = "tpCTe", required = false)
	private String tpCTe;

	@Element(name = "procEmi", required = false)
	private String procEmi;

	@Element(name = "verProc", required = false)
	private String verProc;

	@Element(name = "indGlobalizado", required = false)
	private String indGlobalizado;

	@Element(name = "cMunEnv", required = false)
	private String cMunEnv;

	@Element(name = "xMunEnv", required = false)
	private String xMunEnv;

	@Element(name = "UFEnv", required = false)
	private String UFEnv;

	@Element(name = "modal", required = false)
	private String modal;

	@Element(name = "tpServ", required = false)
	private String tpServ;

	@Element(name = "cMunIni", required = false)
	private String cMunIni;

	@Element(name = "xMunIni", required = false)
	private String xMunIni;

	@Element(name = "UFIni", required = false)
	private String UFIni;

	@Element(name = "cMunFim", required = false)
	private String cMunFim;

	@Element(name = "xMunFim", required = false)
	private String xMunFim;

	@Element(name = "UFFim", required = false)
	private String UFFim;

	@Element(name = "retira", required = false)
	private String retira;

	@Element(name = "xDetRetira", required = false)
	private String xDetRetira;

	@Element(name = "indIEToma", required = false)
	private String indIEToma;

	@Element(name = "toma3", required = false)
	private CTeInfCteIdeToma3 toma3;

	@Element(name = "toma4", required = false)
	private CTeInfCteIdeToma4 toma4;

	@Element(name = "dhCont", required = false)
	private String dhCont;

	@Element(name = "xJust", required = false)
	private String xJust;

	public String getcUF() {
		return cUF;
	}

	public void setcUF(String cUF) {
		this.cUF = cUF;
	}

	public String getcCT() {
		return cCT;
	}

	public void setcCT(String cCT) {
		this.cCT = cCT;
	}

	public String getCFOP() {
		return CFOP;
	}

	public void setCFOP(String cFOP) {
		CFOP = cFOP;
	}

	public String getNatOp() {
		return natOp;
	}

	public void setNatOp(String natOp) {
		this.natOp = natOp;
	}

	public String getMod() {
		return mod;
	}

	public void setMod(String mod) {
		this.mod = mod;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getnCT() {
		return nCT;
	}

	public void setnCT(String nCT) {
		this.nCT = nCT;
	}

	public String getDhEmi() {
		return dhEmi;
	}

	public void setDhEmi(String dhEmi) {
		this.dhEmi = dhEmi;
	}

	public String getTpImp() {
		return tpImp;
	}

	public void setTpImp(String tpImp) {
		this.tpImp = tpImp;
	}

	public String getTpEmis() {
		return tpEmis;
	}

	public void setTpEmis(String tpEmis) {
		this.tpEmis = tpEmis;
	}

	public String getcDV() {
		return cDV;
	}

	public void setcDV(String cDV) {
		this.cDV = cDV;
	}

	public String getTpAmb() {
		return tpAmb;
	}

	public void setTpAmb(String tpAmb) {
		this.tpAmb = tpAmb;
	}

	public String getTpCTe() {
		return tpCTe;
	}

	public void setTpCTe(String tpCTe) {
		this.tpCTe = tpCTe;
	}

	public String getProcEmi() {
		return procEmi;
	}

	public void setProcEmi(String procEmi) {
		this.procEmi = procEmi;
	}

	public String getVerProc() {
		return verProc;
	}

	public void setVerProc(String verProc) {
		this.verProc = verProc;
	}

	public String getIndGlobalizado() {
		return indGlobalizado;
	}

	public void setIndGlobalizado(String indGlobalizado) {
		this.indGlobalizado = indGlobalizado;
	}

	public String getcMunEnv() {
		return cMunEnv;
	}

	public void setcMunEnv(String cMunEnv) {
		this.cMunEnv = cMunEnv;
	}

	public String getxMunEnv() {
		return xMunEnv;
	}

	public void setxMunEnv(String xMunEnv) {
		this.xMunEnv = xMunEnv;
	}

	public String getUFEnv() {
		return UFEnv;
	}

	public void setUFEnv(String uFEnv) {
		UFEnv = uFEnv;
	}

	public String getModal() {
		return modal;
	}

	public void setModal(String modal) {
		this.modal = modal;
	}

	public String getTpServ() {
		return tpServ;
	}

	public void setTpServ(String tpServ) {
		this.tpServ = tpServ;
	}

	public String getcMunIni() {
		return cMunIni;
	}

	public void setcMunIni(String cMunIni) {
		this.cMunIni = cMunIni;
	}

	public String getxMunIni() {
		return xMunIni;
	}

	public void setxMunIni(String xMunIni) {
		this.xMunIni = xMunIni;
	}

	public String getUFIni() {
		return UFIni;
	}

	public void setUFIni(String uFIni) {
		UFIni = uFIni;
	}

	public String getcMunFim() {
		return cMunFim;
	}

	public void setcMunFim(String cMunFim) {
		this.cMunFim = cMunFim;
	}

	public String getxMunFim() {
		return xMunFim;
	}

	public void setxMunFim(String xMunFim) {
		this.xMunFim = xMunFim;
	}

	public String getUFFim() {
		return UFFim;
	}

	public void setUFFim(String uFFim) {
		UFFim = uFFim;
	}

	public String getRetira() {
		return retira;
	}

	public void setRetira(String retira) {
		this.retira = retira;
	}

	public String getxDetRetira() {
		return xDetRetira;
	}

	public void setxDetRetira(String xDetRetira) {
		this.xDetRetira = xDetRetira;
	}

	public String getIndIEToma() {
		return indIEToma;
	}

	public void setIndIEToma(String indIEToma) {
		this.indIEToma = indIEToma;
	}

	public CTeInfCteIdeToma3 getToma3() {
		return toma3;
	}

	public void setToma3(CTeInfCteIdeToma3 toma3) {
		this.toma3 = toma3;
	}

	public CTeInfCteIdeToma4 getToma4() {
		return toma4;
	}

	public void setToma4(CTeInfCteIdeToma4 toma4) {
		this.toma4 = toma4;
	}

	public String getDhCont() {
		return dhCont;
	}

	public void setDhCont(String dhCont) {
		this.dhCont = dhCont;
	}

	public String getxJust() {
		return xJust;
	}

	public void setxJust(String xJust) {
		this.xJust = xJust;
	}

}
