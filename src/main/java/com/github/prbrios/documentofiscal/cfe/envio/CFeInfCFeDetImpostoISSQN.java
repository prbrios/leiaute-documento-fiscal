package com.github.prbrios.documentofiscal.cfe.envio;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 *
 */
@Data
@Root(name = "ISSQN")
public class CFeInfCFeDetImpostoISSQN {

    /**
     * AC - Valor das deduções para ISSQN
     */
    @Element(name = "vDeducISSQN", required = false)
    private String vDeducISSQN;

    /**
     * SAT - Valor da Base de Cálculo do ISSQN
     */
    @Element(name = "vBC", required = false)
    private String vBC;

    /**
     * AC - Alíquota do ISSQN
     */
    @Element(name = "vAliq", required = false)
    private String vAliq;

    /**
     * SAT - Valor do ISSQN
     */
    @Element(name = "vISSQN", required = false)
    private String vISSQN;

    /**
     * AC - Código do município de ocorrência do fato gerador do ISSQN
     */
    @Element(name = "cMunFG", required = false)
    private String cMunFG;

    /**
     * AC - Item da Lista de Serviços
     */
    @Element(name = "cListServ", required = false)
    private String cListServ;

    /**
     * AC - Codigo de tributação pelo ISSQN do municipio
     */
    @Element(name = "cServTribMun", required = false)
    private String cServTribMun;

    /**
     * AC - Natureza da Operação de ISSQN
     */
    @Element(name = "cNatOp", required = false)
    private String cNatOp;

    /**
     * AC - Indicador de Incentivo Fiscal do ISSQN
     */
    @Element(name = "indIncFisc", required = false)
    private String indIncFisc;

    public CFeInfCFeDetImpostoISSQN() {}

    /**
     *
     * @param vDeducISSQN
     * @param vBC
     * @param vAliq
     * @param vISSQN
     * @param cMunFG
     * @param cListServ
     * @param cServTribMun
     * @param cNatOp
     * @param indIncFisc
     */
    public CFeInfCFeDetImpostoISSQN(String vDeducISSQN, String vBC, String vAliq, String vISSQN, String cMunFG, String cListServ, String cServTribMun, String cNatOp, String indIncFisc) {
        this.vDeducISSQN = vDeducISSQN;
        this.vBC = vBC;
        this.vAliq = vAliq;
        this.vISSQN = vISSQN;
        this.cMunFG = cMunFG;
        this.cListServ = cListServ;
        this.cServTribMun = cServTribMun;
        this.cNatOp = cNatOp;
        this.indIncFisc = indIncFisc;
    }
}
