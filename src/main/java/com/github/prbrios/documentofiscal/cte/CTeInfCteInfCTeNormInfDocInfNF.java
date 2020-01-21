package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;

@Data
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

}
