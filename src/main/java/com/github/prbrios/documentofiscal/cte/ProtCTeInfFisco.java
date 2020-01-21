package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "infFisco")
public class ProtCTeInfFisco {

	@Element(name = "cMsg", required = false)
	private String cMsg;

	@Element(name = "xMsg", required = false)
	private String xMsg;

}
