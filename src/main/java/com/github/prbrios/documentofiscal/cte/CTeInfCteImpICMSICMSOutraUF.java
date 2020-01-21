package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "ICMSOutraUF")
public class CTeInfCteImpICMSICMSOutraUF {

	@Element(name = "CST", required = false)
	private String CST;

	@Element(name = "pRedBCOutraUF", required = false)
	private String pRedBCOutraUF;

	@Element(name = "vBCOutraUF", required = false)
	private String vBCOutraUF;

	@Element(name = "pICMSOutraUF", required = false)
	private String pICMSOutraUF;

	@Element(name = "vICMSOutraUF", required = false)
	private String vICMSOutraUF;

}
