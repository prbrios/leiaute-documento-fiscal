package com.github.prbrios.documentofiscal.cfe.envio;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Grupo de COFINS para contribuinte do SIMPLES NACIONAL
 *
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
@Root(name = "COFINSSN")
public class CFeInfCFeDetImpostoCOFINSCOFINSSN {

    /**
     * AC - Código de Situação Tributária
     */
    @Element(name = "CST", required = false)
    private String CST;

    public CFeInfCFeDetImpostoCOFINSCOFINSSN() {}

    /**
     *
     * @param cst
     */
    public CFeInfCFeDetImpostoCOFINSCOFINSSN(String cst) {
        this.CST = cst;
    }

	public String getCST() {
		return CST;
	}

	public void setCST(String cST) {
		CST = cST;
	}
    
    
}
