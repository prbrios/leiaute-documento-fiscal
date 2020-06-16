package com.github.prbrios.documentofiscal.cfe.envio;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

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

	public String getvDeducISSQN() {
		return vDeducISSQN;
	}

	public void setvDeducISSQN(String vDeducISSQN) {
		this.vDeducISSQN = vDeducISSQN;
	}

	public String getvBC() {
		return vBC;
	}

	public void setvBC(String vBC) {
		this.vBC = vBC;
	}

	public String getvAliq() {
		return vAliq;
	}

	public void setvAliq(String vAliq) {
		this.vAliq = vAliq;
	}

	public String getvISSQN() {
		return vISSQN;
	}

	public void setvISSQN(String vISSQN) {
		this.vISSQN = vISSQN;
	}

	public String getcMunFG() {
		return cMunFG;
	}

	public void setcMunFG(String cMunFG) {
		this.cMunFG = cMunFG;
	}

	public String getcListServ() {
		return cListServ;
	}

	public void setcListServ(String cListServ) {
		this.cListServ = cListServ;
	}

	public String getcServTribMun() {
		return cServTribMun;
	}

	public void setcServTribMun(String cServTribMun) {
		this.cServTribMun = cServTribMun;
	}

	public String getcNatOp() {
		return cNatOp;
	}

	public void setcNatOp(String cNatOp) {
		this.cNatOp = cNatOp;
	}

	public String getIndIncFisc() {
		return indIncFisc;
	}

	public void setIndIncFisc(String indIncFisc) {
		this.indIncFisc = indIncFisc;
	}

}
