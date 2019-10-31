package com.github.prbrios.documentofiscal.cfe.envio;

import lombok.Data;
import lombok.Getter;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Grupo do campo de uso livre do fisco
 *
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
@Data
@Root(name = "obsFisco")
public class CFeInfCFeInfAdicObsFisco {

    /**
     * SAT - Identificação do campo
     */
    @Element(name = "xCampo", required = false)
    private String xCampo;

    /**
     * SAT - Conteúdo do campo
     */
    @Element(name = "xTexto", required = false)
    private String xTexto;

    public CFeInfCFeInfAdicObsFisco() {}

    /**
     *
     * @param xCampo
     * @param xTexto
     */
    public CFeInfCFeInfAdicObsFisco(String xCampo, String xTexto) {
        this.xCampo = xCampo;
        this.xTexto = xTexto;
    }
}
