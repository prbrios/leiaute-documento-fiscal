package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "IPI")
public class NFeInfNFeDetImpostoDevolIPI {

    @Element(name = "vIPIDevol", required = false)
    private String vIPIDevol;

    public NFeInfNFeDetImpostoDevolIPI() {}

    /**
     *
     * @param vIPIDevol
     */
    public NFeInfNFeDetImpostoDevolIPI(String vIPIDevol) {
        this.vIPIDevol = vIPIDevol;
    }

}
