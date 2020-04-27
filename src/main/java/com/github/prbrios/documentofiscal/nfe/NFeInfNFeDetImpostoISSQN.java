package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@JsonRootName("issqn")
@Data
@Root(name = "ISSQN")
public class NFeInfNFeDetImpostoISSQN {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vbc")
    @Element(name = "vBC", required = false)
    private String vBC;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("valiq")
    @Element(name = "vAliq", required = false)
    private String vAliq;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vissqn")
    @Element(name = "vISSQN", required = false)
    private String vISSQN;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cmunfg")
    @Element(name = "cMunFG", required = false)
    private String cMunFG;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("clistserv")
    @Element(name = "cListServ", required = false)
    private String cListServ;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vdeducao")
    @Element(name = "vDeducao", required = false)
    private String vDeducao;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("voutro")
    @Element(name = "vOutro", required = false)
    private String vOutro;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vdescincond")
    @Element(name = "vDescIncond", required = false)
    private String vDescIncond;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vdesccond")
    @Element(name = "vDescCond", required = false)
    private String vDescCond;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vissret")
    @Element(name = "vISSRet", required = false)
    private String vISSRet;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("indiss")
    @Element(name = "indISS", required = false)
    private String indISS;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cservico")
    @Element(name = "cServico", required = false)
    private String cServico;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cmun")
    @Element(name = "cMun", required = false)
    private String cMun;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cpais")
    @Element(name = "cPais", required = false)
    private String cPais;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("nprocesso")
    @Element(name = "nProcesso", required = false)
    private String nProcesso;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("indincentivo")
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
