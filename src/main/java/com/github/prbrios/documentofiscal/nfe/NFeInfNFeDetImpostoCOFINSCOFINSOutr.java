package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "COFINSOutr")
public class NFeInfNFeDetImpostoCOFINSCOFINSOutr {

    @Element(name = "CST", required = false)
    private String CST;

    @Element(name = "vBC", required = false)
    private String vBC;

    @Element(name = "pCOFINS", required = false)
    private String pCOFINS;

    @Element(name = "qBCProd", required = false)
    private String qBCProd;

    @Element(name = "vAliqProd", required = false)
    private String vAliqProd;

    @Element(name = "vCOFINS", required = false)
    private String vCOFINS;

    public NFeInfNFeDetImpostoCOFINSCOFINSOutr(){}

    /**
     *
     * @param CST
     * @param vBC
     * @param pCOFINS
     * @param qBCProd
     * @param vAliqProd
     * @param vCOFINS
     */
    public NFeInfNFeDetImpostoCOFINSCOFINSOutr(String CST, String vBC, String pCOFINS, String qBCProd, String vAliqProd, String vCOFINS) {
        this.CST = CST;
        this.vBC = vBC;
        this.pCOFINS = pCOFINS;
        this.qBCProd = qBCProd;
        this.vAliqProd = vAliqProd;
        this.vCOFINS = vCOFINS;
    }
}
