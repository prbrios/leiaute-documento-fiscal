package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "autXML")
public class NFeInfNFeAutXML {

    @Element(name = "CNPJ", required = false)
    private String CNPJ;

    @Element(name = "CPF", required = false)
    private String CPF;

    public NFeInfNFeAutXML() {}

    /**
     *
     * @param CNPJ
     * @param CPF
     */
    public NFeInfNFeAutXML(String CNPJ, String CPF) {
        this.CNPJ = CNPJ;
        this.CPF = CPF;
    }

}
