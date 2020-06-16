package com.github.prbrios.documentofiscal.nfe.evento.envio;

import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

@Root(name = "envEvento")
@Namespace(reference = "http://www.portalfiscal.inf.br/nfe")
public class EnvEvento {

    @Attribute(name = "versao", required = false)
    private String versao;

    @Element(name = "idLote", required = false)
    private String idLote;

    @ElementList(name = "evento", required = false, inline = true)
    private List<EnvEventoEvento> eventos = new ArrayList<EnvEventoEvento>();

    public EnvEvento(){}

    /**
     *
     * @param versao
     * @param idLote
     * @param eventos
     */
    public EnvEvento(String versao, String idLote, List<EnvEventoEvento> eventos) {
        this.versao = versao;
        this.idLote = idLote;
        this.eventos = eventos;
    }

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public String getIdLote() {
		return idLote;
	}

	public void setIdLote(String idLote) {
		this.idLote = idLote;
	}

	public List<EnvEventoEvento> getEventos() {
		return eventos;
	}

	public void setEventos(List<EnvEventoEvento> eventos) {
		this.eventos = eventos;
	}

}
