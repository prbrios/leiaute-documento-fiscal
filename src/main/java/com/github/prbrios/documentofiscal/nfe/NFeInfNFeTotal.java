package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@JsonRootName("total")
@Root(name = "total")
public class NFeInfNFeTotal {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("icmstot")
    @Element(name = "ICMSTot", required = false)
    private NFeInfNFeTotalICMSTot ICMSTot;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("issqntot")
    @Element(name = "ISSQNtot", required = false)
    private NFeInfNFeTotalISSQNtot ISSQNtot;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("rettrib")
    @Element(name = "retTrib", required = false)
    private NFeInfNFeTotalRetTrib retTrib;

    public NFeInfNFeTotal() {}

    /**
     *
     * @param ICMSTot
     * @param ISSQNtot
     * @param retTrib
     */
    public NFeInfNFeTotal(NFeInfNFeTotalICMSTot ICMSTot, NFeInfNFeTotalISSQNtot ISSQNtot, NFeInfNFeTotalRetTrib retTrib) {
        this.ICMSTot = ICMSTot;
        this.ISSQNtot = ISSQNtot;
        this.retTrib = retTrib;
    }

	public NFeInfNFeTotalICMSTot getICMSTot() {
		return ICMSTot;
	}

	public void setICMSTot(NFeInfNFeTotalICMSTot iCMSTot) {
		ICMSTot = iCMSTot;
	}

	public NFeInfNFeTotalISSQNtot getISSQNtot() {
		return ISSQNtot;
	}

	public void setISSQNtot(NFeInfNFeTotalISSQNtot iSSQNtot) {
		ISSQNtot = iSSQNtot;
	}

	public NFeInfNFeTotalRetTrib getRetTrib() {
		return retTrib;
	}

	public void setRetTrib(NFeInfNFeTotalRetTrib retTrib) {
		this.retTrib = retTrib;
	}

}
