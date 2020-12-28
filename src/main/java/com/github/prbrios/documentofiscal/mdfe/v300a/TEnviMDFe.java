package com.github.prbrios.documentofiscal.mdfe.v300a;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("envimdfe")
@Root(name = "enviMDFe")
@Namespace(reference = "http://www.portalfiscal.inf.br/mdfe")
public class TEnviMDFe {

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("versao")
	@Attribute(name = "versao", required = false)
	protected String versao;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("idlote")
	@Element(name = "idLote", required = false)
	protected String idLote;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("mdfe")
	@Element(name = "MDFe", required = false)
	protected TMDFe MDFe;

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

	public TMDFe getMDFe() {
		return MDFe;
	}

	public void setMDFe(TMDFe mDFe) {
		MDFe = mDFe;
	}
}
