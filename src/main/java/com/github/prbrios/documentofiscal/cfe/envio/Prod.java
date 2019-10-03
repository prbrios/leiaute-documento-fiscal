package com.github.prbrios.documentofiscal.cfe.envio;

import lombok.Getter;
import lombok.Setter;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Grupo de detalhamento de Produtos e Serviços do CF-e
 *
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
@Root(name = "prod")
public class Prod {

    /**
     * AC - Código do produto ou serviço
     */
    @Getter
    @Setter
    @Element(name = "cProd", required = false)
    private String cProd;

    /**
     * AC - GTIN (Global Trade Item Number) do produto, antigo código EAN ou código de barras
     */
    @Getter
    @Setter
    @Element(name = "cEAN", required = false)
    private String cEAN;

    /**
     * AC - Descrição do produto ou serviço
     */
    @Getter
    @Setter
    @Element(name = "xProd", required = false)
    private String xProd;

    /**
     * AC - Código NCM com 8 dígitos ou 2 dígitos (gênero)
     */
    @Getter
    @Setter
    @Element(name = "NCM", required = false)
    private String NCM;

    /**
     * AC - Código Fiscal de Operações e Prestações
     */
    @Getter
    @Setter
    @Element(name = "CFOP", required = false)
    private String CFOP;

    /**
     * AC - Unidade comercial
     */
    @Getter
    @Setter
    @Element(name = "uCom", required = false)
    private String uCom;

    /**
     * AC - Quantidade comercial
     */
    @Getter
    @Setter
    @Element(name = "qCom", required = false)
    private String qCom;

    /**
     * AC - Valor unitário de comercialização
     */
    @Getter
    @Setter
    @Element(name = "vUnCom", required = false)
    private String vUnCom;

    /**
     * AC - Valor Bruto dos Produtos ou Serviços
     */
    @Getter
    @Setter
    @Element(name = "vProd", required = false)
    private String vProd;

    /**
     * AC - Regra de cálculo
     */
    @Getter
    @Setter
    @Element(name = "indRegra", required = false)
    private String indRegra;

    /**
     * AC - Valor do Desconto sobre item
     */
    @Getter
    @Setter
    @Element(name = "vDesc", required = false)
    private String vDesc;

    /**
     * AC - Outras despesas acessórias sobre item
     */
    @Getter
    @Setter
    @Element(name = "vOutro", required = false)
    private String vOutro;

    /**
     * AC - Valor líquido do Item
     */
    @Getter
    @Setter
    @Element(name = "vItem", required = false)
    private String vItem;

    /**
     * AC - Rateio do desconto sobre subtotal
     */
    @Getter
    @Setter
    @Element(name = "vRatDesc", required = false)
    private String vRatDesc;

    /**
     * AC - Rateio do acréscimo sobre subtotal
     */
    @Getter
    @Setter
    @Element(name = "vRatAcr", required = false)
    private String vRatAcr;

    /**
     * AC -
     */
    @Getter
    @Setter
    @Element(name = "obsFiscoDet", required = false)
    private ObsFiscoDet obsFiscoDet;

}
