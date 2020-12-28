package com.github.prbrios.documentofiscal.mdfe.v300a;

import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.ElementUnion;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Text;
import org.simpleframework.xml.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.prbrios.documentofiscal.DFPersister;
import com.github.prbrios.documentofiscal.assinatura.Signature;

@JsonRootName("mdfe")
@Root(name = "MDFe")
@Namespace(reference = "http://www.portalfiscal.inf.br/mdfe")
public class TMDFe {

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("infmdfe")
	@Element(name = "infMDFe", required = false)
	protected TMDFe.InfMDFe infMDFe;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("infmdfesupl")
	@Element(name = "infMDFeSupl", required = false)
	protected TMDFe.InfMDFeSupl infMDFeSupl;
	
	@JsonIgnore
	@Element(name = "Signature", required = false)
	protected Signature signature;

	public TMDFe.InfMDFe getInfMDFe() {
		return infMDFe;
	}

	public void setInfMDFe(TMDFe.InfMDFe infMDFe) {
		this.infMDFe = infMDFe;
	}

	public TMDFe.InfMDFeSupl getInfMDFeSupl() {
		return infMDFeSupl;
	}

	public void setInfMDFeSupl(TMDFe.InfMDFeSupl infMDFeSupl) {
		this.infMDFeSupl = infMDFeSupl;
	}

	public Signature getSignature() {
		return signature;
	}

	public void setSignature(Signature signature) {
		this.signature = signature;
	}

	@JsonRootName("infmdfe")
	@Root(name = "infMDFe")
	public static class InfMDFe {

		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("versao")
		@Attribute(name = "versao", required = false)
		protected String versao;
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("id")
		@Attribute(name = "Id", required = false)
		protected String Id;
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("ide")
		@Element(name = "ide", required = false)
		protected TMDFe.InfMDFe.Ide ide;
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("emit")
		@Element(name = "emit", required = false)
		protected TMDFe.InfMDFe.Emit emit;
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("infmodal")
		@Element(name = "infModal", required = false)
		protected TMDFe.InfMDFe.InfModal infModal;
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("infdoc")
		@Element(name = "infDoc", required = false)
		protected TMDFe.InfMDFe.InfDoc infDoc;
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("seg")
		@ElementList(name = "seg", required = false, inline = true)
		protected List<TMDFe.InfMDFe.Seg> seg = new ArrayList<TMDFe.InfMDFe.Seg>();
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("prodpred")
		@Element(name = "prodPred", required = false)
		protected TMDFe.InfMDFe.ProdPred prodPred;
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("tot")
		@Element(name = "tot", required = false)
		protected TMDFe.InfMDFe.Tot tot;
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("lacres")
		@ElementList(name = "lacres", required = false, inline = true)
		protected List<TMDFe.InfMDFe.Lacres> lacres = new ArrayList<TMDFe.InfMDFe.Lacres>();
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("autxml")
		@ElementList(name = "autXML", required = false, inline = true)
		protected List<TMDFe.InfMDFe.AutXML> autXML = new ArrayList<TMDFe.InfMDFe.AutXML>(); 
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("infadic")
		@Element(name = "infAdic", required = false)
		protected TMDFe.InfMDFe.InfAdic infAdic;
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("infresptec")
		@Element(name = "infRespTec", required = false)
		protected TMDFe.InfMDFe.InfRespTec infRespTec;
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("infsolicnff")
		@Element(name = "infSolicNNF", required = false)
		protected TMDFe.InfMDFe.InfSolicNFF infSolicNNF; 

		public String getVersao() {
			return versao;
		}

		public void setVersao(String versao) {
			this.versao = versao;
		}

		public String getId() {
			return Id;
		}

		public void setId(String id) {
			Id = id;
		}

		public TMDFe.InfMDFe.Ide getIde() {
			return ide;
		}

		public void setIde(TMDFe.InfMDFe.Ide ide) {
			this.ide = ide;
		}

		public TMDFe.InfMDFe.Emit getEmit() {
			return emit;
		}

		public void setEmit(TMDFe.InfMDFe.Emit emit) {
			this.emit = emit;
		}

		public TMDFe.InfMDFe.InfModal getInfModal() {
			return infModal;
		}

		public void setInfModal(TMDFe.InfMDFe.InfModal infModal) {
			this.infModal = infModal;
		}

		public TMDFe.InfMDFe.InfDoc getInfDoc() {
			return infDoc;
		}

		public void setInfDoc(TMDFe.InfMDFe.InfDoc infDoc) {
			this.infDoc = infDoc;
		}

		public List<TMDFe.InfMDFe.Seg> getSeg() {
			return seg;
		}

		public void setSeg(List<TMDFe.InfMDFe.Seg> seg) {
			this.seg = seg;
		}

		public TMDFe.InfMDFe.ProdPred getProdPred() {
			return prodPred;
		}

		public void setProdPred(TMDFe.InfMDFe.ProdPred prodPred) {
			this.prodPred = prodPred;
		}

		public TMDFe.InfMDFe.Tot getTot() {
			return tot;
		}

		public void setTot(TMDFe.InfMDFe.Tot tot) {
			this.tot = tot;
		}

		public List<TMDFe.InfMDFe.Lacres> getLacres() {
			return lacres;
		}

		public void setLacres(List<TMDFe.InfMDFe.Lacres> lacres) {
			this.lacres = lacres;
		}

		public List<TMDFe.InfMDFe.AutXML> getAutXML() {
			return autXML;
		}

		public void setAutXML(List<TMDFe.InfMDFe.AutXML> autXML) {
			this.autXML = autXML;
		}

		public TMDFe.InfMDFe.InfAdic getInfAdic() {
			return infAdic;
		}

		public void setInfAdic(TMDFe.InfMDFe.InfAdic infAdic) {
			this.infAdic = infAdic;
		}

		public TMDFe.InfMDFe.InfRespTec getInfRespTec() {
			return infRespTec;
		}

		public void setInfRespTec(TMDFe.InfMDFe.InfRespTec infRespTec) {
			this.infRespTec = infRespTec;
		}

		public TMDFe.InfMDFe.InfSolicNFF getInfSolicNNF() {
			return infSolicNNF;
		}

		public void setInfSolicNNF(TMDFe.InfMDFe.InfSolicNFF infSolicNNF) {
			this.infSolicNNF = infSolicNNF;
		}

