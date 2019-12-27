package com.github.prbrios.documentofiscal.nfe.retorno;

import lombok.Data;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

@Data
@Root(name = "protNFe")
@Namespace(reference = "http://www.portalfiscal.inf.br/nfe")
public class RetEnviNFeProtNFe {

    @Attribute(name = "versao", required = false)
    private String versao;

    @Element(name = "infProt", required = false)
    private RetEnviNFeProtNFeInfProt infProt;

    public RetEnviNFeProtNFe() {}

    /**
     *
     * @param versao
     * @param infProt
     */
    public RetEnviNFeProtNFe(String versao, RetEnviNFeProtNFeInfProt infProt) {
        this.versao = versao;
        this.infProt = infProt;
    }

}