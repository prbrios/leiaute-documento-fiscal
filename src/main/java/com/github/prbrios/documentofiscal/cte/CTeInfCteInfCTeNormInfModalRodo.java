package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;

@Data
@Root(name = "rodo")
public class CTeInfCteInfCTeNormInfModalRodo {

	@Element(name = "RNTRC", required = false)
	private String RNTRC;

	@ElementList(name = "occ", required = false, inline = true)
	private List<CTeInfCteInfCTeNormInfModalRodoOcc> occ
			= new ArrayList<CTeInfCteInfCTeNormInfModalRodoOcc>();

}
