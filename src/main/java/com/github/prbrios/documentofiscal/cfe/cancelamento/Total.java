package com.github.prbrios.documentofiscal.cfe.cancelamento;

import lombok.Getter;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Grupo de Valores Totais do CF-e
 *
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
@Root(name = "total")
public class Total {

    /**
     * SAT - Valor Total do CF-e
     */
    @Getter
    @Element(name = "vCFe", required = false)
    private String vCFe;

}
