package com.github.prbrios.documentofiscal.cfe.envio;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Grupo de Tributação do ICMS = 40, 41, 50, 60
 *
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
@Data
@Root(name = "ICMS40")
public class CFeInfCFeDetImpostoICMSICMS40 {

    /**
     * AC - Origem da mercadoria
     */
    @Element(name = "Orig", required = false)
    private String orig;

    /**
     * AC - Tributação do ICMS = 40, 41, 50, 60
     */
    @Element(name = "CST", required = false)
    private String cst;

    public CFeInfCFeDetImpostoICMSICMS40() {}

    /**
     *
     * @param orig
     * @param cst
     */
    public CFeInfCFeDetImpostoICMSICMS40(String orig, String cst) {
        this.orig = orig;
        this.cst = cst;
    }
}
