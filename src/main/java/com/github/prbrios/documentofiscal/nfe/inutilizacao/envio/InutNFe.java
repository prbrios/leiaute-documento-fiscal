package com.github.prbrios.documentofiscal.nfe.inutilizacao.envio;

import com.fasterxml.jackson.databind.annotation.JsonAppend;
import com.github.prbrios.documentofiscal.assinatura.Signature;
import lombok.Data;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

@Data
@Root(name = "inutNFe")
@Namespace(reference = "http://www.portalfiscal.inf.br/nfe")
public class InutNFe {

    @Attribute(name = "versao", required = false)
    private String versao;

    @Element(name = "infInut", required = false)
    private InutNFeInfInut infInut;

    @Element(name = "Signature", required = false)
    private Signature signature;

}
