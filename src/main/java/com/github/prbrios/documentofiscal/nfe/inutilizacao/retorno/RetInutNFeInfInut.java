package com.github.prbrios.documentofiscal.nfe.inutilizacao.retorno;


import lombok.Data;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "infInut")
public class RetInutNFeInfInut {

    @Attribute(name = "Id", required = false)
    private String id;

    @Element(name = "tpAmb", required = false)
    private String tpAmb;

    @Element(name = "verAplic", required = false)
    private String verAplic;

    @Element(name = "cStat", required = false)
    private String cStat;

    @Element(name = "xMotivo", required = false)
    private String xMotivo;

    @Element(name = "cUF", required = false)
    private String cUF;

    @Element(name = "ano", required = false)
    private String ano;

    @Element(name = "CNPJ", required = false)
    private String CNPJ;

    @Element(name = "mod", required = false)
    private String mod;

    @Element(name = "serie", required = false)
    private String serie;

    @Element(name = "nNFIni", required = false)
    private String nNFIni;

    @Element(name = "nNFFin", required = false)
    private String nNFFin;

    @Element(name = "dhRecbto", required = false)
    private String dhRecbto;

    @Element(name = "nProt", required = false)
    private String nProt;

}
