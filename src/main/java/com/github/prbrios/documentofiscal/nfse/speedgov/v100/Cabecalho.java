package com.github.prbrios.documentofiscal.nfse.speedgov.v100;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.NamespaceList;
import org.simpleframework.xml.Root;

import com.fasterxml.jackson.annotation.JsonProperty;

@Namespace(prefix = "p", reference = "http://ws.speedgov.com.br/cabecalho_v1.xsd")
@NamespaceList({
	@Namespace(prefix = "tipos", reference = "http://ws.speedgov.com.br/tipos_v1.xsd"),
	@Namespace(prefix = "xsi", reference = "http://www.w3.org/2001/XMLSchema-instance")
})
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
