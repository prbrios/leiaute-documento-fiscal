package com.github.prbrios.documentofiscal.cte;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "infFisco")
public class ProtCTeInfFisco {

	@Element(name = "cMsg", required = false)
	private String cMsg;

	@Element(name = "xMsg", required = false)
	private String xMsg;

	public String getcMsg() {
		return cMsg;
	}

	public void setcMsg(String cMsg) {
		this.cMsg = cMsg;
	}

	public String getxMsg() {
		return xMsg;
	}

	public void setxMsg(String xMsg) {
		this.xMsg = xMsg;
	}

}
