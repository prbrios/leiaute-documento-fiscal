package com.github.prbrios.documentofiscal.nfe.evento.envio;

import lombok.Data;
import org.simpleframework.xml.*;

import java.util.ArrayList;
import java.util.List;

@Data
@Root(name = "envEvento")
@Namespace(reference = "http://www.portalfiscal.inf.br/nfe")
public class EnvEvento {

    @Attribute(name = "versao", required = false)
    private String versao;

    @Element(name = "idLote", required = false)
    private String idLote;

    @ElementList(name = "evento", required = false)
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
}
