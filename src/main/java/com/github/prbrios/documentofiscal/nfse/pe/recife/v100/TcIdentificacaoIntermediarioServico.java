package com.github.prbrios.documentofiscal.nfse.pe.recife.v100;

import org.simpleframework.xml.Element;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TcIdentificacaoIntermediarioServico {

	@JsonProperty(value = "razaosocial", required = false)
	@Element(name = "RazaoSocial", required = false)
	private String razaoSocial;
	
	@JsonProperty(value = "cpfcnpj", required = false)
	@Element(name = "CpfCnpj", required = false)
	private TcCpfCnpj cpfCnpj;
	
	@JsonProperty(value = "inscricaomunicipal", required = false)
	@Element(name = "InscricaoMunicipal", required = false)
	private String inscricaoMunicipal;

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public TcCpfCnpj getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(TcCpfCnpj cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	public String getInscricaoMunicipal() {
		return inscricaoMunicipal;
	}

	public void setInscricaoMunicipal(String inscricaoMunicipal) {
		this.inscricaoMunicipal = inscricaoMunicipal;
	}
	
}
