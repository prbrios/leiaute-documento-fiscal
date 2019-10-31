package com.github.prbrios.documentofiscal.cfe.cancelamento;

import lombok.Data;
import lombok.Getter;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Grupo do Endereço do emitente
 *
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
@Data
@Root(name = "enderEmit")
public class CFeCancInfCFeEmitEnderEmit {

    /**
     * SAT - Logradouro
     */
    @Element(name = "xLgr", required = false)
    private String xLgr;

    /**
     * SAT - Número
     */
    @Element(name = "nro", required = false)
    private String nro;

    /**
     * SAT - Complemento
     */
    @Element(name = "xCpl", required = false)
    private String xCpl;

    /**
     * SAT - Bairro
     */
    @Element(name = "xBairro", required = false)
    private String xBairro;

    /**
     * SAT - Município
     */
    @Element(name = "xMun", required = false)
    private String xMun;

    /**
     * SAT - CEP
     */
    @Element(name = "CEP", required = false)
    private String cep;

    public CFeCancInfCFeEmitEnderEmit() {}

    /**
     *
     * @param xLgr
     * @param nro
     * @param xCpl
     * @param xBairro
     * @param xMun
     * @param cep
     */
    public CFeCancInfCFeEmitEnderEmit(String xLgr, String nro, String xCpl, String xBairro, String xMun, String cep) {
        this.xLgr = xLgr;
        this.nro = nro;
        this.xCpl = xCpl;
        this.xBairro = xBairro;
        this.xMun = xMun;
        this.cep = cep;
    }
}