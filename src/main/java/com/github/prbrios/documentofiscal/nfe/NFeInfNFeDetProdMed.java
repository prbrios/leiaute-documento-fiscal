package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "med")
public class NFeInfNFeDetProdMed {

    @Element(name = "cProdANVISA", required = false)
    private String cProdANVISA;

    @Element(name = "xMotivoIsencao", required = false)
    private String xMotivoIsencao;

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
