package com.github.prbrios.documentofiscal.cfe.cancelamento;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Grupo de identificação do emitente do CF-e
 *
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
@Root(name = "emit")
public class CFeCancInfCFeEmit {

    /**
     * SAT - Informar o CNPJ do emitente, com os zeros n\u00e3o significativos
     */
    @Element(name = "CNPJ", required = false)
    private String CNPJ;

    /**
     * SAT - Raz\u00e3o social do emitente
     */
    @Element(name = "xNome", required = false)
    private String xNome;

    /**
     * SAT - Nome fantasia
     */
    @Element(name = "xFant", required = false)
    private String xFant;

    /**
     * SAT - Grupo do Endereço do emitente
     */
    @Element(name = "enderEmit", required = false)
    private CFeCancInfCFeEmitEnderEmit enderEmit;

    /**
     * SAT - Inscrição Estadual
     */
    @Element(name = "IE", required = false)
    private String IE;

    /**
     * SAT - Inscrição Municipal
     */
    @Element(name = "IM", required = false)
    private String IM;

    public CFeCancInfCFeEmit() {}

    /**
     *
     * @param cnpj
     * @param xNome
     * @param xFant
     * @param enderEmit
     * @param ie
     * @param im
     */
    public CFeCancInfCFeEmit(String cnpj, String xNome, String xFant, CFeCancInfCFeEmitEnderEmit enderEmit, String ie, String im) {
        this.CNPJ = cnpj;
        this.xNome = xNome;
        this.xFant = xFant;
        this.enderEmit = enderEmit;
        this.IE = ie;
        this.IM = im;
    }

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public String getxNome() {
		return xNome;
	}

	public void setxNome(String xNome) {
		this.xNome = xNome;
	}

	public String getxFant() {
		return xFant;
	}

	public void setxFant(String xFant) {
		this.xFant = xFant;
	}

	public CFeCancInfCFeEmitEnderEmit getEnderEmit() {
		return enderEmit;
	}

	public void setEnderEmit(CFeCancInfCFeEmitEnderEmit enderEmit) {
		this.enderEmit = enderEmit;
	}

	public String getIE() {
		return IE;
	}

	public void setIE(String iE) {
		IE = iE;
	}

	public String getIM() {
		return IM;
	}

	public void setIM(String iM) {
		IM = iM;
	}
    
}
