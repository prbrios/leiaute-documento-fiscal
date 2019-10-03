package com.github.prbrios.documentofiscal.cfe.envio;

import lombok.Getter;
import lombok.Setter;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Grupo cRegTrib=1 – Simples Nacional e
 *
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
@Root(name = "ICMSSN102")
public class ICMSSN102 {

    /**
     * AC - Origem da mercadoria
     */
    @Getter
    @Setter
    @Element(name = "Orig", required = false)
    private String orig;

    /**
     * AC - Código de Situação da Operação – Simples Nacional
     */
    @Getter
    @Setter
    @Element(name = "CSOSN", required = false)
    private String csosn;

}
