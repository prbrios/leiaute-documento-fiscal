package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "infNFeSupl")
public class NFeInfNFeSupl {

    @Element(name = "qrCode", required = false)
    private String qrCode;

    @Element(name = "urlChave", required = false)
    private String urlChave;

    public NFeInfNFeSupl() {}

    /**
     *
     * @param qrCode
     * @param urlChave
     */
    public NFeInfNFeSupl(String qrCode, String urlChave) {
        this.qrCode = qrCode;
        this.urlChave = urlChave;
    }

}
