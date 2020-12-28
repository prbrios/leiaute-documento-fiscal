package com.github.prbrios.documentofiscal.mdfe.v300a;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("aereo")
@Root(name = "aereo")
public class Aereo extends Modal {

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("nac")
	@Element(name = "nac", required = false)
	protected String nac;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("matr")
	@Element(name = "matr", required = false)
	protected String matr;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("nvoo")
	@Element(name = "nVoo", required = false)
	protected String nVoo;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("caeremb")
	@Element(name = "cAerEmb", required = false)
	protected String cAerEmb;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("caerdes")
	@Element(name = "cAerDes", required = false)
	protected String cAerDes;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("dvoo")
	@Element(name = "dVoo", required = false)
	protected String dVoo;

	@Override
	public String toString() {
		return "Aereo {nac=" + nac + ", matr=" + matr + ", nVoo=" + nVoo + ", cAerEmb=" + cAerEmb + ", cAerDes="
				+ cAerDes + ", dVoo=" + dVoo + "}";
	}

	public Aereo() {
		
	}
	
	public Aereo(
			@Element(name = "nac") String nac,
			@Element(name = "matr") String matr,
			@Element(name = "nVoo") String nVoo,
			@Element(name = "cAerEmb") String cAerEmb,
			@Element(name = "cAerDes") String cAerDes,
			@Element(name = "dVoo") String dVoo
	){
		this.nac = nac;
		this.matr = matr;
		this.nVoo = nVoo;
		this.cAerEmb = cAerEmb;
		this.cAerDes = cAerDes;
		this.dVoo = dVoo;
	}
	
	public String getNac() {
		return nac;
	}

	public void setNac(String nac) {
		this.nac = nac;
	}

	public String getMatr() {
		return matr;
	}

	public void setMatr(String matr) {
		this.matr = matr;
	}

	public String getnVoo() {
		return nVoo;
	}

	public void setnVoo(String nVoo) {
		this.nVoo = nVoo;
	}

	public String getcAerEmb() {
		return cAerEmb;
	}

	public void setcAerEmb(String cAerEmb) {
		this.cAerEmb = cAerEmb;
	}

	public String getcAerDes() {
		return cAerDes;
	}

	public void setcAerDes(String cAerDes) {
		this.cAerDes = cAerDes;
	}

	public String getdVoo() {
		return dVoo;
	}

	public void setdVoo(String dVoo) {
		this.dVoo = dVoo;
	}
}
