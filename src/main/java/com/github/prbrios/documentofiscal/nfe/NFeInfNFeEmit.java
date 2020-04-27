package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@JsonRootName("emit")
@Data
@Root(name = "emit")
public class NFeInfNFeEmit {

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
    @JsonProperty("xfant")
    @Element(name = "xFant", required = false)
    private String xFant;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("enderemit")
    @Element(name = "enderEmit", required = false)
    private NFeInfNFeEmitEnderEmit enderEmit;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("ie")
    @Element(name = "IE", required = false)
    private String IE;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("iest")
    @Element(name = "IEST", required = false)
    private String IEST;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("im")
    @Element(name = "IM", required = false)
    private String IM;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cnae")
    @Element(name = "CNAE", required = false)
    private String CNAE;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("crt")
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
