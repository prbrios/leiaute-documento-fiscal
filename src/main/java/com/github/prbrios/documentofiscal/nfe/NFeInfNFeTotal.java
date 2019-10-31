package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "total")
public class NFeInfNFeTotal {

    @Element(name = "ICMSTot", required = false)
    private NFeInfNFeTotalICMSTot ICMSTot;

    @Element(name = "ISSQNtot", required = false)
    private NFeInfNFeTotalISSQNtot ISSQNtot;

    @Element(name = "retTrib", required = false)
    private NFeInfNFeTotalRetTrib retTrib;

    public NFeInfNFeTotal() {}

    /**
     *
     * @param ICMSTot
     * @param ISSQNtot
     * @param retTrib
     */
    public NFeInfNFeTotal(NFeInfNFeTotalICMSTot ICMSTot, NFeInfNFeTotalISSQNtot ISSQNtot, NFeInfNFeTotalRetTrib retTrib) {
        this.ICMSTot = ICMSTot;
        this.ISSQNtot = ISSQNtot;
        this.retTrib = retTrib;
    }

}
