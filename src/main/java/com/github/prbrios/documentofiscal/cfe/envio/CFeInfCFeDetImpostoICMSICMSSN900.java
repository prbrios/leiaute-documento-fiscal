package com.github.prbrios.documentofiscal.cfe.envio;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * TAG de Grupo cRegTrib=1 – Simples Nacional e CSOSN=900
 */
@Root(name = "ICMSSN900")
public class CFeInfCFeDetImpostoICMSICMSSN900 {

    /**
     * AC - Origem da mercadoria
     */
    @Element(name = "Orig", required = false)
    private String Orig;

    /**
     * AC - Código de Situação da Operação – SIMPLES NACIONAL
     */
    @Element(name = "CSOSN", required = false)
    private String CSOSN;

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

    public CFeInfCFeDetImpostoICMSICMSSN900() {}

    /**
     *
     * @param orig
     * @param CSOSN
     * @param pICMS
     * @param vICMS
     */
    public CFeInfCFeDetImpostoICMSICMSSN900(String orig, String CSOSN, String pICMS, String vICMS) {
        this.Orig = orig;
        this.CSOSN = CSOSN;
        this.pICMS = pICMS;
        this.vICMS = vICMS;
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
