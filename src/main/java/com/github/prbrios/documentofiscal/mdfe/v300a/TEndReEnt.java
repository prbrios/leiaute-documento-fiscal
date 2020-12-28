package com.github.prbrios.documentofiscal.mdfe.v300a;

import org.simpleframework.xml.Element;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TEndReEnt {

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
	protected String UF;
}
