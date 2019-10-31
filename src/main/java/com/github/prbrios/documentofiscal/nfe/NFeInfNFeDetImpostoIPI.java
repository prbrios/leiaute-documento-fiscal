package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "IPI")
public class NFeInfNFeDetImpostoIPI {

    @Element(name = "CNPJProd", required = false)
    private String CNPJProd;

    @Element(name = "cSelo", required = false)
    private String cSelo;

    @Element(name = "qSelo", required = false)
    private String qSelo;

    @Element(name = "cEnq", required = false)
    private String cEnq;

    @Element(name = "IPITrib", required = false)
    private NFeInfNFeDetImpostoIPIIPITrib IPITrib;

    @Element(name = "IPINT", required = false)
    private NFeInfNFeDetImpostoIPIIPINT IPINT;

    public NFeInfNFeDetImpostoIPI() {}

    /**
     *
     * @param CNPJProd
     * @param cSelo
     * @param qSelo
     * @param cEnq
     * @param IPITrib
     * @param IPINT
     */
    public NFeInfNFeDetImpostoIPI(String CNPJProd, String cSelo, String qSelo, String cEnq, NFeInfNFeDetImpostoIPIIPITrib IPITrib, NFeInfNFeDetImpostoIPIIPINT IPINT) {
        this.CNPJProd = CNPJProd;
        this.cSelo = cSelo;
        this.qSelo = qSelo;
        this.cEnq = cEnq;
        this.IPITrib = IPITrib;
        this.IPINT = IPINT;
    }

}
