package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "fat")
public class NFeInfNFeCobrFat {

    @Element(name = "nFat", required = false)
    private String nFat;

    @Element(name = "vOrig", required = false)
    private String vOrig;

    @Element(name = "vDesc", required = false)
    private String vDesc;

    @Element(name = "vLiq", required = false)
    private String vLiq;

    public NFeInfNFeCobrFat() {}

    /**
     *
     * @param nFat
     * @param vOrig
     * @param vDesc
     * @param vLiq
     */
    public NFeInfNFeCobrFat(String nFat, String vOrig, String vDesc, String vLiq) {
        this.nFat = nFat;
        this.vOrig = vOrig;
        this.vDesc = vDesc;
        this.vLiq = vLiq;
    }

}
