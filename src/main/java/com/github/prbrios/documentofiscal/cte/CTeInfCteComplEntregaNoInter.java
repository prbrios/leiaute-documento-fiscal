package com.github.prbrios.documentofiscal.cte;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "noInter")
public class CTeInfCteComplEntregaNoInter {

	@Element(name = "tpHor", required = false)
	private String tpHor;

	@Element(name = "hini", required = false)
	private String hini;

	@Element(name = "hFim", required = false)
	private String hFim;

}
