package com.github.prbrios.documentofiscal.cfe.envio;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Grupo de PIS tributado por Qtde
 *
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
@Data
@Root(name = "PISQtde")
public class CFeInfCFeDetImpostoPISPISQtde {

    /**
     * AC - Código de Situação Tributária do PIS
     */
    @Element(name = "CST", required = false)
    private String cst;

    /**
     * AC - Quantidade Vendida
     */
    @Element(name = "qBCProd", required = false)
    private String qBCProd;

    /**
     * AC - Alíquota do PIS (em reais)
     */
    @Element(name = "vAliqProd", required = false)
    private String vAliqProd;

    /**
     * SAT - Valor do PIS
     */
    @Element(name = "vPIS", required = false)
    private String vPIS;

    public CFeInfCFeDetImpostoPISPISQtde() {}

    /**
     *
     * @param cst
     * @param qBCProd
     * @param vAliqProd
     * @param vPIS
     */
    public CFeInfCFeDetImpostoPISPISQtde(String cst, String qBCProd, String vAliqProd, String vPIS) {
        this.cst = cst;
        this.qBCProd = qBCProd;
        this.vAliqProd = vAliqProd;
        this.vPIS = vPIS;
    }
}