		@JsonRootName("ide")
		@Root(name = "ide")
		public static class Ide {

			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("cuf")
			@Element(name = "cUF", required = false)
			protected String cUF;
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("tpamb")
			@Element(name = "tpAmb", required = false)
			protected String tpAmb;
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("tpemit")
			@Element(name = "tpEmit", required = false)
			protected String tpEmit;
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("tptransp")
			@Element(name = "tpTransp", required = false)
			protected String tpTransp;
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("mod")
			@Element(name = "mod", required = false)
			protected String mod;
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("serie")
			@Element(name = "serie", required = false)
			protected String serie;
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("nmdf")
			@Element(name = "nMDF", required = false)
			protected String nMDF;
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("cmdf")
			@Element(name = "cMDF", required = false)
			protected String cMDF;
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("cdv")
			@Element(name = "cDV", required = false)
			protected String cDV;
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("modal")
			@Element(name = "modal", required = false)
			protected String modal;
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("dhemi")
			@Element(name = "dhEmi", required = false)
			protected String dhEmi;
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("tpemis")
			@Element(name = "tpEmis", required = false)
			protected String tpEmis;
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("procemi")
			@Element(name = "procEmi", required = false)
			protected String procEmi;
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("verproc")
			@Element(name = "verProc", required = false)
			protected String verProc;
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("ufini")
			@Element(name = "UFIni", required = false)
			protected String UFIni;
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("uffim")
			@Element(name = "UFFim", required = false)
			protected String UFFim;
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("infmuncarrega")
			@ElementList(name = "infMunCarrega", required = false, inline = true)
			protected List<TMDFe.InfMDFe.Ide.InfMunCarrega> infMunCarrega = new ArrayList<TMDFe.InfMDFe.Ide.InfMunCarrega>();
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("infpercurso")
			@ElementList(name = "infPercurso", required = false, inline = true)
			protected List<TMDFe.InfMDFe.Ide.InfPercurso> infPercurso = new ArrayList<TMDFe.InfMDFe.Ide.InfPercurso>();
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("dhiniviagem")
			@Element(name = "dhIniViagem", required = false)
			protected String dhIniViagem;
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("indcanalverde")
			@Element(name = "indCanalVerde", required = false)
			protected String indCanalVerde;
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("indcarregaposterior")
			@Element(name = "indCarregaPosterior", required = false)
			protected String indCarregaPosterior;

			public String getcUF() {
				return cUF;
			}

			public void setcUF(String cUF) {
				this.cUF = cUF;
			}

			public String getTpAmb() {
				return tpAmb;
			}

			public void setTpAmb(String tpAmb) {
				this.tpAmb = tpAmb;
			}

			public String getTpEmit() {
				return tpEmit;
			}

			public void setTpEmit(String tpEmit) {
				this.tpEmit = tpEmit;
			}

			public String getTpTransp() {
				return tpTransp;
			}

			public void setTpTransp(String tpTransp) {
				this.tpTransp = tpTransp;
			}

			public String getMod() {
				return mod;
			}

			public void setMod(String mod) {
				this.mod = mod;
			}

			public String getSerie() {
				return serie;
			}

			public void setSerie(String serie) {
				this.serie = serie;
			}

			public String getnMDF() {
				return nMDF;
			}

			public void setnMDF(String nMDF) {
				this.nMDF = nMDF;
			}

			public String getcMDF() {
				return cMDF;
			}

			public void setcMDF(String cMDF) {
				this.cMDF = cMDF;
			}

			public String getcDV() {
				return cDV;
			}

			public void setcDV(String cDV) {
				this.cDV = cDV;
			}

			public String getModal() {
				return modal;
			}

			public void setModal(String modal) {
				this.modal = modal;
			}

			public String getDhEmi() {
				return dhEmi;
			}

			public void setDhEmi(String dhEmi) {
				this.dhEmi = dhEmi;
			}

			public String getTpEmis() {
				return tpEmis;
			}

			public void setTpEmis(String tpEmis) {
				this.tpEmis = tpEmis;
			}

			public String getProcEmi() {
				return procEmi;
			}

			public void setProcEmi(String procEmi) {
				this.procEmi = procEmi;
			}

			public String getVerProc() {
				return verProc;
			}

			public void setVerProc(String verProc) {
				this.verProc = verProc;
			}

			public String getUFIni() {
				return UFIni;
			}

			public void setUFIni(String uFIni) {
				UFIni = uFIni;
			}

			public String getUFFim() {
				return UFFim;
			}

			public void setUFFim(String uFFim) {
				UFFim = uFFim;
			}

			public List<TMDFe.InfMDFe.Ide.InfMunCarrega> getInfMunCarrega() {
				return infMunCarrega;
			}

			public void setInfMunCarrega(List<TMDFe.InfMDFe.Ide.InfMunCarrega> infMunCarrega) {
				this.infMunCarrega = infMunCarrega;
			}

			public List<TMDFe.InfMDFe.Ide.InfPercurso> getInfPercurso() {
				return infPercurso;
			}

			public void setInfPercurso(List<TMDFe.InfMDFe.Ide.InfPercurso> infPercurso) {
				this.infPercurso = infPercurso;
			}

			public String getDhIniViagem() {
				return dhIniViagem;
			}

			public void setDhIniViagem(String dhIniViagem) {
				this.dhIniViagem = dhIniViagem;
			}

			public String getIndCanalVerde() {
				return indCanalVerde;
			}

			public void setIndCanalVerde(String indCanalVerde) {
				this.indCanalVerde = indCanalVerde;
			}

			public String getIndCarregaPosterior() {
				return indCarregaPosterior;
			}

			public void setIndCarregaPosterior(String indCarregaPosterior) {
				this.indCarregaPosterior = indCarregaPosterior;
			}

			@JsonRootName("infmuncarrega")
			@Root(name = "infMunCarrega")
			public static class InfMunCarrega {

				@JsonInclude(JsonInclude.Include.NON_EMPTY)
				@JsonProperty("cmuncarrega")
				@Element(name = "cMunCarrega", required = false)
				protected String cMunCarrega;
				
				@JsonInclude(JsonInclude.Include.NON_EMPTY)
				@JsonProperty("xmuncarrega")
				@Element(name = "xMunCarrega", required = false)
				protected String xMunCarrega;

				public String getcMunCarrega() {
					return cMunCarrega;
				}

