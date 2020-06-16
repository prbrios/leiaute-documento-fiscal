package com.github.prbrios.documentofiscal.cte;

import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(name = "infNFe")
public class CTeInfCteInfCTeNormInfDocInfNFe {

	@Element(name = "chave", required = false)
	private String chave;

	@Element(name = "PIN", required = false)
	private String PIN;

	@Element(name = "dPrev", required = false)
	private String dPrev;

	@ElementList(name = "infUnidCarga", required = false, inline = true)
	private List<CTeInfCteInfCTeNormInfDocInfNFeInfUnidCarga> infUnidCarga
			= new ArrayList<CTeInfCteInfCTeNormInfDocInfNFeInfUnidCarga>();

	@ElementList(name = "infUnidTransp", required = false, inline = true)
	private List<CTeInfCteInfCTeNormInfDocInfNFeInfUnidTransp> infUnidTransp
			= new ArrayList<CTeInfCteInfCTeNormInfDocInfNFeInfUnidTransp>();

	public String getChave() {
		return chave;
	}

	public void setChave(String chave) {
		this.chave = chave;
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

	public List<CTeInfCteInfCTeNormInfDocInfNFeInfUnidCarga> getInfUnidCarga() {
		return infUnidCarga;
	}

	public void setInfUnidCarga(List<CTeInfCteInfCTeNormInfDocInfNFeInfUnidCarga> infUnidCarga) {
		this.infUnidCarga = infUnidCarga;
	}

	public List<CTeInfCteInfCTeNormInfDocInfNFeInfUnidTransp> getInfUnidTransp() {
		return infUnidTransp;
	}

	public void setInfUnidTransp(List<CTeInfCteInfCTeNormInfDocInfNFeInfUnidTransp> infUnidTransp) {
		this.infUnidTransp = infUnidTransp;
	}

}
