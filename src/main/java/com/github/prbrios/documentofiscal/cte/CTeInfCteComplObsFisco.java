package com.github.prbrios.documentofiscal.cte;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "ObsFisco")
public class CTeInfCteComplObsFisco {

	@Attribute(name = "xCampo", required = false)
	private String xCampo;

	@Element(name = "xTexto", required = false)
	private String xTexto;

	public String getxCampo() {
		return xCampo;
	}

	public void setxCampo(String xCampo) {
		this.xCampo = xCampo;
	}

	public String getxTexto() {
		return xTexto;
	}

	public void setxTexto(String xTexto) {
		this.xTexto = xTexto;
	}

}