				public void setcMunCarrega(String cMunCarrega) {
					this.cMunCarrega = cMunCarrega;
				}

				public String getxMunCarrega() {
					return xMunCarrega;
				}

				public void setxMunCarrega(String xMunCarrega) {
					this.xMunCarrega = xMunCarrega;
				}

			}

			@JsonRootName("infpercurso")
			@Root(name = "infPercurso")
			public static class InfPercurso {

				@JsonInclude(JsonInclude.Include.NON_EMPTY)
				@JsonProperty("ufper")
				@Element(name = "UFPer", required = false)
				protected String UFPer;

				public String getUFPer() {
					return UFPer;
				}

				public void setUFPer(String uFPer) {
					UFPer = uFPer;
				}
				
			}
		}

		@JsonRootName("emit")
		@Root(name = "emit")
		public static class Emit {

			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("cnpj")
			@Element(name = "CNPJ", required = false)
			protected String CNPJ;
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("cpf")
			@Element(name = "CPF", required = false)
			protected String CPF;
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("ie")
			@Element(name = "IE", required = false)
			protected String IE;
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("xnome")
			@Element(name = "xNome", required = false)
			protected String xNome;
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("xfant")
			@Element(name = "xFant", required = false)
			protected String xFant;
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("enderemit")
			@Element(name = "enderEmit", required = false)
			protected TEndeEmi enderEmit;

			public String getCNPJ() {
				return CNPJ;
			}

			public void setCNPJ(String cNPJ) {
				CNPJ = cNPJ;
			}

			public String getCPF() {
				return CPF;
			}

			public void setCPF(String cPF) {
				CPF = cPF;
			}

			public String getIE() {
				return IE;
			}

			public void setIE(String iE) {
				IE = iE;
			}

			public String getxNome() {
				return xNome;
			}

			public void setxNome(String xNome) {
				this.xNome = xNome;
			}

			public String getxFant() {
				return xFant;
			}

			public void setxFant(String xFant) {
				this.xFant = xFant;
			}

			public TEndeEmi getEnderEmit() {
				return enderEmit;
			}

			public void setEnderEmit(TEndeEmi enderEmit) {
				this.enderEmit = enderEmit;
			}

		}

		@JsonRootName("infmodal")
		@Root(name = "infModal")
		public static class InfModal {
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("versaomodal")
			@Attribute(name = "versaoModal", required = false)
			protected String versaoModal;
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("modal")
			@ElementUnion({
				@Element(name="aereo", type=Aereo.class),
				@Element(name="rodo", type=Rodo.class),
				@Element(name="aquav", type=Aquav.class),
				@Element(name="ferrov", type=Ferrov.class)
			})
		    private Modal modal;

			public String getVersaoModal() {
				return versaoModal;
			}

			public void setVersaoModal(String versaoModal) {
				this.versaoModal = versaoModal;
			}

			public Modal getModal() {
				return modal;
			}

			public void setModal(Modal modal) {
				this.modal = modal;
			}
		}

		@JsonRootName("infdoc")
		@Root(name = "infDoc")
		public static class InfDoc {

			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("infmundescarga")
			@ElementList(name = "infMunDescarga", required = false, inline = true)
			protected List<TMDFe.InfMDFe.InfDoc.InfMunDescarga> infMunDescarga = new ArrayList<TMDFe.InfMDFe.InfDoc.InfMunDescarga>();

			public List<TMDFe.InfMDFe.InfDoc.InfMunDescarga> getInfMunDescarga() {
				return infMunDescarga;
			}

			public void setInfMunDescarga(List<TMDFe.InfMDFe.InfDoc.InfMunDescarga> infMunDescarga) {
				this.infMunDescarga = infMunDescarga;
			}

			@JsonRootName("infmundescarga")
			@Root(name = "infMunDescarga")
			public static class InfMunDescarga {

				@JsonInclude(JsonInclude.Include.NON_EMPTY)
				@JsonProperty("cmundescarga")
				@Element(name = "cMunDescarga", required = false)
				protected String cMunDescarga;
				
				@JsonInclude(JsonInclude.Include.NON_EMPTY)
				@JsonProperty("xmundescarga")
				@Element(name = "xMunDescarga", required = false)
				protected String xMunDescarga;
				
				@JsonInclude(JsonInclude.Include.NON_EMPTY)
				@JsonProperty("infcte")
				@ElementList(name = "infCTe", required = false, inline = true)
				protected List<TMDFe.InfMDFe.InfDoc.InfMunDescarga.InfCTe> infCTe = new ArrayList<TMDFe.InfMDFe.InfDoc.InfMunDescarga.InfCTe>();
				
				@JsonInclude(JsonInclude.Include.NON_EMPTY)
				@JsonProperty("infnfe")
				@ElementList(name = "infNFe", required = false, inline = true)
				protected List<TMDFe.InfMDFe.InfDoc.InfMunDescarga.InfNFe> infNFe = new ArrayList<TMDFe.InfMDFe.InfDoc.InfMunDescarga.InfNFe>();
				
				@JsonInclude(JsonInclude.Include.NON_EMPTY)
				@JsonProperty("infmdfetransp")
				@ElementList(name = "infMDFeTransp", required = false, inline = true)
				protected List<TMDFe.InfMDFe.InfDoc.InfMunDescarga.InfMDFeTransp> infMDFeTransp = new ArrayList<TMDFe.InfMDFe.InfDoc.InfMunDescarga.InfMDFeTransp>();

				public String getcMunDescarga() {
					return cMunDescarga;
				}

				public void setcMunDescarga(String cMunDescarga) {
					this.cMunDescarga = cMunDescarga;
				}

				public String getxMunDescarga() {
					return xMunDescarga;
				}

				public void setxMunDescarga(String xMunDescarga) {
					this.xMunDescarga = xMunDescarga;
				}

				public List<TMDFe.InfMDFe.InfDoc.InfMunDescarga.InfCTe> getInfCTe() {
					return infCTe;
				}

				public void setInfCTe(List<TMDFe.InfMDFe.InfDoc.InfMunDescarga.InfCTe> infCTe) {
					this.infCTe = infCTe;
				}

				public List<TMDFe.InfMDFe.InfDoc.InfMunDescarga.InfNFe> getInfNFe() {
					return infNFe;
				}

