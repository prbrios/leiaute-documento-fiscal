package com.github.prbrios.documentofiscal.nfse.pe.recife.v100;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import com.fasterxml.jackson.annotation.JsonProperty;

@Root(name = "GerarNfseResposta")
@Namespace(reference = "http://nfse.recife.pe.gov.br/wsnacional/xsd/1/nfse_recife_v01.xsd")
public class GerarNfseResposta {
    
    @JsonProperty(value = "compnfse", required = false)
    @Element(name = "CompNfse", required = false)
    private CompNfse compNfse;
    
    @JsonProperty(value = "listamensagemretorno", required = false)
    @Element(name = "ListaMensagemRetorno", required = false)
    private ListaMensagemRetorno listaMensagemRetorno;

    public CompNfse getCompNfse() {
        return compNfse;
    }

    public void setCompNfse(CompNfse compNfse) {
        this.compNfse = compNfse;
    }

    public ListaMensagemRetorno getListaMensagemRetorno() {
        return listaMensagemRetorno;
    }

    public void setListaMensagemRetorno(ListaMensagemRetorno listaMensagemRetorno) {
        this.listaMensagemRetorno = listaMensagemRetorno;
    }

}
