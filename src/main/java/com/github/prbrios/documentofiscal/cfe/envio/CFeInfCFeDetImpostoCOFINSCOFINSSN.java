package com.github.prbrios.documentofiscal.cfe.envio;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Grupo de COFINS para contribuinte do SIMPLES NACIONAL
 *
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
@Data
@Root(name = "COFINSSN")
public class CFeInfCFeDetImpostoCOFINSCOFINSSN {

    /**
     * AC - Código de Situação Tributária
     */
    @Element(name = "CST", required = false)
    private String cst;

    public CFeInfCFeDetImpostoCOFINSCOFINSSN() {}

    /**
     *
     * @param cst
     */
    public CFeInfCFeDetImpostoCOFINSCOFINSSN(String cst) {
        this.cst = cst;
    }
}