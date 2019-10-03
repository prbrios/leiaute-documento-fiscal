package com.github.prbrios.documentofiscal.cfe.envio;

import lombok.Getter;
import lombok.Setter;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Grupo de Tributos incidentes no Produto ou Serviço
 *
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
@Root(name = "imposto")
public class Imposto {

    /**
     * AC - Valor aproximado dos tributos do Produto ou serviço – Lei 12741/12
     */
    @Getter
    @Setter
    @Element(name = "vItem12741", required = false)
    private String vItem12741;

    /**
     * AC - Grupo do ICMS da Operação própria e ST
     */
    @Getter
    @Setter
    @Element(name = "ICMS", required = false)
    private ICMS icms;

    /**
     * AC - Grupo do PIS
     */
    @Getter
    @Setter
    @Element(name = "PIS", required = false)
    private PIS pis;

    /**
     * AC - Grupo de PIS Substituição Tributária
     */
    @Getter
    @Setter
    @Element(name = "PISST", required = false)
    private PISST pisst;

    /**
     * AC - Grupo do COFINS
     */
    @Getter
    @Setter
    @Element(name = "COFINS", required = false)
    private COFINS cofins;

    /**
     * AC - Grupo de COFINS Substituição Tributária
     */
    @Getter
    @Setter
    @Element(name = "COFINSST", required = false)
    private COFINSST cofinsst;

    /**
     * AC - Grupo do ISSQN
     */
    @Getter
    @Setter
    @Element(name = "ISSQN", required = false)
    private ISSQN issqn;

}
