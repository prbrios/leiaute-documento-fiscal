package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "CIDE")
public class NFeInfNFeDetProdCombCIDE {

    @Element(name = "qBCProd", required = false)
    private String qBCProd;

    @Element(name = "vAliqProd", required = false)
    private String vAliqProd;

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
