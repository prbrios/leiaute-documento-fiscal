package com.github.prbrios.documentofiscal.nfse.abrasf.v100;

import org.simpleframework.xml.Element;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.prbrios.documentofiscal.assinatura.Signature;

public class TcPedidoCancelamento {

	@JsonProperty(value = "infpedidocancelamento", required = false)
	@Element(name = "InfPedidoCancelamento", required = false)
	private TcInfPedidoCancelamento infPedidoCancelamento;
	
	@JsonProperty(value = "signature", required = false)
	@Element(name = "Signature", required = false)
	private Signature signature;

	public TcInfPedidoCancelamento getInfPedidoCancelamento() {
		return infPedidoCancelamento;
	}

	public void setInfPedidoCancelamento(TcInfPedidoCancelamento infPedidoCancelamento) {
		this.infPedidoCancelamento = infPedidoCancelamento;
	}

	public Signature getSignature() {
		return signature;
	}

	public void setSignature(Signature signature) {
		this.signature = signature;
	}
	
}
