package com.github.prbrios.documentofiscal.nfe.retorno;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;

public class RetCancNFeInfCanc {
    
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

    @Element(name = "chNFe", required = false)
    private String chNFe;

    @Element(name = "dhRecbto", required = false)
    private String dhRecbto;

    @Element(name = "nProt", required = false)
    private String nProt;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTpAmb() {
        return tpAmb;
    }

    public void setTpAmb(String tpAmb) {
        this.tpAmb = tpAmb;
    }

    public String getVerAplic() {
        return verAplic;
    }

    public void setVerAplic(String verAplic) {
        this.verAplic = verAplic;
    }

    public String getcStat() {
        return cStat;
    }

    public void setcStat(String cStat) {
        this.cStat = cStat;
    }

    public String getxMotivo() {
        return xMotivo;
    }

    public void setxMotivo(String xMotivo) {
        this.xMotivo = xMotivo;
    }

    public String getcUF() {
        return cUF;
    }

    public void setcUF(String cUF) {
        this.cUF = cUF;
    }

    public String getChNFe() {
        return chNFe;
    }

    public void setChNFe(String chNFe) {
        this.chNFe = chNFe;
    }

    public String getDhRecbto() {
        return dhRecbto;
    }

    public void setDhRecbto(String dhRecbto) {
        this.dhRecbto = dhRecbto;
    }

    public String getnProt() {
        return nProt;
    }

    public void setnProt(String nProt) {
        this.nProt = nProt;
    }

}
