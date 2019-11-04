package com.github.prbrios.documentofiscal.cfe.envio;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Grupo de COFINS tributado pela alíquota
 *
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
@Data
@Root(name = "COFINSAliq")
public class CFeInfCFeDetImpostoCOFINSCOFINSAliq {

    /**
     * AC - Código de Situação Tributária
     */
    @Element(name = "CST", required = false)
    private String CST;

    /**
     * AC - Valor da Base de Cálculo
     */
    @Element(name = "vBC", required = false)
    private String vBC;

    /**
     * AC - Alíquota(em percentual)
     */
    @Element(name = "pCOFINS", required = false)
    private String pCOFINS;

    /**
     * SAT - Valor
     */
    @Element(name = "vCOFINS", required = false)
    private String vCOFINS;

    public CFeInfCFeDetImpostoCOFINSCOFINSAliq() {}

    /**
     *
     * @param cst
     * @param vBC
     * @param pCOFINS
     * @param vCOFINS
     */
    public CFeInfCFeDetImpostoCOFINSCOFINSAliq(String cst, String vBC, String pCOFINS, String vCOFINS) {
        this.CST = cst;
        this.vBC = vBC;
        this.pCOFINS = pCOFINS;
        this.vCOFINS = vCOFINS;
    }
}
