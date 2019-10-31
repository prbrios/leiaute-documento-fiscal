package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "PISQtde")
public class NFeInfNFeDetImpostoPISPISQtde {

    @Element(name = "CST", required = false)
    private String CST;

    @Element(name = "qBCProd", required = false)
    private String qBCProd;

    @Element(name = "vAliqProd", required = false)
    private String vAliqProd;

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
