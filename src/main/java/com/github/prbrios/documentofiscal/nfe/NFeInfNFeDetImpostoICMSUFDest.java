package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@JsonRootName("icmsufdest")
@Data
@Root(name = "ICMSUFDest")
public class NFeInfNFeDetImpostoICMSUFDest {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vbcufdest")
    @Element(name = "vBCUFDest", required = false)
    private String vBCUFDest;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vbcfcpufdest")
    @Element(name = "vBCFCPUFDest", required = false)
    private String vBCFCPUFDest;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("pfcpufdest")
    @Element(name = "pFCPUFDest", required = false)
    private String pFCPUFDest;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("picmsufdest")
    @Element(name = "pICMSUFDest", required = false)
    private String pICMSUFDest;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("picmsinter")
    @Element(name = "pICMSInter", required = false)
    private String pICMSInter;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("picmsinterpart")
    @Element(name = "pICMSInterPart", required = false)
    private String pICMSInterPart;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vfcpufdest")
    @Element(name = "vFCPUFDest", required = false)
    private String vFCPUFDest;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vicmsufdest")
    @Element(name = "vICMSUFDest", required = false)
    private String vICMSUFDest;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vicmsufremet")
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
