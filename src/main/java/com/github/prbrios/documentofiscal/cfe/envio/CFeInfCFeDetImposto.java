package com.github.prbrios.documentofiscal.cfe.envio;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Grupo de Tributos incidentes no Produto ou Serviço
 *
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
@Root(name = "imposto")
public class CFeInfCFeDetImposto {

    /**
     * AC - Valor aproximado dos tributos do Produto ou serviço – Lei 12741/12
     */
    @Element(name = "vItem12741", required = false)
    private String vItem12741;

    /**
     * AC - Grupo do ICMS da Operação própria e ST
     */
    @Element(name = "ICMS", required = false)
    private CFeInfCFeDetImpostoICMS ICMS;

    /**
     * AC - Grupo do PIS
     */
    @Element(name = "PIS", required = false)
    private CFeInfCFeDetImpostoPIS PIS;

    /**
     * AC - Grupo de PIS Substituição Tributária
     */
    @Element(name = "PISST", required = false)
    private CFeInfCFeDetImpostoPISST PISST;

    /**
     * AC - Grupo do COFINS
     */
    @Element(name = "COFINS", required = false)
    private CFeInfCFeDetImpostoCOFINS COFINS;

    /**
     * AC - Grupo de COFINS Substituição Tributária
     */
    @Element(name = "COFINSST", required = false)
    private CFeInfCFeDetImpostoCOFINSST COFINSST;

    /**
     * AC - Grupo do ISSQN
     */
    @Element(name = "ISSQN", required = false)
    private CFeInfCFeDetImpostoISSQN ISSQN;

    public CFeInfCFeDetImposto() {}

    /**
     *
     * @param vItem12741
     * @param icms
     * @param pis
     * @param pisst
     * @param cofins
     * @param cofinsst
     * @param issqn
     */
    public CFeInfCFeDetImposto(String vItem12741, CFeInfCFeDetImpostoICMS icms, CFeInfCFeDetImpostoPIS pis, CFeInfCFeDetImpostoPISST pisst, CFeInfCFeDetImpostoCOFINS cofins, CFeInfCFeDetImpostoCOFINSST cofinsst, CFeInfCFeDetImpostoISSQN issqn) {
        this.vItem12741 = vItem12741;
        this.ICMS = icms;
        this.PIS = pis;
        this.PISST = pisst;
        this.COFINS = cofins;
        this.COFINSST = cofinsst;
        this.ISSQN = issqn;
    }

	public String getvItem12741() {
		return vItem12741;
	}

	public void setvItem12741(String vItem12741) {
		this.vItem12741 = vItem12741;
	}

	public CFeInfCFeDetImpostoICMS getICMS() {
		return ICMS;
	}

	public void setICMS(CFeInfCFeDetImpostoICMS iCMS) {
		ICMS = iCMS;
	}

	public CFeInfCFeDetImpostoPIS getPIS() {
		return PIS;
	}

	public void setPIS(CFeInfCFeDetImpostoPIS pIS) {
		PIS = pIS;
	}

	public CFeInfCFeDetImpostoPISST getPISST() {
		return PISST;
	}

	public void setPISST(CFeInfCFeDetImpostoPISST pISST) {
		PISST = pISST;
	}

	public CFeInfCFeDetImpostoCOFINS getCOFINS() {
		return COFINS;
	}

	public void setCOFINS(CFeInfCFeDetImpostoCOFINS cOFINS) {
		COFINS = cOFINS;
	}

	public CFeInfCFeDetImpostoCOFINSST getCOFINSST() {
		return COFINSST;
	}

	public void setCOFINSST(CFeInfCFeDetImpostoCOFINSST cOFINSST) {
		COFINSST = cOFINSST;
	}

	public CFeInfCFeDetImpostoISSQN getISSQN() {
		return ISSQN;
	}

	public void setISSQN(CFeInfCFeDetImpostoISSQN iSSQN) {
		ISSQN = iSSQN;
	}

}
