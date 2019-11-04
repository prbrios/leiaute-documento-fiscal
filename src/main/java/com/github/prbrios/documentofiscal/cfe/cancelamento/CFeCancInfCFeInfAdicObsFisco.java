package com.github.prbrios.documentofiscal.cfe.cancelamento;

import lombok.Data;
import lombok.Getter;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Grupo do campo de uso livre do Fisco
 *
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
@Data
@Root(name = "obsFisco")
public class CFeCancInfCFeInfAdicObsFisco {

    /**
     * SAT - Identificação do campo
     */
    @Attribute(name = "xCampo", required = false)
    private String xCampo;

    /**
     * SAT - Conteúdo do campo
     */
    @Element(name = "xTexto", required = false)
    private String xTexto;

    public CFeCancInfCFeInfAdicObsFisco() {}

    /**
     *
     * @param xCampo
     * @param xTexto
     */
    public CFeCancInfCFeInfAdicObsFisco(String xCampo, String xTexto) {
        this.xCampo = xCampo;
        this.xTexto = xTexto;
    }
}
