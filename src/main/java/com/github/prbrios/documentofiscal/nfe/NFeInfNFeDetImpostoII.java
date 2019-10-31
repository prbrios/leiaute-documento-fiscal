package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "II")
public class NFeInfNFeDetImpostoII {

    @Element(name = "vBC", required = false)
    private String vBC;

    @Element(name = "vDespAdu", required = false)
    private String vDespAdu;

    @Element(name = "vII", required = false)
    private String vII;

    @Element(name = "vIOF", required = false)
    private String vIOF;

    public NFeInfNFeDetImpostoII() {}

    /**
     *
     * @param vBC
     * @param vDespAdu
     * @param vII
     * @param vIOF
     */
    public NFeInfNFeDetImpostoII(String vBC, String vDespAdu, String vII, String vIOF) {
        this.vBC = vBC;
        this.vDespAdu = vDespAdu;
        this.vII = vII;
        this.vIOF = vIOF;
    }

}
