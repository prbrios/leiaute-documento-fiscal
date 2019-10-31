package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "forDia")
public class NFeInfNFeCanaForDia {

    @Element(name = "qtde", required = false)
    private String qtde;

    @Element(name = "dia", required = false)
    private String dia;

    public NFeInfNFeCanaForDia() {}

    /**
     *
     * @param qtde
     * @param dia
     */
    public NFeInfNFeCanaForDia(String qtde, String dia) {
        this.qtde = qtde;
        this.dia = dia;
    }

}
