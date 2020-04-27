package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@JsonRootName("adi")
@Data
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

}
