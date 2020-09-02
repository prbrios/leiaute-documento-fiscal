package com.github.prbrios.documentofiscal.nfe.status.envio;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("consstatserv")
@Namespace(reference = "http://www.portalfiscal.inf.br/nfe")
@Root(name = "consStatServ")
public class ConsStatServ {

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("versao")
	@Attribute(name = "versao", required=false)
	private String versao;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("tpAmb")
	@Element(name = "tpAmb", required=false)
	private String tpAmb;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cUF")
	@Element(name = "cUF", required=false)
	private String cUF;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("xServ")
	@Element(name = "xServ", required=false)
	private String xServ;

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public String getTpAmb() {
		return tpAmb;
	}

	public void setTpAmb(String tpAmb) {
		this.tpAmb = tpAmb;
	}

	public String getcUF() {
		return cUF;
	}

	public void setcUF(String cUF) {
		this.cUF = cUF;
	}

	public String getxServ() {
		return xServ;
	}

	public void setxServ(String xServ) {
		this.xServ = xServ;
	}

}
