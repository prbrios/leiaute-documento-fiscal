package com.github.prbrios.documentofiscal.cfe.envio;

import lombok.Getter;
import lombok.Setter;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Grupo de PIS não tributado
 *
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
@Root(name = "PISNT")
public class PISNT {

    /**
     * AC - Código de Situação Tributária do PIS
     */
    @Getter
    @Setter
    @Element(name = "CST", required = false)
    private String cst;

}
