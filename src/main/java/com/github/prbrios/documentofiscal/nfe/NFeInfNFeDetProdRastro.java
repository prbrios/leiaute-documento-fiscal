package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@JsonRootName("rastro")
@Root(name = "rastro")
public class NFeInfNFeDetProdRastro {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("nlote")
    @Element(name = "nLote", required = false)
    private String nLote;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("qlote")
    @Element(name = "qLote", required = false)
    private String qLote;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("dfab")
    @Element(name = "dFab", required = false)
    private String dFab;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("dval")
    @Element(name = "dVal", required = false)
    private String dVal;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cagreg")
    @Element(name = "cAgreg", required = false)
    private String cAgreg;

    public NFeInfNFeDetProdRastro() {}

    /**
     *
     * @param nLote
     * @param qLote
     * @param dFab
     * @param dVal
     * @param cAgreg
     */
    public NFeInfNFeDetProdRastro(String nLote, String qLote, String dFab, String dVal, String cAgreg) {
        this.nLote = nLote;
        this.qLote = qLote;
        this.dFab = dFab;
        this.dVal = dVal;
        this.cAgreg = cAgreg;
    }

	public String getnLote() {
		return nLote;
	}

	public void setnLote(String nLote) {
		this.nLote = nLote;
	}

	public String getqLote() {
		return qLote;
	}

	public void setqLote(String qLote) {
		this.qLote = qLote;
	}

	public String getdFab() {
		return dFab;
	}

	public void setdFab(String dFab) {
		this.dFab = dFab;
	}

	public String getdVal() {
		return dVal;
	}

	public void setdVal(String dVal) {
		this.dVal = dVal;
	}

	public String getcAgreg() {
		return cAgreg;
	}

	public void setcAgreg(String cAgreg) {
		this.cAgreg = cAgreg;
	}

}
