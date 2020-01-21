package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;

@Data
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

}
