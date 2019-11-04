package com.github.prbrios.documentofiscal.cfe.envio;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Grupo de Tributação do ICMS= 00, 20, 90
 *
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
@Data
@Root(name = "ICMS00")
public class CFeInfCFeDetImpostoICMSICMS00 {

    /**
     * AC - Origem da mercadoria
     */
    @Element(name = "Orig", required = false)
    private String Orig;

    /**
     * AC - Tributação do ICMS = 00, 20, 90
     */
    @Element(name = "CST", required = false)
    private String CST;

    /**
     * AC - Alíquota efetiva do imposto
     */
    @Element(name = "pICMS", required = false)
    private String pICMS;

    /**
     * SAT - Valor do ICMS
     */
    @Element(name = "vICMS", required = false)
    private String vICMS;

    public CFeInfCFeDetImpostoICMSICMS00() {}

    /**
     *
     * @param orig
     * @param cst
     * @param pICMS
     * @param vICMS
     */
    public CFeInfCFeDetImpostoICMSICMS00(String orig, String cst, String pICMS, String vICMS) {
        this.Orig = orig;
        this.CST = cst;
        this.pICMS = pICMS;
        this.vICMS = vICMS;
    }
}
