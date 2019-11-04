package com.github.prbrios.documentofiscal.cfe.envio;

import lombok.Data;
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
    @Element(name = "ICMSTot", required = false)
    private CFeInfCFeTotalICMSTot ICMSTot;

    /**
     * SAT - Valor total do CF-e
     */
    @Element(name = "vCFe", required = false)
    private String vCFe;

    /**
     * SAT - Grupo de valores totais referentes ao ISSQN
     */
    @Element(name = "ISSQNtot", required = false)
    private CFeInfCFeTotalISSQNTot ISSQNTot;

    /**
     * AC - Grupo de valores de entrada de desconto/acréscimo sobre o subtotal
     */
    @Element(name = "DescAcrEntr", required = false)
    private CFeInfCFeTotalDescAcrEntr DescAcrEntr;


    @Element(name = "vCFeLei12741", required = false)
    private String vCFeLei12741;

    public CFeInfCFeTotal() {}

    /**
     *
     * @param icmsTot
     * @param vCFe
     * @param issqnTot
     * @param descAcrEntr
     * @param vCFeLei12741
     */
    public CFeInfCFeTotal(CFeInfCFeTotalICMSTot icmsTot, String vCFe, CFeInfCFeTotalISSQNTot issqnTot, CFeInfCFeTotalDescAcrEntr descAcrEntr, String vCFeLei12741) {
        this.ICMSTot = icmsTot;
        this.vCFe = vCFe;
        this.ISSQNTot = issqnTot;
        this.DescAcrEntr = descAcrEntr;
        this.vCFeLei12741 = vCFeLei12741;
    }
}
