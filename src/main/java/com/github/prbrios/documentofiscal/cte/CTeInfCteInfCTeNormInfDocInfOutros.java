package com.github.prbrios.documentofiscal.cte;

import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(name = "infOutros")
public class CTeInfCteInfCTeNormInfDocInfOutros {

	@Element(name = "tpDoc", required = false)
	private String tpDoc;

	@Element(name = "descOutros", required = false)
	private String descOutros;

	@Element(name = "nDoc", required = false)
	private String nDoc;

	@Element(name = "dEmi", required = false)
	private String dEmi;

	@Element(name = "vDocFisc", required = false)
	private String vDocFisc;

	@Element(name = "dPrev", required = false)
	private String dPrev;

	@ElementList(name = "infUnidCarga", required = false, inline = true)
	private List<CTeInfCteInfCTeNormInfDocInfOutrosInfUnidCarga> infUnidCarga
			= new ArrayList<CTeInfCteInfCTeNormInfDocInfOutrosInfUnidCarga>();

	@ElementList(name = "indUnidTransp", required = false, inline = true)
	private List<CTeInfCteInfCTeNormInfDocInfOutrosInfUnidTransp> infUnidTransp
			= new ArrayList<CTeInfCteInfCTeNormInfDocInfOutrosInfUnidTransp>();

	public String getTpDoc() {
		return tpDoc;
	}

	public void setTpDoc(String tpDoc) {
		this.tpDoc = tpDoc;
	}

	public String getDescOutros() {
		return descOutros;
	}

	public void setDescOutros(String descOutros) {
		this.descOutros = descOutros;
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

	public String getvDocFisc() {
		return vDocFisc;
	}

	public void setvDocFisc(String vDocFisc) {
		this.vDocFisc = vDocFisc;
	}

	public String getdPrev() {
		return dPrev;
	}

	public void setdPrev(String dPrev) {
		this.dPrev = dPrev;
	}

	public List<CTeInfCteInfCTeNormInfDocInfOutrosInfUnidCarga> getInfUnidCarga() {
		return infUnidCarga;
	}

	public void setInfUnidCarga(List<CTeInfCteInfCTeNormInfDocInfOutrosInfUnidCarga> infUnidCarga) {
		this.infUnidCarga = infUnidCarga;
	}

	public List<CTeInfCteInfCTeNormInfDocInfOutrosInfUnidTransp> getInfUnidTransp() {
		return infUnidTransp;
	}

	public void setInfUnidTransp(List<CTeInfCteInfCTeNormInfDocInfOutrosInfUnidTransp> infUnidTransp) {
		this.infUnidTransp = infUnidTransp;
	}

}
