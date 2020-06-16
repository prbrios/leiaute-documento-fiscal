package com.github.prbrios.documentofiscal.cte;

import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(name = "indUnidTransp")
public class CTeInfCteInfCTeNormInfDocInfOutrosInfUnidTransp {

	@Element(name = "tpUnidTransp", required = false)
	private String tpUnidTransp;

	@Element(name = "idUnidTransp", required = false)
	private String idUnidTransp;

	@ElementList(name = "lacUnidTransp", required = false, inline = true)
	private List<CTeInfCteInfCTeNormInfDocInfOutrosInfUnidTranspLacUnidTransp> lacUnidTransp
			= new ArrayList<CTeInfCteInfCTeNormInfDocInfOutrosInfUnidTranspLacUnidTransp>();

	@ElementList(name = "infUnidCarga", required = false, inline = true)
	private List<CTeInfCteInfCTeNormInfDocInfOutrosInfUnidTranspInfUnidCarga> infUnidCarga
			= new ArrayList<CTeInfCteInfCTeNormInfDocInfOutrosInfUnidTranspInfUnidCarga>();

	@Element(name = "qtdRat", required = false)
	private String qtdRat;

	public String getTpUnidTransp() {
		return tpUnidTransp;
	}

	public void setTpUnidTransp(String tpUnidTransp) {
		this.tpUnidTransp = tpUnidTransp;
	}

	public String getIdUnidTransp() {
		return idUnidTransp;
	}

	public void setIdUnidTransp(String idUnidTransp) {
		this.idUnidTransp = idUnidTransp;
	}

	public List<CTeInfCteInfCTeNormInfDocInfOutrosInfUnidTranspLacUnidTransp> getLacUnidTransp() {
		return lacUnidTransp;
	}

	public void setLacUnidTransp(List<CTeInfCteInfCTeNormInfDocInfOutrosInfUnidTranspLacUnidTransp> lacUnidTransp) {
		this.lacUnidTransp = lacUnidTransp;
	}

	public List<CTeInfCteInfCTeNormInfDocInfOutrosInfUnidTranspInfUnidCarga> getInfUnidCarga() {
		return infUnidCarga;
	}

	public void setInfUnidCarga(List<CTeInfCteInfCTeNormInfDocInfOutrosInfUnidTranspInfUnidCarga> infUnidCarga) {
		this.infUnidCarga = infUnidCarga;
	}

	public String getQtdRat() {
		return qtdRat;
	}

	public void setQtdRat(String qtdRat) {
		this.qtdRat = qtdRat;
	}

}
