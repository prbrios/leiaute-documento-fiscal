package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "PISAliq")
public class NFeInfNFeDetImpostoPISPISAliq {

    @Element(name = "CST", required = false)
    private String CST;

    @Element(name = "vBC", required = false)
    private String vBC;

    @Element(name = "pPIS", required = false)
    private String pPIS;

    @Element(name = "vPIS", required = false)
    private String vPIS;

    public NFeInfNFeDetImpostoPISPISAliq() {}

    /**
     *
     * @param CST
     * @param vBC
     * @param pPIS
     * @param vPIS
     */
    public NFeInfNFeDetImpostoPISPISAliq(String CST, String vBC, String pPIS, String vPIS) {
        this.CST = CST;
        this.vBC = vBC;
        this.pPIS = pPIS;
        this.vPIS = vPIS;
    }

}
