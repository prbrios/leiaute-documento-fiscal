package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@JsonRootName("entrega")
@Data
@Root(name = "entrega")
public class NFeInfNFeEntrega {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cnpj")
    @Element(name = "CNPJ", required = false)
    private String CNPJ;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cpf")
    @Element(name = "CPF", required = false)
    private String CPF;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("xnome")
    @Element(name = "xNome", required = false)
    private String xNome;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("xlogr")
    @Element(name = "xLgr", required = false)
    private String xLgr;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("nro")
    @Element(name = "nro", required = false)
    private String nro;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("xcpl")
    @Element(name = "xCpl", required = false)
    private String xCpl;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("xbairro")
    @Element(name = "xBairro", required = false)
    private String xBairro;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cmun")
    @Element(name = "cMun", required = false)
    private String cMun;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("xmun")
    @Element(name = "xMun", required = false)
    private String xMun;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("uf")
    @Element(name = "UF", required = false)
    private String UF;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cep")
    @Element(name = "CEP", required = false)
    private String CEP;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cpais")
    @Element(name = "cPais", required = false)
    private String cPais;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("xpais")
    @Element(name = "xPais", required = false)
    private String xPais;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("fone")
    @Element(name = "fone", required = false)
    private String fone;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("email")
    @Element(name = "email", required = false)
    private String email;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("ie")
    @Element(name = "IE", required = false)
    private String IE;

    public NFeInfNFeEntrega() {}

    /**
     *
     * @param CNPJ
     * @param CPF
     * @param xNome
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
     * @param email
     * @param IE
     */
    public NFeInfNFeEntrega(String CNPJ, String CPF, String xNome, String xLgr, String nro, String xCpl, String xBairro, String cMun, String xMun, String UF, String CEP, String cPais, String xPais, String fone, String email, String IE) {
        this.CNPJ = CNPJ;
        this.CPF = CPF;
        this.xNome = xNome;
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
        this.email = email;
        this.IE = IE;
    }

}
