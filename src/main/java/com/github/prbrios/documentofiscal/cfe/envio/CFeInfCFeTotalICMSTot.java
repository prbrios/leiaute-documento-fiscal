package com.github.prbrios.documentofiscal.cfe.envio;

import lombok.Data;
import lombok.Getter;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Grupo de Valores Totais referentes ao ICMS
 *
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
@Data
@Root(name = "ICMSTot")
public class CFeInfCFeTotalICMSTot {

    /**
     * SAT - Valor Total do ICMS
     */
    @Element(name = "vICMS", required = false)
    private String vICMS;

    /**
     * SAT - Valor total dos produtos e serviços
     */
    @Element(name = "vProd", required = false)
    private String vProd;

    /**
     * SAT - Valor total dos descontos sobre item
     */
    @Element(name = "vDesc", required = false)
    private String vDesc;

    /**
     * SAT - Valor total do PIS
     */
    @Element(name = "vPIS", required = false)
    private String vPIS;

    /**
     * SAT - Valor total do COFINS
     */
    @Element(name = "vCOFINS", required = false)
    private String vCOFINS;

    /**
     * SAT - Valor total do PIS ST
     */
    @Element(name = "vPISST", required = false)
    private String vPISST;

    /**
     * SAT - Valor total do COFINS ST
     */
    @Element(name = "vCOFINSST", required = false)
    private String vCOFINSST;

    /**
     * SAT - Valor total de outras despesas acessórias sobre item
     */
    @Element(name = "vOutro", required = false)
    private String vOutro;

    /**
     * SAT - Valor total do CF-e
     */
    @Element(name = "vCFe", required = false)
    private String vCFe;

    public CFeInfCFeTotalICMSTot() {}

    /**
     *
     * @param vICMS
     * @param vProd
     * @param vDesc
     * @param vPIS
     * @param vCOFINS
     * @param vPISST
     * @param vCOFINSST
     * @param vOutro
     * @param vCFe
     */
    public CFeInfCFeTotalICMSTot(String vICMS, String vProd, String vDesc, String vPIS, String vCOFINS, String vPISST, String vCOFINSST, String vOutro, String vCFe) {
        this.vICMS = vICMS;
        this.vProd = vProd;
        this.vDesc = vDesc;
        this.vPIS = vPIS;
        this.vCOFINS = vCOFINS;
        this.vPISST = vPISST;
        this.vCOFINSST = vCOFINSST;
        this.vOutro = vOutro;
        this.vCFe = vCFe;
    }
}
