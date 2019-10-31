package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "retTrib")
public class NFeInfNFeTotalRetTrib {

    @Element(name = "vRetPIS", required = false)
    private String vRetPIS;

    @Element(name = "vRetCOFINS", required = false)
    private String vRetCOFINS;

    @Element(name = "vRetCSLL", required = false)
    private String vRetCSLL;

    @Element(name = "vBCIRRF", required = false)
    private String vBCIRRF;

    @Element(name = "vIRRF", required = false)
    private String vIRRF;

    @Element(name = "vBCRetPrev", required = false)
    private String vBCRetPrev;

    @Element(name = "vRetPrev", required = false)
    private String vRetPrev;

    public NFeInfNFeTotalRetTrib() {}

    /**
     *
     * @param vRetPIS
     * @param vRetCOFINS
     * @param vRetCSLL
     * @param vBCIRRF
     * @param vIRRF
     * @param vBCRetPrev
     * @param vRetPrev
     */
    public NFeInfNFeTotalRetTrib(String vRetPIS, String vRetCOFINS, String vRetCSLL, String vBCIRRF, String vIRRF, String vBCRetPrev, String vRetPrev) {
        this.vRetPIS = vRetPIS;
        this.vRetCOFINS = vRetCOFINS;
        this.vRetCSLL = vRetCSLL;
        this.vBCIRRF = vBCIRRF;
        this.vIRRF = vIRRF;
        this.vBCRetPrev = vBCRetPrev;
        this.vRetPrev = vRetPrev;
    }

}
