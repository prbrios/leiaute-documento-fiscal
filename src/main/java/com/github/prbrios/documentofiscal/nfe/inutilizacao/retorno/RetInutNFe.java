package com.github.prbrios.documentofiscal.nfe.inutilizacao.retorno;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import com.github.prbrios.documentofiscal.assinatura.Signature;

@Root(name = "retInutNFe")
public class RetInutNFe {

    @Attribute(name = "versao", required = false)
    private String versao;

    @Element(name = "infInut", required = false)
    private RetInutNFeInfInut infInut;

    @Element(name = "Signature", required = false)
    private Signature signature;

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public RetInutNFeInfInut getInfInut() {
		return infInut;
	}

	public void setInfInut(RetInutNFeInfInut infInut) {
		this.infInut = infInut;
	}

	public Signature getSignature() {
		return signature;
	}

	public void setSignature(Signature signature) {
		this.signature = signature;
	}

}
