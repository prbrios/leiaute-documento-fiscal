package com.github.prbrios.documentofiscal.nfse.pe.recife.v100;

import org.simpleframework.xml.Element;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TcCpfCnpj {

	@JsonProperty(value = "cpf", required = false)
	@Element(name = "Cpf", required = false)
	private String cpf;
	
	@JsonProperty(value = "cnpj", required = false)
	@Element(name = "Cnpj", required = false)
	private String cnpj;
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
}
