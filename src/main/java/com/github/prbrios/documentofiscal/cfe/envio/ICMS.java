package com.github.prbrios.documentofiscal.cfe.envio;

import lombok.Getter;
import lombok.Setter;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Grupo do ICMS da Operação própria e ST
 *
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
@Root(name = "ICMS")
public class ICMS {

    /**
     * AC - Grupo de Tributação do ICMS= 00, 20, 90
     */
    @Getter
    @Setter
    @Element(name = "ICMS00", required = false)
    private ICMS00 icms00;

    /**
     * AC - Grupo de Tributação do ICMS = 40, 41, 50, 60
     */
    @Getter
    @Setter
    @Element(name = "ICMS40", required = false)
    private ICMS40 icms40;

    /**
     * AC - Grupo cRegTrib=1 – Simples Nacional e CSOSN=102, 300, 500
     */
    @Getter
    @Setter
    @Element(name = "ICMSSN102", required = false)
    private ICMSSN102 icmssn102;

    /**
     * AC - TAG de Grupo cRegTrib=1 – Simples Nacional e CSOSN=900
     */
    @Getter
    @Setter
    @Element(name = "ICMSSN900", required = false)
    private ICMSSN900 icmssn900;

}
