package com.github.prbrios.documentofiscal.cfe.envio;

import lombok.Data;
import lombok.Getter;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Grupo de Valores Totais referentes ao ISSQN
 *
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
@Data
@Root(name = "ISSQNTot")
public class CFeInfCFeTotalISSQNTot {

    /**
     * SAT - Valor total da base de cálculo do ISSQN
     */
    @Element(name = "vBC", required = false)
    private String vBC;

    /**
     * SAT - Valor total do ISS
     */
    @Element(name = "vISS", required = false)
    private String vISS;

    /**
     * SAT - Valor total do PIS sobre serviços
     */
    @Element(name = "vPIS", required = false)
    private String vPIS;

    /**
     * SAT - Valor total do COFINS sobre serviços
     */
    @Element(name = "vCOFINS", required = false)
    private String vCOFINS;

    /**
     * SAT - Valor total do PIS ST sobre serviços
     */
    @Element(name = "vPISST", required = false)
    private String vPISST;

    /**
     * SAT - Valor total do COFINS ST sobre serviços
     */
    @Element(name = "vCOFINSST", required = false)
    private String vCOFINSST;

    public CFeInfCFeTotalISSQNTot() {}

    /**
     *
     * @param vBC
     * @param vISS
     * @param vPIS
     * @param vCOFINS
     * @param vPISST
     * @param vCOFINSST
     */
    public CFeInfCFeTotalISSQNTot(String vBC, String vISS, String vPIS, String vCOFINS, String vPISST, String vCOFINSST) {
        this.vBC = vBC;
        this.vISS = vISS;
        this.vPIS = vPIS;
        this.vCOFINS = vCOFINS;
        this.vPISST = vPISST;
        this.vCOFINSST = vCOFINSST;
    }
}
