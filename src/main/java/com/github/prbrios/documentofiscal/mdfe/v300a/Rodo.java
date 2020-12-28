package com.github.prbrios.documentofiscal.mdfe.v300a;

import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("rodo")
@Root(name = "rodo")
public class Rodo extends Modal {

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("infantt")
	@Element(name = "infANTT", required = false)
	protected Rodo.InfANTT infANTT;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("veictracao")
	@Element(name = "veicTracao", required = false)
	protected Rodo.VeicTracao veicTracao;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("veicReboque")
	@ElementList(name = "veicReboque", required = false, inline = true)
	protected List<Rodo.VeicReboque> veicReboque = new ArrayList<Rodo.VeicReboque>();
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("codagporto")
	@Element(name = "codAgPorto", required = false)
	protected String codAgPorto;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("lacrodo")
	@ElementList(name = "lacRodo", required = false, inline = true)
	protected List<Rodo.LacRodo> lacRodo = new ArrayList<Rodo.LacRodo>();
	
	public Rodo.InfANTT getInfANTT() {
		return infANTT;
	}

	public void setInfANTT(Rodo.InfANTT infANTT) {
		this.infANTT = infANTT;
	}

	public Rodo.VeicTracao getVeicTracao() {
		return veicTracao;
	}

	public void setVeicTracao(Rodo.VeicTracao veicTracao) {
		this.veicTracao = veicTracao;
	}

	public List<Rodo.VeicReboque> getVeicReboque() {
		return veicReboque;
	}

	public void setVeicReboque(List<Rodo.VeicReboque> veicReboque) {
		this.veicReboque = veicReboque;
	}

	public String getCodAgPorto() {
		return codAgPorto;
	}

	public void setCodAgPorto(String codAgPorto) {
		this.codAgPorto = codAgPorto;
	}

	public List<Rodo.LacRodo> getLacRodo() {
		return lacRodo;
	}

	public void setLacRodo(List<Rodo.LacRodo> lacRodo) {
		this.lacRodo = lacRodo;
	}

	@JsonRootName("infantt")
	@Root(name = "infANTT")
	public static class InfANTT {
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("rntrc")
		@Element(name = "RNTRC", required = false)
		protected String RNTRC;
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("infciot")
		@ElementList(name = "infCIOT", required = false, inline = true)
		protected List<Rodo.InfANTT.InfCIOT> infCIOT = new ArrayList<Rodo.InfANTT.InfCIOT>();
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("valeped")
		@Element(name = "valePed", required = false)
		protected Rodo.InfANTT.ValePed valePed;
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("infcontratante")
		@ElementList(name = "infContratante", required = false, inline = true)
		protected List<Rodo.InfANTT.InfContratante> infContratante = new ArrayList<Rodo.InfANTT.InfContratante>();
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("infpag")
		@ElementList(name = "infPag", required = false, inline = true)
		protected List<Rodo.InfANTT.InfPag> infPag = new ArrayList<Rodo.InfANTT.InfPag>();
		
		public String getRNTRC() {
			return RNTRC;
		}

		public void setRNTRC(String rNTRC) {
			RNTRC = rNTRC;
		}

		public List<Rodo.InfANTT.InfCIOT> getInfCIOT() {
			return infCIOT;
		}

		public void setInfCIOT(List<Rodo.InfANTT.InfCIOT> infCIOT) {
			this.infCIOT = infCIOT;
		}

		public Rodo.InfANTT.ValePed getValePed() {
			return valePed;
		}

		public void setValePed(Rodo.InfANTT.ValePed valePed) {
			this.valePed = valePed;
		}

		public List<Rodo.InfANTT.InfContratante> getInfContratante() {
			return infContratante;
		}

		public void setInfContratante(List<Rodo.InfANTT.InfContratante> infContratante) {
			this.infContratante = infContratante;
		}

		public List<Rodo.InfANTT.InfPag> getInfPag() {
			return infPag;
		}

