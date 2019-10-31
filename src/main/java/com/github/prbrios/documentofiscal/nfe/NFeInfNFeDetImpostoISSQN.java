package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "ISSQN")
public class NFeInfNFeDetImpostoISSQN {

    @Element(name = "vBC", required = false)
    private String vBC;

    @Element(name = "vAliq", required = false)
    private String vAliq;

    @Element(name = "vISSQN", required = false)
    private String vISSQN;

    @Element(name = "cMunFG", required = false)
    private String cMunFG;

    @Element(name = "cListServ", required = false)
    private String cListServ;

    @Element(name = "vDeducao", required = false)
    private String vDeducao;

    @Element(name = "vOutro", required = false)
    private String vOutro;

    @Element(name = "vDescIncond", required = false)
    private String vDescIncond;

    @Element(name = "vDescCond", required = false)
    private String vDescCond;

    @Element(name = "vISSRet", required = false)
    private String vISSRet;

    @Element(name = "indISS", required = false)
    private String indISS;

    @Element(name = "cServico", required = false)
    private String cServico;

    @Element(name = "cMun", required = false)
    private String cMun;

    @Element(name = "cPais", required = false)
    private String cPais;

    @Element(name = "nProcesso", required = false)
    private String nProcesso;

    @Element(name = "indIncentivo", required = false)
    private String indIncentivo;

    public NFeInfNFeDetImpostoISSQN() {}

    /**
     *
     * @param vBC
     * @param vAliq
     * @param vISSQN
     * @param cMunFG
     * @param cListServ
     * @param vDeducao
     * @param vOutro
     * @param vDescIncond
     * @param vDescCond
     * @param vISSRet
     * @param indISS
     * @param cServico
     * @param cMun
     * @param cPais
     * @param nProcesso
     * @param indIncentivo
     */
    public NFeInfNFeDetImpostoISSQN(String vBC, String vAliq, String vISSQN, String cMunFG, String cListServ, String vDeducao, String vOutro, String vDescIncond, String vDescCond, String vISSRet, String indISS, String cServico, String cMun, String cPais, String nProcesso, String indIncentivo) {
        this.vBC = vBC;
        this.vAliq = vAliq;
        this.vISSQN = vISSQN;
        this.cMunFG = cMunFG;
        this.cListServ = cListServ;
        this.vDeducao = vDeducao;
        this.vOutro = vOutro;
        this.vDescIncond = vDescIncond;
        this.vDescCond = vDescCond;
        this.vISSRet = vISSRet;
        this.indISS = indISS;
        this.cServico = cServico;
        this.cMun = cMun;
        this.cPais = cPais;
        this.nProcesso = nProcesso;
        this.indIncentivo = indIncentivo;
    }

}
