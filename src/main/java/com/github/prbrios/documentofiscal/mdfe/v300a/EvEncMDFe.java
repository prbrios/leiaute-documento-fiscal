package com.github.prbrios.documentofiscal.mdfe.v300a;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("evencmdfe")
@Root(name = "evEncMDFe")
public class EvEncMDFe extends Evento {

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("descevento")
	@Element(name = "descEvento", required = false)
	protected String descEvento = "Encerramento";
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("nprot")
	@Element(name = "nProt", required = false)
	protected String nProt;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("dtenc")
	@Element(name = "dtEnc", required = false)
	protected String dtEnc;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("cuf")
	@Element(name = "cUF", required = false)
	protected String cUF;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("cmun")
	@Element(name = "cMun", required = false)
	protected String cMun;
	
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
	public String getDtEnc() {
		return dtEnc;
	}
	public void setDtEnc(String dtEnc) {
		this.dtEnc = dtEnc;
	}
	public String getcUF() {
		return cUF;
	}
	public void setcUF(String cUF) {
		this.cUF = cUF;
	}
	public String getcMun() {
		return cMun;
	}
	public void setcMun(String cMun) {
		this.cMun = cMun;
	}
}