				public void setInfNFe(List<TMDFe.InfMDFe.InfDoc.InfMunDescarga.InfNFe> infNFe) {
					this.infNFe = infNFe;
				}

				public List<TMDFe.InfMDFe.InfDoc.InfMunDescarga.InfMDFeTransp> getInfMDFeTransp() {
					return infMDFeTransp;
				}

				public void setInfMDFeTransp(List<TMDFe.InfMDFe.InfDoc.InfMunDescarga.InfMDFeTransp> infMDFeTransp) {
					this.infMDFeTransp = infMDFeTransp;
				}

				@JsonRootName("infcte")
				@Root(name = "infCTe")
				public static class InfCTe {

					@JsonInclude(JsonInclude.Include.NON_EMPTY)
					@JsonProperty("chcte")
					@Element(name= "chCTe", required = false)
					protected String chCTe;
					
					@JsonInclude(JsonInclude.Include.NON_EMPTY)
					@JsonProperty("segcodbarra")
					@Element(name= "segCodBarra", required = false)
					protected String segCodBarra;
					
					@JsonInclude(JsonInclude.Include.NON_EMPTY)
					@JsonProperty("indreentrega")
					@Element(name="indReentrega", required = false)
					protected String indReentrega;
					
					@JsonInclude(JsonInclude.Include.NON_EMPTY)
					@JsonProperty("infunidtransp")
					@ElementList(name="infUnidTransp", required = false, inline = true)
					protected List<TMDFe.InfMDFe.InfDoc.InfMunDescarga.InfCTe.InfUnidTransp> infUnidTransp = new ArrayList<TMDFe.InfMDFe.InfDoc.InfMunDescarga.InfCTe.InfUnidTransp>();
					
					@JsonInclude(JsonInclude.Include.NON_EMPTY)
					@JsonProperty("peri")
					@ElementList(name="peri", required = false, inline = true)
					protected List<TMDFe.InfMDFe.InfDoc.InfMunDescarga.InfCTe.Peri> peri = new ArrayList<TMDFe.InfMDFe.InfDoc.InfMunDescarga.InfCTe.Peri>();
					
					@JsonInclude(JsonInclude.Include.NON_EMPTY)
					@JsonProperty("infentregaparcial")
					@Element(name="infEntregaParcial", required = false)
					protected TMDFe.InfMDFe.InfDoc.InfMunDescarga.InfCTe.InfEntregaParcial infEntregaParcial;

					public String getChCTe() {
						return chCTe;
					}

					public void setChCTe(String chCTe) {
						this.chCTe = chCTe;
					}

					public String getSegCodBarra() {
						return segCodBarra;
					}

					public void setSegCodBarra(String segCodBarra) {
						this.segCodBarra = segCodBarra;
					}

					public String getIndReentrega() {
						return indReentrega;
					}

					public void setIndReentrega(String indReentrega) {
						this.indReentrega = indReentrega;
					}

					public List<TMDFe.InfMDFe.InfDoc.InfMunDescarga.InfCTe.InfUnidTransp> getInfUnidTransp() {
						return infUnidTransp;
					}

					public void setInfUnidTransp(List<TMDFe.InfMDFe.InfDoc.InfMunDescarga.InfCTe.InfUnidTransp> infUnidTransp) {
						this.infUnidTransp = infUnidTransp;
					}

					public List<TMDFe.InfMDFe.InfDoc.InfMunDescarga.InfCTe.Peri> getPeri() {
						return peri;
					}

					public void setPeri(List<TMDFe.InfMDFe.InfDoc.InfMunDescarga.InfCTe.Peri> peri) {
						this.peri = peri;
					}

					public TMDFe.InfMDFe.InfDoc.InfMunDescarga.InfCTe.InfEntregaParcial getInfEntregaParcial() {
						return infEntregaParcial;
					}

					public void setInfEntregaParcial(TMDFe.InfMDFe.InfDoc.InfMunDescarga.InfCTe.InfEntregaParcial infEntregaParcial) {
						this.infEntregaParcial = infEntregaParcial;
					}

					@JsonRootName("infunidtransp")
					@Root(name = "infUnidTransp")
					public static class InfUnidTransp extends TUnidadeTransp {
						
					}
					
					@JsonRootName("peri")
					@Root(name = "peri")
					public static class Peri {

						@JsonInclude(JsonInclude.Include.NON_EMPTY)
						@JsonProperty("nonu")
						@Element(name = "nONU", required = false)
						protected String nONU;
						
						@JsonInclude(JsonInclude.Include.NON_EMPTY)
						@JsonProperty("xnomeae")
						@Element(name = "xNomeAE", required = false)
						protected String xNomeAE;
						
						@JsonInclude(JsonInclude.Include.NON_EMPTY)
						@JsonProperty("xclarisco")
						@Element(name = "xClaRisco", required = false)
						protected String xClaRisco;
						
						@JsonInclude(JsonInclude.Include.NON_EMPTY)
						@JsonProperty("gremb")
						@Element(name = "grEmb", required = false)
						protected String grEmb;
						
						@JsonInclude(JsonInclude.Include.NON_EMPTY)
						@JsonProperty("qtotprod")
						@Element(name = "qTotProd", required = false)
						protected String qTotProd;
						
						@JsonInclude(JsonInclude.Include.NON_EMPTY)
						@JsonProperty("qvoltipo")
						@Element(name = "qVolTipo", required = false)
						protected String qVolTipo;

						public String getnONU() {
							return nONU;
						}

						public void setnONU(String nONU) {
							this.nONU = nONU;
						}

						public String getxNomeAE() {
							return xNomeAE;
						}

						public void setxNomeAE(String xNomeAE) {
							this.xNomeAE = xNomeAE;
						}

						public String getxClaRisco() {
							return xClaRisco;
						}

						public void setxClaRisco(String xClaRisco) {
							this.xClaRisco = xClaRisco;
						}

						public String getGrEmb() {
							return grEmb;
						}

						public void setGrEmb(String grEmb) {
							this.grEmb = grEmb;
						}

						public String getqTotProd() {
							return qTotProd;
						}

						public void setqTotProd(String qTotProd) {
							this.qTotProd = qTotProd;
						}

						public String getqVolTipo() {
							return qVolTipo;
						}

						public void setqVolTipo(String qVolTipo) {
							this.qVolTipo = qVolTipo;
						}
					}

