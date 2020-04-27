package com.github.prbrios.documentofiscal.nfe.inutilizacao.envio;

import lombok.Data;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "infInut")
public class InutNFeInfInut {

    @Attribute(name = "Id", required = false)
    private String id;

    @Element(name="tpAmb", required = false)
    private String tpAmb;

    @Element(name="xServ", required = false)
    private String xServ;

    @Element(name="cUF", required = false)
    private String cUF;

    @Element(name="ano", required = false)
    private String ano;

    @Element(name="CNPJ", required = false)
    private String CNPJ;

    @Element(name="mod", required = false)
    private String mod;

    @Element(name="serie", required = false)
    private String serie;

    @Element(name="nNFIni", required = false)
    private String nNFIni;

    @Element(name="nNFFin", required = false)
    private String nNFFin;

    @Element(name="xJust", required = false)
    private String xJust;
}
