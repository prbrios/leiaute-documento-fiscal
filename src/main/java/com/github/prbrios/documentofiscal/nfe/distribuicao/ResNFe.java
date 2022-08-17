package com.github.prbrios.documentofiscal.nfe.distribuicao;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("resnfe")
@Root(name = "resNFe")
@Namespace(reference = "http://www.portalfiscal.inf.br/nfe")
public class ResNFe {

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("versao")
    @Attribute(name="versao", required = false)
	private String versao;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("chnfe")
    @Element(name = "chNFe", required = false)
	private String chNFe;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cnpj")
    @Element(name = "CNPJ", required = false)
	private String CNPJ;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cpf")
    @Element(name = "CPF", required = false)
	private String CPF;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("xnome")
    @Element(name = "xNome", required = false)
	private String xNome;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("ie")
    @Element(name = "IE", required = false)
	private String IE;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("dhemi")
    @Element(name = "dhEmi", required = false)
	private String dhEmi;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("tpnf")
    @Element(name = "tpNF", required = false)
	private String tpNF;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vnf")
    @Element(name = "vNF", required = false)
	private String vNF;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("digval")
    @Element(name = "digVal", required = false)
	private String digVal;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("dhrecbto")
    @Element(name = "dhRecbto", required = false)
	private String dhRecbto;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("nprot")
    @Element(name = "nProt", required = false)
	private String nProt;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("csitnfe")
    @Element(name = "cSitNFe", required = false)
	private String cSitNFe;

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public String getChNFe() {
		return chNFe;
	}

	public void setChNFe(String chNFe) {
		this.chNFe = chNFe;
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

	public String getxNome() {
		return xNome;
	}

	public void setxNome(String xNome) {
		this.xNome = xNome;
	}

	public String getIE() {
		return IE;
	}

	public void setIE(String iE) {
		IE = iE;
	}

	public String getDhEmi() {
		return dhEmi;
	}

	public void setDhEmi(String dhEmi) {
		this.dhEmi = dhEmi;
	}

	public String getTpNF() {
		return tpNF;
	}

	public void setTpNF(String tpNF) {
		this.tpNF = tpNF;
	}

	public String getvNF() {
		return vNF;
	}

	public void setvNF(String vNF) {
		this.vNF = vNF;
	}

	public String getDigVal() {
		return digVal;
	}

	public void setDigVal(String digVal) {
		this.digVal = digVal;
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

	public String getcSitNFe() {
		return cSitNFe;
	}

	public void setcSitNFe(String cSitNFe) {
		this.cSitNFe = cSitNFe;
	}
}
