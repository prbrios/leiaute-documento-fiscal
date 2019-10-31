package com.github.prbrios.documentofiscal.cfe.envio;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Grupo cRegTrib=1 – Simples Nacional e
 *
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
@Data
@Root(name = "ICMSSN102")
public class CFeInfCFeDetImpostoICMSICMSSN102 {

    /**
     * AC - Origem da mercadoria
     */
    @Element(name = "Orig", required = false)
    private String orig;

    /**
     * AC - Código de Situação da Operação – Simples Nacional
     */
    @Element(name = "CSOSN", required = false)
    private String csosn;

    public CFeInfCFeDetImpostoICMSICMSSN102() {}

    /**
     *
     * @param orig
     * @param csosn
     */
    public CFeInfCFeDetImpostoICMSICMSSN102(String orig, String csosn) {
        this.orig = orig;
        this.csosn = csosn;
    }
}
