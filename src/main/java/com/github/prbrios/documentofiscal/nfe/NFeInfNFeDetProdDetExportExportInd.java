package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@JsonRootName("exportind")
@Root(name = "exportInd")
public class NFeInfNFeDetProdDetExportExportInd {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("nre")
    @Element(name = "nRE", required = false)
    private String nRE;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("chnfe")
    @Element(name = "chNFe", required = false)
    private String chNFe;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("qexport")
    @Element(name = "qExport", required = false)
    private String qExport;

    public NFeInfNFeDetProdDetExportExportInd() {}

    /**
     *
     * @param nRE
     * @param chNFe
     * @param qExport
     */
    public NFeInfNFeDetProdDetExportExportInd(String nRE, String chNFe, String qExport) {
        this.nRE = nRE;
        this.chNFe = chNFe;
        this.qExport = qExport;
    }

	public String getnRE() {
		return nRE;
	}

	public void setnRE(String nRE) {
		this.nRE = nRE;
	}

	public String getChNFe() {
		return chNFe;
	}

	public void setChNFe(String chNFe) {
		this.chNFe = chNFe;
	}

	public String getqExport() {
		return qExport;
	}

	public void setqExport(String qExport) {
		this.qExport = qExport;
	}

}
