package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "lacres")
public class NFeInfNFeTranspVolLacres {

    @Element(name = "nLacre", required = false)
    private String nLacre;

    public NFeInfNFeTranspVolLacres() {}

    /**
     *
     * @param nLacre
     */
    public NFeInfNFeTranspVolLacres(String nLacre) {
        this.nLacre = nLacre;
    }

}
