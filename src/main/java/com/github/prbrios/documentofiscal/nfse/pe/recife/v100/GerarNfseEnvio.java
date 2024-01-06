package com.github.prbrios.documentofiscal.nfse.pe.recife.v100;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import com.fasterxml.jackson.annotation.JsonProperty;

@Root(name = "GerarNfseEnvio")
@Namespace(reference = "http://nfse.recife.pe.gov.br/WSNacional/XSD/1/nfse_recife_v01.xsd")
public class GerarNfseEnvio {
    
    @JsonProperty(value = "rps", required = false)
    @Element(name = "Rps", required = false)
    private TcRps rps;

    public TcRps getRps() {
        return rps;
    }

    public void setRps(TcRps rps) {
        this.rps = rps;
    }

}
