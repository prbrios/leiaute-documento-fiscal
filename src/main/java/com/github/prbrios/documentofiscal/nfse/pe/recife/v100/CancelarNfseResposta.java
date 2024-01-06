package com.github.prbrios.documentofiscal.nfse.pe.recife.v100;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import com.fasterxml.jackson.annotation.JsonProperty;

@Root(name = "CancelarNfseResposta")
@Namespace(reference = "http://www.abrasf.org.br/ABRASF/arquivos/nfse.xsd")
public class CancelarNfseResposta {

	@JsonProperty(value = "cancelamento", required = false)
	@Element(name = "Cancelamento", required = false)
	private TcCancelamentoNfse cancelamento;

	@JsonProperty(value = "listamensagemretorno", required = false)
	@Element(name = "ListaMensagemRetorno", required = false)
	private ListaMensagemRetorno listaMensagemRetorno;

	public ListaMensagemRetorno getListaMensagemRetorno() {
		return listaMensagemRetorno;
	}

	public void setListaMensagemRetorno(ListaMensagemRetorno listaMensagemRetorno) {
		this.listaMensagemRetorno = listaMensagemRetorno;
	}

	public TcCancelamentoNfse getCancelamento() {
		return cancelamento;
	}

	public void setCancelamento(TcCancelamentoNfse cancelamento) {
		this.cancelamento = cancelamento;
	}

}
