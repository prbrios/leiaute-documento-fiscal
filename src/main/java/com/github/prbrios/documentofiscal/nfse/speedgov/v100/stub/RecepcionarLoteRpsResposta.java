package com.github.prbrios.documentofiscal.nfse.speedgov.v100.stub;

import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(name = "RecepcionarLoteRpsResposta")
public class RecepcionarLoteRpsResposta {

	@Element(name = "NumeroLote", required = false)
	private String numeroLote;
	
	@Element(name = "Sucesso", required = false)
	private Boolean sucesso;
	
	@Element(name = "DataHora", required = false)
	private String dataHora;
	
	@Element(name = "Protocolo", required = false)
	private String protocolo;
	
	@Element(name = "DataRecebimento", required = false)
	private String dataRecebimento;
	
	@ElementList(name = "MensagemRetorno", required = false, inline = true)
	private List<RecepcionarLoteRpsResposta.MensagemRetorno> mensagemRetornoList;
	
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

	public List<RecepcionarLoteRpsResposta.MensagemRetorno> getMensagemRetornoList() {
		return mensagemRetornoList;
	}

	public void setMensagemRetornoList(List<RecepcionarLoteRpsResposta.MensagemRetorno> mensagemRetornoList) {
		this.mensagemRetornoList = mensagemRetornoList;
	}

	public String getProtocolo() {
		return protocolo;
	}

	public void setProtocolo(String protocolo) {
		this.protocolo = protocolo;
	}

	public String getDataRecebimento() {
		return dataRecebimento;
	}

	public void setDataRecebimento(String dataRecebimento) {
		this.dataRecebimento = dataRecebimento;
	}

	@Root(name = "MensagemRetorno")
	public static class MensagemRetorno {
		
		@Element(name = "Codigo", required = false)
		private String codigo;
		
		@Element(name = "Mensagem", required = false)
		private String mensagem;
		
		@Element(name = "Correcao", required = false)
		private String correcao;
		
		public String getCodigo() {
			return codigo;
		}
		public void setCodigo(String codigo) {
			this.codigo = codigo;
		}
		public String getMensagem() {
			return mensagem;
		}
		public void setMensagem(String mensagem) {
			this.mensagem = mensagem;
		}
		public String getCorrecao() {
			return correcao;
		}
		public void setCorrecao(String correcao) {
			this.correcao = correcao;
		}
		
	}
	
}
