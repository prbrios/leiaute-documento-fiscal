package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;

@Data
@Root(name = "infServVinc")
public class CTeInfCteInfCTeNormInfServVinc {

	@ElementList(name = "infCTeMultimodal", required = false, inline = true)
	private List<CTeInfCteInfCTeNormInfServVincInfCTeMultimodal> infCTeMultimodal
			= new ArrayList<CTeInfCteInfCTeNormInfServVincInfCTeMultimodal>();

}
