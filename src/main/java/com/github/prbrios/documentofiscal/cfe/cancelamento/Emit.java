package com.github.prbrios.documentofiscal.cfe.cancelamento;

import lombok.Getter;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Grupo de identificação do emitente do CF-e
 *
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
@Root(name = "emit")
public class Emit {

    /**
     * SAT - Informar o CNPJ do emitente, com os zeros n\u00e3o significativos
     */
    @Getter
    @Element(name = "CNPJ", required = false)
    private String cnpj;

    /**
     * SAT - Raz\u00e3o social do emitente
     */
    @Getter
    @Element(name = "xNome", required = false)
    private String xNome;

    /**
     * SAT - Nome fantasia
     */
    @Getter
    @Element(name = "xFant", required = false)
    private String xFant;

    /**
     * SAT - Grupo do Endereço do emitente
     */
    @Getter
    @Element(name = "enderEmit", required = false)
    private EnderEmit enderEmit;

    /**
     * SAT - Inscrição Estadual
     */
    @Getter
    @Element(name = "IE", required = false)
    private String ie;

    /**
     * SAT - Inscrição Municipal
     */
    @Getter
    @Element(name = "IM", required = false)
    private String im;

}
