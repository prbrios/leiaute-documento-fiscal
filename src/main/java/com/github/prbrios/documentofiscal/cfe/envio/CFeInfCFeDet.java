package com.github.prbrios.documentofiscal.cfe.envio;

import lombok.Data;
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
@Data
@Root(name = "det")
public class CFeInfCFeDet {

    /**
     * AC - Número do item
     */
    @Attribute(name = "nItem", required = false)
    private String nItem;

    /**
     * AC - Grupo de detalhamento de Produtos e Serviços do CF-e
     */
    @Element(name = "prod", required = false)
    private CFeInfCFeDetProd prod;

    /**
     * AC - Tributos incidentes no produto ou serviço
     */
    @Element(name = "imposto", required = false)
    private CFeInfCFeDetImposto imposto;

    /**
     * AC - Informações adicionais do produto
     */
    @Element(name = "infAdProd", required = false)
    private String infAdProd;

    public CFeInfCFeDet() {}

    /**
     *
     * @param nItem
     * @param prod
     * @param imposto
     * @param infAdProd
     */
    public CFeInfCFeDet(String nItem, CFeInfCFeDetProd prod, CFeInfCFeDetImposto imposto, String infAdProd) {
        this.nItem = nItem;
        this.prod = prod;
        this.imposto = imposto;
        this.infAdProd = infAdProd;
    }
}
