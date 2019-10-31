package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "compra")
public class NFeInfNFeCompra {

    @Element(name = "xNEmp", required = false)
    private String xNEmp;

    @Element(name = "xPed", required = false)
    private String xPed;

    @Element(name = "xCont", required = false)
    private String xCont;

    public NFeInfNFeCompra() {}

    /**
     *
     * @param xNEmp
     * @param xPed
     * @param xCont
     */
    public NFeInfNFeCompra(String xNEmp, String xPed, String xCont) {
        this.xNEmp = xNEmp;
        this.xPed = xPed;
        this.xCont = xCont;
    }

}
