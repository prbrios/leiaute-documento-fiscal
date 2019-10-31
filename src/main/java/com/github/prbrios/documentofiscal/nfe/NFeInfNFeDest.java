package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "dest")
public class NFeInfNFeDest {

    @Element(name = "CNPJ", required = false)
    private String CNPJ;

    @Element(name = "CPF", required = false)
    private String CPF;

    @Element(name = "idEstrangeiro", required = false)
    private String idEstrangeiro;

    @Element(name = "xNome", required = false)
    private String xNome;

    @Element(name = "enderDest", required = false)
    private NFeInfNFeDestEnderDest enderDest;

    @Element(name = "indIEDest", required = false)
    private String indIEDest;

    @Element(name = "IE", required = false)
    private String IE;

    @Element(name = "ISUF", required = false)
    private String ISUF;

    @Element(name = "IM", required = false)
    private String IM;

    @Element(name = "email", required = false)
    private String email;

    public NFeInfNFeDest() {}

    /**
     *
     * @param CNPJ
     * @param CPF
     * @param idEstrangeiro
     * @param xNome
     * @param enderDest
     * @param indIEDest
     * @param IE
     * @param ISUF
     * @param IM
     * @param email
     */
    public NFeInfNFeDest(String CNPJ, String CPF, String idEstrangeiro, String xNome, NFeInfNFeDestEnderDest enderDest, String indIEDest, String IE, String ISUF, String IM, String email) {
        this.CNPJ = CNPJ;
        this.CPF = CPF;
        this.idEstrangeiro = idEstrangeiro;
        this.xNome = xNome;
        this.enderDest = enderDest;
        this.indIEDest = indIEDest;
        this.IE = IE;
        this.ISUF = ISUF;
        this.IM = IM;
        this.email = email;
    }

}
