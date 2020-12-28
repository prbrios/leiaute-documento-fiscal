package com.github.prbrios.documentofiscal.mdfe.v300a;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementUnion;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.github.prbrios.documentofiscal.assinatura.Signature;

@JsonRootName("eventomdfe")
@Root(name = "eventoMDFe")
@Namespace(reference = "http://www.portalfiscal.inf.br/mdfe")
public class TEvento {

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("versao")
	@Attribute(name = "versao", required = false)
	protected String versao;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("infevento")
	@Element(name = "infEvento", required = false)
	protected TEvento.InfEvento infEvento;
	
	@JsonIgnore
	@Element(name = "Signature", required = false)
	protected Signature signature;

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public TEvento.InfEvento getInfEvento() {
		return infEvento;
	}

	public void setInfEvento(TEvento.InfEvento infEvento) {
		this.infEvento = infEvento;
	}

	public Signature getSignature() {
		return signature;
	}

	public void setSignature(Signature signature) {
		this.signature = signature;
	}

	@JsonRootName("infevento")
	@Root(name = "infEvento")
	public static class InfEvento {
	
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("id")
		@Attribute(name = "Id", required = false)
		protected String id;
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("corgao")
		@Element(name = "cOrgao", required = false)
		protected String cOrgao;
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("tpamb")
		@Element(name = "tpAmb", required = false)
		protected String tpAmb;
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("cnpj")
		@Element(name = "CNPJ", required = false)
		protected String CNPJ;
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("cpf")
		@Element(name = "CPF", required = false)
		protected String CPF;
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("chmdfe")
		@Element(name = "chMDFe", required = false)
		protected String chMDFe;
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("dhevento")
		@Element(name = "dhEvento", required = false)
		protected String dhEvento;
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("tpevento")
		@Element(name = "tpEvento", required = false)
		protected String tpEvento;
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("nseqevento")
		@Element(name = "nSeqEvento", required = false)
		protected String nSeqEvento;
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("detevento")
		@Element(name = "detEvento", required = false)
		protected TEvento.InfEvento.DetEvento detEvento;
		
		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getTpAmb() {
			return tpAmb;
		}

		public void setTpAmb(String tpAmb) {
			this.tpAmb = tpAmb;
		}

		public String getcOrgao() {
			return cOrgao;
		}

		public void setcOrgao(String cOrgao) {
			this.cOrgao = cOrgao;
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

		public String getChMDFe() {
			return chMDFe;
		}

		public void setChMDFe(String chMDFe) {
			this.chMDFe = chMDFe;
		}

		public String getDhEvento() {
			return dhEvento;
		}

		public void setDhEvento(String dhEvento) {
			this.dhEvento = dhEvento;
		}

		public String getTpEvento() {
			return tpEvento;
		}

		public void setTpEvento(String tpEvento) {
			this.tpEvento = tpEvento;
		}

		public String getnSeqEvento() {
			return nSeqEvento;
		}

		public void setnSeqEvento(String nSeqEvento) {
			this.nSeqEvento = nSeqEvento;
		}

		public TEvento.InfEvento.DetEvento getDetEvento() {
			return detEvento;
		}

		public void setDetEvento(TEvento.InfEvento.DetEvento detEvento) {
			this.detEvento = detEvento;
		}

		@JsonRootName("detevento")
		@Root(name = "detEvento")
		public static class DetEvento {
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("versaoevento")
			@Attribute(name = "versaoEvento", required = false)
			protected String versaoEvento;
			
			@ElementUnion({
				@Element(name = "evCancMDFe", type = EvCancMDFe.class),
				@Element(name = "evEncMDFe", type = EvEncMDFe.class)
			})
			protected Evento evento;

			public String getVersaoEvento() {
				return versaoEvento;
			}

			public void setVersaoEvento(String versaoEvento) {
				this.versaoEvento = versaoEvento;
			}

			public Evento getEvento() {
				return evento;
			}

			public void setEvento(Evento evento) {
				this.evento = evento;
			}
			
		}
		
		
	}
	
}
