package com.github.prbrios.documentofiscal.nfe.distribuicao;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("distdfeint")
@Root(name = "distDFeInt")
@Namespace(reference = "http://www.portalfiscal.inf.br/nfe")
public class DistDFeInt {

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("versao")
    @Attribute(name="versao", required = false)
	private String versao;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("tpamb")
    @Element(name = "tpAmb", required = false)
	private String tpAmb;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cufautor")
    @Element(name = "cUFAutor", required = false)
	private String cUFAutor;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cnpj")
    @Element(name = "CNPJ", required = false)
	private String CNPJ;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cpf")
    @Element(name = "CPF", required = false)
	private String CPF;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("distnsu")
    @Element(name = "distNSU", required = false)
	private DistDFeIntDistNSU distNSU;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("consnsu")
    @Element(name = "consNSU", required = false)
	private DistDFeIntConsNSU consNSU;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("conschnfe")
    @Element(name = "consChNFe", required = false)
	private DistDFeIntConsChNFe consChNFe;

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

	public String getcUFAutor() {
		return cUFAutor;
	}

	public void setcUFAutor(String cUFAutor) {
		this.cUFAutor = cUFAutor;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public DistDFeIntDistNSU getDistNSU() {
		return distNSU;
	}

	public void setDistNSU(DistDFeIntDistNSU distNSU) {
		this.distNSU = distNSU;
	}

	public DistDFeIntConsNSU getConsNSU() {
		return consNSU;
	}

	public void setConsNSU(DistDFeIntConsNSU consNSU) {
		this.consNSU = consNSU;
	}

	public DistDFeIntConsChNFe getConsChNFe() {
		return consChNFe;
	}

	public void setConsChNFe(DistDFeIntConsChNFe consChNFe) {
		this.consChNFe = consChNFe;
	}
	
}
