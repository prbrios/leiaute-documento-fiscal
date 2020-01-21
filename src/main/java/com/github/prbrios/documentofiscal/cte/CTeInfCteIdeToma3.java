package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "toma3")
public class CTeInfCteIdeToma3 {

	@Element(name = "toma", required = false)
	private String toma;

}
