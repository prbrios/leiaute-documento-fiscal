package com.github.prbrios.documentofiscal.nfe.distribuicao;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

@JsonRootName("resevento")
@Root(name = "resEvento")
@Namespace(reference = "http://www.portalfiscal.inf.br/nfe")
public class ResEvento {
    
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("versao")
    @Attribute(name="versao", required = false)
    private String versao;
    
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("corgao")
    @Element(name = "cOrgao", required = false)
    private String cOrgao;
    
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cnpj")
    @Element(name = "CNPJ", required = false)
    private String CNPJ;
    
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cpf")
    @Element(name = "CPF", required = false)
    private String CPF;
    
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("chnfe")
    @Element(name = "chNFe", required = false)
    private String chNFe;
    
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("dhevento")
    @Element(name = "dhEvento", required = false)
    private String dhEvento;
    
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("tpevento")
    @Element(name = "tpEvento", required = false)
    private String tpEvento;
    
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("nseqevento")
    @Element(name = "nSeqEvento", required = false)
    private String nSeqEvento;
    
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("xevento")
    @Element(name = "xEvento", required = false)
    private String xEvento;
    
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("dhrecbto")
    @Element(name = "dhRecbto", required = false)
    private String dhRecbto;
    
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("nprot")
    @Element(name = "nProt", required = false)
    private String nProt;

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public String getcOrgao() {
        return cOrgao;
    }

    public void setcOrgao(String cOrgao) {
        this.cOrgao = cOrgao;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getChNFe() {
        return chNFe;
    }

    public void setChNFe(String chNFe) {
        this.chNFe = chNFe;
    }

    public String getDhEvento() {
        return dhEvento;
    }

    public void setDhEvento(String dhEvento) {
        this.dhEvento = dhEvento;
    }

    public String getTpEvento() {
        return tpEvento;
    }

    public void setTpEvento(String tpEvento) {
        this.tpEvento = tpEvento;
    }

    public String getnSeqEvento() {
        return nSeqEvento;
    }

    public void setnSeqEvento(String nSeqEvento) {
        this.nSeqEvento = nSeqEvento;
    }

    public String getxEvento() {
        return xEvento;
    }

    public void setxEvento(String xEvento) {
        this.xEvento = xEvento;
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
