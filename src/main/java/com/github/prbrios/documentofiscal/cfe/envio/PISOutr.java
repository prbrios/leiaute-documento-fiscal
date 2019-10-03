package com.github.prbrios.documentofiscal.cfe.envio;

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
@Root(name = "PISOutr")
public class PISOutr {

    /**
     * AC - Código de Situação Tributária do PIS
     */
    @Getter
    @Setter
    @Element(name = "CST", required = false)
    private String cst;

    /**
     * AC - Valor da Base de Cálculo do PIS
     */
    @Getter
    @Setter
    @Element(name = "vBC", required = false)
    private String vBC;

    /**
     * AC - Alíquota do PIS (em percentual)
     */
    @Getter
    @Setter
    @Element(name = "pPIS", required = false)
    private String pPIS;

    /**
     * AC - Quantidade Vendida
     */
    @Getter
    @Setter
    @Element(name = "qBCProd", required = false)
    private String qBCProd;

    /**
     * AC - Alíquota do PIS (em reais)
     */
    @Getter
    @Setter
    @Element(name = "vAliqProd", required = false)
    private String vAliqProd;

    /**
     * SAT - Valor do PIS
     */
    @Getter
    @Element(name = "vPIS", required = false)
    private String vPIS;

}