		public void setInfPag(List<Rodo.InfANTT.InfPag> infPag) {
			this.infPag = infPag;
		}

		@JsonRootName("infciot")
		@Root(name = "infCIOT")
		public static class InfCIOT {
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("ciot")
			@Element(name = "CIOT", required = false)
			protected String CIOT;
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("cpf")
			@Element(name = "CPF", required = false)
			protected String CPF;
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("cnpj")
			@Element(name = "CNPJ", required = false)
			protected String CNPJ;

			public String getCIOT() {
				return CIOT;
			}

			public void setCIOT(String cIOT) {
				CIOT = cIOT;
			}

			public String getCPF() {
				return CPF;
			}

			public void setCPF(String cPF) {
				CPF = cPF;
			}

			public String getCNPJ() {
				return CNPJ;
			}

			public void setCNPJ(String cNPJ) {
				CNPJ = cNPJ;
			}
		}
		
		@JsonRootName("valeped")
		@Root(name = "valePed")
		public static class ValePed {
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("disp")
			@ElementList(name = "disp", required = false, inline = true)
			protected List<Rodo.InfANTT.ValePed.Disp> disp = new ArrayList<Rodo.InfANTT.ValePed.Disp>();
			
			public List<Rodo.InfANTT.ValePed.Disp> getDisp() {
				return disp;
			}

			public void setDisp(List<Rodo.InfANTT.ValePed.Disp> disp) {
				this.disp = disp;
			}

			@JsonRootName("disp")
			@Root(name = "disp")
			public static class Disp {
				
				@JsonInclude(JsonInclude.Include.NON_EMPTY)
				@JsonProperty("cnpjforn")
				@Element(name = "CNPJForn", required = false)
				protected String CNPJForn;
				
				@JsonInclude(JsonInclude.Include.NON_EMPTY)
				@JsonProperty("cnpjpg")
				@Element(name = "CNPJPg", required = false)
				protected String CNPJPg;
				
				@JsonInclude(JsonInclude.Include.NON_EMPTY)
				@JsonProperty("cpfpg")
				@Element(name = "CPFPg", required = false)
				protected String CPFPg;
				
				@JsonInclude(JsonInclude.Include.NON_EMPTY)
				@JsonProperty("ncompra")
				@Element(name = "nCompra", required = false)
				protected String nCompra;
				
				@JsonInclude(JsonInclude.Include.NON_EMPTY)
				@JsonProperty("vvaleped")
				@Element(name = "vValePed", required = false)
				protected String vValePed;

				public String getCNPJForn() {
					return CNPJForn;
				}

				public void setCNPJForn(String cNPJForn) {
					CNPJForn = cNPJForn;
				}

				public String getCNPJPg() {
					return CNPJPg;
				}

				public void setCNPJPg(String cNPJPg) {
					CNPJPg = cNPJPg;
				}

				public String getCPFPg() {
					return CPFPg;
				}

				public void setCPFPg(String cPFPg) {
					CPFPg = cPFPg;
				}

				public String getnCompra() {
					return nCompra;
				}

				public void setnCompra(String nCompra) {
					this.nCompra = nCompra;
				}

				public String getvValePed() {
					return vValePed;
				}

				public void setvValePed(String vValePed) {
					this.vValePed = vValePed;
				}
			}
		}
		
		@JsonRootName("infcontratante")
		@Root(name = "infContratante")
		public static class InfContratante {
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("xnome")
			@Element(name = "xNome", required = false)
			protected String xNome;
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("cpf")
			@Element(name = "CPF", required = false)
			protected String CPF;
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("cnpj")
			@Element(name = "CNPJ", required = false)
			protected String CNPJ;
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("idestrangeiro")
			@Element(name = "idEstrangeiro", required = false)
			protected String idEstrangeiro;

			public String getxNome() {
				return xNome;
			}

			public void setxNome(String xNome) {
				this.xNome = xNome;
			}

