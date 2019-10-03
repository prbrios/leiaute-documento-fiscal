package com.github.prbrios.documentofiscal.cfe.envio;

import lombok.Getter;
import lombok.Setter;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 *
 */
@Root(name = "ISSQN")
public class ISSQN {

    /**
     * AC - Valor das deduções para ISSQN
     */
    @Getter
    @Setter
    @Element(name = "vDeducISSQN", required = false)
    private String vDeducISSQN;

    /**
     * SAT - Valor da Base de Cálculo do ISSQN
     */
    @Getter
    @Element(name = "vBC", required = false)
    private String vBC;

    /**
     * AC - Alíquota do ISSQN
     */
    @Getter
    @Setter
    @Element(name = "vAliq", required = false)
    private String vAliq;

    /**
     * SAT - Valor do ISSQN
     */
    @Getter
    @Element(name = "vISSQN", required = false)
    private String vISSQN;

    /**
     * AC - Código do município de ocorrência do fato gerador do ISSQN
     */
    @Getter
    @Setter
    @Element(name = "cMunFG", required = false)
    private String cMunFG;

    /**
     * AC - Item da Lista de Serviços
     */
    @Getter
    @Setter
    @Element(name = "cListServ", required = false)
    private String cListServ;

    /**
     * AC - Codigo de tributação pelo ISSQN do municipio
     */
    @Getter
    @Setter
    @Element(name = "cServTribMun", required = false)
    private String cServTribMun;

    /**
     * AC - Natureza da Operação de ISSQN
     */
    @Getter
    @Setter
    @Element(name = "cNatOp", required = false)
    private String cNatOp;

    /**
     * AC - Indicador de Incentivo Fiscal do ISSQN
     */
    @Getter
    @Setter
    @Element(name = "indIncFisc", required = false)
    private String indIncFisc;

}
