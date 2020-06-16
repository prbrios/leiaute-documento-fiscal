package com.github.prbrios.documentofiscal.nfe.evento;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import com.github.prbrios.documentofiscal.nfe.evento.envio.EnvEventoEvento;
import com.github.prbrios.documentofiscal.nfe.evento.retorno.RetEnvEventoRetEvento;

@Root(name = "procEvento")
@Namespace(reference = "http://www.portalfiscal.inf.br/nfe")
public class ProcEvento {

    @Attribute(name = "versao", required = false)
    private String versao;

    @Element(name = "evento", required = false)
    private EnvEventoEvento evento;

    @Element(name = "retEvento", required = false)
    private RetEnvEventoRetEvento retEvento;

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public EnvEventoEvento getEvento() {
		return evento;
	}

	public void setEvento(EnvEventoEvento evento) {
		this.evento = evento;
	}

	public RetEnvEventoRetEvento getRetEvento() {
		return retEvento;
	}

	public void setRetEvento(RetEnvEventoRetEvento retEvento) {
		this.retEvento = retEvento;
	}

}