			public String getCPF() {
				return CPF;
			}

			public void setCPF(String cPF) {
				CPF = cPF;
			}

			public String getCNPJ() {
				return CNPJ;
			}

			public void setCNPJ(String cNPJ) {
				CNPJ = cNPJ;
			}

			public String getIdEstrangeiro() {
				return idEstrangeiro;
			}

			public void setIdEstrangeiro(String idEstrangeiro) {
				this.idEstrangeiro = idEstrangeiro;
			}
		}
		
		@JsonRootName("infpag")
		@Root(name = "infPag")
		public static class InfPag {
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("xnome")
			@Element(name = "xNome", required = false)
			protected String xNome;
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("cpf")
			@Element(name = "CPF", required = false)
			protected String CPF;
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("cnpj")
			@Element(name = "CNPJ", required = false)
			protected String CNPJ;
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("idestrangeiro")
			@Element(name = "idEstrangeiro", required = false)
			protected String idEstrangeiro;
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("comp")
			@ElementList(name = "comp", required = false, inline = true)
			protected List<Rodo.InfANTT.InfPag.Comp> comp = new ArrayList<Rodo.InfANTT.InfPag.Comp>();
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("vcontrato")
			@Element(name = "vContrato", required = false)
			protected String vContrato;
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("indpag")
			@Element(name = "indPag", required = false)
			protected String indPag;
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("infprazo")
			@ElementList(name = "infPrazo", required = false, inline = true)
			protected List<Rodo.InfANTT.InfPag.InfPrazo> infPrazo = new ArrayList<Rodo.InfANTT.InfPag.InfPrazo>();
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("infbanc")
			@Element(name = "infBanc", required = false)
			protected Rodo.InfANTT.InfPag.InfBanco infBanc;
			
			public String getxNome() {
				return xNome;
			}

			public void setxNome(String xNome) {
				this.xNome = xNome;
			}

			public String getCPF() {
				return CPF;
			}

			public void setCPF(String cPF) {
				CPF = cPF;
			}

			public String getCNPJ() {
				return CNPJ;
			}

			public void setCNPJ(String cNPJ) {
				CNPJ = cNPJ;
			}

			public String getIdEstrangeiro() {
				return idEstrangeiro;
			}

			public void setIdEstrangeiro(String idEstrangeiro) {
				this.idEstrangeiro = idEstrangeiro;
			}

			public List<Rodo.InfANTT.InfPag.Comp> getComp() {
				return comp;
			}

			public void setComp(List<Rodo.InfANTT.InfPag.Comp> comp) {
				this.comp = comp;
			}

			public String getvContrato() {
				return vContrato;
			}

			public void setvContrato(String vContrato) {
				this.vContrato = vContrato;
			}

			public String getIndPag() {
				return indPag;
			}

			public void setIndPag(String indPag) {
				this.indPag = indPag;
			}

			public List<Rodo.InfANTT.InfPag.InfPrazo> getInfPrazo() {
				return infPrazo;
			}

			public void setInfPrazo(List<Rodo.InfANTT.InfPag.InfPrazo> infPrazo) {
				this.infPrazo = infPrazo;
			}

			public Rodo.InfANTT.InfPag.InfBanco getInfBanc() {
				return infBanc;
			}

			public void setInfBanc(Rodo.InfANTT.InfPag.InfBanco infBanc) {
				this.infBanc = infBanc;
			}

			@JsonRootName("comp")
			@Root(name = "comp")
			public static class Comp {
				
				@JsonInclude(JsonInclude.Include.NON_EMPTY)
				@JsonProperty("tpcomp")
				@Element(name = "tpComp", required = false)
				protected String tpComp;
				
				@JsonInclude(JsonInclude.Include.NON_EMPTY)
				@JsonProperty("vcomp")
				@Element(name = "vComp", required = false)
				protected String vComp;
				
				@JsonInclude(JsonInclude.Include.NON_EMPTY)
				@JsonProperty("xcomp")
				@Element(name = "xComp", required = false)
				protected String xComp;

