package com.github.prbrios.documentofiscal.cfe.envio;

import lombok.Getter;
import lombok.Setter;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Grupo de Tributação do ICMS = 40, 41, 50, 60
 *
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
@Root(name = "ICMS40")
public class ICMS40 {

    /**
     * AC - Origem da mercadoria
     */
    @Getter
    @Setter
    @Element(name = "Orig", required = false)
    private String orig;

    /**
     * AC - Tributação do ICMS = 40, 41, 50, 60
     */
    @Getter
    @Setter
    @Element(name = "CST", required = false)
    private String cst;

}
