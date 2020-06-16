package com.github.prbrios.documentofiscal.nfe.retorno;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("protnfe")
@Root(name = "protNFe")
@Namespace(reference = "http://www.portalfiscal.inf.br/nfe")
public class RetEnviNFeProtNFe {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("versao")
    @Attribute(name = "versao", required = false)
    private String versao;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("infprot")
    @Element(name = "infProt", required = false)
    private RetEnviNFeProtNFeInfProt infProt;

    public RetEnviNFeProtNFe() {}

    /**
     *
     * @param versao
     * @param infProt
     */
    public RetEnviNFeProtNFe(String versao, RetEnviNFeProtNFeInfProt infProt) {
        this.versao = versao;
        this.infProt = infProt;
    }

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public RetEnviNFeProtNFeInfProt getInfProt() {
		return infProt;
	}

	public void setInfProt(RetEnviNFeProtNFeInfProt infProt) {
		this.infProt = infProt;
	}

}