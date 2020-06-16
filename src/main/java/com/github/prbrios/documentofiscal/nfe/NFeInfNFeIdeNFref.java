package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@JsonRootName("nfref")
@Root(name = "NFref")
public class NFeInfNFeIdeNFref {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("refnfe")
    @Element(name = "refNFe", required = false)
    private String refNFe;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("refnf")
    @Element(name = "refNF", required = false)
    private NFeInfNFeIdeNFrefRefNF refNF;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("refnfp")
    @Element(name = "refNFP", required = false)
    private NFeInfNFeIdeNFrefRefNFP refNFP;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("refcte")
    @Element(name = "refCTe", required = false)
    private String refCTe;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("refecf")
    @Element(name = "refECF", required = false)
    private NFeInfNFeIdeNFrefRefECF refECF;

    public NFeInfNFeIdeNFref() {}

    /**
     *
     * @param refNFe
     * @param refNF
     * @param refNFP
     * @param refCTe
     * @param refECF
     */
    public NFeInfNFeIdeNFref(String refNFe, NFeInfNFeIdeNFrefRefNF refNF, NFeInfNFeIdeNFrefRefNFP refNFP, String refCTe, NFeInfNFeIdeNFrefRefECF refECF) {
        this.refNFe = refNFe;
        this.refNF = refNF;
        this.refNFP = refNFP;
        this.refCTe = refCTe;
        this.refECF = refECF;
    }

	public String getRefNFe() {
		return refNFe;
	}

	public void setRefNFe(String refNFe) {
		this.refNFe = refNFe;
	}

	public NFeInfNFeIdeNFrefRefNF getRefNF() {
		return refNF;
	}

	public void setRefNF(NFeInfNFeIdeNFrefRefNF refNF) {
		this.refNF = refNF;
	}

	public NFeInfNFeIdeNFrefRefNFP getRefNFP() {
		return refNFP;
	}

	public void setRefNFP(NFeInfNFeIdeNFrefRefNFP refNFP) {
		this.refNFP = refNFP;
	}

	public String getRefCTe() {
		return refCTe;
	}

	public void setRefCTe(String refCTe) {
		this.refCTe = refCTe;
	}

	public NFeInfNFeIdeNFrefRefECF getRefECF() {
		return refECF;
	}

	public void setRefECF(NFeInfNFeIdeNFrefRefECF refECF) {
		this.refECF = refECF;
	}

}
