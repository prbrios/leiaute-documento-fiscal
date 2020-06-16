package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@JsonRootName("icmsufdest")
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

	public String getvBCUFDest() {
		return vBCUFDest;
	}

	public void setvBCUFDest(String vBCUFDest) {
		this.vBCUFDest = vBCUFDest;
	}

	public String getvBCFCPUFDest() {
		return vBCFCPUFDest;
	}

	public void setvBCFCPUFDest(String vBCFCPUFDest) {
		this.vBCFCPUFDest = vBCFCPUFDest;
	}

	public String getpFCPUFDest() {
		return pFCPUFDest;
	}

	public void setpFCPUFDest(String pFCPUFDest) {
		this.pFCPUFDest = pFCPUFDest;
	}

	public String getpICMSUFDest() {
		return pICMSUFDest;
	}

	public void setpICMSUFDest(String pICMSUFDest) {
		this.pICMSUFDest = pICMSUFDest;
	}

	public String getpICMSInter() {
		return pICMSInter;
	}

	public void setpICMSInter(String pICMSInter) {
		this.pICMSInter = pICMSInter;
	}

	public String getpICMSInterPart() {
		return pICMSInterPart;
	}

	public void setpICMSInterPart(String pICMSInterPart) {
		this.pICMSInterPart = pICMSInterPart;
	}

	public String getvFCPUFDest() {
		return vFCPUFDest;
	}

	public void setvFCPUFDest(String vFCPUFDest) {
		this.vFCPUFDest = vFCPUFDest;
	}

	public String getvICMSUFDest() {
		return vICMSUFDest;
	}

	public void setvICMSUFDest(String vICMSUFDest) {
		this.vICMSUFDest = vICMSUFDest;
	}

	public String getvICMSUFRemet() {
		return vICMSUFRemet;
	}

	public void setvICMSUFRemet(String vICMSUFRemet) {
		this.vICMSUFRemet = vICMSUFRemet;
	}

}
