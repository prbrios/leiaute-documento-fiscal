package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

@Data
@Root(name = "nfeProc")
@Namespace(reference = "http://www.portalfiscal.inf.br/nfe")
public class NFeProc {

    @Attribute(name = "versao", required = false)
    private String versao;

    @Element(name = "NFe", required = false)
    private NFe NFe;

    @Element(name = "protNFe", required = false)
    private NFeProcProtNFe protNFe;

    public NFeProc() {}

    /**
     *
     * @param versao
     * @param NFe
     * @param protNFe
     */
    public NFeProc(String versao, com.github.prbrios.documentofiscal.nfe.NFe NFe, NFeProcProtNFe protNFe) {
        this.versao = versao;
        this.NFe = NFe;
        this.protNFe = protNFe;
    }

}
