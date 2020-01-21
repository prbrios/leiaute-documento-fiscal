package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;

@Data
@Root(name = "idDocAnt")
public class CTeInfCteInfCTeNormDocAntEmiDocAntIdDocAnt {

	@ElementList(name = "idDocAntPap", required = false, inline = true)
	private List<CTeInfCteInfCTeNormDocAntEmiDocAntIdDocAntIdDocAntPap> idDocAntPap
			= new ArrayList<CTeInfCteInfCTeNormDocAntEmiDocAntIdDocAntIdDocAntPap>();

	@ElementList(name = "idDocAntEle", required = false, inline = true)
	private List<CTeInfCteInfCTeNormDocAntEmiDocAntIdDocAntIdDocAntEle> idDocAntEle
			= new ArrayList<CTeInfCteInfCTeNormDocAntEmiDocAntIdDocAntIdDocAntEle>();

}
