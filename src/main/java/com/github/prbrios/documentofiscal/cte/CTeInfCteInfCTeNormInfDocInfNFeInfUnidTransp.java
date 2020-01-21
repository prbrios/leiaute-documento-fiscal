package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;

@Data
@Root(name = "infUnidTransp")
public class CTeInfCteInfCTeNormInfDocInfNFeInfUnidTransp {

	@Element(name = "tpUnidTransp", required = false)
	private String tpUnidTransp;

	@Element(name = "idUnidTransp", required = false)
	private String idUnidTransp;

	@ElementList(name = "lacUnidTransp", required = false, inline = true)
	private List<CTeInfCteInfCTeNormInfDocInfNFeInfUnidTranspLacUnidTransp> lacUnidTransp
			= new ArrayList<CTeInfCteInfCTeNormInfDocInfNFeInfUnidTranspLacUnidTransp>();

	@ElementList(name = "infUnidCarga", required = false, inline = true)
	private List<CTeInfCteInfCTeNormInfDocInfNFeInfUnidTranspInfUnidCarga> infUnidCarga
			= new ArrayList<CTeInfCteInfCTeNormInfDocInfNFeInfUnidTranspInfUnidCarga>();

	@Element(name = "qtdRat", required = false)
	private String qtdRat;

}
