package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;

@Data
@Root(name = "aereo")
public class CTeInfCteInfCTeNormInfModalAereo {

	@Element(name = "nMinu", required = false)
	private String nMinu;

	@Element(name = "nOCA", required = false)
	private String nOCA;

	@Element(name = "dPrevAereo")
	private String dPrevAereo;

	@Element(name = "natCarga", required = false)
	private CTeInfCteInfCTeNormInfModalAereoNatCarga natCarga;

	@Element(name = "tarifa", required = false)
	private CTeInfCteInfCTeNormInfModalAereoTarifa tarifa;

	@ElementList(name = "peri", required = false, inline = true)
	private List<CTeInfCteInfCTeNormInfModalAereoPeri> peri
			= new ArrayList<CTeInfCteInfCTeNormInfModalAereoPeri>();

}