					@JsonRootName("infentregaparcial")
					@Root(name = "infEntregaParcial")
					public static class InfEntregaParcial {

						@JsonInclude(JsonInclude.Include.NON_EMPTY)
						@JsonProperty("qtdtotal")
						@Element(name = "qtdTotal", required = false)
						protected String qtdTotal;
						
						@JsonInclude(JsonInclude.Include.NON_EMPTY)
						@JsonProperty("qtdparcial")
						@Element(name = "qtdParcial", required = false)
						protected String qtdParcial;

						public String getQtdTotal() {
							return qtdTotal;
						}

						public void setQtdTotal(String qtdTotal) {
							this.qtdTotal = qtdTotal;
						}

						public String getQtdParcial() {
							return qtdParcial;
						}

						public void setQtdParcial(String qtdParcial) {
							this.qtdParcial = qtdParcial;
						}
					}
				}

				@JsonRootName("infnfe")
				@Root(name = "infNFe")
				public static class InfNFe {

					@JsonInclude(JsonInclude.Include.NON_EMPTY)
					@JsonProperty("chnfe")
					@Element(name = "chNFe", required = false)
					protected String chNFe;
					
					@JsonInclude(JsonInclude.Include.NON_EMPTY)
					@JsonProperty("segcodbarra")
					@Element(name = "segCodBarra", required = false)
					protected String SegCodBarra;
					
					@JsonInclude(JsonInclude.Include.NON_EMPTY)
					@JsonProperty("indreentrega")
					@Element(name = "indReentrega", required = false)
					protected String indReentrega;
					
					@JsonInclude(JsonInclude.Include.NON_EMPTY)
					@JsonProperty("infunidtransp")
					@ElementList(name = "infUnidTransp", required = false, inline = true)
					protected List<TMDFe.InfMDFe.InfDoc.InfMunDescarga.InfNFe.InfUnidTransp> infUnidTransp = new ArrayList<TMDFe.InfMDFe.InfDoc.InfMunDescarga.InfNFe.InfUnidTransp>();
					
					@JsonInclude(JsonInclude.Include.NON_EMPTY)
					@JsonProperty("peri")
					@ElementList(name = "peri", required = false, inline = true)
					protected List<TMDFe.InfMDFe.InfDoc.InfMunDescarga.InfNFe.Peri> peri = new ArrayList<TMDFe.InfMDFe.InfDoc.InfMunDescarga.InfNFe.Peri>();

					public String getChNFe() {
						return chNFe;
					}

					public void setChNFe(String chNFe) {
						this.chNFe = chNFe;
					}

					public String getSegCodBarra() {
						return SegCodBarra;
					}

					public void setSegCodBarra(String segCodBarra) {
						SegCodBarra = segCodBarra;
					}

					public String getIndReentrega() {
						return indReentrega;
					}

					public void setIndReentrega(String indReentrega) {
						this.indReentrega = indReentrega;
					}

					public List<TMDFe.InfMDFe.InfDoc.InfMunDescarga.InfNFe.InfUnidTransp> getInfUnidTransp() {
						return infUnidTransp;
					}

					public void setInfUnidTransp(List<TMDFe.InfMDFe.InfDoc.InfMunDescarga.InfNFe.InfUnidTransp> infUnidTransp) {
						this.infUnidTransp = infUnidTransp;
					}

					public List<TMDFe.InfMDFe.InfDoc.InfMunDescarga.InfNFe.Peri> getPeri() {
						return peri;
					}

					public void setPeri(List<TMDFe.InfMDFe.InfDoc.InfMunDescarga.InfNFe.Peri> peri) {
						this.peri = peri;
					}
					
					@JsonRootName("infUnidTransp")
					@Root(name = "infUnidTransp")
					public static class InfUnidTransp extends TUnidadeTransp {
						
					}
					
					@JsonRootName("peri")
					@Root(name = "peri")
					public static class Peri {

						@JsonInclude(JsonInclude.Include.NON_EMPTY)
						@JsonProperty("nonu")
						@Element(name = "nONU", required = false)
						protected String nONU;
						
						@JsonInclude(JsonInclude.Include.NON_EMPTY)
						@JsonProperty("xnomeae")
						@Element(name = "xNomeAE", required = false)
						protected String xNomeAE;
						
						@JsonInclude(JsonInclude.Include.NON_EMPTY)
						@JsonProperty("xclarisco")
						@Element(name = "xClaRisco", required = false)
						protected String xClaRisco;
						
						@JsonInclude(JsonInclude.Include.NON_EMPTY)
						@JsonProperty("gremb")
						@Element(name = "grEmb", required = false)
						protected String grEmb;
						
						@JsonInclude(JsonInclude.Include.NON_EMPTY)
						@JsonProperty("qtotprod")
						@Element(name = "qTotProd", required = false)
						protected String qTotProd;
						
						@JsonInclude(JsonInclude.Include.NON_EMPTY)
						@JsonProperty("qvoltipo")
						@Element(name = "qVolTipo", required = false)
						protected String qVolTipo;

						public String getnONU() {
							return nONU;
						}

						public void setnONU(String nONU) {
							this.nONU = nONU;
						}

						public String getxNomeAE() {
							return xNomeAE;
						}

						public void setxNomeAE(String xNomeAE) {
							this.xNomeAE = xNomeAE;
						}

						public String getxClaRisco() {
							return xClaRisco;
						}

						public void setxClaRisco(String xClaRisco) {
							this.xClaRisco = xClaRisco;
						}

						public String getGrEmb() {
							return grEmb;
						}

						public void setGrEmb(String grEmb) {
							this.grEmb = grEmb;
						}

						public String getqTotProd() {
							return qTotProd;
						}

						public void setqTotProd(String qTotProd) {
							this.qTotProd = qTotProd;
						}

						public String getqVolTipo() {
							return qVolTipo;
						}

						public void setqVolTipo(String qVolTipo) {
							this.qVolTipo = qVolTipo;
						}
					}
				}

				@JsonRootName("infmdfetransp")
				@Root(name = "infMDFeTransp")
				public static class InfMDFeTransp {

					@JsonInclude(JsonInclude.Include.NON_EMPTY)
					@JsonProperty("chmdfe")
					@Element(name = "chMDFe", required = false)
					protected String chMDFe;
					
