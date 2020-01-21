package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;

@Data
@Root(name = "detCont")
public class CTeInfCteInfCTeNormInfModalAquavDetCont {

	@Element(name = "nCont", required = false)
	private String nCont;

	@ElementList(name = "lacre", required = false, inline = true)
	private List<CTeInfCteInfCTeNormInfModalAquavDetContLacre> lacre
			= new ArrayList<CTeInfCteInfCTeNormInfModalAquavDetContLacre>();

	@ElementList(name = "infDoc", required = false, inline = true)
	private List<CTeInfCteInfCTeNormInfModalAquavDetContInfDoc> infDoc
			= new ArrayList<CTeInfCteInfCTeNormInfModalAquavDetContInfDoc>();

}
