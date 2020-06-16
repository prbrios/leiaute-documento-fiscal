package com.github.prbrios.documentofiscal.cfe.cancelamento;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Grupo de Valores Totais do CF-e
 *
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
@Root(name = "total")
public class CFeCancInfCFeTotal {

    /**
     * SAT - Valor Total do CF-e
     */
    @Element(name = "vCFe", required = false)
    private String vCFe;

    public CFeCancInfCFeTotal() {}

    /**
     *
     * @param vCFe
     */
    public CFeCancInfCFeTotal(String vCFe) {
        this.vCFe = vCFe;
    }

	public String getvCFe() {
		return vCFe;
	}

	public void setvCFe(String vCFe) {
		this.vCFe = vCFe;
	}
    
}
