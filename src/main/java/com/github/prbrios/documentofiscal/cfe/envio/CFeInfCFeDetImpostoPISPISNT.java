package com.github.prbrios.documentofiscal.cfe.envio;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Grupo de PIS não tributado
 *
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
@Data
@Root(name = "PISNT")
public class CFeInfCFeDetImpostoPISPISNT {

    /**
     * AC - Código de Situação Tributária do PIS
     */
    @Element(name = "CST", required = false)
    private String cst;

    public CFeInfCFeDetImpostoPISPISNT() {}

    /**
     *
     * @param cst
     */
    public CFeInfCFeDetImpostoPISPISNT(String cst) {
        this.cst = cst;
    }
}