package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@JsonRootName("refnfp")
@Data
@Root(name = "refNFP")
public class NFeInfNFeIdeNFrefRefNFP {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cuf")
    @Element(name = "cUF", required = false)
    private String cUF;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("aamm")
    @Element(name = "AAMM", required = false)
    private String AAMM;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cnp")
    @Element(name = "CNPJ", required = false)
    private String CNPJ;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cpf")
    @Element(name = "CPF", required = false)
    private String CPF;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("ie")
    @Element(name = "IE", required = false)
    private String IE;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("mod")
    @Element(name = "mod", required = false)
    private String mod;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("serie")
    @Element(name = "serie", required = false)
    private String serie;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("nnf")
    @Element(name = "nNF", required = false)
    private String nNF;

    public NFeInfNFeIdeNFrefRefNFP() {}

    /**
     *
     * @param cUF
     * @param AAMM
     * @param CNPJ
     * @param CPF
     * @param IE
     * @param mod
     * @param serie
     * @param nNF
     */
    public NFeInfNFeIdeNFrefRefNFP(String cUF, String AAMM, String CNPJ, String CPF, String IE, String mod, String serie, String nNF) {
        this.cUF = cUF;
        this.AAMM = AAMM;
        this.CNPJ = CNPJ;
        this.CPF = CPF;
        this.IE = IE;
        this.mod = mod;
        this.serie = serie;
        this.nNF = nNF;
    }

}
