package com.github.prbrios.documentofiscal.cfe.envio;

import lombok.Getter;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Grupo do Endereço do emitente
 *
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
@Root(name = "enderEmit")
public class EnderEmit {

    /**
     * SAT - Logradouro
     */
    @Getter
    @Element(name = "xLgr", required = false)
    private String xLgr;

    /**
     * SAT - Número
     */
    @Getter
    @Element(name = "nro", required = false)
    private String nro;

    /**
     * SAT - Complemento
     */
    @Getter
    @Element(name = "xCpl", required = false)
    private String xCpl;

    /**
     * SAT - Bairro
     */
    @Getter
    @Element(name = "xBairro", required = false)
    private String xBairro;

    /**
     * SAT - Município
     */
    @Getter
    @Element(name = "xMun", required = false)
    private String xMun;

    /**
     * SAT - CEP
     */
    @Getter
    @Element(name = "CEP", required = false)
    private String cep;
}