					@JsonInclude(JsonInclude.Include.NON_EMPTY)
					@JsonProperty("indreentrega")
					@Element(name = "indReentrega", required = false)
					protected String indReentrega;
					
					@JsonInclude(JsonInclude.Include.NON_EMPTY)
					@JsonProperty("infunidtransp")
					@ElementList(name = "infUnidTransp", required = false, inline = true)
					protected List<TMDFe.InfMDFe.InfDoc.InfMunDescarga.InfMDFeTransp.InfUnidTransp> infUnidTransp = new ArrayList<TMDFe.InfMDFe.InfDoc.InfMunDescarga.InfMDFeTransp.InfUnidTransp>();
					
					@JsonInclude(JsonInclude.Include.NON_EMPTY)
					@JsonProperty("peri")
					@ElementList(name = "peri", required = false, inline = true)
					protected List<TMDFe.InfMDFe.InfDoc.InfMunDescarga.InfMDFeTransp.Peri> peri = new ArrayList<TMDFe.InfMDFe.InfDoc.InfMunDescarga.InfMDFeTransp.Peri>();

					public String getChMDFe() {
						return chMDFe;
					}

					public void setChMDFe(String chMDFe) {
						this.chMDFe = chMDFe;
					}

					public String getIndReentrega() {
						return indReentrega;
					}

					public void setIndReentrega(String indReentrega) {
						this.indReentrega = indReentrega;
					}

					public List<TMDFe.InfMDFe.InfDoc.InfMunDescarga.InfMDFeTransp.InfUnidTransp> getInfUnidTransp() {
						return infUnidTransp;
					}

					public void setInfUnidTransp(List<TMDFe.InfMDFe.InfDoc.InfMunDescarga.InfMDFeTransp.InfUnidTransp> infUnidTransp) {
						this.infUnidTransp = infUnidTransp;
					}

					public List<TMDFe.InfMDFe.InfDoc.InfMunDescarga.InfMDFeTransp.Peri> getPeri() {
						return peri;
					}

					public void setPeri(List<TMDFe.InfMDFe.InfDoc.InfMunDescarga.InfMDFeTransp.Peri> peri) {
						this.peri = peri;
					}

					@JsonRootName("infunidtransp")
					@Root(name = "infUnidTransp")
					public static class InfUnidTransp extends TUnidadeTransp {
						
					}
					
					@JsonRootName("peri")
					@Root(name = "peri")
					public static class Peri {

						@JsonInclude(JsonInclude.Include.NON_EMPTY)
						@JsonProperty("nonu")
						@Element(name = "nONU", required = false)
						protected String nONU;
						
						@JsonInclude(JsonInclude.Include.NON_EMPTY)
						@JsonProperty("xnomeae")
						@Element(name = "xNomeAE", required = false)
						protected String xNomeAE;
						
						@JsonInclude(JsonInclude.Include.NON_EMPTY)
						@JsonProperty("xclarisco")
						@Element(name = "xClaRisco", required = false)
						protected String xClaRisco;
						
						@JsonInclude(JsonInclude.Include.NON_EMPTY)
						@JsonProperty("gremb")
						@Element(name = "grEmb", required = false)
						protected String grEmb;
						
						@JsonInclude(JsonInclude.Include.NON_EMPTY)
						@JsonProperty("qtotprod")
						@Element(name = "qTotProd", required = false)
						protected String qTotProd;
						
						@JsonInclude(JsonInclude.Include.NON_EMPTY)
						@JsonProperty("qvoltipo")
						@Element(name = "qVolTipo", required = false)
						protected String qVolTipo;

						public String getnONU() {
							return nONU;
						}

						public void setnONU(String nONU) {
							this.nONU = nONU;
						}

						public String getxNomeAE() {
							return xNomeAE;
						}

						public void setxNomeAE(String xNomeAE) {
							this.xNomeAE = xNomeAE;
						}

						public String getxClaRisco() {
							return xClaRisco;
						}

						public void setxClaRisco(String xClaRisco) {
							this.xClaRisco = xClaRisco;
						}

						public String getGrEmb() {
							return grEmb;
						}

						public void setGrEmb(String grEmb) {
							this.grEmb = grEmb;
						}

						public String getqTotProd() {
							return qTotProd;
						}

						public void setqTotProd(String qTotProd) {
							this.qTotProd = qTotProd;
						}

						public String getqVolTipo() {
							return qVolTipo;
						}

						public void setqVolTipo(String qVolTipo) {
							this.qVolTipo = qVolTipo;
						}
					}
				}
			}
		}

		@JsonRootName("seg")
		@Root(name = "seg")
		public static class Seg {

			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("infresp")
			@Element(name = "infResp", required = false)
			protected TMDFe.InfMDFe.Seg.InfResp infResp;
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("infseg")
			@Element(name = "infSeg", required = false)
			protected TMDFe.InfMDFe.Seg.InfSeg infSeg;
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("napol")
			@Element(name = "nApol", required = false)
			protected String nApol;
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("naver")
			@Transient
			private List<String> nAverTemp = new ArrayList<String>();
			
			@ElementList(inline = true)
			protected List<TMDFe.InfMDFe.Seg.nAver> nAver = new ArrayList<TMDFe.InfMDFe.Seg.nAver>();
			
			public TMDFe.InfMDFe.Seg.InfResp getInfResp() {
				return infResp;
			}

			public void setInfResp(TMDFe.InfMDFe.Seg.InfResp infResp) {
				this.infResp = infResp;
			}

			public TMDFe.InfMDFe.Seg.InfSeg getInfSeg() {
				return infSeg;
			}

			public void setInfSeg(TMDFe.InfMDFe.Seg.InfSeg infSeg) {
				this.infSeg = infSeg;
			}

			public String getnApol() {
				return nApol;
			}

			public void setnApol(String nApol) {
				this.nApol = nApol;
			}

			public List<String> getnAverTemp() {
				return nAverTemp;
			}

			public void setnAverTemp(List<String> nAver) {
				
				for(String s : nAver) {
					this.nAver.add(new nAver(s));
				}
				
				this.nAverTemp = nAver;
			}
			
			public List<TMDFe.InfMDFe.Seg.nAver> getnAver() {
				return nAver;
			}

			public void setnAver(List<TMDFe.InfMDFe.Seg.nAver> nAver) {
				this.nAver = nAver;
			}

			@Element(name="nAver", data=true)
			public static class nAver {

