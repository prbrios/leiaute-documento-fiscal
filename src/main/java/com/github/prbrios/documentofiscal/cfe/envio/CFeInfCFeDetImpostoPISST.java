package com.github.prbrios.documentofiscal.cfe.envio;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Grupo de PIS Substituição Tributária
 *
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
@Root(name = "PISST")
public class CFeInfCFeDetImpostoPISST {

    /**
     * AC - Valor da Base de Cálculo do PIS
     */
    @Element(name = "vBC", required = false)
    private String vBC;

    /**
     * AC - Alíquota do PIS (em percentual)
     */
    @Element(name = "pPIS", required = false)
    private String pPIS;

    /**
     * AC - Quantidade Vendida
     */
    @Element(name = "qBCProd", required = false)
    private String qBCProd;

    /**
     * AC - Alíquota do PIS (em reais)
     */
    @Element(name = "vAliqProd", required = false)
    private String vAliqProd;

    /**
     * SAT - Valor do PIS
     */
    @Element(name = "vPIS", required = false)
    private String vPIS;

    public CFeInfCFeDetImpostoPISST() {}

    /**
     *
     * @param vBC
     * @param pPIS
     * @param qBCProd
     * @param vAliqProd
     * @param vPIS
     */
    public CFeInfCFeDetImpostoPISST(String vBC, String pPIS, String qBCProd, String vAliqProd, String vPIS) {
        this.vBC = vBC;
        this.pPIS = pPIS;
        this.qBCProd = qBCProd;
        this.vAliqProd = vAliqProd;
        this.vPIS = vPIS;
    }

	public String getvBC() {
		return vBC;
	}

	public void setvBC(String vBC) {
		this.vBC = vBC;
	}

	public String getpPIS() {
		return pPIS;
	}

	public void setpPIS(String pPIS) {
		this.pPIS = pPIS;
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

	public String getvPIS() {
		return vPIS;
	}

	public void setvPIS(String vPIS) {
		this.vPIS = vPIS;
	}
    
}
