package com.github.prbrios.documentofiscal.cfe.envio;

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
@Root(name = "PIS")
public class PIS {

    /**
     * AC - Grupo de PIS tributado pela alíquota
     */
    @Getter
    @Setter
    @Element(name = "PISAliq", required = false)
    private PISAliq pisAliq;

    /**
     * AC - Grupo de PIS tributado por Qtde
     */
    @Getter
    @Setter
    @Element(name = "PISQtde", required = false)
    private PISQtde pisQtde;

    /**
     * AC - Grupo de PIS não tributado
     */
    @Getter
    @Setter
    @Element(name = "PISNT", required = false)
    private PISNT pisnt;

    /**
     * AC - Grupo de PIS para contribuinte do SIMPLES NACIONAL
     */
    @Getter
    @Setter
    @Element(name = "PISSN", required = false)
    private PISSN pissn;

    /**
     * AC - Grupo de PIS Outras Operações
     */
    @Getter
    @Setter
    @Element(name = "PISOutr", required = false)
    private PISOutr pisOutr;

}
