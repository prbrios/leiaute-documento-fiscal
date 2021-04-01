package com.github.prbrios.documentofiscal.nfse.ce.fortaleza.v3;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

@JsonRootName("identificacaoprestador")
@Root(name = "IdentificacaoPrestador")
public class IdentificacaoPrestador {

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("cnpj")
	@Element(name = "Cnpj", required = false)
	//@Namespace(reference = "http://www.ginfes.com.br/tipos_v03.xsd")
	protected String cnpj;

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("inscricaomunicipal")
	@Element(name = "InscricaoMunicipal", required = false)
	//@Namespace(reference = "http://www.ginfes.com.br/tipos_v03.xsd")
	protected String inscricaoMunicipal;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getInscricaoMunicipal() {
		return inscricaoMunicipal;
	}

	public void setInscricaoMunicipal(String inscricaoMunicipal) {
		this.inscricaoMunicipal = inscricaoMunicipal;
	}

}
