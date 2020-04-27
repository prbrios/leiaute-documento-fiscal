package com.github.prbrios.documentofiscal.nfe.inutilizacao.retorno;

import com.github.prbrios.documentofiscal.assinatura.Signature;
import lombok.Data;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "retInutNFe")
public class RetInutNFe {

    @Attribute(name = "versao", required = false)
    private String versao;

    @Element(name = "infInut", required = false)
    private RetInutNFeInfInut infInut;

    @Element(name = "Signature", required = false)
    private Signature signature;

}
