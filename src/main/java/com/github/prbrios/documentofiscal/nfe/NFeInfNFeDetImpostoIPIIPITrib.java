package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "IPITrib")
public class NFeInfNFeDetImpostoIPIIPITrib {

    @Element(name = "CST", required = false)
    private String CST;


    @Element(name = "vBC", required = false)
    private String vBC;

    @Element(name = "pIPI", required = false)
    private String pIPI;


    @Element(name = "qUnid", required = false)
    private String qUnid;

    @Element(name = "vUnid", required = false)
    private String vUnid;


    @Element(name = "vIPI", required = false)
    private String vIPI;

    public NFeInfNFeDetImpostoIPIIPITrib() {}

    /**
     *
     * @param CST
     * @param vBC
     * @param pIPI
     * @param qUnid
     * @param vUnid
     * @param vIPI
     */
    public NFeInfNFeDetImpostoIPIIPITrib(String CST, String vBC, String pIPI, String qUnid, String vUnid, String vIPI) {
        this.CST = CST;
        this.vBC = vBC;
        this.pIPI = pIPI;
        this.qUnid = qUnid;
        this.vUnid = vUnid;
        this.vIPI = vIPI;
    }

}
