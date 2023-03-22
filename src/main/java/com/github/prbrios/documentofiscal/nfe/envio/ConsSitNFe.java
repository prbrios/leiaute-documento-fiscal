package com.github.prbrios.documentofiscal.nfe.envio;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

@Root(name = "consSitNFe")
@Namespace(reference = "http://www.portalfiscal.inf.br/nfe")
public class ConsSitNFe {
    
    @Attribute(name = "versao", required = false)
    private String versao;

    @Element(name = "tpAmb", required = false)
    private String tpAmb;

    @Element(name = "xServ", required = false)
    private String xServ;

    @Element(name = "chNFe", required = false)
    private String chNFe;

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public String getTpAmb() {
        return tpAmb;
    }

    public void setTpAmb(String tpAmb) {
        this.tpAmb = tpAmb;
    }

    public String getxServ() {
        return xServ;
    }

    public void setxServ(String xServ) {
        this.xServ = xServ;
    }

    public String getChNFe() {
        return chNFe;
    }

    public void setChNFe(String chNFe) {
        this.chNFe = chNFe;
    }

}
