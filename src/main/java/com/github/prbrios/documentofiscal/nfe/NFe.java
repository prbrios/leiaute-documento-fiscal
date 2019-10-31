package com.github.prbrios.documentofiscal.nfe;

import com.github.prbrios.documentofiscal.assinatura.Signature;
import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

@Data
@Root(name = "NFe")
@Namespace(reference = "http://www.portalfiscal.inf.br/nfe")
public class NFe {

    @Element(name = "infNFe", required = false)
    private NFeInfNFe infNFe;

    @Element(name = "infNFeSupl", required = false)
    private NFeInfNFeSupl infNFeSupl;

    @Element(name = "Signature", required = false)
    private Signature signature;

    public NFe() {}

    public NFe(NFeInfNFe infNFe, NFeInfNFeSupl infNFeSupl, Signature signature) {
        this.infNFe = infNFe;
        this.infNFeSupl = infNFeSupl;
        this.signature = signature;
    }

}