package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@JsonRootName("adi")
@Root(name = "adi")
public class NFeInfNFeDetProdDIAdi {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("nadicao")
    @Element(name = "nAdicao", required = false)
    private String nAdicao;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("nseqadic")
    @Element(name = "nSeqAdic", required = false)
    private String nSeqAdic;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cfabricante")
    @Element(name = "cFabricante", required = false)
    private String cFabricante;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vdescdi")
    @Element(name = "vDescDI", required = false)
    private String vDescDI;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("ndraw")
    @Element(name = "nDraw", required = false)
    private String nDraw;

    public NFeInfNFeDetProdDIAdi() {}

    /**
     *
     * @param nAdicao
     * @param nSeqAdic
     * @param cFabricante
     * @param vDescDI
     * @param nDraw
     */
    public NFeInfNFeDetProdDIAdi(String nAdicao, String nSeqAdic, String cFabricante, String vDescDI, String nDraw) {
        this.nAdicao = nAdicao;
        this.nSeqAdic = nSeqAdic;
        this.cFabricante = cFabricante;
        this.vDescDI = vDescDI;
        this.nDraw = nDraw;
    }

	public String getnAdicao() {
		return nAdicao;
	}

	public void setnAdicao(String nAdicao) {
		this.nAdicao = nAdicao;
	}

	public String getnSeqAdic() {
		return nSeqAdic;
	}

	public void setnSeqAdic(String nSeqAdic) {
		this.nSeqAdic = nSeqAdic;
	}

	public String getcFabricante() {
		return cFabricante;
	}

	public void setcFabricante(String cFabricante) {
		this.cFabricante = cFabricante;
	}

	public String getvDescDI() {
		return vDescDI;
	}

	public void setvDescDI(String vDescDI) {
		this.vDescDI = vDescDI;
	}

	public String getnDraw() {
		return nDraw;
	}

	public void setnDraw(String nDraw) {
		this.nDraw = nDraw;
	}

}
