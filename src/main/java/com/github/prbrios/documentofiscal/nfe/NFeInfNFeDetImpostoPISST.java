package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "PISST")
public class NFeInfNFeDetImpostoPISST {

    @Element(name = "vBC", required = false)
    private String vBC;

    @Element(name = "pPIS", required = false)
    private String pPIS;

    @Element(name = "qBCProd", required = false)
    private String qBCProd;

    @Element(name = "vAliqProd", required = false)
    private String vAliqProd;

    @Element(name = "vPIS", required = false)
    private String vPIS;

    public NFeInfNFeDetImpostoPISST() {}

    /**
     *
     * @param vBC
     * @param pPIS
     * @param qBCProd
     * @param vAliqProd
     * @param vPIS
     */
    public NFeInfNFeDetImpostoPISST(String vBC, String pPIS, String qBCProd, String vAliqProd, String vPIS) {
        this.vBC = vBC;
        this.pPIS = pPIS;
        this.qBCProd = qBCProd;
        this.vAliqProd = vAliqProd;
        this.vPIS = vPIS;
    }

}
