package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;

@Data
@Root(name = "infCarga")
public class CTeInfCteInfCTeNormInfCarga {

	@Element(name = "vCarga", required = false)
	private String vCarga;

	@Element(name = "proPred", required = false)
	private String proPred;

	@Element(name = "xOutCat", required = false)
	private String xOutCat;

	@ElementList(name = "infQ", required = false, inline = true)
	private List<CTeInfCteInfCTeNormInfCargaInfQ> infQ = new ArrayList<CTeInfCteInfCTeNormInfCargaInfQ>();

	@ElementList(name = "vCargaAverb", required = false)
	private String vCargaAverb;

}
