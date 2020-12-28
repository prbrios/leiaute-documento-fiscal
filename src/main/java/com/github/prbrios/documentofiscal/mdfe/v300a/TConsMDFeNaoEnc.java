package com.github.prbrios.documentofiscal.mdfe.v300a;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("")
@Root(name = "")
public class TConsMDFeNaoEnc {

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
	protected String xServ;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("")
	@Element(name = "", required = false)
	protected String CNPJ;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("")
	@Element(name = "", required = false)
	protected String CPF;
}
