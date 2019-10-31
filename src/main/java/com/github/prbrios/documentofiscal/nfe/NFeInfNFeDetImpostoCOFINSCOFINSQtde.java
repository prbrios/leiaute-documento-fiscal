package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "COFINSQtde")
public class NFeInfNFeDetImpostoCOFINSCOFINSQtde {

    @Element(name = "CST", required = false)
    private String CST;

    @Element(name = "qBCProd", required = false)
    private String qBCProd;

    @Element(name = "vAliqProd", required = false)
    private String vAliqProd;

    @Element(name = "vCOFINS", required = false)
    private String vCOFINS;

    public NFeInfNFeDetImpostoCOFINSCOFINSQtde() {}

    /**
     *
     * @param CST
     * @param qBCProd
     * @param vAliqProd
     * @param vCOFINS
     */
    public NFeInfNFeDetImpostoCOFINSCOFINSQtde(String CST, String qBCProd, String vAliqProd, String vCOFINS) {
        this.CST = CST;
        this.qBCProd = qBCProd;
        this.vAliqProd = vAliqProd;
        this.vCOFINS = vCOFINS;
    }
}
