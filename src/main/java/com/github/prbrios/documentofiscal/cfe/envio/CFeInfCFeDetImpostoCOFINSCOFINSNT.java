package com.github.prbrios.documentofiscal.cfe.envio;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Grupo de COFINS não tributado
 *
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
@Data
@Root(name = "COFINSNT")
public class CFeInfCFeDetImpostoCOFINSCOFINSNT {

    /**
     * AC - Código de Situação Tributária
     */
    @Element(name = "CST", required = false)
    private String CST;

    public CFeInfCFeDetImpostoCOFINSCOFINSNT() {}

    /**
     *
     * @param cst
     */
    public CFeInfCFeDetImpostoCOFINSCOFINSNT(String cst) {
        this.CST = cst;
    }
}
