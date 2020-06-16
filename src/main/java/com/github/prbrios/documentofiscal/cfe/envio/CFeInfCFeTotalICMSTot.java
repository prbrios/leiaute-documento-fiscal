package com.github.prbrios.documentofiscal.cfe.envio;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Grupo de Valores Totais referentes ao ICMS
 *
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
@Root(name = "ICMSTot")
public class CFeInfCFeTotalICMSTot {

    /**
     * SAT - Valor Total do ICMS
     */
    @Element(name = "vICMS", required = false)
    private String vICMS;

    /**
     * SAT - Valor total dos produtos e serviços
     */
    @Element(name = "vProd", required = false)
    private String vProd;

    /**
     * SAT - Valor total dos descontos sobre item
     */
    @Element(name = "vDesc", required = false)
    private String vDesc;

    /**
     * SAT - Valor total do PIS
     */
    @Element(name = "vPIS", required = false)
    private String vPIS;

    /**
     * SAT - Valor total do COFINS
     */
    @Element(name = "vCOFINS", required = false)
    private String vCOFINS;

    /**
     * SAT - Valor total do PIS ST
     */
    @Element(name = "vPISST", required = false)
    private String vPISST;

    /**
     * SAT - Valor total do COFINS ST
     */
    @Element(name = "vCOFINSST", required = false)
    private String vCOFINSST;

    /**
     * SAT - Valor total de outras despesas acessórias sobre item
     */
    @Element(name = "vOutro", required = false)
    private String vOutro;

    public CFeInfCFeTotalICMSTot() {}

    /**
     *
     * @param vICMS
     * @param vProd
     * @param vDesc
     * @param vPIS
     * @param vCOFINS
     * @param vPISST
     * @param vCOFINSST
     * @param vOutro
     */
    public CFeInfCFeTotalICMSTot(String vICMS, String vProd, String vDesc, String vPIS, String vCOFINS, String vPISST, String vCOFINSST, String vOutro) {
        this.vICMS = vICMS;
        this.vProd = vProd;
        this.vDesc = vDesc;
        this.vPIS = vPIS;
        this.vCOFINS = vCOFINS;
        this.vPISST = vPISST;
        this.vCOFINSST = vCOFINSST;
        this.vOutro = vOutro;
    }

	public String getvICMS() {
		return vICMS;
	}

	public void setvICMS(String vICMS) {
		this.vICMS = vICMS;
	}

	public String getvProd() {
		return vProd;
	}

	public void setvProd(String vProd) {
		this.vProd = vProd;
	}

	public String getvDesc() {
		return vDesc;
	}

	public void setvDesc(String vDesc) {
		this.vDesc = vDesc;
	}

	public String getvPIS() {
		return vPIS;
	}

	public void setvPIS(String vPIS) {
		this.vPIS = vPIS;
	}

	public String getvCOFINS() {
		return vCOFINS;
	}

	public void setvCOFINS(String vCOFINS) {
		this.vCOFINS = vCOFINS;
	}

	public String getvPISST() {
		return vPISST;
	}

	public void setvPISST(String vPISST) {
		this.vPISST = vPISST;
	}

	public String getvCOFINSST() {
		return vCOFINSST;
	}

	public void setvCOFINSST(String vCOFINSST) {
		this.vCOFINSST = vCOFINSST;
	}

	public String getvOutro() {
		return vOutro;
	}

	public void setvOutro(String vOutro) {
		this.vOutro = vOutro;
	}
    
}
