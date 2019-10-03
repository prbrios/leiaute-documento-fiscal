package com.github.prbrios.documentofiscal.cfe.envio;

import lombok.Getter;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Grupo do campo de uso livre do fisco
 *
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
@Root(name = "obsFisco")
public class ObsFisco {

    /**
     * SAT - Identificação do campo
     */
    @Getter
    @Element(name = "xCampo", required = false)
    private String xCampo;

    /**
     * SAT - Conteúdo do campo
     */
    @Getter
    @Element(name = "xTexto", required = false)
    private String xTexto;

}