				public String getTpComp() {
					return tpComp;
				}

				public void setTpComp(String tpComp) {
					this.tpComp = tpComp;
				}

				public String getvComp() {
					return vComp;
				}

				public void setvComp(String vComp) {
					this.vComp = vComp;
				}

				public String getxComp() {
					return xComp;
				}

				public void setxComp(String xComp) {
					this.xComp = xComp;
				}
			}
			
			@JsonRootName("infprazo")
			@Root(name = "infPrazo")
			public static class InfPrazo {
				
				@JsonInclude(JsonInclude.Include.NON_EMPTY)
				@JsonProperty("nparcela")
				@Element(name = "nParcela", required = false)
				protected String nParcela;
				
				@JsonInclude(JsonInclude.Include.NON_EMPTY)
				@JsonProperty("dvenc")
				@Element(name = "dVenc", required = false)
				protected String dVenc;
				
				@JsonInclude(JsonInclude.Include.NON_EMPTY)
				@JsonProperty("vparcela")
				@Element(name = "vParcela", required = false)
				protected String vParcela;

				public String getnParcela() {
					return nParcela;
				}

				public void setnParcela(String nParcela) {
					this.nParcela = nParcela;
				}

				public String getdVenc() {
					return dVenc;
				}

				public void setdVenc(String dVenc) {
					this.dVenc = dVenc;
				}

				public String getvParcela() {
					return vParcela;
				}

				public void setvParcela(String vParcela) {
					this.vParcela = vParcela;
				}
			}
			
			@JsonRootName("infbanco")
			@Root(name = "infBanco")
			public static class InfBanco {
				
				@JsonInclude(JsonInclude.Include.NON_EMPTY)
				@JsonProperty("codbanco")
				@Element(name = "codBanco", required = false)
				protected String codBanco;
				
				@JsonInclude(JsonInclude.Include.NON_EMPTY)
				@JsonProperty("codagencia")
				@Element(name = "codAgencia", required = false)
				protected String codAgencia;
				
				@JsonInclude(JsonInclude.Include.NON_EMPTY)
				@JsonProperty("cnpjipef")
				@Element(name = "CNPJIPEF", required = false)
				protected String CNPJIPEF;

				public String getCodBanco() {
					return codBanco;
				}

				public void setCodBanco(String codBanco) {
					this.codBanco = codBanco;
				}

				public String getCodAgencia() {
					return codAgencia;
				}

				public void setCodAgencia(String codAgencia) {
					this.codAgencia = codAgencia;
				}

				public String getCNPJIPEF() {
					return CNPJIPEF;
				}

				public void setCNPJIPEF(String cNPJIPEF) {
					CNPJIPEF = cNPJIPEF;
				}
			}
		}
	}
	
	@JsonRootName("veictracao")
	@Root(name = "veicTracao")
	public static class VeicTracao {
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("cint")
		@Element(name = "cInt", required = false)
		protected String cInt;
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("placa")
		@Element(name = "placa", required = false)
		protected String placa;
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("renavam")
		@Element(name = "RENAVAM", required = false)
		protected String RENAVAM;
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("tara")
		@Element(name = "tara", required = false)
		protected String tara;
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("capkg")
		@Element(name = "capKG", required = false)
		protected String capKG;
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("capm3")
		@Element(name = "capM3", required = false)
		protected String capM3;
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("prop")
		@Element(name = "prop", required = false)
		protected Rodo.VeicTracao.Prop prop;
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("condutor")
		@ElementList(name = "condutor", required = false, inline = true)
		protected List<Rodo.VeicTracao.Condutor> condutor = new ArrayList<Rodo.VeicTracao.Condutor>();
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("tprod")
		@Element(name = "tpRod", required = false)
		protected String tpRod;
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("tpcar")
		@Element(name = "tpCar", required = false)
		protected String tpCar;
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("uf")
		@Element(name = "UF", required = false)
		protected String UF;
		
