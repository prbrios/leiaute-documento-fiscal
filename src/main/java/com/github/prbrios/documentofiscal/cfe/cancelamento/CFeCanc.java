package com.github.prbrios.documentofiscal.cfe.cancelamento;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import com.github.prbrios.documentofiscal.assinatura.Signature;

/**
 * TAG raiz do CF-e
 *
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
@Root(name = "CFeCanc")
public class CFeCanc {

    /**
     * AC - Grupo das informações do CF-e
     */
    @Element(name = "infCFe", required = false)
    private CFeCancInfCFe infCFe;

    /**
     * SAT - Assinatura XML do CF-e de cancelamento segundo o Padrão XML Digital Signature
     */
    @Element(name = "Signature", required = false)
    private Signature signature;

    public CFeCanc() {}

    /**
     *
     * @param infCFe
     * @param signature
     */
    public CFeCanc(CFeCancInfCFe infCFe, Signature signature) {
        this.infCFe = infCFe;
        this.signature = signature;
    }

	public CFeCancInfCFe getInfCFe() {
		return infCFe;
	}

	public void setInfCFe(CFeCancInfCFe infCFe) {
		this.infCFe = infCFe;
	}

	public Signature getSignature() {
		return signature;
	}

	public void setSignature(Signature signature) {
		this.signature = signature;
	}
    
}
