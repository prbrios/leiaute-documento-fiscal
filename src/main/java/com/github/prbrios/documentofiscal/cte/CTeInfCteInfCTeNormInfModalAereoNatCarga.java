package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;

@Data
@Root(name = "natCarga")
public class CTeInfCteInfCTeNormInfModalAereoNatCarga {

	@Element(name = "xDime", required = false)
	private String xDime;

	@ElementList(name = "cInfManu", required = false, inline = true)
	private List<String> cInfManu = new ArrayList<String>();

}
