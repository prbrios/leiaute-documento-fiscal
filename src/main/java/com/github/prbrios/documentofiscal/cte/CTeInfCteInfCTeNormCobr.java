package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;

@Data
@Root(name = "cobr")
public class CTeInfCteInfCTeNormCobr {

	@Element(name = "fat", required = false)
	private CTeInfCteInfCTeNormCobrFat fat;

	@ElementList(name = "dup", required = false, inline = true)
	private List<CTeInfCteInfCTeNormCobrDup> dup
			= new ArrayList<CTeInfCteInfCTeNormCobrDup>();

}
