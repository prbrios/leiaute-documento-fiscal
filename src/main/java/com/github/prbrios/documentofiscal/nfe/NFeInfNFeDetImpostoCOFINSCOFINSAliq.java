package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "COFINSAliq")
public class NFeInfNFeDetImpostoCOFINSCOFINSAliq {

    @Element(name = "CST", required = false)
    private String CST;

    @Element(name = "vBC", required = false)
    private String vBC;

    @Element(name = "pCOFINS", required = false)
    private String pCOFINS;

    @Element(name = "vCOFINS", required = false)
    private String vCOFINS;

    public NFeInfNFeDetImpostoCOFINSCOFINSAliq() {}

    /**
     *
     * @param CST
     * @param vBC
     * @param pCOFINS
     * @param vCOFINS
     */
    public NFeInfNFeDetImpostoCOFINSCOFINSAliq(String CST, String vBC, String pCOFINS, String vCOFINS) {
        this.CST = CST;
        this.vBC = vBC;
        this.pCOFINS = pCOFINS;
        this.vCOFINS = vCOFINS;
    }

}
