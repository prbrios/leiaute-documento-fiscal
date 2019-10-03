package com.github.prbrios.documentofiscal.cfe.envio;

import lombok.Getter;
import lombok.Setter;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Grupo de valores de entrada de Desconto/Acrésci mo sobre Subtotal
 *
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
@Root(name = "DescAcrEntr")
public class DescAcrEntr {

    /**
     * AC - Valor de entrada de desconto sobre o subtotal
     */
    @Getter
    @Setter
    @Element(name = "vDescSubtot", required = false)
    private String vDescSubtot;

    /**
     * AC - Valor de entrada de acréscimo sobre o subtotal
     */
    @Getter
    @Setter
    @Element(name = "vAcresSubtot", required = false)
    private String vAcresSubtot;

    /**
     * AC - Valor aproximado dos tributos do CFe- SAT – Lei 12741/12.
     */
    @Getter
    @Setter
    @Element(name = "vCFeLei12741", required = false)
    private String vCFeLei12741;
}
