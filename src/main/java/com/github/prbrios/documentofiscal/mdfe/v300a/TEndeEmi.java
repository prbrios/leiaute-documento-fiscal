package com.github.prbrios.documentofiscal.mdfe.v300a;

import org.simpleframework.xml.Element;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TEndeEmi {

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("xlgr")
	@Element(name = "xLgr", required = false)
	protected String xLgr;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("nro")
	@Element(name = "nro", required = false)
	protected String nro;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("xcpl")
	@Element(name = "xCpl", required = false)
	protected String xCpl;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("xbairro")
	@Element(name = "xBairro", required = false)
	protected String xBairro;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("cmun")
	@Element(name = "cMun", required = false)
	protected String cMun;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("xmun")
	@Element(name = "xMun", required = false)
	protected String xMun;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("cep")
	@Element(name = "CEP", required = false)
	protected String CEP;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("uf")
	@Element(name = "UF", required = false)
	protected String UF;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("fone")
	@Element(name = "fone", required = false)
	protected String fone;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("email")
	@Element(name = "email", required = false)
	protected String email;

	public String getxLgr() {
		return xLgr;
	}

	public void setxLgr(String xLgr) {
		this.xLgr = xLgr;
	}

	public String getNro() {
		return nro;
	}

	public void setNro(String nro) {
		this.nro = nro;
	}

	public String getxCpl() {
		return xCpl;
	}

	public void setxCpl(String xCpl) {
		this.xCpl = xCpl;
	}

	public String getxBairro() {
		return xBairro;
	}

	public void setxBairro(String xBairro) {
		this.xBairro = xBairro;
	}

	public String getcMun() {
		return cMun;
	}

	public void setcMun(String cMun) {
		this.cMun = cMun;
	}

	public String getxMun() {
		return xMun;
	}

	public void setxMun(String xMun) {
		this.xMun = xMun;
	}

	public String getCEP() {
		return CEP;
	}

	public void setCEP(String cEP) {
		CEP = cEP;
	}

	public String getUF() {
		return UF;
	}

	public void setUF(String uF) {
		UF = uF;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
