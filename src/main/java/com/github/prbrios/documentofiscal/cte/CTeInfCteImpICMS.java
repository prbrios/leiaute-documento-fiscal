package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "ICMS")
public class CTeInfCteImpICMS {

	@Element(name = "ICMS00", required = false)
	private CTeInfCteImpICMSICMS00 ICMS00;

	@Element(name = "ICMS20", required = false)
	private CTeInfCteImpICMSICMS20 ICMS20;

	@Element(name = "ICMS45", required = false)
	private CTeInfCteImpICMSICMS45 ICMS45;

	@Element(name = "ICMS60", required = false)
	private CTeInfCteImpICMSICMS60 ICMS60;

	@Element(name = "ICMS90", required = false)
	private CTeInfCteImpICMSICMS90 ICMS90;

	@Element(name = "ICMSOutraUF", required = false)
	private CTeInfCteImpICMSICMSOutraUF ICMSOutraUF;

	@Element(name = "ICMSSN", required = false)
	private CTeInfCteImpICMSICMSSN ICMSSN;


}
