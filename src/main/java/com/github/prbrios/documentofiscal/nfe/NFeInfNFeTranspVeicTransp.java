package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "veicTransp")
public class NFeInfNFeTranspVeicTransp {

    @Element(name = "placa", required = false)
    private String placa;

    @Element(name = "UF", required = false)
    private String UF;

    @Element(name = "RNTC", required = false)
    private String RNTC;

    public NFeInfNFeTranspVeicTransp() {}

    /**
     *
     * @param placa
     * @param UF
     * @param RNTC
     */
    public NFeInfNFeTranspVeicTransp(String placa, String UF, String RNTC) {
        this.placa = placa;
        this.UF = UF;
        this.RNTC = RNTC;
    }

}
