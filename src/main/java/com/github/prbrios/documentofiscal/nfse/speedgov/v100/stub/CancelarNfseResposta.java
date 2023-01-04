package com.github.prbrios.documentofiscal.nfse.speedgov.v100.stub;

import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import com.github.prbrios.documentofiscal.assinatura.Signature;

@Root(name = "CancelarNfseResposta")
public class CancelarNfseResposta {

	@Element(name = "Sucesso", required = false)
	private String sucesso;
	
	@Element(name = "DataHora", required = false)
	private String dataHora;
	
	@ElementList(name = "MensagemRetorno", required = false, inline = true)
	private List<MensagemRetorno> mensagemRetornoList;
	
	@Element(name = "Cancelamento", required = false)
	private Cancelamento cancelamento;
	
	@Element(name = "CancelamentoNfse", required = false)
	private CancelamentoNfse cancelamentoNfse;
	
	public Cancelamento getCancelamento() {
		return cancelamento;
	}

	public void setCancelamento(Cancelamento cancelamento) {
		this.cancelamento = cancelamento;
	}

	public CancelamentoNfse getCancelamentoNfse() {
		return cancelamentoNfse;
	}

	public void setCancelamentoNfse(CancelamentoNfse cancelamentoNfse) {
		this.cancelamentoNfse = cancelamentoNfse;
	}

	public String getSucesso() {
		return sucesso;
	}

	public void setSucesso(String sucesso) {
		this.sucesso = sucesso;
	}

	public String getDataHora() {
		return dataHora;
	}

	public void setDataHora(String dataHora) {
		this.dataHora = dataHora;
	}

	public List<MensagemRetorno> getMensagemRetornoList() {
		return mensagemRetornoList;
	}

	public void setMensagemRetornoList(List<MensagemRetorno> mensagemRetornoList) {
		this.mensagemRetornoList = mensagemRetornoList;
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
	
	@Root(name = "Cancelamento")
	public static class Cancelamento {
		
	}
	
	@Root(name = "CancelamentoNfse")
	public static class CancelamentoNfse {
		
		@Element(name = "ConfirmacaoCancelamento", required = false)
		private ConfirmacaoCancelamento confirmacaoCancelamento;
		
		@Element(name = "Signature", required = false)
		private Signature signature;
		
		public ConfirmacaoCancelamento getConfirmacaoCancelamento() {
			return confirmacaoCancelamento;
		}

		public void setConfirmacaoCancelamento(ConfirmacaoCancelamento confirmacaoCancelamento) {
			this.confirmacaoCancelamento = confirmacaoCancelamento;
		}

		public Signature getSignature() {
			return signature;
		}

		public void setSignature(Signature signature) {
			this.signature = signature;
		}

		@Root(name = "ConfirmacaoCancelamento")
		public static class ConfirmacaoCancelamento {
			
			@Attribute(name = "id", required = false)
			private String id;
			
			@Element(name = "PedidoCancelamento", required = false)
			private PedidoCancelamento pedidoCancelamento;
			
			@Element(name = "InfConfirmacaoCancelamento", required = false)
			private InfConfirmacaoCancelamento infConfirmacaoCancelamento;
			
			public String getId() {
				return id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public PedidoCancelamento getPedidoCancelamento() {
				return pedidoCancelamento;
			}

			public void setPedidoCancelamento(PedidoCancelamento pedidoCancelamento) {
				this.pedidoCancelamento = pedidoCancelamento;
			}

			public InfConfirmacaoCancelamento getInfConfirmacaoCancelamento() {
				return infConfirmacaoCancelamento;
			}

			public void setInfConfirmacaoCancelamento(InfConfirmacaoCancelamento infConfirmacaoCancelamento) {
				this.infConfirmacaoCancelamento = infConfirmacaoCancelamento;
			}

			@Root(name = "PedidoCancelamento")
			public static class PedidoCancelamento {
				
				@Element(name = "InfPedidoCancelamento", required = false)
				private InfPedidoCancelamento infPedidoCancelamento;
				
				public InfPedidoCancelamento getInfPedidoCancelamento() {
					return infPedidoCancelamento;
				}

				public void setInfPedidoCancelamento(InfPedidoCancelamento infPedidoCancelamento) {
					this.infPedidoCancelamento = infPedidoCancelamento;
				}

				@Root(name = "InfPedidoCancelamento")
				public static class InfPedidoCancelamento {
					
					@Element(name = "IdentificacaoNfse", required = false)
					private IdentificacaoNfse identificacaoNfse;
					
					@Element(name = "CodigoCancelamento", required = false)
					private String codigoCancelamento;
					
					public IdentificacaoNfse getIdentificacaoNfse() {
						return identificacaoNfse;
					}

					public void setIdentificacaoNfse(IdentificacaoNfse identificacaoNfse) {
						this.identificacaoNfse = identificacaoNfse;
					}

					public String getCodigoCancelamento() {
						return codigoCancelamento;
					}

					public void setCodigoCancelamento(String codigoCancelamento) {
						this.codigoCancelamento = codigoCancelamento;
					}

					@Root(name = "IdentificacaoNfse")
					public static class IdentificacaoNfse {
						
						@Element(name = "Numero", required = false)
						private String Numero;
						
						@Element(name = "Cnpj", required = false)
                        private String Cnpj;
						
						@Element(name = "InscricaoMunicipal", required = false)
                        private String InscricaoMunicipal;
						
						@Element(name = "CodigoMunicipio", required = false)
                        private String CodigoMunicipio;

						public String getNumero() {
							return Numero;
						}

						public void setNumero(String numero) {
							Numero = numero;
						}

						public String getCnpj() {
							return Cnpj;
						}

						public void setCnpj(String cnpj) {
							Cnpj = cnpj;
						}

						public String getInscricaoMunicipal() {
							return InscricaoMunicipal;
						}

						public void setInscricaoMunicipal(String inscricaoMunicipal) {
							InscricaoMunicipal = inscricaoMunicipal;
						}

						public String getCodigoMunicipio() {
							return CodigoMunicipio;
						}

						public void setCodigoMunicipio(String codigoMunicipio) {
							CodigoMunicipio = codigoMunicipio;
						}
						
					}
				}
				
			}
			
			@Root(name = "InfConfirmacaoCancelamento")
			public static class InfConfirmacaoCancelamento {
				
				@Element(name = "Sucesso", required = false)
				private String sucesso;
				
				@Element(name = "DataHora", required = false)
				private String dataHora;

				public String getSucesso() {
					return sucesso;
				}

				public void setSucesso(String sucesso) {
					this.sucesso = sucesso;
				}

				public String getDataHora() {
					return dataHora;
				}

				public void setDataHora(String dataHora) {
					this.dataHora = dataHora;
				}
				
			}
			
		}
		
	}
	
}
