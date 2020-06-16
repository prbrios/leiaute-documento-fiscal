package com.github.prbrios.documentofiscal.cfe.envio;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Grupo de Tributação do ICMS= 00, 20, 90
 *
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
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

	public String getpICMS() {
		return pICMS;
	}

	public void setpICMS(String pICMS) {
		this.pICMS = pICMS;
	}

	public String getvICMS() {
		return vICMS;
	}

	public void setvICMS(String vICMS) {
		this.vICMS = vICMS;
	}
    
}
