package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.github.prbrios.documentofiscal.nfe.retorno.RetEnviNFeProtNFe;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

@JsonRootName("nfeproc")
@Root(name = "nfeProc")
@Namespace(reference = "http://www.portalfiscal.inf.br/nfe")
public class NFeProc {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("versao")
    @Attribute(name = "versao", required = false)
    private String versao;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("nfe")
    @Element(name = "NFe", required = false)
    private NFe NFe;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("protnfe")
    @Element(name = "protNFe", required = false)
    private RetEnviNFeProtNFe protNFe;

    public NFeProc() {}

    /**
     *
     * @param versao
     * @param NFe
     * @param protNFe
     */
    public NFeProc(String versao, com.github.prbrios.documentofiscal.nfe.NFe NFe, RetEnviNFeProtNFe protNFe) {
        this.versao = versao;
        this.NFe = NFe;
        this.protNFe = protNFe;
    }

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public NFe getNFe() {
		return NFe;
	}

	public void setNFe(NFe nFe) {
		NFe = nFe;
	}

	public RetEnviNFeProtNFe getProtNFe() {
		return protNFe;
	}

	public void setProtNFe(RetEnviNFeProtNFe protNFe) {
		this.protNFe = protNFe;
	}

}
