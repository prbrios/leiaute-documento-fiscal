package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "ICMSUFFim")
public class CTeInfCteImpICMSUFFim {

	@Element(name = "vBCUFFim", required = false)
	private String vBCUFFim;

	@Element(name = "pFCPUFFim", required = false)
	private String pFCPUFFim;

	@Element(name = "pICMSUFFim", required = false)
	private String pICMSUFFim;

	@Element(name = "pICMSInter", required = false)
	private String pICMSInter;

	@Element(name = "vFCPUFFim", required = false)
	private String vFCPUFFim;

	@Element(name = "vICMSUFFim", required = false)
	private String vICMSUFFim;

	@Element(name = "vICMSUFIni", required = false)
	private String vICMSUFIni;
}
