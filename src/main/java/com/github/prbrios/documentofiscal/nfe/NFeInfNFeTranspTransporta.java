package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "transporta")
public class NFeInfNFeTranspTransporta {

    @Element(name = "CNPJ", required = false)
    private String CNPJ;

    @Element(name = "CPF", required = false)
    private String CPF;

    @Element(name = "xNome", required = false)
    private String xNome;

    @Element(name = "IE", required = false)
    private String IE;

    @Element(name = "xEnder", required = false)
    private String xEnder;

    @Element(name = "xMun", required = false)
    private String xMun;

    @Element(name = "UF", required = false)
    private String UF;

    public NFeInfNFeTranspTransporta() {}

    /**
     *
     * @param CNPJ
     * @param CPF
     * @param xNome
     * @param IE
     * @param xEnder
     * @param xMun
     * @param UF
     */
    public NFeInfNFeTranspTransporta(String CNPJ, String CPF, String xNome, String IE, String xEnder, String xMun, String UF) {
        this.CNPJ = CNPJ;
        this.CPF = CPF;
        this.xNome = xNome;
        this.IE = IE;
        this.xEnder = xEnder;
        this.xMun = xMun;
        this.UF = UF;
    }

}
