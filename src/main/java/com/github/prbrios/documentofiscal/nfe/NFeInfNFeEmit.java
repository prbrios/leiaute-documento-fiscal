package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "emit")
public class NFeInfNFeEmit {

    @Element(name = "CNPJ", required = false)
    private String CNPJ;

    @Element(name = "CPF", required = false)
    private String CPF;

    @Element(name = "xNome", required = false)
    private String xNome;

    @Element(name = "xFant", required = false)
    private String xFant;

    @Element(name = "enderEmit", required = false)
    private NFeInfNFeEmitEnderEmit enderEmit;

    @Element(name = "IE", required = false)
    private String IE;

    @Element(name = "IEST", required = false)
    private String IEST;

    @Element(name = "IM", required = false)
    private String IM;

    @Element(name = "CNAE", required = false)
    private String CNAE;

    @Element(name = "CRT", required = false)
    private String CRT;

    public NFeInfNFeEmit() {}

    /**
     *
     * @param CNPJ
     * @param CPF
     * @param xNome
     * @param xFant
     * @param enderEmit
     * @param IE
     * @param IEST
     * @param IM
     * @param CNAE
     * @param CRT
     */
    public NFeInfNFeEmit(String CNPJ, String CPF, String xNome, String xFant, NFeInfNFeEmitEnderEmit enderEmit, String IE, String IEST, String IM, String CNAE, String CRT) {
        this.CNPJ = CNPJ;
        this.CPF = CPF;
        this.xNome = xNome;
        this.xFant = xFant;
        this.enderEmit = enderEmit;
        this.IE = IE;
        this.IEST = IEST;
        this.IM = IM;
        this.CNAE = CNAE;
        this.CRT = CRT;
    }

}
