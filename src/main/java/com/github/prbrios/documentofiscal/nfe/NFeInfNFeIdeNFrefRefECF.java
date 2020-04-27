package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@JsonRootName("refecf")
@Data
@Root(name = "refECF")
public class NFeInfNFeIdeNFrefRefECF {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("mod")
    @Element(name = "mod", required = false)
    private String mod;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("necf")
    @Element(name = "nECF", required = false)
    private String nECF;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("ncoo")
    @Element(name = "nCOO", required = false)
    private String nCOO;

    public NFeInfNFeIdeNFrefRefECF() {}

    /**
     *
     * @param mod
     * @param nECF
     * @param nCOO
     */
    public NFeInfNFeIdeNFrefRefECF(String mod, String nECF, String nCOO) {
        this.mod = mod;
        this.nECF = nECF;
        this.nCOO = nCOO;
    }

}
