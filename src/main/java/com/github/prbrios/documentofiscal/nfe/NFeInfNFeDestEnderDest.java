package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "enderDest")
public class NFeInfNFeDestEnderDest {

    @Element(name = "xLgr", required = false)
    private String xLgr;

    @Element(name = "nro", required = false)
    private String nro;

    @Element(name = "xCpl", required = false)
    private String xCpl;

    @Element(name = "xBairro", required = false)
    private String xBairro;

    @Element(name = "cMun", required = false)
    private String cMun;

    @Element(name = "xMun", required = false)
    private String xMun;

    @Element(name = "UF", required = false)
    private String UF;

    @Element(name = "CEP", required = false)
    private String CEP;

    @Element(name = "cPais", required = false)
    private String cPais;

    @Element(name = "xPais", required = false)
    private String xPais;

    @Element(name = "fone", required = false)
    private String fone;

    public NFeInfNFeDestEnderDest() {}

    /**
     *
     * @param xLgr
     * @param nro
     * @param xCpl
     * @param xBairro
     * @param cMun
     * @param xMun
     * @param UF
     * @param CEP
     * @param cPais
     * @param xPais
     * @param fone
     */
    public NFeInfNFeDestEnderDest(String xLgr, String nro, String xCpl, String xBairro, String cMun, String xMun, String UF, String CEP, String cPais, String xPais, String fone) {
        this.xLgr = xLgr;
        this.nro = nro;
        this.xCpl = xCpl;
        this.xBairro = xBairro;
        this.cMun = cMun;
        this.xMun = xMun;
        this.UF = UF;
        this.CEP = CEP;
        this.cPais = cPais;
        this.xPais = xPais;
        this.fone = fone;
    }

}
