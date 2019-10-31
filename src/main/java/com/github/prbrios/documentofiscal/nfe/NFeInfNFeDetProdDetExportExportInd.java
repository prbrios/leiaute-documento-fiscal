package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "exportInd")
public class NFeInfNFeDetProdDetExportExportInd {

    @Element(name = "nRE", required = false)
    private String nRE;

    @Element(name = "chNFe", required = false)
    private String chNFe;

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
