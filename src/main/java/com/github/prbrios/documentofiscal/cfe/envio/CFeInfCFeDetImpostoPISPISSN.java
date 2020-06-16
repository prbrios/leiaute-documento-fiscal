package com.github.prbrios.documentofiscal.cfe.envio;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Grupo de PIS para contribuinte do SIMPLES NACIONAL
 *
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
@Root(name = "PISSN")
public class CFeInfCFeDetImpostoPISPISSN {

    /**
     * AC - Código de Situação Tributária do PIS
     */
    @Element(name = "CST", required = false)
    private String CST;

    public CFeInfCFeDetImpostoPISPISSN() {}

    /**
     *
     * @param cst
     */
    public CFeInfCFeDetImpostoPISPISSN(String cst) {
        this.CST = cst;
    }

	public String getCST() {
		return CST;
	}

	public void setCST(String cST) {
		CST = cST;
	}
    
}