		public String getcInt() {
			return cInt;
		}

		public void setcInt(String cInt) {
			this.cInt = cInt;
		}

		public String getPlaca() {
			return placa;
		}

		public void setPlaca(String placa) {
			this.placa = placa;
		}

		public String getRENAVAM() {
			return RENAVAM;
		}

		public void setRENAVAM(String rENAVAM) {
			RENAVAM = rENAVAM;
		}

		public String getTara() {
			return tara;
		}

		public void setTara(String tara) {
			this.tara = tara;
		}

		public String getCapKG() {
			return capKG;
		}

		public void setCapKG(String capKG) {
			this.capKG = capKG;
		}

		public String getCapM3() {
			return capM3;
		}

		public void setCapM3(String capM3) {
			this.capM3 = capM3;
		}

		public Rodo.VeicTracao.Prop getProp() {
			return prop;
		}

		public void setProp(Rodo.VeicTracao.Prop prop) {
			this.prop = prop;
		}

		public List<Rodo.VeicTracao.Condutor> getCondutor() {
			return condutor;
		}

		public void setCondutor(List<Rodo.VeicTracao.Condutor> condutor) {
			this.condutor = condutor;
		}

		public String getTpRod() {
			return tpRod;
		}

		public void setTpRod(String tpRod) {
			this.tpRod = tpRod;
		}

		public String getTpCar() {
			return tpCar;
		}

		public void setTpCar(String tpCar) {
			this.tpCar = tpCar;
		}

		public String getUF() {
			return UF;
		}

		public void setUF(String uF) {
			UF = uF;
		}

		@JsonRootName("prop")
		@Root(name = "prop")
		public static class Prop {
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("cpf")
			@Element(name = "CPF", required = false)
			protected String CPF;
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("cnpj")
			@Element(name = "CNPJ", required = false)
			protected String CNPJ;
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("rntrc")
			@Element(name = "RNTRC", required = false)
			protected String RNTRC;
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("xnome")
			@Element(name = "xNome", required = false)
			protected String xNome;
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("ie")
			@Element(name = "IE", required = false)
			protected String IE;
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("uf")
			@Element(name = "UF", required = false)
			protected String UF;
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("tpprop")
			@Element(name = "tpProp", required = false)
			protected String tpProp;

			public String getCPF() {
				return CPF;
			}

			public void setCPF(String cPF) {
				CPF = cPF;
			}

			public String getCNPJ() {
				return CNPJ;
			}

			public void setCNPJ(String cNPJ) {
				CNPJ = cNPJ;
			}

			public String getRNTRC() {
				return RNTRC;
			}

			public void setRNTRC(String rNTRC) {
				RNTRC = rNTRC;
			}

			public String getxNome() {
				return xNome;
			}

			public void setxNome(String xNome) {
				this.xNome = xNome;
			}

			public String getIE() {
				return IE;
			}

			public void setIE(String iE) {
				IE = iE;
			}

			public String getUF() {
				return UF;
			}

			public void setUF(String uF) {
				UF = uF;
			}

			public String getTpProp() {
				return tpProp;
			}

			public void setTpProp(String tpProp) {
				this.tpProp = tpProp;
			}
		}
		
		@JsonRootName("condutor")
		@Root(name = "condutor")
		public static class Condutor {
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("xnome")
			@Element(name = "xNome", required = false)
			protected String xNome;
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("cpf")
			@Element(name = "CPF", required = false)
			protected String CPF;

			public String getxNome() {
				return xNome;
			}

			public void setxNome(String xNome) {
				this.xNome = xNome;
			}

			public String getCPF() {
				return CPF;
			}

			public void setCPF(String cPF) {
				CPF = cPF;
			}
		}
	}
	
