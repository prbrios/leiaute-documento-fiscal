package com.github.prbrios.documentofiscal.cfe.envio;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Grupo do PIS
 *
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
@Data
@Root(name = "PIS")
public class CFeInfCFeDetImpostoPIS {

    /**
     * AC - Grupo de PIS tributado pela alíquota
     */
    @Element(name = "PISAliq", required = false)
    private CFeInfCFeDetImpostoPISPISAliq pisAliq;

    /**
     * AC - Grupo de PIS tributado por Qtde
     */
    @Element(name = "PISQtde", required = false)
    private CFeInfCFeDetImpostoPISPISQtde pisQtde;

    /**
     * AC - Grupo de PIS não tributado
     */
    @Element(name = "PISNT", required = false)
    private CFeInfCFeDetImpostoPISPISNT pisnt;

    /**
     * AC - Grupo de PIS para contribuinte do SIMPLES NACIONAL
     */
    @Element(name = "PISSN", required = false)
    private CFeInfCFeDetImpostoPISPISSN pissn;

    /**
     * AC - Grupo de PIS Outras Operações
     */
    @Element(name = "PISOutr", required = false)
    private CFeInfCFeDetImpostoPISPISOutr pisOutr;

    public CFeInfCFeDetImpostoPIS() {}

    /**
     *
     * @param pisAliq
     * @param pisQtde
     * @param pisnt
     * @param pissn
     * @param pisOutr
     */
    public CFeInfCFeDetImpostoPIS(CFeInfCFeDetImpostoPISPISAliq pisAliq, CFeInfCFeDetImpostoPISPISQtde pisQtde, CFeInfCFeDetImpostoPISPISNT pisnt, CFeInfCFeDetImpostoPISPISSN pissn, CFeInfCFeDetImpostoPISPISOutr pisOutr) {
        this.pisAliq = pisAliq;
        this.pisQtde = pisQtde;
        this.pisnt = pisnt;
        this.pissn = pissn;
        this.pisOutr = pisOutr;
    }
}
