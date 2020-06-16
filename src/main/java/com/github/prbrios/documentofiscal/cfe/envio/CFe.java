package com.github.prbrios.documentofiscal.cfe.envio;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import com.github.prbrios.documentofiscal.assinatura.Signature;

/**
 * AC - TAG raiz do CF-e
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
@Root(name = "CFe")
public class CFe
{
    /**
     * AC - Grupo das informações do CF-e
     */
    @Element(name = "infCFe", required = false)
    private CFeInfCFe infCFe;

    /**
     * SAT - Assinatura XML do CF-e Segundo o Padrão XML Digital Signature
     */
    @Element(name = "Signature", required = false)
    private Signature signature;

    public CFe() {}

    /**
     *
     * @param infCFe
     * @param signature
     */
    public CFe(CFeInfCFe infCFe, Signature signature) {
        this.infCFe = infCFe;
        this.signature = signature;
    }

	public CFeInfCFe getInfCFe() {
		return infCFe;
	}

	public void setInfCFe(CFeInfCFe infCFe) {
		this.infCFe = infCFe;
	}

	public Signature getSignature() {
		return signature;
	}

	public void setSignature(Signature signature) {
		this.signature = signature;
	}

}
