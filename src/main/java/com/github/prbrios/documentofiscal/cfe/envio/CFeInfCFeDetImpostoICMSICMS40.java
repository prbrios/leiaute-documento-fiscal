package com.github.prbrios.documentofiscal.cfe.envio;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Grupo de Tributação do ICMS = 40, 41, 50, 60
 *
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
@Root(name = "ICMS40")
public class CFeInfCFeDetImpostoICMSICMS40 {

    /**
     * AC - Origem da mercadoria
     */
    @Element(name = "Orig", required = false)
    private String Orig;

    /**
     * AC - Tributação do ICMS = 40, 41, 50, 60
     */
    @Element(name = "CST", required = false)
    private String CST;

    public CFeInfCFeDetImpostoICMSICMS40() {}

    /**
     *
     * @param orig
     * @param cst
     */
    public CFeInfCFeDetImpostoICMSICMS40(String orig, String cst) {
        this.Orig = orig;
        this.CST = cst;
    }

	public String getOrig() {
		return Orig;
	}

	public void setOrig(String orig) {
		Orig = orig;
	}

	public String getCST() {
		return CST;
	}

	public void setCST(String cST) {
		CST = cST;
	}

}
