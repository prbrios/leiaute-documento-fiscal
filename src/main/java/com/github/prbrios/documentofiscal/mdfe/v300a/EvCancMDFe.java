package com.github.prbrios.documentofiscal.mdfe.v300a;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("evcancmdfe")
@Root(name = "evCancMDFe")
public class EvCancMDFe extends Evento {

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("descevento")
	@Element(name = "descEvento", required = false)
	protected String descEvento = "Cancelamento";
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("nprot")
	@Element(name = "nProt", required = false)
	protected String nProt;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("xjust")
	@Element(name = "xJust", required = false)
	protected String xJust;

	public String getDescEvento() {
		return descEvento;
	}

	public void setDescEvento(String descEvento) {
		this.descEvento = descEvento;
	}

	public String getnProt() {
		return nProt;
	}

	public void setnProt(String nProt) {
		this.nProt = nProt;
	}

	public String getxJust() {
		return xJust;
	}

	public void setxJust(String xJust) {
		this.xJust = xJust;
	}
	
}
