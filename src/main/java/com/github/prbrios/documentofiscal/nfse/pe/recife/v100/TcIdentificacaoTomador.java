package com.github.prbrios.documentofiscal.nfse.pe.recife.v100;

import org.simpleframework.xml.Element;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TcIdentificacaoTomador {

	@JsonProperty(value = "cpfcnpj", required = false)
	@Element(name = "CpfCnpj", required = false)
	private TcCpfCnpj cpfCnpj;
	
	@JsonProperty(value = "inscricaomunicipal", required = false)
	@Element(name = "InscricaoMunicipal", required = false)
	private String inscricaoMunicipal;

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
