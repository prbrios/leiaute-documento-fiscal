package com.github.prbrios.documentofiscal.nfse.speedgov.v100.stub;

import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import com.github.prbrios.documentofiscal.nfse.speedgov.v100.CompNfse;
import com.github.prbrios.documentofiscal.nfse.speedgov.v100.TcMensagemRetorno;

@Root(name = "ConsultarLoteRpsResposta")
public class ConsultarLoteRpsResposta {

	@Element(name = "Sucesso", required = false)
	private Boolean sucesso;
	
	@Element(name = "DataHora", required = false)
	private String dataHora;
	
	@ElementList(name = "MensagemRetorno", required = false, inline = true)
	private List<TcMensagemRetorno> mensagemRetornoList;

	@Element(name = "ListaNfse", required = false)
	private ListaNfse listaNfse;
	
	public Boolean getSucesso() {
		return sucesso;
	}

	public void setSucesso(Boolean sucesso) {
		this.sucesso = sucesso;
	}

	public String getDataHora() {
		return dataHora;
	}

	public void setDataHora(String dataHora) {
		this.dataHora = dataHora;
	}

	public List<TcMensagemRetorno> getMensagemRetornoList() {
		return mensagemRetornoList;
	}

	public void setMensagemRetornoList(List<TcMensagemRetorno> mensagemRetornoList) {
		this.mensagemRetornoList = mensagemRetornoList;
	}
	
	public ListaNfse getListaNfse() {
		return listaNfse;
	}

	public void setListaNfse(ListaNfse listaNfse) {
		this.listaNfse = listaNfse;
	}

	public static class ListaNfse {
		
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
