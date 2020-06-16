package com.github.prbrios.documentofiscal.cte;

import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(name = "infUnidCarga")
public class CTeInfCteInfCTeNormInfDocInfOutrosInfUnidCarga {

	@Element(name = "tpUnidCarga", required = false)
	private String tpUnidCarga;

	@Element(name = "idUnidCarga", required = false)
	private String idUnidCarga;

	@ElementList(name = "lacUnidCarga", required = false, inline = true)
	private List<CTeInfCteInfCTeNormInfDocInfOutrosInfUnidCargaLacUnidCarga> lacUnidCarga
			= new ArrayList<CTeInfCteInfCTeNormInfDocInfOutrosInfUnidCargaLacUnidCarga>();

	@Element(name = "qtdRat", required = false)
	private String qtdRat;

	public String getTpUnidCarga() {
		return tpUnidCarga;
	}

	public void setTpUnidCarga(String tpUnidCarga) {
		this.tpUnidCarga = tpUnidCarga;
	}

	public String getIdUnidCarga() {
		return idUnidCarga;
	}

	public void setIdUnidCarga(String idUnidCarga) {
		this.idUnidCarga = idUnidCarga;
	}

	public List<CTeInfCteInfCTeNormInfDocInfOutrosInfUnidCargaLacUnidCarga> getLacUnidCarga() {
		return lacUnidCarga;
	}

	public void setLacUnidCarga(List<CTeInfCteInfCTeNormInfDocInfOutrosInfUnidCargaLacUnidCarga> lacUnidCarga) {
		this.lacUnidCarga = lacUnidCarga;
	}

	public String getQtdRat() {
		return qtdRat;
	}

	public void setQtdRat(String qtdRat) {
		this.qtdRat = qtdRat;
	}
	
}
