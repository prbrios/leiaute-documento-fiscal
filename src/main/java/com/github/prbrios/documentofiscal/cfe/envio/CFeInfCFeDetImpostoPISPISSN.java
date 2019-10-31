package com.github.prbrios.documentofiscal.cfe.envio;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Grupo de PIS para contribuinte do SIMPLES NACIONAL
 *
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
@Data
@Root(name = "PISSN")
public class CFeInfCFeDetImpostoPISPISSN {

    /**
     * AC - Código de Situação Tributária do PIS
     */
    @Element(name = "CST", required = false)
    private String cst;

    public CFeInfCFeDetImpostoPISPISSN() {}

    /**
     *
     * @param cst
     */
    public CFeInfCFeDetImpostoPISPISSN(String cst) {
        this.cst = cst;
    }
}
