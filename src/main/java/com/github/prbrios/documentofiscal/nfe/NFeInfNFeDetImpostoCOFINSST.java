package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@JsonRootName("cofinsst")
@Data
@Root(name = "COFINSST")
public class NFeInfNFeDetImpostoCOFINSST {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vbc")
    @Element(name = "vBC", required = false)
    private String vBC;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("pcofins")
    @Element(name = "pCOFINS", required = false)
    private String pCOFINS;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("qbcprod")
    @Element(name = "qBCProd", required = false)
    private String qBCProd;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("valiqprod")
    @Element(name = "vAliqProd", required = false)
    private String vAliqProd;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vcofins")
    @Element(name = "vCOFINS", required = false)
    private String vCOFINS;

    public NFeInfNFeDetImpostoCOFINSST() {}

    /**
     *
     * @param vBC
     * @param pCOFINS
     * @param qBCProd
     * @param vAliqProd
     * @param vCOFINS
     */
    public NFeInfNFeDetImpostoCOFINSST(String vBC, String pCOFINS, String qBCProd, String vAliqProd, String vCOFINS) {
        this.vBC = vBC;
        this.pCOFINS = pCOFINS;
        this.qBCProd = qBCProd;
        this.vAliqProd = vAliqProd;
        this.vCOFINS = vCOFINS;
    }

}
