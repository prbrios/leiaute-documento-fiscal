package com.github.prbrios.documentofiscal.cfe.envio;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Grupo cRegTrib=1 – Simples Nacional e
 *
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
@Root(name = "ICMSSN102")
public class CFeInfCFeDetImpostoICMSICMSSN102 {

    /**
     * AC - Origem da mercadoria
     */
    @Element(name = "Orig", required = false)
    private String Orig;

    /**
     * AC - Código de Situação da Operação – Simples Nacional
     */
    @Element(name = "CSOSN", required = false)
    private String CSOSN;

    public CFeInfCFeDetImpostoICMSICMSSN102() {}

    /**
     *
     * @param orig
     * @param csosn
     */
    public CFeInfCFeDetImpostoICMSICMSSN102(String orig, String csosn) {
        this.Orig = orig;
        this.CSOSN = csosn;
    }

	public String getOrig() {
		return Orig;
	}

	public void setOrig(String orig) {
		Orig = orig;
	}

	public String getCSOSN() {
		return CSOSN;
	}

	public void setCSOSN(String cSOSN) {
		CSOSN = cSOSN;
	}
    
}
