package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@JsonRootName("cide")
@Data
@Root(name = "CIDE")
public class NFeInfNFeDetProdCombCIDE {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("qbcprod")
    @Element(name = "qBCProd", required = false)
    private String qBCProd;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("valiqprod")
    @Element(name = "vAliqProd", required = false)
    private String vAliqProd;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vcide")
    @Element(name = "vCIDE", required = false)
    private String vCIDE;

    public NFeInfNFeDetProdCombCIDE() {}

    /**
     *
     * @param qBCProd
     * @param vAliqProd
     * @param vCIDE
     */
    public NFeInfNFeDetProdCombCIDE(String qBCProd, String vAliqProd, String vCIDE) {
        this.qBCProd = qBCProd;
        this.vAliqProd = vAliqProd;
        this.vCIDE = vCIDE;
    }

}
