package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;

@Data
@Root(name = "docAnt")
public class CTeInfCteInfCTeNormDocAnt {

	@ElementList(name = "emiDocAnt")
	private List<CTeInfCteInfCTeNormDocAntEmiDocAnt> emiDocAnt
			= new ArrayList<CTeInfCteInfCTeNormDocAntEmiDocAnt>();

}
