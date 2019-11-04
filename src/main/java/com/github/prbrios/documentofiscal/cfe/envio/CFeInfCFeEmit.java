package com.github.prbrios.documentofiscal.cfe.envio;

import lombok.Data;
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
public class CFeInfCFeEmit {

    /**
     * AC - Informar o CNPJ do emitente, com os zeros n\u00e3o significativos
     */
    @Element(name = "CNPJ", required = false)
    private String CNPJ;

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
    private CFeInfCFeEmitEnderEmit enderEmit;

    /**
     * AC - Inscrição Estadual
     */
    @Element(name = "IE", required = false)
    private String IE;

    /**
     * AC - Inscrição Municipal
     */
    @Element(name = "IM", required = false)
    private String IM;

    /**
     * SAT - Código de Regime Tributário
     */
    @Element(name = "cRegTrib", required = false)
    private String cRegTrib;

    /**
     * AC - Regime Especial de Tributação do ISSQN
     */
    @Element(name = "cRegTribISSQN", required = false)
    private String cRegTribISSQN;

    /**
     * AC - Indicador de rateio do Desconto sobre subtotal entre itens sujeitos à tributação pelo ISSQN
     */
    @Element(name = "indRatISSQN", required = false)
    private String indRatISSQN;

    public CFeInfCFeEmit() {}

    /**
     *
     * @param cnpj
     * @param xNome
     * @param xFant
     * @param enderEmit
     * @param ie
     * @param im
     * @param cRegTrib
     * @param cRegTribISSQN
     * @param indRatISSQN
     */
    public CFeInfCFeEmit(String cnpj, String xNome, String xFant, CFeInfCFeEmitEnderEmit enderEmit, String ie, String im, String cRegTrib, String cRegTribISSQN, String indRatISSQN) {
        this.CNPJ = cnpj;
        this.xNome = xNome;
        this.xFant = xFant;
        this.enderEmit = enderEmit;
        this.IE = ie;
        this.IM = im;
        this.cRegTrib = cRegTrib;
        this.cRegTribISSQN = cRegTribISSQN;
        this.indRatISSQN = indRatISSQN;
    }
}
