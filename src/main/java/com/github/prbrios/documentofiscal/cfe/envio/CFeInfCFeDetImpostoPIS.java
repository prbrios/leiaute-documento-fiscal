package com.github.prbrios.documentofiscal.cfe.envio;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Grupo do PIS
 *
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
@Root(name = "PIS")
public class CFeInfCFeDetImpostoPIS {

    /**
     * AC - Grupo de PIS tributado pela alíquota
     */
    @Element(name = "PISAliq", required = false)
    private CFeInfCFeDetImpostoPISPISAliq PISAliq;

    /**
     * AC - Grupo de PIS tributado por Qtde
     */
    @Element(name = "PISQtde", required = false)
    private CFeInfCFeDetImpostoPISPISQtde PISQtde;

    /**
     * AC - Grupo de PIS não tributado
     */
    @Element(name = "PISNT", required = false)
    private CFeInfCFeDetImpostoPISPISNT PISNT;

    /**
     * AC - Grupo de PIS para contribuinte do SIMPLES NACIONAL
     */
    @Element(name = "PISSN", required = false)
    private CFeInfCFeDetImpostoPISPISSN PISSN;

    /**
     * AC - Grupo de PIS Outras Operações
     */
    @Element(name = "PISOutr", required = false)
    private CFeInfCFeDetImpostoPISPISOutr PISOutr;

    public CFeInfCFeDetImpostoPIS() {}

    /**
     *
     * @param pisAliq
     * @param pisQtde
     * @param pisnt
     * @param pissn
     * @param pisOutr
     */
    public CFeInfCFeDetImpostoPIS(CFeInfCFeDetImpostoPISPISAliq pisAliq, CFeInfCFeDetImpostoPISPISQtde pisQtde, CFeInfCFeDetImpostoPISPISNT pisnt, CFeInfCFeDetImpostoPISPISSN pissn, CFeInfCFeDetImpostoPISPISOutr pisOutr) {
        this.PISAliq = pisAliq;
        this.PISQtde = pisQtde;
        this.PISNT = pisnt;
        this.PISSN = pissn;
        this.PISOutr = pisOutr;
    }

	public CFeInfCFeDetImpostoPISPISAliq getPISAliq() {
		return PISAliq;
	}

	public void setPISAliq(CFeInfCFeDetImpostoPISPISAliq pISAliq) {
		PISAliq = pISAliq;
	}

	public CFeInfCFeDetImpostoPISPISQtde getPISQtde() {
		return PISQtde;
	}

	public void setPISQtde(CFeInfCFeDetImpostoPISPISQtde pISQtde) {
		PISQtde = pISQtde;
	}

	public CFeInfCFeDetImpostoPISPISNT getPISNT() {
		return PISNT;
	}

	public void setPISNT(CFeInfCFeDetImpostoPISPISNT pISNT) {
		PISNT = pISNT;
	}

	public CFeInfCFeDetImpostoPISPISSN getPISSN() {
		return PISSN;
	}

	public void setPISSN(CFeInfCFeDetImpostoPISPISSN pISSN) {
		PISSN = pISSN;
	}

	public CFeInfCFeDetImpostoPISPISOutr getPISOutr() {
		return PISOutr;
	}

	public void setPISOutr(CFeInfCFeDetImpostoPISPISOutr pISOutr) {
		PISOutr = pISOutr;
	}
    
}
