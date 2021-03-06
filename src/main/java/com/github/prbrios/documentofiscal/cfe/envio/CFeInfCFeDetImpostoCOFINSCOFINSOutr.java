package com.github.prbrios.documentofiscal.cfe.envio;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Grupo de COFINS Outras Operações
 *
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
@Root(name = "COFINSOutr")
public class CFeInfCFeDetImpostoCOFINSCOFINSOutr {

    /**
     * AC - Código de Situação Tributária
     */
    @Element(name = "CST", required = false)
    private String CST;

    /**
     * AC - Valor da Base de Cálculo
     */
    @Element(name = "vBC", required = false)
    private String vBC;

    /**
     * AC - Alíquota (em percentual)
     */
    @Element(name = "pCOFINS", required = false)
    private String pCOFINS;

    /**
     * AC - Quantidade Vendida
     */
    @Element(name = "qBCProd", required = false)
    private String qBCProd;

    /**
     * AC - Alíquota (em reais)
     */
    @Element(name = "vAliqProd", required = false)
    private String vAliqProd;

    /**
     * SAT - Valor
     */
    @Element(name = "vCOFINS", required = false)
    private String vCOFINS;

    public CFeInfCFeDetImpostoCOFINSCOFINSOutr() {}

    /**
     *
     * @param cst
     * @param vBC
     * @param pCOFINS
     * @param qBCProd
     * @param vAliqProd
     * @param vCOFINS
     */
    public CFeInfCFeDetImpostoCOFINSCOFINSOutr(String cst, String vBC, String pCOFINS, String qBCProd, String vAliqProd, String vCOFINS) {
        this.CST = cst;
        this.vBC = vBC;
        this.pCOFINS = pCOFINS;
        this.qBCProd = qBCProd;
        this.vAliqProd = vAliqProd;
        this.vCOFINS = vCOFINS;
    }

	public String getCST() {
		return CST;
	}

	public void setCST(String cST) {
		CST = cST;
	}

	public String getvBC() {
		return vBC;
	}

	public void setvBC(String vBC) {
		this.vBC = vBC;
	}

	public String getpCOFINS() {
		return pCOFINS;
	}

	public void setpCOFINS(String pCOFINS) {
		this.pCOFINS = pCOFINS;
	}

	public String getqBCProd() {
		return qBCProd;
	}

	public void setqBCProd(String qBCProd) {
		this.qBCProd = qBCProd;
	}

	public String getvAliqProd() {
		return vAliqProd;
	}

	public void setvAliqProd(String vAliqProd) {
		this.vAliqProd = vAliqProd;
	}

	public String getvCOFINS() {
		return vCOFINS;
	}

	public void setvCOFINS(String vCOFINS) {
		this.vCOFINS = vCOFINS;
	}
    
}
