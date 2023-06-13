package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@JsonRootName("comb")
@Root(name = "comb")
public class NFeInfNFeDetProdComb {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cprodanp")
    @Element(name = "cProdANP", required = false)
    private String cProdANP;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("descanp")
    @Element(name = "descANP", required = false)
    private String descANP;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("pglp")
    @Element(name = "pGLP", required = false)
    private String pGLP;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("pgnn")
    @Element(name = "pGNn", required = false)
    private String pGNn;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("pgni")
    @Element(name = "pGNi", required = false)
    private String pGNi;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vpart")
    @Element(name = "vPart", required = false)
    private String vPart;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("codif")
    @Element(name = "CODIF", required = false)
    private String CODIF;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("qtemp")
    @Element(name = "qTemp", required = false)
    private String qTemp;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("ufcons")
    @Element(name = "UFCons", required = false)
    private String UFCons;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cide")
    @Element(name = "CIDE", required = false)
    private NFeInfNFeDetProdCombCIDE CIDE;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("encerrante")
    @Element(name = "encerrante", required = false)
    private NFeInfNFeDetProdCombEncerrante encerrante;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("pbio")
    @Element(name = "pBio", required = false)
    private String pBio;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("origcomb")
    @ElementList(name = "origComb", inline = true, required = false)
    private List<NFeInfNFeDetProdCombOrigComb> origComb;

    public NFeInfNFeDetProdComb() {}

    /**
     *
     * @param cProdANP
     * @param descANP
     * @param pGLP
     * @param pGNn
     * @param pGNi
     * @param vPart
     * @param CODIF
     * @param qTemp
     * @param UFCons
     * @param CIDE
     * @param encerrante
     */
    public NFeInfNFeDetProdComb(String cProdANP, String descANP, String pGLP, String pGNn, String pGNi, String vPart, String CODIF, String qTemp, String UFCons, NFeInfNFeDetProdCombCIDE CIDE, NFeInfNFeDetProdCombEncerrante encerrante) {
        this.cProdANP = cProdANP;
        this.descANP = descANP;
        this.pGLP = pGLP;
        this.pGNn = pGNn;
        this.pGNi = pGNi;
        this.vPart = vPart;
        this.CODIF = CODIF;
        this.qTemp = qTemp;
        this.UFCons = UFCons;
        this.CIDE = CIDE;
        this.encerrante = encerrante;
    }

    /**
     * 
     * @param cProdANP
     * @param descANP
     * @param pGLP
     * @param pGNn
     * @param pGNi
     * @param vPart
     * @param CODIF
     * @param qTemp
     * @param UFCons
     * @param CIDE
     * @param encerrante
     * @param pBio
     */
    public NFeInfNFeDetProdComb(String cProdANP, String descANP, String pGLP, String pGNn, String pGNi, String vPart, String CODIF, String qTemp, String UFCons, NFeInfNFeDetProdCombCIDE CIDE, NFeInfNFeDetProdCombEncerrante encerrante, String pBio) {
        this.cProdANP = cProdANP;
        this.descANP = descANP;
        this.pGLP = pGLP;
        this.pGNn = pGNn;
        this.pGNi = pGNi;
        this.vPart = vPart;
        this.CODIF = CODIF;
        this.qTemp = qTemp;
        this.UFCons = UFCons;
        this.CIDE = CIDE;
        this.encerrante = encerrante;
    }

	public String getcProdANP() {
		return cProdANP;
	}

	public void setcProdANP(String cProdANP) {
		this.cProdANP = cProdANP;
	}

	public String getDescANP() {
		return descANP;
	}

	public void setDescANP(String descANP) {
		this.descANP = descANP;
	}

	public String getpGLP() {
		return pGLP;
	}

	public void setpGLP(String pGLP) {
		this.pGLP = pGLP;
	}

	public String getpGNn() {
		return pGNn;
	}

	public void setpGNn(String pGNn) {
		this.pGNn = pGNn;
	}

	public String getpGNi() {
		return pGNi;
	}

	public void setpGNi(String pGNi) {
		this.pGNi = pGNi;
	}

	public String getvPart() {
		return vPart;
	}

	public void setvPart(String vPart) {
		this.vPart = vPart;
	}

	public String getCODIF() {
		return CODIF;
	}

	public void setCODIF(String cODIF) {
		CODIF = cODIF;
	}

	public String getqTemp() {
		return qTemp;
	}

	public void setqTemp(String qTemp) {
		this.qTemp = qTemp;
	}

	public String getUFCons() {
		return UFCons;
	}

	public void setUFCons(String uFCons) {
		UFCons = uFCons;
	}

	public NFeInfNFeDetProdCombCIDE getCIDE() {
		return CIDE;
	}

	public void setCIDE(NFeInfNFeDetProdCombCIDE cIDE) {
		CIDE = cIDE;
	}

	public NFeInfNFeDetProdCombEncerrante getEncerrante() {
		return encerrante;
	}

	public void setEncerrante(NFeInfNFeDetProdCombEncerrante encerrante) {
		this.encerrante = encerrante;
	}

    public String getpBio() {
        return pBio;
    }

    public void setpBio(String pBio) {
        this.pBio = pBio;
    }

    public List<NFeInfNFeDetProdCombOrigComb> getOrigComb() {
        return origComb;
    }

    public void setOrigComb(List<NFeInfNFeDetProdCombOrigComb> origComb) {
        this.origComb = origComb;
    }

}
