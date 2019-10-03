package com.github.prbrios.documentofiscal.cfe.envio;

import lombok.Getter;
import lombok.Setter;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Grupo de Tributação do ICMS= 00, 20, 90
 *
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
@Root(name = "ICMS00")
public class ICMS00 {

    /**
     * AC - Origem da mercadoria
     */
    @Getter
    @Setter
    @Element(name = "Orig", required = false)
    private String orig;

    /**
     * AC - Tributação do ICMS = 00, 20, 90
     */
    @Getter
    @Setter
    @Element(name = "CST", required = false)
    private String cst;

    /**
     * AC - Alíquota efetiva do imposto
     */
    @Getter
    @Setter
    @Element(name = "pICMS", required = false)
    private String pICMS;

    /**
     * SAT - Valor do ICMS
     */
    @Getter
    @Element(name = "vICMS", required = false)
    private String vICMS;


}
