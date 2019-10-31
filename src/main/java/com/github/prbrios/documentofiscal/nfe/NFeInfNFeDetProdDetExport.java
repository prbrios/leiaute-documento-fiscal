package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "detExport")
public class NFeInfNFeDetProdDetExport {

    @Element(name = "nDraw", required = false)
    private String nDraw;

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
