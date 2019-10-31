package com.github.prbrios.documentofiscal.cfe.envio;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Grupo de PIS Outras Operações
 *
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
@Data
@Root(name = "PISOutr")
public class CFeInfCFeDetImpostoPISPISOutr {

    /**
     * AC - Código de Situação Tributária do PIS
     */
    @Element(name = "CST", required = false)
    private String cst;

    /**
     * AC - Valor da Base de Cálculo do PIS
     */
    @Element(name = "vBC", required = false)
    private String vBC;

    /**
     * AC - Alíquota do PIS (em percentual)
     */
    @Element(name = "pPIS", required = false)
    private String pPIS;

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

    public CFeInfCFeDetImpostoPISPISOutr() {}

    /**
     *
     * @param cst
     * @param vBC
     * @param pPIS
     * @param qBCProd
     * @param vAliqProd
     * @param vPIS
     */
    public CFeInfCFeDetImpostoPISPISOutr(String cst, String vBC, String pPIS, String qBCProd, String vAliqProd, String vPIS) {
        this.cst = cst;
        this.vBC = vBC;
        this.pPIS = pPIS;
        this.qBCProd = qBCProd;
        this.vAliqProd = vAliqProd;
        this.vPIS = vPIS;
    }
}
