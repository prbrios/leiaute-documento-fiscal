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
    @Element(name = "ICMSTot", required = false)
    private CFeInfCFeTotalICMSTot icmsTot;

    /**
     * SAT - Valor total do CF-e
     */
    @Element(name = "vCFe", required = false)
    private String vCFe;

    /**
     * SAT - Grupo de valores totais referentes ao ISSQN
     */
    @Element(name = "ISSQNtot", required = false)
    private CFeInfCFeTotalISSQNTot issqnTot;

    /**
     * AC - Grupo de valores de entrada de desconto/acréscimo sobre o subtotal
     */
    @Element(name = "DescAcrEntr", required = false)
    private CFeInfCFeTotalDescAcrEntr descAcrEntr;


    @Element(name = "vCFeLei12741", required = false)
    private String vCFeLei12741;

    public CFeInfCFeTotal() {}

    /**
     *
     * @param icmsTot
     * @param issqnTot
     * @param descAcrEntr
     * @param vCFeLei12741
     */
    public CFeInfCFeTotal(CFeInfCFeTotalICMSTot icmsTot, CFeInfCFeTotalISSQNTot issqnTot, CFeInfCFeTotalDescAcrEntr descAcrEntr, String vCFeLei12741) {
        this.icmsTot = icmsTot;
        this.issqnTot = issqnTot;
        this.descAcrEntr = descAcrEntr;
        this.vCFeLei12741 = vCFeLei12741;
    }
}
