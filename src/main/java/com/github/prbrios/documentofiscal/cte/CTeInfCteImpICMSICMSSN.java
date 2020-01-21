package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "ICMSSN")
public class CTeInfCteImpICMSICMSSN {

	@Element(name = "CST", required = false)
	private String CST;

	@Element(name = "indSN", required = false)
	private String indSN;

}
