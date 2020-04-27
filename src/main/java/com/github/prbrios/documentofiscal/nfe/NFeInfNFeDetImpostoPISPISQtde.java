package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@JsonRootName("pisqtde")
@Data
@Root(name = "PISQtde")
public class NFeInfNFeDetImpostoPISPISQtde {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cst")
    @Element(name = "CST", required = false)
    private String CST;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("qbcprod")
    @Element(name = "qBCProd", required = false)
    private String qBCProd;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("valiqprod")
    @Element(name = "vAliqProd", required = false)
    private String vAliqProd;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vpis")
    @Element(name = "vPIS", required = false)
    private String vPIS;

    public NFeInfNFeDetImpostoPISPISQtde() {}

    /**
     *
     * @param CST
     * @param qBCProd
     * @param vAliqProd
     * @param vPIS
     */
    public NFeInfNFeDetImpostoPISPISQtde(String CST, String qBCProd, String vAliqProd, String vPIS) {
        this.CST = CST;
        this.qBCProd = qBCProd;
        this.vAliqProd = vAliqProd;
        this.vPIS = vPIS;
    }

}
