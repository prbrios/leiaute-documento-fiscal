package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "ICMS60")
public class CTeInfCteImpICMSICMS60 {

	@Element(name = "CST", required = false)
	private String CST;

	@Element(name = "vBCSTRet", required = false)
	private String vBCSTRet;

	@Element(name = "vICMSSTRet", required = false)
	private String vICMSSTRet;

	@Element(name = "pICMSSTRet", required = false)
	private String pICMSSTRet;

	@Element(name = "vCred", required = false)
	private String vCred;

}
