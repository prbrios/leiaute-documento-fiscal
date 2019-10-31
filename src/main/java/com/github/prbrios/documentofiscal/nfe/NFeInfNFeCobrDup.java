package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "dup")
public class NFeInfNFeCobrDup {

    @Element(name = "nDup", required = false)
    private String nDup;

    @Element(name = "dVenc", required = false)
    private String dVenc;

    @Element(name = "vDup", required = false)
    private String vDup;

    public NFeInfNFeCobrDup() {}

    /**
     *
     * @param nDup
     * @param dVenc
     * @param vDup
     */
    public NFeInfNFeCobrDup(String nDup, String dVenc, String vDup) {
        this.nDup = nDup;
        this.dVenc = dVenc;
        this.vDup = vDup;
    }

}
