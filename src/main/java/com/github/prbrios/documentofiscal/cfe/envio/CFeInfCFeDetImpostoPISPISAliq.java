package com.github.prbrios.documentofiscal.cfe.envio;

import lombok.Data;
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
@Data
@Root(name = "PISAliq")
public class CFeInfCFeDetImpostoPISPISAliq {

    /**
     * AC - Código de Situação Tributária do PIS
     */
    @Element(name = "CST", required = false)
    private String cst;

    /**
     * AC - Valor da Base de Cálculo do PIS
     */
    @Element(name = "vBC", required = false)
    private String vBC;

    /**
     * AC - Alíquota do PIS (em percentual)
     */
    @Element(name = "pPIS", required = false)
    private String pPIS;

    /**
     * SAT - Valor do PIS
     */
    @Element(name = "vPIS", required = false)
    private String vPIS;

    public CFeInfCFeDetImpostoPISPISAliq() {}

    /**
     *
     * @param cst
     * @param vBC
     * @param pPIS
     * @param vPIS
     */
    public CFeInfCFeDetImpostoPISPISAliq(String cst, String vBC, String pPIS, String vPIS) {
        this.cst = cst;
        this.vBC = vBC;
        this.pPIS = pPIS;
        this.vPIS = vPIS;
    }
}
