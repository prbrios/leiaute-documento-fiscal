package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "impostoDevol")
public class NFeInfNFeDetImpostoDevol {

    @Element(name = "pDevol", required = false)
    private String pDevol;

    @Element(name = "IPI", required = false)
    private NFeInfNFeDetImpostoDevolIPI IPI;

    public NFeInfNFeDetImpostoDevol() {}

    /**
     *
     * @param pDevol
     * @param IPI
     */
    public NFeInfNFeDetImpostoDevol(String pDevol, NFeInfNFeDetImpostoDevolIPI IPI) {
        this.pDevol = pDevol;
        this.IPI = IPI;
    }

}
