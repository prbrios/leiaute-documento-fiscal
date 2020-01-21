package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;

@Data
@Root(name = "infUnidCarga")
public class CTeInfCteInfCTeNormInfDocInfNFInfUnidTranspInfUnidCarga {

	@Element(name = "tpUnidCarga", required = false)
	private String tpUnidCarga;

	@Element(name = "idUnidCarga", required = false)
	private String idUnidCarga;

	@ElementList(name = "", required = false, inline = true)
	private List<CTeInfCteInfCTeNormInfDocInfNFInfUnidTranspInfUnidCargaLacUnidCarga> lacUnidCarga
			= new ArrayList<CTeInfCteInfCTeNormInfDocInfNFInfUnidTranspInfUnidCargaLacUnidCarga>();

	@Element(name = "qtdRat", required = false)
	private String qtdRat;

}
