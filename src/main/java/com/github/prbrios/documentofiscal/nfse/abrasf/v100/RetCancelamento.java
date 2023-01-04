package com.github.prbrios.documentofiscal.nfse.abrasf.v100;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import com.fasterxml.jackson.annotation.JsonProperty;

@Root(name = "RetCancelamento")
public class RetCancelamento {

	@JsonProperty(value = "nfsecancelamento", required = false)
	@Element(name = "NfseCancelamento", required = false)
	private TcCancelamentoNfse nfseCancelamento;

	public TcCancelamentoNfse getNfseCancelamento() {
		return nfseCancelamento;
	}

	public void setNfseCancelamento(TcCancelamentoNfse nfseCancelamento) {
		this.nfseCancelamento = nfseCancelamento;
	}
	
}
