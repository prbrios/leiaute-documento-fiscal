package com.github.prbrios.documentofiscal.nfse.speedgov.v100.stub;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "ConsultarLoteRps")
public class ConsultarLoteRps {

	@Element(name = "header", required = false, data = true)
	private String header;
	
	@Element(name = "parameters", required = false, data = true)
	private String parameters;

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public String getParameters() {
		return parameters;
	}

	public void setParameters(String parameters) {
		this.parameters = parameters;
	}
	
}
