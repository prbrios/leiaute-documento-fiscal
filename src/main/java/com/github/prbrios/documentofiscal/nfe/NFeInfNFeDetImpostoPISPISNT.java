package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "PISNT")
public class NFeInfNFeDetImpostoPISPISNT {

    @Element(name = "CST", required = false)
    private String CST;

    public NFeInfNFeDetImpostoPISPISNT() {}

    /**
     *
     * @param CST
     */
    public NFeInfNFeDetImpostoPISPISNT(String CST) {
        this.CST = CST;
    }

}
