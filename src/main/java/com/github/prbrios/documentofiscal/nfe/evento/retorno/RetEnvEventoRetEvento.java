package com.github.prbrios.documentofiscal.nfe.evento.retorno;

import lombok.Data;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "retEvento")
public class RetEnvEventoRetEvento {

    @Attribute(name = "versao", required = false)
    private String versao = "1.00";

    @Element(name = "infEvento", required = false)
    private RetEnvEventoRetEventoInfEvento infEvento;

}
