package com.github.prbrios.documentofiscal.nfse.abrasf.v100;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.prbrios.documentofiscal.assinatura.Signature;

@Root(name = "EnviarLoteRpsEnvio")
public class EnviarLoteRpsEnvio {
	
	@JsonProperty(value = "loterps", required = false)
	@Element(name = "LoteRps", required = false)
	private TcLoteRps loteRps;
	
	@JsonProperty(value = "signature", required = false)
	@Element(name = "Signature", required = false)
	private Signature signature;

	public TcLoteRps getLoteRps() {
		return loteRps;
	}

	public void setLoteRps(TcLoteRps loteRps) {
		this.loteRps = loteRps;
	}

	public Signature getSignature() {
		return signature;
	}

	public void setSignature(Signature signature) {
		this.signature = signature;
	}
	
}
