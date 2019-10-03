package com.github.prbrios.documentofiscal.cfe.envio;

import lombok.Getter;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Grupo de Valores Totais referentes ao ISSQN
 *
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
@Root(name = "ISSQNTot")
public class ISSQNTot {

    /**
     * SAT - Valor total da base de cálculo do ISSQN
     */
    @Getter
    @Element(name = "vBC", required = false)
    private String vBC;

    /**
     * SAT - Valor total do ISS
     */
    @Getter
    @Element(name = "vISS", required = false)
    private String vISS;

    /**
     * SAT - Valor total do PIS sobre serviços
     */
    @Getter
    @Element(name = "vPIS", required = false)
    private String vPIS;

    /**
     * SAT - Valor total do COFINS sobre serviços
     */
    @Getter
    @Element(name = "vCOFINS", required = false)
    private String vCOFINS;

    /**
     * SAT - Valor total do PIS ST sobre serviços
     */
    @Getter
    @Element(name = "vPISST", required = false)
    private String vPISST;

    /**
     * SAT - Valor total do COFINS ST sobre serviços
     */
    @Getter
    @Element(name = "vCOFINSST", required = false)
    private String vCOFINSST;

}
