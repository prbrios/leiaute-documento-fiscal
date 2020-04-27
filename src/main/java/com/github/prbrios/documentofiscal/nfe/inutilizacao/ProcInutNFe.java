package com.github.prbrios.documentofiscal.nfe.inutilizacao;

import com.github.prbrios.documentofiscal.nfe.inutilizacao.envio.InutNFe;
import com.github.prbrios.documentofiscal.nfe.inutilizacao.retorno.RetInutNFe;
import com.github.prbrios.documentofiscal.nfe.inutilizacao.retorno.RetInutNFeInfInut;
import lombok.Data;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "procInutNFe")
public class ProcInutNFe {

    @Attribute(name = "versao", required = false)
    private String versao;

    @Element(name = "inutNFe", required = false)
    private InutNFe inutNFe;

    @Element(name = "retInutNFe", required = false)
    private RetInutNFe retInutNFe;

}
