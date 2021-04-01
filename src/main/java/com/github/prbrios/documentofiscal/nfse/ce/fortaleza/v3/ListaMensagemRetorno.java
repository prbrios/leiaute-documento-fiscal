package com.github.prbrios.documentofiscal.nfse.ce.fortaleza.v3;

import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(name = "ListaMensagemRetorno")
public class ListaMensagemRetorno {
	
	@ElementList(name = "MensagemRetorno", required = false, inline = true)
	protected List<MensagemRetorno> mensagemRetorno = new ArrayList<MensagemRetorno>();

	public List<MensagemRetorno> getMensagemRetorno() {
		return mensagemRetorno;
	}

	public void setMensagemRetorno(List<MensagemRetorno> mensagemRetorno) {
		this.mensagemRetorno = mensagemRetorno;
	}
}
