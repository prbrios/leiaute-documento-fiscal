package com.github.prbrios.documentofiscal.nfse.abrasf.v100;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TcInfPedidoCancelamento {

	@JsonProperty(value = "id", required = false)
	@Attribute(name = "Id", required = false)
	private String id;
	
	@JsonProperty(value = "identificacaonfse", required = false)
	@Element(name = "IdentificacaoNfse", required = false)
	private TcIdentificacaoNfse identificacaoNfse;
	
	@JsonProperty(value = "codigocancelamento", required = false)
	@Element(name = "CodigoCancelamento", required = false)
	private String codigoCancelamento;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public TcIdentificacaoNfse getIdentificacaoNfse() {
		return identificacaoNfse;
	}

	public void setIdentificacaoNfse(TcIdentificacaoNfse identificacaoNfse) {
		this.identificacaoNfse = identificacaoNfse;
	}

	public String getCodigoCancelamento() {
		return codigoCancelamento;
	}

	public void setCodigoCancelamento(String codigoCancelamento) {
		this.codigoCancelamento = codigoCancelamento;
	}
	
	
}
