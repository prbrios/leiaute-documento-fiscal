package com.github.prbrios.documentofiscal.cfe.cancelamento;

import lombok.Data;
import lombok.Getter;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Grupo de identificação do emitente do CF-e
 *
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
@Data
@Root(name = "emit")
public class CFeCancInfCFeEmit {

    /**
     * SAT - Informar o CNPJ do emitente, com os zeros n\u00e3o significativos
     */
    @Element(name = "CNPJ", required = false)
    private String cnpj;

    /**
     * SAT - Raz\u00e3o social do emitente
     */
    @Element(name = "xNome", required = false)
    private String xNome;

    /**
     * SAT - Nome fantasia
     */
    @Element(name = "xFant", required = false)
    private String xFant;

    /**
     * SAT - Grupo do Endereço do emitente
     */
    @Element(name = "enderEmit", required = false)
    private CFeCancInfCFeEmitEnderEmit enderEmit;

    /**
     * SAT - Inscrição Estadual
     */
    @Element(name = "IE", required = false)
    private String ie;

    /**
     * SAT - Inscrição Municipal
     */
    @Element(name = "IM", required = false)
    private String im;

    public CFeCancInfCFeEmit() {}

    /**
     *
     * @param cnpj
     * @param xNome
     * @param xFant
     * @param enderEmit
     * @param ie
     * @param im
     */
    public CFeCancInfCFeEmit(String cnpj, String xNome, String xFant, CFeCancInfCFeEmitEnderEmit enderEmit, String ie, String im) {
        this.cnpj = cnpj;
        this.xNome = xNome;
        this.xFant = xFant;
        this.enderEmit = enderEmit;
        this.ie = ie;
        this.im = im;
    }
}
