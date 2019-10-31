package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "COFINSNT")
public class NFeInfNFeDetImpostoCOFINSCOFINSNT {

    @Element(name = "CST", required = false)
    private String CST;

    public NFeInfNFeDetImpostoCOFINSCOFINSNT() {}

    /**
     *
     * @param CST
     */
    public NFeInfNFeDetImpostoCOFINSCOFINSNT(String CST) {
        this.CST = CST;
    }

}
