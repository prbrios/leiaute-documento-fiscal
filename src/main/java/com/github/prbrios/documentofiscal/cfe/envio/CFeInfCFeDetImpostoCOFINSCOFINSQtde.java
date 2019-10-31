package com.github.prbrios.documentofiscal.cfe.envio;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Grupo de COFINS tributado por Qtde
 *
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
@Data
@Root(name = "COFINSQtde")
public class CFeInfCFeDetImpostoCOFINSCOFINSQtde {

    /**
     * AC - Código de Situação Tributária
     */
    @Element(name = "CST", required = false)
    private String cst;

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

    public CFeInfCFeDetImpostoCOFINSCOFINSQtde() {}

    /**
     *
     * @param cst
     * @param qBCProd
     * @param vAliqProd
     * @param vCOFINS
     */
    public CFeInfCFeDetImpostoCOFINSCOFINSQtde(String cst, String qBCProd, String vAliqProd, String vCOFINS) {
        this.cst = cst;
        this.qBCProd = qBCProd;
        this.vAliqProd = vAliqProd;
        this.vCOFINS = vCOFINS;
    }
}
