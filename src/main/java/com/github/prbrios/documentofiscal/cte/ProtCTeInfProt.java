package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "infProt")
public class ProtCTeInfProt {

	@Attribute(name = "Id", required = false)
	private String id;

	@Element(name = "tpAmb", required = false)
	private String tpAmb;

	@Element(name = "verAplic", required = false)
	private String verAplic;

	@Element(name = "chCTe", required = false)
	private String chCTe;

	@Element(name = "dhRecbto", required = false)
	private String dhRecbto;

	@Element(name = "nProt", required = false)
	private String nProt;

	@Element(name = "digVal", required = false)
	private String digVal;

	@Element(name = "cStat", required = false)
	private String cStat;

	@Element(name = "xMotivo", required = false)
	private String xMotivo;

}
