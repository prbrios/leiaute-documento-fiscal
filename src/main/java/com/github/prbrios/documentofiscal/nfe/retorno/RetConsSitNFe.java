package com.github.prbrios.documentofiscal.nfe.retorno;

import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import com.github.prbrios.documentofiscal.nfe.evento.ProcEvento;

@Root(name = "retConsSitNFe")
@Namespace(reference = "http://www.portalfiscal.inf.br/nfe")
public class RetConsSitNFe {

    @Attribute(name = "versao", required = false)
    private String versao;

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

    @Element(name = "dhRecbto", required = false)
    private String dhRecbto;

    @Element(name = "chNFe", required = false)
    private String chNFe;

    @Element(name = "protNFe", required = false)
    private RetEnviNFeProtNFe protNFe;

    @Element(name = "retCancNFe", required = false)
    private RetCancNFe retCancNFe;

    @ElementList(name = "procEvento", inline = true, required = false)
    private List<ProcEvento> procEvento;

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

    public String getDhRecbto() {
        return dhRecbto;
    }

    public void setDhRecbto(String dhRecbto) {
        this.dhRecbto = dhRecbto;
    }

    public String getChNFe() {
        return chNFe;
    }

    public void setChNFe(String chNFe) {
        this.chNFe = chNFe;
    }

    public RetEnviNFeProtNFe getProtNFe() {
        return protNFe;
    }

    public void setProtNFe(RetEnviNFeProtNFe protNFe) {
        this.protNFe = protNFe;
    }

    public RetCancNFe getRetCancNFe() {
        return retCancNFe;
    }

    public void setRetCancNFe(RetCancNFe retCancNFe) {
        this.retCancNFe = retCancNFe;
    }

    public List<ProcEvento> getProcEvento() {
        return procEvento;
    }

    public void setProcEvento(List<ProcEvento> procEvento) {
        this.procEvento = procEvento;
    }
    
}
