package com.github.prbrios.documentofiscal.cfe.envio;

import lombok.Data;
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
@Data
@Root(name = "total")
public class CFeInfCFeTotal {

    /**
     * SAT - Valor total do ICMS
     */
    @Element(name = "ICMSTot")
    private CFeInfCFeTotalICMSTot icmsTot;

    /**
     * SAT - Grupo de valores totais referentes ao ISSQN
     */
    @Element(name = "ISSQNtot")
    private CFeInfCFeTotalISSQNTot issqnTot;

    /**
     * AC - Grupo de valores de entrada de desconto/acréscimo sobre o subtotal
     */
    @Element(name = "DescAcrEntr")
    private CFeInfCFeTotalDescAcrEntr descAcrEntr;

    public CFeInfCFeTotal() {}

    /**
     *
     * @param icmsTot
     * @param issqnTot
     * @param descAcrEntr
     */
    public CFeInfCFeTotal(CFeInfCFeTotalICMSTot icmsTot, CFeInfCFeTotalISSQNTot issqnTot, CFeInfCFeTotalDescAcrEntr descAcrEntr) {
        this.icmsTot = icmsTot;
        this.issqnTot = issqnTot;
        this.descAcrEntr = descAcrEntr;
    }
}
