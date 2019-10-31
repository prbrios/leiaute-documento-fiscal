package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "IPINT")
public class NFeInfNFeDetImpostoIPIIPINT {

    @Element(name = "CST", required = false)
    private String CST;

    public NFeInfNFeDetImpostoIPIIPINT() {}

    /**
     *
     * @param CST
     */
    public NFeInfNFeDetImpostoIPIIPINT(String CST) {
        this.CST = CST;
    }

}
