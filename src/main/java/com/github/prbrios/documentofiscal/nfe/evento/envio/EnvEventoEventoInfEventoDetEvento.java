package com.github.prbrios.documentofiscal.nfe.evento.envio;

import lombok.Data;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "detEvento")
public class EnvEventoEventoInfEventoDetEvento {

    @Attribute(name = "versao", required = false)
    private String versao;

    @Element(name = "descEvento", required = false)
    private String descEvento;

    @Element(name = "nProt", required = false)
    private String nProt;

    @Element(name = "xJust", required = false)
    private String xJust;

    @Element(name = "xCorrecao", required = false)
    private String xCorrecao;

    @Element(name = "xCondUso", required = false)
    private String xCondUso;

    public EnvEventoEventoInfEventoDetEvento() {}

    /**
     *
     * @param versao
     * @param descEvento
     * @param nProt
     * @param xJust
     */
    public EnvEventoEventoInfEventoDetEvento(String versao, String descEvento, String nProt, String xJust) {
        this.versao = versao;
        this.descEvento = descEvento;
        this.nProt = nProt;
        this.xJust = xJust;
    }

    /**
     *
     * @param versao
     * @param descEvento
     * @param nProt
     * @param xJust
     * @param xCorrecao
     * @param xCondUso
     */
    public EnvEventoEventoInfEventoDetEvento(String versao, String descEvento, String nProt, String xJust, String xCorrecao, String xCondUso) {
        this.versao = versao;
        this.descEvento = descEvento;
        this.nProt = nProt;
        this.xJust = xJust;
        this.xCorrecao = xCorrecao;
        this.xCondUso = xCondUso;
    }
}
