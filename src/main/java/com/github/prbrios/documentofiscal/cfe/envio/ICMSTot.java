package com.github.prbrios.documentofiscal.cfe.envio;

import lombok.Getter;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Grupo de Valores Totais referentes ao ICMS
 *
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
@Root(name = "ICMSTot")
public class ICMSTot {

    /**
     * SAT - Valor Total do ICMS
     */
    @Getter
    @Element(name = "vICMS", required = false)
    private String vICMS;

    /**
     * SAT - Valor total dos produtos e serviços
     */
    @Getter
    @Element(name = "vProd", required = false)
    private String vProd;

    /**
     * SAT - Valor total dos descontos sobre item
     */
    @Getter
    @Element(name = "vDesc", required = false)
    private String vDesc;

    /**
     * SAT - Valor total do PIS
     */
    @Getter
    @Element(name = "vPIS", required = false)
    private String vPIS;

    /**
     * SAT - Valor total do COFINS
     */
    @Getter
    @Element(name = "vCOFINS", required = false)
    private String vCOFINS;

    /**
     * SAT - Valor total do PIS ST
     */
    @Getter
    @Element(name = "vPISST", required = false)
    private String vPISST;

    /**
     * SAT - Valor total do COFINS ST
     */
    @Getter
    @Element(name = "vCOFINSST", required = false)
    private String vCOFINSST;

    /**
     * SAT - Valor total de outras despesas acessórias sobre item
     */
    @Getter
    @Element(name = "vOutro", required = false)
    private String vOutro;

    /**
     * SAT - Valor total do CF-e
     */
    @Getter
    @Element(name = "vCFe", required = false)
    private String vCFe;

}
