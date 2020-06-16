package com.github.prbrios.documentofiscal.nfe.envio;

import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.github.prbrios.documentofiscal.nfe.NFe;

@JsonRootName("enviNFe")
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

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public String getIdLote() {
		return idLote;
	}

	public void setIdLote(String idLote) {
		this.idLote = idLote;
	}

	public String getIndSinc() {
		return indSinc;
	}

	public void setIndSinc(String indSinc) {
		this.indSinc = indSinc;
	}

	public List<NFe> getNFe() {
		return NFe;
	}

	public void setNFe(List<NFe> nFe) {
		NFe = nFe;
	}
    
}
