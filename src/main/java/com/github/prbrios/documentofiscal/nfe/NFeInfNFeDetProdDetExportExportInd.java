package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@JsonRootName("exportind")
@Data
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

}
