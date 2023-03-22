package com.github.prbrios.documentofiscal.nfe.retorno;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import com.github.prbrios.documentofiscal.assinatura.Signature;

@Root(name = "retCancNFe")
@Namespace(reference = "http://www.portalfiscal.inf.br/nfe")
public class RetCancNFe {
    
    @Element(name = "infCanc", required = false)
    private RetCancNFeInfCanc infCanc;

    @Element(name = "Signature", required = false)
    private Signature signature;

    public RetCancNFeInfCanc getInfCanc() {
        return infCanc;
    }

    public void setInfCanc(RetCancNFeInfCanc infCanc) {
        this.infCanc = infCanc;
    }

    public Signature getSignature() {
        return signature;
    }

    public void setSignature(Signature signature) {
        this.signature = signature;
    }

}
