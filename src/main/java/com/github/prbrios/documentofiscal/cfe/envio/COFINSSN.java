package com.github.prbrios.documentofiscal.cfe.envio;

import lombok.Getter;
import lombok.Setter;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Grupo de COFINS para contribuinte do SIMPLES NACIONAL
 *
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
@Root(name = "COFINSSN")
public class COFINSSN {

    /**
     * AC - Código de Situação Tributária
     */
    @Getter
    @Setter
    @Element(name = "CST", required = false)
    private String cst;

}
