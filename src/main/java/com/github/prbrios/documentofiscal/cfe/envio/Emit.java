package com.github.prbrios.documentofiscal.cfe.envio;

import lombok.Getter;
import lombok.Setter;
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
     * AC - Informar o CNPJ do emitente, com os zeros n\u00e3o significativos
     */
    @Getter
    @Setter
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
     * AC - Inscrição Estadual
     */
    @Getter
    @Setter
    @Element(name = "IE", required = false)
    private String ie;

    /**
     * AC - Inscrição Municipal
     */
    @Getter
    @Setter
    @Element(name = "IM", required = false)
    private String im;

    /**
     * SAT - Código de Regime Tributário
     */
    @Getter
    @Element(name = "cRegTrib", required = false)
    private String cRegTrib;

    /**
     * AC - Regime Especial de Tributação do ISSQN
     */
    @Getter
    @Setter
    @Element(name = "cRegTribISSQN", required = false)
    private String cRegTribISSQN;

    /**
     * AC - Indicador de rateio do Desconto sobre subtotal entre itens sujeitos à tributação pelo ISSQN
     */
    @Getter
    @Setter
    @Element(name = "indRatISSQN", required = false)
    private String indRatISSQN;

}
