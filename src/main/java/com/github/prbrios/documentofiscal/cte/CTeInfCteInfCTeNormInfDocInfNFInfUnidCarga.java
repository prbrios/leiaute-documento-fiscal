package com.github.prbrios.documentofiscal.cte;

import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(name = "infUnidCarga")
public class CTeInfCteInfCTeNormInfDocInfNFInfUnidCarga {

	@Element(name = "tpUnidCarga", required = false)
	private String tpUnidCarga;

	@Element(name = "idUnidCarga", required = false)
	private String idUnidCarga;

	@ElementList(name = "lacUnidCarga", required = false, inline = true)
	private List<CTeInfCteInfCTeNormInfDocInfNFInfUnidCargaLacUnidCarga> lacUnidCarga
			= new ArrayList<CTeInfCteInfCTeNormInfDocInfNFInfUnidCargaLacUnidCarga>();

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

	public List<CTeInfCteInfCTeNormInfDocInfNFInfUnidCargaLacUnidCarga> getLacUnidCarga() {
		return lacUnidCarga;
	}

	public void setLacUnidCarga(List<CTeInfCteInfCTeNormInfDocInfNFInfUnidCargaLacUnidCarga> lacUnidCarga) {
		this.lacUnidCarga = lacUnidCarga;
	}

}
