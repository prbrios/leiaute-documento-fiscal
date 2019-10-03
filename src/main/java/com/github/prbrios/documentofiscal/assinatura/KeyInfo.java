package com.github.prbrios.documentofiscal.assinatura;

import org.simpleframework.xml.Element;

import br.com.unigex.documentofiscal.DFBase;

public class KeyInfo extends DFBase {
    private static final long serialVersionUID = 7949034334524924221L;

    @Element(name = "X509Data", required = false)
    private X509Data data;

    public X509Data getData() {
        return this.data;
    }

    public void setData(final X509Data data) {
        this.data = data;
    }
}