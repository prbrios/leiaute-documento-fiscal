package com.github.prbrios.documentofiscal.nfse.speedgov.v100;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TcConfirmacaoCancelamento {

	@JsonProperty(value = "id", required = false)
	@Attribute(name = "Id", required = false)
	private String id;
	
	@JsonProperty(value = "pedido", required = false)
	@Element(name = "Pedido", required = false)
	private TcPedidoCancelamento pedido;
	
	@JsonProperty(value = "datahoracancelamento", required = false)
	@Element(name = "DataHoraCancelamento", required = false)
	private String dataHoraCancelamento;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public TcPedidoCancelamento getPedido() {
		return pedido;
	}

	public void setPedido(TcPedidoCancelamento pedido) {
		this.pedido = pedido;
	}

	public String getDataHoraCancelamento() {
		return dataHoraCancelamento;
	}

	public void setDataHoraCancelamento(String dataHoraCancelamento) {
		this.dataHoraCancelamento = dataHoraCancelamento;
	}
	
}
