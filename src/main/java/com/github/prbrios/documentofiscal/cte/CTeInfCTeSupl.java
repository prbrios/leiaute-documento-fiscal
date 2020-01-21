package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "infCTeSupl")
public class CTeInfCTeSupl {

	@Element(name = "qrCodeCTe", required = false)
	private String qrCodeCTe;

}
