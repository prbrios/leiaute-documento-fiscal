package com.github.prbrios.documentofiscal.mdfe.v300a;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("mdfeproc")
@Root(name = "mdfeProc")
@Namespace(reference = "http://www.portalfiscal.inf.br/mdfe")
public class MDFeProc {

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("versao")
	@Attribute(name = "versao", required = false)
	protected String versao;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("iptransmissor")
	@Attribute(name = "ipTransmissor", required = false)
	protected String ipTransmissor;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("nportacon")
	@Attribute(name = "nPortaCon", required = false)
	protected String nPortaCon;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("dhconexao")
	@Attribute(name = "dhConexao", required = false)
	protected String dhConexao;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("mdfe")
	@Element(name = "MDFe", required = false)
	protected TMDFe MDFe;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("protmdfe")
	@Element(name = "protMDFe", required = false)
	protected TProtMDFe protMDFe;
	
	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public String getIpTransmissor() {
		return ipTransmissor;
	}

	public void setIpTransmissor(String ipTransmissor) {
		this.ipTransmissor = ipTransmissor;
	}

	public String getnPortaCon() {
		return nPortaCon;
	}

	public void setnPortaCon(String nPortaCon) {
		this.nPortaCon = nPortaCon;
	}

	public String getDhConexao() {
		return dhConexao;
	}

	public void setDhConexao(String dhConexao) {
		this.dhConexao = dhConexao;
	}

	public TMDFe getMDFe() {
		return MDFe;
	}

	public void setMDFe(TMDFe mDFe) {
		MDFe = mDFe;
	}

	public TProtMDFe getProtMDFe() {
		return protMDFe;
	}

	public void setProtMDFe(TProtMDFe protMDFe) {
		this.protMDFe = protMDFe;
	}
	
	/*
	@JsonRootName("protmdfe")
	@Root(name = "protMDFe")
	public static class ProtMDFe extends TProtMDFe {
		
	}
	*/

}
