package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "procRef")
public class NFeInfNFeInfAdicProcRef {

    @Element(name = "nProc", required = false)
    private String nProc;

    @Element(name = "indProc", required = false)
    private String indProc;

    public NFeInfNFeInfAdicProcRef() {}

    /**
     *
     * @param nProc
     * @param indProc
     */
    public NFeInfNFeInfAdicProcRef(String nProc, String indProc) {
        this.nProc = nProc;
        this.indProc = indProc;
    }

}
