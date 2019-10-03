package com.github.prbrios.documentofiscal.cfe.envio;

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
@Root(name = "PISQtde")
public class PISQtde {

    /**
     * AC - Código de Situação Tributária do PIS
     */
    @Getter
    @Setter
    @Element(name = "CST", required = false)
    private String cst;

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
