package com.github.prbrios.documentofiscal.cfe.envio;

import lombok.Getter;
import lombok.Setter;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Grupo de COFINS não tributado
 *
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
@Root(name = "COFINSNT")
public class COFINSNT {

    /**
     * AC - Código de Situação Tributária
     */
    @Getter
    @Setter
    @Element(name = "CST", required = false)
    private String cst;

}
