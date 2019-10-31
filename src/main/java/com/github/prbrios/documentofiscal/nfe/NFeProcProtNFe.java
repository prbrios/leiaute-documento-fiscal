package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

@Data
@Root(name = "protNFe")
@Namespace(reference = "http://www.portalfiscal.inf.br/nfe")
public class NFeProcProtNFe {

    @Attribute(name = "versao", required = false)
    private String versao;

    @Element(name = "infProt", required = false)
    private NFeProcProtNFeInfProt infProt;

    public NFeProcProtNFe() {}

    /**
     *
     * @param versao
     * @param infProt
     */
    public NFeProcProtNFe(String versao, NFeProcProtNFeInfProt infProt) {
        this.versao = versao;
        this.infProt = infProt;
    }

}