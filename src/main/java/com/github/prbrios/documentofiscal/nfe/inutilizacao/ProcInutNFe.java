package com.github.prbrios.documentofiscal.nfe.inutilizacao;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import com.github.prbrios.documentofiscal.nfe.inutilizacao.envio.InutNFe;
import com.github.prbrios.documentofiscal.nfe.inutilizacao.retorno.RetInutNFe;

@Root(name = "procInutNFe")
public class ProcInutNFe {

    @Attribute(name = "versao", required = false)
    private String versao;

    @Element(name = "inutNFe", required = false)
    private InutNFe inutNFe;

    @Element(name = "retInutNFe", required = false)
    private RetInutNFe retInutNFe;

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public InutNFe getInutNFe() {
		return inutNFe;
	}

	public void setInutNFe(InutNFe inutNFe) {
		this.inutNFe = inutNFe;
	}

	public RetInutNFe getRetInutNFe() {
		return retInutNFe;
	}

	public void setRetInutNFe(RetInutNFe retInutNFe) {
		this.retInutNFe = retInutNFe;
	}

}
