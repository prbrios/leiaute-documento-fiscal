package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@JsonRootName("rastro")
@Data
@Root(name = "rastro")
public class NFeInfNFeDetProdRastro {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("nlote")
    @Element(name = "nLote", required = false)
    private String nLote;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("qlote")
    @Element(name = "qLote", required = false)
    private String qLote;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("dfab")
    @Element(name = "dFab", required = false)
    private String dFab;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("dval")
    @Element(name = "dVal", required = false)
    private String dVal;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cagreg")
    @Element(name = "cAgreg", required = false)
    private String cAgreg;

    public NFeInfNFeDetProdRastro() {}

    /**
     *
     * @param nLote
     * @param qLote
     * @param dFab
     * @param dVal
     * @param cAgreg
     */
    public NFeInfNFeDetProdRastro(String nLote, String qLote, String dFab, String dVal, String cAgreg) {
        this.nLote = nLote;
        this.qLote = qLote;
        this.dFab = dFab;
        this.dVal = dVal;
        this.cAgreg = cAgreg;
    }

}
