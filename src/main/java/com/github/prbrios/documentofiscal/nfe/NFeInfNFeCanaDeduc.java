package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "deduc")
public class NFeInfNFeCanaDeduc {

    @Element(name = "xDed", required = false)
    private String xDed;

    @Element(name = "vDed", required = false)
    private String vDed;

    public NFeInfNFeCanaDeduc() {}

    /**
     *
     * @param xDed
     * @param vDed
     */
    public NFeInfNFeCanaDeduc(String xDed, String vDed) {
        this.xDed = xDed;
        this.vDed = vDed;
    }

}
