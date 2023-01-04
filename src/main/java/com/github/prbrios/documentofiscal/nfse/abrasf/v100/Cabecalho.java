package com.github.prbrios.documentofiscal.nfse.abrasf.v100;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import com.fasterxml.jackson.annotation.JsonProperty;

@Root(name = "cabecalho")
public class Cabecalho {

	@JsonProperty(value = "versao", required = false)
	@Attribute(name = "versao", required = false)
	private String versao;
	
	@JsonProperty(value = "versaodados", required = false)
	@Element(name = "versaoDados", required = false)
	private String versaoDados;

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public String getVersaoDados() {
		return versaoDados;
	}

	public void setVersaoDados(String versaoDados) {
		this.versaoDados = versaoDados;
	}

}
