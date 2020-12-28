package com.github.prbrios.documentofiscal.mdfe.v300a;

import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

public class TRetConsMDFeNaoEnc {

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("")
	@Element(name = "", required = false)
	protected String versao;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("")
	@Element(name = "", required = false)
	protected String tpAmb;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("")
	@Element(name = "", required = false)
	protected String verAplic;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("")
	@Element(name = "", required = false)
	protected String cStat;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("")
	@Element(name = "", required = false)
	protected String xMotivo;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("")
	@Element(name = "", required = false)
	protected String cUF;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("")
	@ElementList(name = "", required = false, inline = true)
	protected List<TRetConsMDFeNaoEnc.InfMDFe> infMDFe = new ArrayList<TRetConsMDFeNaoEnc.InfMDFe>();
	
	@JsonRootName("")
	@Root(name = "")
	public static class InfMDFe {
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("")
		@Element(name = "", required = false)
		protected String chMDFe;
		
		@JsonInclude(JsonInclude.Include.NON_EMPTY)
		@JsonProperty("")
		@Element(name = "", required = false)
		protected String nProt;
	}
}
