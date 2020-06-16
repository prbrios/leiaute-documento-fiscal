package com.github.prbrios.documentofiscal.cfe.cancelamento;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Grupo de identificação do Destinatário do CF-e
 *
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
@Root(name = "dest")
public class CFeCancInfCFeDest {

    /**
     * AC - CNPJ do destinatário
     */
    @Element(name = "CNPJ", required = false)
    private String CNPJ;

    /**
     * AC - CPF do destinatário
     */
    @Element(name = "CPF", required = false)
    private String CPF;

    public CFeCancInfCFeDest() {}

    /**
     *
     * @param cnpj
     * @param cpf
     */
    public CFeCancInfCFeDest(String cnpj, String cpf) {
        this.CNPJ = cnpj;
        this.CPF = cpf;
    }

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}
    
}
