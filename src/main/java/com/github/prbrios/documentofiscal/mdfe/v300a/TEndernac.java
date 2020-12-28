package com.github.prbrios.documentofiscal.mdfe.v300a;

import org.simpleframework.xml.Element;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TEndernac {

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("")
	@Element(name = "", required = false)
	protected String xLgr;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("")
	@Element(name = "", required = false)
	protected String nro;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("")
	@Element(name = "", required = false)
	protected String xCpl;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("")
	@Element(name = "", required = false)
	protected String xBairro;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("")
	@Element(name = "", required = false)
	protected String cMun;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("")
	@Element(name = "", required = false)
	protected String xMun;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("")
	@Element(name = "", required = false)
	protected String CEP;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("")
	@Element(name = "", required = false)
	protected String UF;
}
