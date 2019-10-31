package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "obsFisco")
public class NFeInfNFeInfAdicObsFisco {

    @Element(name = "xTexto", required = false)
    private String xTexto;

    @Element(name = "xCampo", required = false)
    private String xCampo;

    public NFeInfNFeInfAdicObsFisco() {}

    /**
     *
     * @param xTexto
     * @param xCampo
     */
    public NFeInfNFeInfAdicObsFisco(String xTexto, String xCampo) {
        this.xTexto = xTexto;
        this.xCampo = xCampo;
    }

}
