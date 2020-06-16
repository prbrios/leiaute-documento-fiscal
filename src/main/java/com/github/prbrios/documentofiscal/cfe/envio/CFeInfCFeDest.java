package com.github.prbrios.documentofiscal.cfe.envio;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Grupo de identificação do Destinatário do CF-e
 *
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
@Root(name = "dest")
public class CFeInfCFeDest {

    /**
     * AC - CNPJ
     */
    @Element(name = "CNPJ", required = false)
    private String cnpj;

    /**
     * AC - CPF
     */
    @Element(name = "CPF", required = false)
    private String cpf;

    /**
     * AC - Razão Social ou nome do destinatário
     */
    @Element(name = "xNome", required = false)
    private String xNome;

    public CFeInfCFeDest() {}

    /**
     *
     * @param cnpj
     * @param cpf
     * @param xNome
     */
    public CFeInfCFeDest(String cnpj, String cpf, String xNome) {
        this.cnpj = cnpj;
        this.cpf = cpf;
        this.xNome = xNome;
    }

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getxNome() {
		return xNome;
	}

	public void setxNome(String xNome) {
		this.xNome = xNome;
	}

}
