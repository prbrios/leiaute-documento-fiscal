package com.github.prbrios.documentofiscal.cte;

import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(name = "infNF")
public class CTeInfCteInfCTeNormInfDocInfNF {

	@Element(name = "nRoma", required = false)
	private String nRoma;

	@Element(name = "nPed", required = false)
	private String nPed;

	@Element(name = "mod", required = false)
	private String mod;

	@Element(name = "serie", required = false)
	private String serie;

	@Element(name = "nDoc", required = false)
	private String nDoc;

	@Element(name = "dEmi", required = false)
	private String dEmi;

	@Element(name = "vBC", required = false)
	private String vBC;

	@Element(name = "vICMS", required = false)
	private String vICMS;

	@Element(name = "vBCST", required = false)
	private String vBCST;

	@Element(name = "vST", required = false)
	private String vST;

	@Element(name = "vProd", required = false)
	private String vProd;

	@Element(name = "vNF", required = false)
	private String vNF;

	@Element(name = "nCFOP", required = false)
	private String nCFOP;

	@Element(name = "nPeso", required = false)
	private String nPeso;

	@Element(name = "PIN", required = false)
	private String PIN;

	@Element(name = "dPrev", required = false)
	private String dPrev;

	@ElementList(name = "infUnidCarga", required = false, inline = true)
	private List<CTeInfCteInfCTeNormInfDocInfNFInfUnidCarga> infUnidCarga
			= new ArrayList<CTeInfCteInfCTeNormInfDocInfNFInfUnidCarga>();

	@ElementList(name = "infUnidTransp", required = false, inline = true)
	private List<CTeInfCteInfCTeNormInfDocInfNFInfUnidTransp> infUnidTransp
			= new ArrayList<CTeInfCteInfCTeNormInfDocInfNFInfUnidTransp>();

	public String getnRoma() {
		return nRoma;
	}

	public void setnRoma(String nRoma) {
		this.nRoma = nRoma;
	}

	public String getnPed() {
		return nPed;
	}

	public void setnPed(String nPed) {
		this.nPed = nPed;
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

	public String getnDoc() {
		return nDoc;
	}

	public void setnDoc(String nDoc) {
		this.nDoc = nDoc;
	}

	public String getdEmi() {
		return dEmi;
	}

	public void setdEmi(String dEmi) {
		this.dEmi = dEmi;
	}

	public String getvBC() {
		return vBC;
	}

	public void setvBC(String vBC) {
		this.vBC = vBC;
	}

	public String getvICMS() {
		return vICMS;
	}

	public void setvICMS(String vICMS) {
		this.vICMS = vICMS;
	}

	public String getvBCST() {
		return vBCST;
	}

	public void setvBCST(String vBCST) {
		this.vBCST = vBCST;
	}

	public String getvST() {
		return vST;
	}

	public void setvST(String vST) {
		this.vST = vST;
	}

	public String getvProd() {
		return vProd;
	}

	public void setvProd(String vProd) {
		this.vProd = vProd;
	}

	public String getvNF() {
		return vNF;
	}

	public void setvNF(String vNF) {
		this.vNF = vNF;
	}

	public String getnCFOP() {
		return nCFOP;
	}

	public void setnCFOP(String nCFOP) {
		this.nCFOP = nCFOP;
	}

	public String getnPeso() {
		return nPeso;
	}

	public void setnPeso(String nPeso) {
		this.nPeso = nPeso;
	}

	public String getPIN() {
		return PIN;
	}

	public void setPIN(String pIN) {
		PIN = pIN;
	}

	public String getdPrev() {
		return dPrev;
	}

	public void setdPrev(String dPrev) {
		this.dPrev = dPrev;
	}

	public List<CTeInfCteInfCTeNormInfDocInfNFInfUnidCarga> getInfUnidCarga() {
		return infUnidCarga;
	}

	public void setInfUnidCarga(List<CTeInfCteInfCTeNormInfDocInfNFInfUnidCarga> infUnidCarga) {
		this.infUnidCarga = infUnidCarga;
	}

	public List<CTeInfCteInfCTeNormInfDocInfNFInfUnidTransp> getInfUnidTransp() {
		return infUnidTransp;
	}

	public void setInfUnidTransp(List<CTeInfCteInfCTeNormInfDocInfNFInfUnidTransp> infUnidTransp) {
		this.infUnidTransp = infUnidTransp;
	}

}
