package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "retTransp")
public class NFeInfNFeTranspRetTransp {

    @Element(name = "vServ", required = false)
    private String vServ;

    @Element(name = "vBCRet", required = false)
    private String vBCRet;

    @Element(name = "pICMSRet", required = false)
    private String pICMSRet;

    @Element(name = "vICMSRet", required = false)
    private String vICMSRet;

    @Element(name = "CFOP", required = false)
    private String CFOP;

    @Element(name = "cMunFG", required = false)
    private String cMunFG;

    public NFeInfNFeTranspRetTransp() {}

    /**
     *
     * @param vServ
     * @param vBCRet
     * @param pICMSRet
     * @param vICMSRet
     * @param CFOP
     * @param cMunFG
     */
    public NFeInfNFeTranspRetTransp(String vServ, String vBCRet, String pICMSRet, String vICMSRet, String CFOP, String cMunFG) {
        this.vServ = vServ;
        this.vBCRet = vBCRet;
        this.pICMSRet = pICMSRet;
        this.vICMSRet = vICMSRet;
        this.CFOP = CFOP;
        this.cMunFG = cMunFG;
    }

}