				@Text
				public String value;

				public nAver(String s) {
					this.value = s;
				}
				
				private nAver() {
					
				}
				
			}
			
			@JsonRootName("infresp")
			@Root(name = "infResp")
			public static class InfResp {

				@JsonInclude(JsonInclude.Include.NON_EMPTY)
				@JsonProperty("respseg")
				@Element(name = "respSeg", required = false)
				protected String respSeg;
				
				@JsonInclude(JsonInclude.Include.NON_EMPTY)
				@JsonProperty("cnpj")
				@Element(name = "CNPJ", required = false)
				protected String CNPJ;
				
				@JsonInclude(JsonInclude.Include.NON_EMPTY)
				@JsonProperty("cpf")
				@Element(name = "CPF", required = false)
				protected String CPF;

				public String getRespSeg() {
					return respSeg;
				}

				public void setRespSeg(String respSeg) {
					this.respSeg = respSeg;
				}

				public String getCNPJ() {
					return CNPJ;
				}

				public void setCNPJ(String cNPJ) {
					CNPJ = cNPJ;
				}

				public String getCPF() {
					return CPF;
				}

				public void setCPF(String cPF) {
					CPF = cPF;
				}
			}
			
			@JsonRootName("infseg")
			@Root(name = "infSeg")
			public static class InfSeg {
				
				@JsonInclude(JsonInclude.Include.NON_EMPTY)
				@JsonProperty("xseg")
				@Element(name = "xSeg", required = false)
				protected String xSeg;
				
				@JsonInclude(JsonInclude.Include.NON_EMPTY)
				@JsonProperty("cnpj")
				@Element(name = "CNPJ", required = false)
				protected String CNPJ;

				public String getxSeg() {
					return xSeg;
				}

				public void setxSeg(String xSeg) {
					this.xSeg = xSeg;
				}

				public String getCNPJ() {
					return CNPJ;
				}

				public void setCNPJ(String cNPJ) {
					CNPJ = cNPJ;
				}
			}
		}

		@JsonRootName("prodpred")
		@Root(name = "prodPred")
		public static class ProdPred {

			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("tpcarga")
			@Element(name = "tpCarga", required = false)
			protected String tpCarga;
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("xprod")
			@Element(name = "xProd", required = false)
			protected String xProd;
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("cean")
			@Element(name = "cEAN", required = false)
			protected String cEAN;
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("ncm")
			@Element(name = "NCM", required = false)
			protected String NCM;
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("inflotacao")
			@Element(name = "infLotacao", required = false)
			protected TMDFe.InfMDFe.ProdPred.InfLotacao infLotacao;
			
			public String getTpCarga() {
				return tpCarga;
			}

			public void setTpCarga(String tpCarga) {
				this.tpCarga = tpCarga;
			}

			public String getxProd() {
				return xProd;
			}

			public void setxProd(String xProd) {
				this.xProd = xProd;
			}

			public String getcEAN() {
				return cEAN;
			}

			public void setcEAN(String cEAN) {
				this.cEAN = cEAN;
			}

			public String getNCM() {
				return NCM;
			}

			public void setNCM(String nCM) {
				NCM = nCM;
			}

			public TMDFe.InfMDFe.ProdPred.InfLotacao getInfLotacao() {
				return infLotacao;
			}

			public void setInfLotacao(TMDFe.InfMDFe.ProdPred.InfLotacao infLotacao) {
				this.infLotacao = infLotacao;
			}

			@JsonRootName("inflotacao")
			@Root(name = "infLotacao")
			public static class InfLotacao {
				
				@JsonInclude(JsonInclude.Include.NON_EMPTY)
				@JsonProperty("inflocalcarrega")
				@Element(name = "infLocalCarrega", required = false)
				protected TMDFe.InfMDFe.ProdPred.InfLotacao.InfLocalCarrega infLocalCarrega;
				
				@JsonInclude(JsonInclude.Include.NON_EMPTY)
				@JsonProperty("inflocaldescarrega")
				@Element(name = "infLocalDescarrega", required = false)
				protected TMDFe.InfMDFe.ProdPred.InfLotacao.InfLocalDescarrega infLocalDescarrega;
				
				public TMDFe.InfMDFe.ProdPred.InfLotacao.InfLocalCarrega getInfLocalCarrega() {
					return infLocalCarrega;
				}

				public void setInfLocalCarrega(TMDFe.InfMDFe.ProdPred.InfLotacao.InfLocalCarrega infLocalCarrega) {
					this.infLocalCarrega = infLocalCarrega;
				}

				public TMDFe.InfMDFe.ProdPred.InfLotacao.InfLocalDescarrega getInfLocalDescarrega() {
					return infLocalDescarrega;
				}

				public void setInfLocalDescarrega(TMDFe.InfMDFe.ProdPred.InfLotacao.InfLocalDescarrega infLocalDescarrega) {
					this.infLocalDescarrega = infLocalDescarrega;
				}

				@JsonRootName("inflocalcarrega")
				@Root(name = "infLocalCarrega")
				public static class InfLocalCarrega {
				
					@JsonInclude(JsonInclude.Include.NON_EMPTY)
					@JsonProperty("cep")
					@Element(name = "CEP", required = false)
					protected String CEP;
					
					@JsonInclude(JsonInclude.Include.NON_EMPTY)
					@JsonProperty("latitude")
					@Element(name = "latitude", required = false)
					protected String latitude;
					
					@JsonInclude(JsonInclude.Include.NON_EMPTY)
					@JsonProperty("longitude")
					@Element(name = "longitude", required = false)
					protected String longitude;

					public String getCEP() {
						return CEP;
					}

					public void setCEP(String cEP) {
						CEP = cEP;
					}

					public String getLatitude() {
						return latitude;
					}

					public void setLatitude(String latitude) {
						this.latitude = latitude;
					}

					public String getLongitude() {
						return longitude;
					}

					public void setLongitude(String longitude) {
						this.longitude = longitude;
					}
				}
				
				@JsonRootName("inflocaldescarrega")
				@Root(name = "infLocalDescarrega")
				public static class InfLocalDescarrega {
					
					@JsonInclude(JsonInclude.Include.NON_EMPTY)
					@JsonProperty("cep")
					@Element(name = "CEP", required = false)
					protected String CEP;
					
