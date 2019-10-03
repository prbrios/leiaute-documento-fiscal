package com.github.prbrios.documentofiscal.cfe.envio;

import lombok.Getter;
import lombok.Setter;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Grupo de COFINS tributado pela alíquota
 *
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
@Root(name = "COFINSAliq")
public class COFINSAliq {

    /**
     * AC - Código de Situação Tributária
     */
    @Getter
    @Setter
    @Element(name = "CST", required = false)
    private String cst;

    /**
     * AC - Valor da Base de Cálculo
     */
    @Getter
    @Setter
    @Element(name = "vBC", required = false)
    private String vBC;

    /**
     * AC - Alíquota(em percentual)
     */
    @Getter
    @Setter
    @Element(name = "pCOFINS", required = false)
    private String pCOFINS;

    /**
     * SAT - Valor
     */
    @Getter
    @Element(name = "vCOFINS", required = false)
    private String vCOFINS;

}
