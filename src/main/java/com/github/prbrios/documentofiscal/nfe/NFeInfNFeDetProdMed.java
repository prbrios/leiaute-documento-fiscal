package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@JsonRootName("med")
@Data
@Root(name = "med")
public class NFeInfNFeDetProdMed {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cprodanvisa")
    @Element(name = "cProdANVISA", required = false)
    private String cProdANVISA;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("xmotivoisencao")
    @Element(name = "xMotivoIsencao", required = false)
    private String xMotivoIsencao;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vpmc")
    @Element(name = "vPMC", required = false)
    private String vPMC;

    public NFeInfNFeDetProdMed() {}

    /**
     *
     * @param cProdANVISA
     * @param xMotivoIsencao
     * @param vPMC
     */
    public NFeInfNFeDetProdMed(String cProdANVISA, String xMotivoIsencao, String vPMC) {
        this.cProdANVISA = cProdANVISA;
        this.xMotivoIsencao = xMotivoIsencao;
        this.vPMC = vPMC;
    }

}
