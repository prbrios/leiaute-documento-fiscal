package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@JsonRootName("card")
@Data
@Root(name = "card")
public class NFeInfNFePagDetPagCard {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("tpintegra")
    @Element(name = "tpIntegra", required = false)
    private String tpIntegra;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cnpj")
    @Element(name = "CNPJ", required = false)
    private String CNPJ;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("tbanc")
    @Element(name = "tBand", required = false)
    private String tBand;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("caut")
    @Element(name = "cAut", required = false)
    private String cAut;

    public NFeInfNFePagDetPagCard() {}

    /**
     *
     * @param tpIntegra
     * @param CNPJ
     * @param tBand
     * @param cAut
     */
    public NFeInfNFePagDetPagCard(String tpIntegra, String CNPJ, String tBand, String cAut) {
        this.tpIntegra = tpIntegra;
        this.CNPJ = CNPJ;
        this.tBand = tBand;
        this.cAut = cAut;
    }

}
