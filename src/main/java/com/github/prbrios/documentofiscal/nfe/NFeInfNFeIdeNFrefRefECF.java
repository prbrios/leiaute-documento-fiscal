package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@JsonRootName("refecf")
@Root(name = "refECF")
public class NFeInfNFeIdeNFrefRefECF {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("mod")
    @Element(name = "mod", required = false)
    private String mod;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("necf")
    @Element(name = "nECF", required = false)
    private String nECF;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("ncoo")
    @Element(name = "nCOO", required = false)
    private String nCOO;

    public NFeInfNFeIdeNFrefRefECF() {}

    /**
     *
     * @param mod
     * @param nECF
     * @param nCOO
     */
    public NFeInfNFeIdeNFrefRefECF(String mod, String nECF, String nCOO) {
        this.mod = mod;
        this.nECF = nECF;
        this.nCOO = nCOO;
    }

	public String getMod() {
		return mod;
	}

	public void setMod(String mod) {
		this.mod = mod;
	}

	public String getnECF() {
		return nECF;
	}

	public void setnECF(String nECF) {
		this.nECF = nECF;
	}

	public String getnCOO() {
		return nCOO;
	}

	public void setnCOO(String nCOO) {
		this.nCOO = nCOO;
	}

}
