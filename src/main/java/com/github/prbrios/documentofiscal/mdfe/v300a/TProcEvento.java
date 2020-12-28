package com.github.prbrios.documentofiscal.mdfe.v300a;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("proceventomdfe")
@Root(name = "procEventoMDFe")
@Namespace(reference = "http://www.portalfiscal.inf.br/mdfe")
public class TProcEvento {

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
	@JsonProperty("evendomdfe")
	@Element(name = "evendoMDFe", required = false)
	protected TEvento evendoMDFe;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("reteventomdfe")
	@Element(name = "retEventoMDFe", required = false)
	protected TRetEvento retEventoMDFe;

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

	public TEvento getEvendoMDFe() {
		return evendoMDFe;
	}

	public void setEvendoMDFe(TEvento evendoMDFe) {
		this.evendoMDFe = evendoMDFe;
	}

	public TRetEvento getRetEventoMDFe() {
		return retEventoMDFe;
	}

	public void setRetEventoMDFe(TRetEvento retEventoMDFe) {
		this.retEventoMDFe = retEventoMDFe;
	}
}
