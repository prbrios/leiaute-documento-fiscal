package com.github.prbrios.documentofiscal.nfe.evento;

import com.github.prbrios.documentofiscal.DFPersister;
import com.github.prbrios.documentofiscal.nfe.evento.envio.EnvEventoEvento;
import com.github.prbrios.documentofiscal.nfe.evento.retorno.RetEnvEvento;
import com.github.prbrios.documentofiscal.nfe.evento.retorno.RetEnvEventoRetEvento;
import lombok.Data;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

@Data
@Root(name = "procEvento")
@Namespace(reference = "http://www.portalfiscal.inf.br/nfe")
public class ProcEvento {

    @Attribute(name = "versao", required = false)
    private String versao;

    @Element(name = "evento", required = false)
    private EnvEventoEvento evento;

    @Element(name = "retEvento", required = false)
    private RetEnvEventoRetEvento retEvento;

}