	@JsonRootName("veicreboque")
	@Root(name = "veicReboque")
	public static class VeicReboque {
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("cint")
		@Element(name = "cInt", required = false)
		protected String cInt;
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("placa")
		@Element(name = "placa", required = false)
		protected String placa;
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("renavam")
		@Element(name = "RENAVAM", required = false)
		protected String RENAVAM;
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("tara")
		@Element(name = "tara", required = false)
		protected String tara;
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("capkg")
		@Element(name = "capKG", required = false)
		protected String capKG;
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("capm3")
		@Element(name = "capM3", required = false)
		protected String capM3;
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("prop")
		@Element(name = "prop", required = false)
		protected Rodo.VeicReboque.Prop prop;
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("tpcar")
		@Element(name = "tpCar", required = false)
		protected String tpCar;
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("uf")
		@Element(name = "UF", required = false)
		protected String UF;
		
		public String getcInt() {
			return cInt;
		}

		public void setcInt(String cInt) {
			this.cInt = cInt;
		}

		public String getPlaca() {
			return placa;
		}

		public void setPlaca(String placa) {
			this.placa = placa;
		}

		public String getRENAVAM() {
			return RENAVAM;
		}

		public void setRENAVAM(String rENAVAM) {
			RENAVAM = rENAVAM;
		}

		public String getTara() {
			return tara;
		}

		public void setTara(String tara) {
			this.tara = tara;
		}

		public String getCapKG() {
			return capKG;
		}

		public void setCapKG(String capKG) {
			this.capKG = capKG;
		}

		public String getCapM3() {
			return capM3;
		}

		public void setCapM3(String capM3) {
			this.capM3 = capM3;
		}

		public Rodo.VeicReboque.Prop getProp() {
			return prop;
		}

		public void setProp(Rodo.VeicReboque.Prop prop) {
			this.prop = prop;
		}

		public String getTpCar() {
			return tpCar;
		}

		public void setTpCar(String tpCar) {
			this.tpCar = tpCar;
		}

		public String getUF() {
			return UF;
		}

		public void setUF(String uF) {
			UF = uF;
		}

		@JsonRootName("prop")
		@Root(name = "prop")
		public static class Prop {
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("cpf")
			@Element(name = "CPF", required = false)
			protected String CPF;
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("cnpj")
			@Element(name = "CNPJ", required = false)
			protected String CNPJ;
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("rntrc")
			@Element(name = "RNTRC", required = false)
			protected String RNTRC;
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("xnome")
			@Element(name = "xNome", required = false)
			protected String xNome;
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("ie")
			@Element(name = "IE", required = false)
			protected String IE;
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("uf")
			@Element(name = "UF", required = false)
			protected String UF;
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("tpprop")
			@Element(name = "tpProp", required = false)
			protected String tpProp;

			public String getCPF() {
				return CPF;
			}

			public void setCPF(String cPF) {
				CPF = cPF;
			}

			public String getCNPJ() {
				return CNPJ;
			}

			public void setCNPJ(String cNPJ) {
				CNPJ = cNPJ;
			}

			public String getRNTRC() {
				return RNTRC;
			}

			public void setRNTRC(String rNTRC) {
				RNTRC = rNTRC;
			}

			public String getxNome() {
				return xNome;
			}

			public void setxNome(String xNome) {
				this.xNome = xNome;
			}

			public String getIE() {
				return IE;
			}

			public void setIE(String iE) {
				IE = iE;
			}

			public String getUF() {
				return UF;
			}

			public void setUF(String uF) {
				UF = uF;
			}

			public String getTpProp() {
				return tpProp;
			}

			public void setTpProp(String tpProp) {
				this.tpProp = tpProp;
			}
		}
		
	}
	
	@JsonRootName("lacrodo")
	@Root(name = "lacRodo")
	public static class LacRodo {
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("nlacre")
		@Element(name = "nLacre", required = false)
		protected String nLacre;

		public String getnLacre() {
			return nLacre;
		}

		public void setnLacre(String nLacre) {
			this.nLacre = nLacre;
		}
	}
}
