package com.github.prbrios.documentofiscal.nfse.pe.recife.v100;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.prbrios.documentofiscal.assinatura.Signature;

@Root(name = "Rps")
public class TcRps {

	@JsonProperty(value = "infrps", required = false)
	@Element(name = "InfRps", required = false)
	private TcInfRps infRps;
	
	@JsonProperty(value = "signature", required = false)
	@Element(name = "Signature", required = false)
	private Signature signature;

	public TcInfRps getInfRps() {
		return infRps;
	}

	public void setInfRps(TcInfRps infRps) {
		this.infRps = infRps;
	}

	public Signature getSignature() {
		return signature;
	}

	public void setSignature(Signature signature) {
		this.signature = signature;
	}

}
