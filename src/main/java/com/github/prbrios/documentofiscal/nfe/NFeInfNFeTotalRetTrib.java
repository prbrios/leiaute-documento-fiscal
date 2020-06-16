package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@JsonRootName("rettrib")
@Root(name = "retTrib")
public class NFeInfNFeTotalRetTrib {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vretpis")
    @Element(name = "vRetPIS", required = false)
    private String vRetPIS;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vretcofins")
    @Element(name = "vRetCOFINS", required = false)
    private String vRetCOFINS;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vretcsll")
    @Element(name = "vRetCSLL", required = false)
    private String vRetCSLL;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vbcirrf")
    @Element(name = "vBCIRRF", required = false)
    private String vBCIRRF;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("virrf")
    @Element(name = "vIRRF", required = false)
    private String vIRRF;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vbcretprev")
    @Element(name = "vBCRetPrev", required = false)
    private String vBCRetPrev;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vretprev")
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

	public String getvRetPIS() {
		return vRetPIS;
	}

	public void setvRetPIS(String vRetPIS) {
		this.vRetPIS = vRetPIS;
	}

	public String getvRetCOFINS() {
		return vRetCOFINS;
	}

	public void setvRetCOFINS(String vRetCOFINS) {
		this.vRetCOFINS = vRetCOFINS;
	}

	public String getvRetCSLL() {
		return vRetCSLL;
	}

	public void setvRetCSLL(String vRetCSLL) {
		this.vRetCSLL = vRetCSLL;
	}

	public String getvBCIRRF() {
		return vBCIRRF;
	}

	public void setvBCIRRF(String vBCIRRF) {
		this.vBCIRRF = vBCIRRF;
	}

	public String getvIRRF() {
		return vIRRF;
	}

	public void setvIRRF(String vIRRF) {
		this.vIRRF = vIRRF;
	}

	public String getvBCRetPrev() {
		return vBCRetPrev;
	}

	public void setvBCRetPrev(String vBCRetPrev) {
		this.vBCRetPrev = vBCRetPrev;
	}

	public String getvRetPrev() {
		return vRetPrev;
	}

	public void setvRetPrev(String vRetPrev) {
		this.vRetPrev = vRetPrev;
	}

}
