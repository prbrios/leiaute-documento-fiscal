package com.github.prbrios.documentofiscal.nfse.speedgov.v100;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TcContato {

	@JsonProperty(value = "telefone", required = false)
	@Element(name = "Telefone", required = false)
	private String telefone;
	
	@JsonProperty(value = "email", required = false)
	@Element(name = "Email", required = false)
	private String email;

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
