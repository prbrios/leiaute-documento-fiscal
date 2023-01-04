package com.github.prbrios.documentofiscal.nfse.abrasf.v100;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import com.fasterxml.jackson.annotation.JsonProperty;

@Root(name = "CancelarNfseEnvio")
public class CancelarNfseEnvio {

	@JsonProperty(value = "pedido", required = false)
	@Element(name = "Pedido", required = false)
	private TcPedidoCancelamento pedido;

	public TcPedidoCancelamento getPedido() {
		return pedido;
	}

	public void setPedido(TcPedidoCancelamento pedido) {
		this.pedido = pedido;
	}
	
}
