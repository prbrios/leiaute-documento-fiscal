package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@JsonRootName("avulsa")
@Data
@Root(name = "avulsa")
public class NFeInfNFeAvulsa {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cnpj")
    @Element(name = "CNPJ", required = false)
    private String CNPJ;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("xorgao")
    @Element(name = "xOrgao", required = false)
    private String xOrgao;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("matr")
    @Element(name = "matr", required = false)
    private String matr;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("xagente")
    @Element(name = "xAgente", required = false)
    private String xAgente;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("fone")
    @Element(name = "fone", required = false)
    private String fone;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("uf")
    @Element(name = "UF", required = false)
    private String UF;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("ndar")
    @Element(name = "nDAR", required = false)
    private String nDAR;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("demi")
    @Element(name = "dEmi", required = false)
    private String dEmi;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vdar")
    @Element(name = "vDAR", required = false)
    private String vDAR;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("repemi")
    @Element(name = "repEmi", required = false)
    private String repEmi;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("dpag")
    @Element(name = "dPag", required = false)
    private String dPag;

    public NFeInfNFeAvulsa() {}

    /**
     *
     * @param CNPJ
     * @param xOrgao
     * @param matr
     * @param xAgente
     * @param fone
     * @param UF
     * @param nDAR
     * @param dEmi
     * @param vDAR
     * @param repEmi
     * @param dPag
     */
    public NFeInfNFeAvulsa(String CNPJ, String xOrgao, String matr, String xAgente, String fone, String UF, String nDAR, String dEmi, String vDAR, String repEmi, String dPag) {
        this.CNPJ = CNPJ;
        this.xOrgao = xOrgao;
        this.matr = matr;
        this.xAgente = xAgente;
        this.fone = fone;
        this.UF = UF;
        this.nDAR = nDAR;
        this.dEmi = dEmi;
        this.vDAR = vDAR;
        this.repEmi = repEmi;
        this.dPag = dPag;
    }

}
