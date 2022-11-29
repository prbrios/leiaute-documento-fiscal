package com.github.prbrios.documentofiscal.nfse.ginfes.v3.tipos;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.github.prbrios.documentofiscal.nfse.ginfes.v3.tipos.CpfCnpj;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@JsonRootName("identificacaotomador")
@Root(name = "IdentificacaoTomador")
public class IdentificacaoTomador {

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("cpfcnpj")
	@Element(name = "CpfCnpj", required = false)
	protected CpfCnpj cpfCnpj;

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("inscricaomunicipal")
	@Element(name = "InscricaoMunicipal", required = false)
	protected String inscricaoMunicipal;

	public CpfCnpj getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(CpfCnpj cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	public String getInscricaoMunicipal() {
		return inscricaoMunicipal;
	}

	public void setInscricaoMunicipal(String inscricaoMunicipal) {
		this.inscricaoMunicipal = inscricaoMunicipal;
	}

}
