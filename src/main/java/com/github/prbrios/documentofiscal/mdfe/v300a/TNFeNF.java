package com.github.prbrios.documentofiscal.mdfe.v300a;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

public class TNFeNF {

	@JsonRootName("")
	@Root(name = "")
	public static class InfNFe {
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("")
		@Element(name = "", required = false)
		protected String chNFe;
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("")
		@Element(name = "", required = false)
		protected String PIN;
	}
	
	@JsonRootName("")
	@Root(name = "")
	public static class InfNF {
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("")
		@Element(name = "", required = false)
		protected TNFeNF.InfNF.Emi emi;
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("")
		@Element(name = "", required = false)
		protected TNFeNF.InfNF.Dest dest;
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("")
		@Element(name = "", required = false)
		protected String serie;
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("")
		@Element(name = "", required = false)
		protected String nNF;
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("")
		@Element(name = "", required = false)
		protected String dEMi;
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("")
		@Element(name = "", required = false)
		protected String vNF;
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("")
		@Element(name = "", required = false)
		protected String PIN;
		
		@JsonRootName("")
		@Root(name = "")
		public static class Emi {
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("")
			@Element(name = "", required = false)
			protected String CNPJ;
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("")
			@Element(name = "", required = false)
			protected String xNome;
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("")
			@Element(name = "", required = false)
			protected String UF;
		}
		
		@JsonRootName("")
		@Root(name = "")
		public static class Dest {
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("")
			@Element(name = "", required = false)
			protected String CNPJ;
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("")
			@Element(name = "", required = false)
			protected String CPF;
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("")
			@Element(name = "", required = false)
			protected String xNome;
			
			@JsonInclude(JsonInclude.Include.NON_EMPTY)
			@JsonProperty("")
			@Element(name = "", required = false)
			protected String UF;
		}
	}
}
