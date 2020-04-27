package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@JsonRootName("enderemit")
@Data
@Root(name = "enderEmit")
public class NFeInfNFeEmitEnderEmit {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("xlgr")
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

    public NFeInfNFeEmitEnderEmit() {}

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
    public NFeInfNFeEmitEnderEmit(String xLgr, String nro, String xCpl, String xBairro, String cMun, String xMun, String UF, String CEP, String cPais, String xPais, String fone) {
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
