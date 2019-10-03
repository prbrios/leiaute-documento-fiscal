package com.github.prbrios.documentofiscal.cfe.envio;

import lombok.Getter;
import lombok.Setter;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * TAG de Grupo cRegTrib=1 – Simples Nacional e CSOSN=900
 */
@Root(name = "ICMSSN900")
public class ICMSSN900 {

    /**
     * AC - Origem da mercadoria
     */
    @Getter
    @Setter
    @Element(name = "Orig", required = false)
    private String orig;

    /**
     * AC - Código de Situação da Operação – SIMPLES NACIONAL
     */
    @Getter
    @Setter
    @Element(name = "CSOSN", required = false)
    private String CSOSN;

    /**
     * AC - Alíquota efetiva do imposto
     */
    @Getter
    @Setter
    @Element(name = "pICMS", required = false)
    private String pICMS;

    /**
     * SAT - Valor do ICMS
     */
    @Getter
    @Element(name = "vICMS", required = false)
    private String vICMS;

}
