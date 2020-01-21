package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "infQ")
public class CTeInfCteInfCTeNormInfCargaInfQ {

	@Element(name = "cUnid", required = false)
	private String cUnid;

	@Element(name = "tpMed", required = false)
	private String tpMed;

	@Element(name = "qCarga", required = false)
	private String qCarga;

}
