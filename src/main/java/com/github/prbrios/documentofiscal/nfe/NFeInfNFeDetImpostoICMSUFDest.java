package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "ICMSUFDest")
public class NFeInfNFeDetImpostoICMSUFDest {

    @Element(name = "vBCUFDest", required = false)
    private String vBCUFDest;

    @Element(name = "vBCFCPUFDest", required = false)
    private String vBCFCPUFDest;

    @Element(name = "pFCPUFDest", required = false)
    private String pFCPUFDest;

    @Element(name = "pICMSUFDest", required = false)
    private String pICMSUFDest;

    @Element(name = "pICMSInter", required = false)
    private String pICMSInter;

    @Element(name = "pICMSInterPart", required = false)
    private String pICMSInterPart;

    @Element(name = "vFCPUFDest", required = false)
    private String vFCPUFDest;

    @Element(name = "vICMSUFDest", required = false)
    private String vICMSUFDest;

    @Element(name = "vICMSUFRemet", required = false)
    private String vICMSUFRemet;

    public NFeInfNFeDetImpostoICMSUFDest() {}

    /**
     *
     * @param vBCUFDest
     * @param vBCFCPUFDest
     * @param pFCPUFDest
     * @param pICMSUFDest
     * @param pICMSInter
     * @param pICMSInterPart
     * @param vFCPUFDest
     * @param vICMSUFDest
     * @param vICMSUFRemet
     */
    public NFeInfNFeDetImpostoICMSUFDest(String vBCUFDest, String vBCFCPUFDest, String pFCPUFDest, String pICMSUFDest, String pICMSInter, String pICMSInterPart, String vFCPUFDest, String vICMSUFDest, String vICMSUFRemet) {
        this.vBCUFDest = vBCUFDest;
        this.vBCFCPUFDest = vBCFCPUFDest;
        this.pFCPUFDest = pFCPUFDest;
        this.pICMSUFDest = pICMSUFDest;
        this.pICMSInter = pICMSInter;
        this.pICMSInterPart = pICMSInterPart;
        this.vFCPUFDest = vFCPUFDest;
        this.vICMSUFDest = vICMSUFDest;
        this.vICMSUFRemet = vICMSUFRemet;
    }

}
