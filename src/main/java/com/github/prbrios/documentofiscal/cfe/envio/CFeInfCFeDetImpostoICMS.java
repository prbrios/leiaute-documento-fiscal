package com.github.prbrios.documentofiscal.cfe.envio;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Grupo do ICMS da Operação própria e ST
 *
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
@Data
@Root(name = "ICMS")
public class CFeInfCFeDetImpostoICMS {

    /**
     * AC - Grupo de Tributação do ICMS= 00, 20, 90
     */
    @Element(name = "ICMS00", required = false)
    private CFeInfCFeDetImpostoICMSICMS00 ICMS00;

    /**
     * AC - Grupo de Tributação do ICMS = 40, 41, 50, 60
     */
    @Element(name = "ICMS40", required = false)
    private CFeInfCFeDetImpostoICMSICMS40 ICMS40;

    /**
     * AC - Grupo cRegTrib=1 – Simples Nacional e CSOSN=102, 300, 500
     */
    @Element(name = "ICMSSN102", required = false)
    private CFeInfCFeDetImpostoICMSICMSSN102 ICMSSN102;

    /**
     * AC - TAG de Grupo cRegTrib=1 – Simples Nacional e CSOSN=900
     */
    @Element(name = "ICMSSN900", required = false)
    private CFeInfCFeDetImpostoICMSICMSSN900 ICMSSN900;

    public CFeInfCFeDetImpostoICMS() {}

    /**
     *
     * @param icms00
     * @param icms40
     * @param icmssn102
     * @param icmssn900
     */
    public CFeInfCFeDetImpostoICMS(CFeInfCFeDetImpostoICMSICMS00 icms00, CFeInfCFeDetImpostoICMSICMS40 icms40, CFeInfCFeDetImpostoICMSICMSSN102 icmssn102, CFeInfCFeDetImpostoICMSICMSSN900 icmssn900) {
        this.ICMS00 = icms00;
        this.ICMS40 = icms40;
        this.ICMSSN102 = icmssn102;
        this.ICMSSN900 = icmssn900;
    }
}
