package com.github.prbrios.documentofiscal.cte;

import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(name = "infUnidTransp")
public class CTeInfCteInfCTeNormInfDocInfNFInfUnidTransp {

	@Element(name = "tpUnidTransp", required = false)
	private String tpUnidTransp;

	@Element(name = "idUnidTransp", required = false)
	private String idUnidTransp;

	@ElementList(name = "lacUnidTransp", required = false, inline = true)
	private List<CTeInfCteInfCTeNormInfDocInfNFInfUnidTranspLacUnidTransp> lacUnidTransp
			= new ArrayList<CTeInfCteInfCTeNormInfDocInfNFInfUnidTranspLacUnidTransp>();

	@ElementList(name = "infUnidCarga", required = false, inline = true)
	private List<CTeInfCteInfCTeNormInfDocInfNFInfUnidTranspInfUnidCarga> infUnidCarga
			= new ArrayList<CTeInfCteInfCTeNormInfDocInfNFInfUnidTranspInfUnidCarga>();

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

	public List<CTeInfCteInfCTeNormInfDocInfNFInfUnidTranspLacUnidTransp> getLacUnidTransp() {
		return lacUnidTransp;
	}

	public void setLacUnidTransp(List<CTeInfCteInfCTeNormInfDocInfNFInfUnidTranspLacUnidTransp> lacUnidTransp) {
		this.lacUnidTransp = lacUnidTransp;
	}

	public List<CTeInfCteInfCTeNormInfDocInfNFInfUnidTranspInfUnidCarga> getInfUnidCarga() {
		return infUnidCarga;
	}

	public void setInfUnidCarga(List<CTeInfCteInfCTeNormInfDocInfNFInfUnidTranspInfUnidCarga> infUnidCarga) {
		this.infUnidCarga = infUnidCarga;
	}
	
}
