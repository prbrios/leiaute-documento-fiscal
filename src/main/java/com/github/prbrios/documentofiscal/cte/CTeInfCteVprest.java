package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;

@Data
@Root(name = "vPrest")
public class CTeInfCteVprest {

	@Element(name = "vTPrest", required = false)
	private String vTPrest;

	@Element(name = "vRec", required = false)
	private String vRec;

	@ElementList(name = "Comp", required = false, inline = true)
	private List<CTeInfCteVprestComp> Comp = new ArrayList<CTeInfCteVprestComp>();

}
