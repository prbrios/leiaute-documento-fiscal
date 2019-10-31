package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "infRespTec")
public class NFeInfNFeInfRespTec {

    @Element(name = "CNPJ", required = false)
    private String CNPJ;

    @Element(name = "xContato", required = false)
    private String xContato;

    @Element(name = "email", required = false)
    private String email;

    @Element(name = "fone", required = false)
    private String fone;

    @Element(name = "idCSRT", required = false)
    private String idCSRT;

    @Element(name = "hashCSRT", required = false)
    private String hashCSRT;

    public NFeInfNFeInfRespTec() {}

    /**
     *
     * @param CNPJ
     * @param xContato
     * @param email
     * @param fone
     * @param idCSRT
     * @param hashCSRT
     */
    public NFeInfNFeInfRespTec(String CNPJ, String xContato, String email, String fone, String idCSRT, String hashCSRT) {
        this.CNPJ = CNPJ;
        this.xContato = xContato;
        this.email = email;
        this.fone = fone;
        this.idCSRT = idCSRT;
        this.hashCSRT = hashCSRT;
    }

}
