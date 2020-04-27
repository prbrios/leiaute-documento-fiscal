package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@JsonRootName("comb")
@Data
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

}
