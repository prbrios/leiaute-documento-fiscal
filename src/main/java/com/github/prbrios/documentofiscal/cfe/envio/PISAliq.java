package com.github.prbrios.documentofiscal.cfe.envio;

import lombok.Getter;
import lombok.Setter;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Grupo de PIS tributado pela alíquota
 *
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
@Root(name = "PISAliq")
public class PISAliq {

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
     * SAT - Valor do PIS
     */
    @Getter
    @Element(name = "vPIS", required = false)
    private String vPIS;

}
