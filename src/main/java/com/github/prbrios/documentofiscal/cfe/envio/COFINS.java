package com.github.prbrios.documentofiscal.cfe.envio;

import lombok.Getter;
import lombok.Setter;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Grupo do COFINS
 * 
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
@Root(name = "COFINS")
public class COFINS {

    /**
     * AC - Grupo de COFINS tributado pela alíquota
     */
    @Getter
    @Setter
    @Element(name = "COFINSAliq", required = false)
    private COFINSAliq COFINSAliq;

    /**
     * AC - Grupo de COFINS tributado por Qtde
     */
    @Getter
    @Setter
    @Element(name = "COFINSQtde", required = false)
    private COFINSQtde COFINSQtde;

    /**
     * AC - Grupo de COFINS não tributado
     */
    @Getter
    @Setter
    @Element(name = "COFINSNT", required = false)
    private COFINSNT COFINSnt;

    /**
     * AC - Grupo de COFINS para contribuinte do SIMPLES NACIONAL
     */
    @Getter
    @Setter
    @Element(name = "COFINSSN", required = false)
    private COFINSSN COFINSsn;

    /**
     * AC - Grupo de COFINS Outras Operações
     */
    @Getter
    @Setter
    @Element(name = "COFINSOutr", required = false)
    private COFINSOutr COFINSOutr;

}
