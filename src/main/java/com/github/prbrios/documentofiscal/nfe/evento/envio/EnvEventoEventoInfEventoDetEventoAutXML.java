package com.github.prbrios.documentofiscal.nfe.evento.envio;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "autXML")
public class EnvEventoEventoInfEventoDetEventoAutXML {

	@Element(name="CNPJ", required=false)
	private String CNPJ;
	
	@Element(name="CPF", required=false)
	private String CPF;

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}
	
}
