package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@JsonRootName("rettransp")
@Data
@Root(name = "retTransp")
public class NFeInfNFeTranspRetTransp {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vserv")
    @Element(name = "vServ", required = false)
    private String vServ;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vbcret")
    @Element(name = "vBCRet", required = false)
    private String vBCRet;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("picmsret")
    @Element(name = "pICMSRet", required = false)
    private String pICMSRet;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vicmsret")
    @Element(name = "vICMSRet", required = false)
    private String vICMSRet;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cfop")
    @Element(name = "CFOP", required = false)
    private String CFOP;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cmunfg")
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
