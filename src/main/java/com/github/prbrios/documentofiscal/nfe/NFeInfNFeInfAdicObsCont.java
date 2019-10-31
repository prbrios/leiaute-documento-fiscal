package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "obsCont")
public class NFeInfNFeInfAdicObsCont {

    @Element(name = "xTexto", required = false)
    private String xTexto;

    @Element(name = "xCampo", required = false)
    private String xCampo;

    public NFeInfNFeInfAdicObsCont() {}

    /**
     *
     * @param xTexto
     * @param xCampo
     */
    public NFeInfNFeInfAdicObsCont(String xTexto, String xCampo) {
        this.xTexto = xTexto;
        this.xCampo = xCampo;
    }

}
