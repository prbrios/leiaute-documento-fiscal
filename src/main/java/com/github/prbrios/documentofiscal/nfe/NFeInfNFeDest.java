package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@JsonRootName("dest")
@Data
@Root(name = "dest")
public class NFeInfNFeDest {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cnpj")
    @Element(name = "CNPJ", required = false)
    private String CNPJ;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cpf")
    @Element(name = "CPF", required = false)
    private String CPF;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("idestrangeiro")
    @Element(name = "idEstrangeiro", required = false)
    private String idEstrangeiro;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("xnome")
    @Element(name = "xNome", required = false)
    private String xNome;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("enderdest")
    @Element(name = "enderDest", required = false)
    private NFeInfNFeDestEnderDest enderDest;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("indiedest")
    @Element(name = "indIEDest", required = false)
    private String indIEDest;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("ie")
    @Element(name = "IE", required = false)
    private String IE;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("isuf")
    @Element(name = "ISUF", required = false)
    private String ISUF;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("im")
    @Element(name = "IM", required = false)
    private String IM;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("email")
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
