package com.github.prbrios.documentofiscal.nfse.pe.recife.v100;

import java.util.List;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import com.fasterxml.jackson.annotation.JsonProperty;

@Root(name = "ListaMensagemRetorno")
@Namespace(reference = "http://www.abrasf.org.br/ABRASF/arquivos/nfse.xsd")
public class ListaMensagemRetorno {

	@JsonProperty(value = "mensagemretorno", required = false)
	@ElementList(name = "MensagemRetorno", required = false, inline = true)
	private List<TcMensagemRetorno> mensagemRetorno;

	public List<TcMensagemRetorno> getMensagemRetorno() {
		return mensagemRetorno;
	}

	public void setMensagemRetorno(List<TcMensagemRetorno> mensagemRetorno) {
		this.mensagemRetorno = mensagemRetorno;
	}
	
}
