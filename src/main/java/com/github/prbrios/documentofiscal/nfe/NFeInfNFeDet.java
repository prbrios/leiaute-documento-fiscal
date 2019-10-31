package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "det")
public class NFeInfNFeDet {

    @Attribute(name = "nItem", required = false)
    private String nItem;

    @Element(name = "prod", required = false)
    private NFeInfNFeDetProd prod;

    @Element(name = "imposto", required = false)
    private NFeInfNFeDetImposto imposto;

    @Element(name = "impostoDevol", required = false)
    private NFeInfNFeDetImpostoDevol impostoDevol;

    @Element(name = "infAdProd", required = false)
    private String infAdProd;

    public NFeInfNFeDet() {}

    /**
     *
     * @param nItem
     * @param prod
     * @param imposto
     * @param impostoDevol
     * @param infAdProd
     */
    public NFeInfNFeDet(String nItem, NFeInfNFeDetProd prod, NFeInfNFeDetImposto imposto, NFeInfNFeDetImpostoDevol impostoDevol, String infAdProd) {
        this.nItem = nItem;
        this.prod = prod;
        this.imposto = imposto;
        this.impostoDevol = impostoDevol;
        this.infAdProd = infAdProd;
    }

}
