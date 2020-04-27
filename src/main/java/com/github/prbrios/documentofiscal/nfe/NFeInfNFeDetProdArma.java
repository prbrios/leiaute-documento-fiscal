package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@JsonRootName("arma")
@Data
@Root(name = "arma")
public class NFeInfNFeDetProdArma {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("tparma")
    @Element(name = "tpArma", required = false)
    private String tpArma;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("nserie")
    @Element(name = "nSerie", required = false)
    private String nSerie;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("ncano")
    @Element(name = "nCano", required = false)
    private String nCano;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("descr")
    @Element(name = "descr", required = false)
    private String descr;

    public NFeInfNFeDetProdArma() {}

    /**
     *
     * @param tpArma
     * @param nSerie
     * @param nCano
     * @param descr
     */
    public NFeInfNFeDetProdArma(String tpArma, String nSerie, String nCano, String descr) {
        this.tpArma = tpArma;
        this.nSerie = nSerie;
        this.nCano = nCano;
        this.descr = descr;
    }

}
