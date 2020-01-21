package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "ICMS00")
public class CTeInfCteImpICMSICMS00 {

	@Element(name = "CST", required = false)
	private String CST;

	@Element(name = "vBC", required = false)
	private String vBC;

	@Element(name = "pICMS", required = false)
	private String pICMS;

	@Element(name = "vICMS", required = false)
	private String vICMS;

}
