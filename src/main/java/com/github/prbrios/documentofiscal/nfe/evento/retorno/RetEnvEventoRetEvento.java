package com.github.prbrios.documentofiscal.nfe.evento.retorno;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import com.github.prbrios.documentofiscal.assinatura.Signature;

@Root(name = "retEvento")
public class RetEnvEventoRetEvento {

    @Attribute(name = "versao", required = false)
    private String versao = "1.00";

    @Element(name = "infEvento", required = false)
    private RetEnvEventoRetEventoInfEvento infEvento;

    @Element(name = "Signature", required = false)
    private Signature signature;

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public RetEnvEventoRetEventoInfEvento getInfEvento() {
		return infEvento;
	}

	public void setInfEvento(RetEnvEventoRetEventoInfEvento infEvento) {
		this.infEvento = infEvento;
	}

	public Signature getSignature() {
		return signature;
	}

	public void setSignature(Signature signature) {
		this.signature = signature;
	}

}
