package com.github.prbrios.documentofiscal.nfe.evento.retorno;

import lombok.Data;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "infEvento")
public class RetEnvEventoRetEventoInfEvento {

    @Attribute(name = "Id", required = false)
    private String id;

    @Element(name = "tpAmb", required = false)
    private String tpAmb;

    @Element(name = "verAplic", required = false)
    private String verAplic;

    @Element(name = "cOrgao", required = false)
    private String cOrgao;

    @Element(name = "cStat", required = false)
    private String cStat;

    @Element(name = "xMotivo", required = false)
    private String xMotivo;

    @Element(name = "chNFe", required = false)
    private String chNFe;

    @Element(name = "tpEvento", required = false)
    private String tpEvento;

    @Element(name = "xEvento", required = false)
    private String xEvento;

    @Element(name = "nSeqEvento", required = false)
    private String nSeqEvento;

    @Element(name = "CNPJDest", required = false)
    private String CNPJDest;

    @Element(name = "CPFDest", required = false)
    private String CPFDest;

    @Element(name = "emailDest", required = false)
    private String emailDest;

    @Element(name = "dhRegEvento", required = false)
    private String dhRegEvento;

    @Element(name = "nProt", required = false)
    private String nProt;



}
