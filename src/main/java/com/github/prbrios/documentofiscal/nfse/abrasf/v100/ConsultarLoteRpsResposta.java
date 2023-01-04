package com.github.prbrios.documentofiscal.nfse.abrasf.v100;

import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import com.fasterxml.jackson.annotation.JsonProperty;

@Root(name = "ConsultarLoteRpsResposta")
public class ConsultarLoteRpsResposta {

	@JsonProperty(value = "listanfse", required = false)
	@Element(name = "ListaNfse", required = false)
	private ListaNfse listaNfse;
	
	@JsonProperty(value = "listamensagemretorno", required = false)
	@Element(name = "ListaMensagemRetorno", required = false)
	private ListaMensagemRetorno listaMensagemRetorno;
	
	@JsonProperty(value = "listamensagemretornolote", required = false)
	@Element(name = "ListaMensagemRetornoLote", required = false)
	private ListaMensagemRetornoLote listaMensagemRetornoLote;

	public ListaNfse getListaNfse() {
		return listaNfse;
	}

	public void setListaNfse(ListaNfse listaNfse) {
		this.listaNfse = listaNfse;
	}

	public ListaMensagemRetorno getListaMensagemRetorno() {
		return listaMensagemRetorno;
	}

	public void setListaMensagemRetorno(ListaMensagemRetorno listaMensagemRetorno) {
		this.listaMensagemRetorno = listaMensagemRetorno;
	}

	public ListaMensagemRetornoLote getListaMensagemRetornoLote() {
		return listaMensagemRetornoLote;
	}

	public void setListaMensagemRetornoLote(ListaMensagemRetornoLote listaMensagemRetornoLote) {
		this.listaMensagemRetornoLote = listaMensagemRetornoLote;
	}

	public static class ListaNfse {
		
		@JsonProperty(value = "compnfse", required = false)
		@ElementList(name = "CompNfse", required = false, inline = true)
		private List<CompNfse> compNfse;

		public List<CompNfse> getCompNfse() {
			return compNfse;
		}

		public void setCompNfse(List<CompNfse> compNfse) {
			this.compNfse = compNfse;
		}
		
	}
	
}
