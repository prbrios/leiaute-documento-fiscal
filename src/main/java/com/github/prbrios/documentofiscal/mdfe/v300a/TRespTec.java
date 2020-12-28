package com.github.prbrios.documentofiscal.mdfe.v300a;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

public class TRespTec {

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("cnpj")
	@Element(name = "CNPJ", required = false)
	protected String CNPJ;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("xcontato")
	@Element(name = "xContato", required = false)
	protected String xContato;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("email")
	@Element(name = "email", required = false)
	protected String email;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("fone")
	@Element(name = "fone", required = false)
	protected String fone;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("idcsrt")
	@Element(name = "idCSRT", required = false)
	protected String idCSRT;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("hashcsrt")
	@Element(name = "hashCSRT", required = false)
	protected String hashCSRT;

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public String getxContato() {
		return xContato;
	}

	public void setxContato(String xContato) {
		this.xContato = xContato;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public String getIdCSRT() {
		return idCSRT;
	}

	public void setIdCSRT(String idCSRT) {
		this.idCSRT = idCSRT;
	}

	public String getHashCSRT() {
		return hashCSRT;
	}

	public void setHashCSRT(String hashCSRT) {
		this.hashCSRT = hashCSRT;
	}
}
