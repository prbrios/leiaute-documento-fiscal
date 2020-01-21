package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "ICMS45")
public class CTeInfCteImpICMSICMS45 {

	@Element(name = "CST", required = false)
	private String CST;

}
