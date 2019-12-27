package com.github.prbrios.documentofiscal.nfe.evento.envio;

import com.github.prbrios.documentofiscal.assinatura.Signature;
import lombok.Data;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

@Data
@Root(name = "evento")
@Namespace(reference = "http://www.portalfiscal.inf.br/nfe")
public class EnvEventoEvento {

    @Attribute(name = "versao", required = false)
    private String versao = "1.00";

    @Element(name = "infEvento", required = false)
    private EnvEventoEventoInfEvento infEvento;

    @Element(name = "Signature", required = false)
    private Signature signature;

    public EnvEventoEvento() {}

    /**
     *
     * @param versao
     * @param infEvento
     * @param signature
     */
    public EnvEventoEvento(String versao, EnvEventoEventoInfEvento infEvento, Signature signature) {
        this.versao = versao;
        this.infEvento = infEvento;
        this.signature = signature;
    }
}
