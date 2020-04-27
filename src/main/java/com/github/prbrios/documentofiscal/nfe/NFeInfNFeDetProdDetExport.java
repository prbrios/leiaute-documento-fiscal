package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@JsonRootName("detexport")
@Data
@Root(name = "detExport")
public class NFeInfNFeDetProdDetExport {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("ndraw")
    @Element(name = "nDraw", required = false)
    private String nDraw;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("exportind")
    @Element(name = "exportInd", required = false)
    private NFeInfNFeDetProdDetExportExportInd exportInd;

    public NFeInfNFeDetProdDetExport() {}

    /**
     *
     * @param nDraw
     * @param exportInd
     */
    public NFeInfNFeDetProdDetExport(String nDraw, NFeInfNFeDetProdDetExportExportInd exportInd) {
        this.nDraw = nDraw;
        this.exportInd = exportInd;
    }

}
