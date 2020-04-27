package com.github.prbrios.documentofiscal.nfe.envio;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.github.prbrios.documentofiscal.nfe.NFe;
import lombok.Data;
import org.simpleframework.xml.*;

import java.util.ArrayList;
import java.util.List;

@JsonRootName("enviNFe")
@Data
@Root(name = "enviNFe")
@Namespace(reference = "http://www.portalfiscal.inf.br/nfe")
public class EnviNFe {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("versao")
    @Attribute(name = "versao", required = false)
    private String versao;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("idlote")
    @Element(name = "idLote", required = false)
    private String idLote;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("indsinc")
    @Element(name = "indSinc", required = false)
    private String indSinc;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("nfe")
    @ElementList(name = "NFe", required = false, inline = true)
    private List<NFe> NFe = new ArrayList<NFe>();

}