					@JsonInclude(JsonInclude.Include.NON_EMPTY)
					@JsonProperty("latitude")
					@Element(name = "latitude", required = false)
					protected String latitude;
					
					@JsonInclude(JsonInclude.Include.NON_EMPTY)
					@JsonProperty("longitude")
					@Element(name = "longitude", required = false)
					protected String longitude;

					public String getCEP() {
						return CEP;
					}

					public void setCEP(String cEP) {
						CEP = cEP;
					}

					public String getLatitude() {
						return latitude;
					}

					public void setLatitude(String latitude) {
						this.latitude = latitude;
					}

					public String getLongitude() {
						return longitude;
					}

					public void setLongitude(String longitude) {
						this.longitude = longitude;
					}
				}
			}
		}

		@JsonRootName("tot")
		@Root(name = "tot")
		public static class Tot {

			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("qcte")
			@Element(name = "qCTe", required = false)
			protected String qCTe;
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("qnfe")
			@Element(name = "qNFe", required = false)
			protected String qNFe;
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("qmdfe")
			@Element(name = "qMDFe", required = false)
			protected String qMDFe;
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("vcarga")
			@Element(name = "vCarga", required = false)
			protected String vCarga;
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("cunid")
			@Element(name = "cUnid", required = false)
			protected String cUnid;
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("qcarga")
			@Element(name = "qCarga", required = false)
			protected String qCarga;

			public String getqCTe() {
				return qCTe;
			}

			public void setqCTe(String qCTe) {
				this.qCTe = qCTe;
			}

			public String getqNFe() {
				return qNFe;
			}

			public void setqNFe(String qNFe) {
				this.qNFe = qNFe;
			}

			public String getqMDFe() {
				return qMDFe;
			}

			public void setqMDFe(String qMDFe) {
				this.qMDFe = qMDFe;
			}

			public String getvCarga() {
				return vCarga;
			}

			public void setvCarga(String vCarga) {
				this.vCarga = vCarga;
			}

			public String getcUnid() {
				return cUnid;
			}

			public void setcUnid(String cUnid) {
				this.cUnid = cUnid;
			}

			public String getqCarga() {
				return qCarga;
			}

			public void setqCarga(String qCarga) {
				this.qCarga = qCarga;
			}
		}

		@JsonRootName("lacres")
		@Root(name = "lacres")
		public static class Lacres {

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

		@JsonRootName("autxml")
		@Root(name = "autXML")
		public static class AutXML {

			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("cnpj")
			@Element(name = "CNPJ", required = false)
			protected String CNPJ;
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("cpf")
			@Element(name = "CPF", required = false)
			protected String CPF;

			public String getCNPJ() {
				return CNPJ;
			}

			public void setCNPJ(String cNPJ) {
				CNPJ = cNPJ;
			}

			public String getCPF() {
				return CPF;
			}

			public void setCPF(String cPF) {
				CPF = cPF;
			}
		}

		@JsonRootName("infadic")
		@Root(name = "infAdic")
		public static class InfAdic {

			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("infadfisco")
			@Element(name = "infAdFisco", required = false)
			protected String infAdFisco;
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("infcpl")
			@Element(name = "infCpl", required = false)
			protected String infCpl;

			public String getInfAdFisco() {
				return infAdFisco;
			}

			public void setInfAdFisco(String infAdFisco) {
				this.infAdFisco = infAdFisco;
			}

			public String getInfCpl() {
				return infCpl;
			}

			public void setInfCpl(String infCpl) {
				this.infCpl = infCpl;
			}
		}

		@JsonRootName("infsolicnff")
		@Root(name = "infSolicNFF")
		public static class InfSolicNFF {
		
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("xsolic")
			@Element(name = "xSolic", required = false)
			protected String xSolic;

			public String getxSolic() {
				return xSolic;
			}

			public void setxSolic(String xSolic) {
				this.xSolic = xSolic;
			}
		}
		
		@JsonRootName("infresptec")
		@Root(name = "infRespTec")
		public static class InfRespTec extends TRespTec {
			
		}

	}

	@JsonRootName("infmdfesupl")
	@Root(name = "infMDFeSupl")
	public static class InfMDFeSupl {

		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("qrcodmdfe")
		@Element(name = "qrCodMDFe", required = false, data = true)
		protected String qrCodMDFe;

		public String getQrCodMDFe() {
			return qrCodMDFe;
		}

		public void setQrCodMDFe(String qrCodMDFe) {
			this.qrCodMDFe = qrCodMDFe;
		}
	}

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		
		String json0 = "{\"infmdfe\":{\"infmodal\":{\"modal\":{\"type\":\"aereo\", \"nac\":\"teste xuxa\"}}}}";
		ObjectMapper objectMapper = new ObjectMapper();
		TMDFe t = objectMapper.readValue(json0, TMDFe.class);
		Aereo aereo = (Aereo) t.getInfMDFe().getInfModal().getModal();
		System.out.println(aereo.getNac());
		
		Modal modal = new Aereo();// Aereo("nac","matr","nvoo","cearemb","caerdes","dvoo");
		
		TMDFe.InfMDFe.InfModal infModal = new TMDFe.InfMDFe.InfModal();
		infModal.setVersaoModal("3.00");
		infModal.setModal(modal);
		
		TMDFe.InfMDFe infMDFe = new TMDFe.InfMDFe();
		infMDFe.setVersao("3.00");
		infMDFe.setId("1");
		infMDFe.setInfModal(infModal);
		
		TMDFe tmdfe = new TMDFe();
		tmdfe.setInfMDFe(infMDFe);
		
		DFPersister<TMDFe> p = new DFPersister<TMDFe>(){};
		String json = p.write(t);
		
		System.out.println(json); 
		
	}
	/*
	 * public static void main(String[] args) {
	 * 
	 * TMDFe.InfMDFe.Ide ide = new TMDFe.InfMDFe.Ide(); ide.setNome("paulo");
	 * 
	 * TMDFe.InfMDFe infMDFe = new TMDFe.InfMDFe(); infMDFe.setIde(ide);
	 * 
	 * TMDFe mdfe = new TMDFe(); mdfe.setInfMDFe(infMDFe);
	 * 
	 * DFPersister<TMDFe> mdfePersister = new DFPersister<TMDFe>(){}; String xml =
	 * mdfePersister.write(mdfe);
	 * 
	 * System.out.println(xml);
	 * 
	 * }
	 */
}
