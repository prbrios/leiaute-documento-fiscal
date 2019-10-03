package com.github.prbrios.documentofiscal.cfe.envio;

import lombok.Getter;
import lombok.Setter;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Grupo de COFINS Substituição Tributária
 *
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
@Root(name = "COFINSST")
public class COFINSST {

    /**
     * AC - Valor da Base de Cálculo
     */
    @Getter
    @Setter
    @Element(name = "vBC", required = false)
    private String vBC;

    /**
     * AC - Alíquota (em percentual)
     */
    @Getter
    @Setter
    @Element(name = "pCOFINS", required = false)
    private String pCOFINS;

    /**
     * AC - Quantidade Vendida
     */
    @Getter
    @Setter
    @Element(name = "qBCProd", required = false)
    private String qBCProd;

    /**
     * AC - Alíquota (em reais)
     */
    @Getter
    @Setter
    @Element(name = "vAliqProd", required = false)
    private String vAliqProd;

    /**
     * SAT - Valor
     */
    @Getter
    @Element(name = "vCOFINS", required = false)
    private String vCOFINS;

}
