package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;

@Data
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

}
