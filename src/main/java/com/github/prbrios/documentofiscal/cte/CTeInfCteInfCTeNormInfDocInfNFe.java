package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;

@Data
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
}
