package com.github.prbrios.documentofiscal.cfe.envio;

import lombok.Getter;
import lombok.Setter;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Grupo de detalhamento de produtos e serviços do CF-e
 *
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
@Root(name = "det")
public class Det {

    /**
     * AC - Número do item
     */
    @Getter
    @Setter
    @Attribute(name = "nItem", required = false)
    private Integer nItem;

    /**
     * AC - Grupo de detalhamento de Produtos e Serviços do CF-e
     */
    @Getter
    @Setter
    @Element(name = "prod", required = false)
    private Prod prod;

    /**
     * AC - Tributos incidentes no produto ou serviço
     */
    @Getter
    @Setter
    @Element(name = "imposto", required = false)
    private Imposto imposto;

    /**
     * AC - Informações adicionais do produto
     */
    @Getter
    @Setter
    @Element(name = "infAdProd", required = false)
    private String infAdProd;
}
