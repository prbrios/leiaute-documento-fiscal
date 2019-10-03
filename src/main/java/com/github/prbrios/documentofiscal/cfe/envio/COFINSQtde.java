package com.github.prbrios.documentofiscal.cfe.envio;

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
@Root(name = "COFINSQtde")
public class COFINSQtde {

    /**
     * AC - Código de Situação Tributária
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
