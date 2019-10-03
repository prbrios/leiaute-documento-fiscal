package com.github.prbrios.documentofiscal.cfe.envio;

import lombok.Getter;
import lombok.Setter;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Grupo de valores totais do CF-e
 *
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
@Root(name = "total")
public class Total {

    /**
     * SAT - Valor total do ICMS
     */
    @Getter
    @Element(name = "ICMSTot")
    private ICMSTot icmsTot;

    /**
     * SAT - Grupo de valores totais referentes ao ISSQN
     */
    @Getter
    @Element(name = "ISSQNtot")
    private ISSQNTot issqnTot;

    /**
     * AC - Grupo de valores de entrada de desconto/acréscimo sobre o subtotal
     */
    @Getter
    @Setter
    @Element(name = "DescAcrEntr")
    private DescAcrEntr descAcrEntr;
}
