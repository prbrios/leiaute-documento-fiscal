package com.github.prbrios.documentofiscal.cfe.envio;

import lombok.Data;
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
@Data
@Root(name = "COFINSST")
public class CFeInfCFeDetImpostoCOFINSST {

    /**
     * AC - Valor da Base de Cálculo
     */
    @Element(name = "vBC", required = false)
    private String vBC;

    /**
     * AC - Alíquota (em percentual)
     */
    @Element(name = "pCOFINS", required = false)
    private String pCOFINS;

    /**
     * AC - Quantidade Vendida
     */
    @Element(name = "qBCProd", required = false)
    private String qBCProd;

    /**
     * AC - Alíquota (em reais)
     */
    @Element(name = "vAliqProd", required = false)
    private String vAliqProd;

    /**
     * SAT - Valor
     */
    @Element(name = "vCOFINS", required = false)
    private String vCOFINS;

    public CFeInfCFeDetImpostoCOFINSST() {}

    /**
     *
     * @param vBC
     * @param pCOFINS
     * @param qBCProd
     * @param vAliqProd
     * @param vCOFINS
     */
    public CFeInfCFeDetImpostoCOFINSST(String vBC, String pCOFINS, String qBCProd, String vAliqProd, String vCOFINS) {
        this.vBC = vBC;
        this.pCOFINS = pCOFINS;
        this.qBCProd = qBCProd;
        this.vAliqProd = vAliqProd;
        this.vCOFINS = vCOFINS;
    }
}
