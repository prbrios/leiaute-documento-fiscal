package com.github.prbrios.documentofiscal.nfe.evento.envio;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "infEvento")
public class EnvEventoEventoInfEvento {

    @Attribute(name = "Id", required = false)
    private String id;

    @Element(name = "cOrgao", required = false)
    private String cOrgao;

    @Element(name = "tpAmb", required = false)
    private String tpAmb;

    @Element(name = "CNPJ", required = false)
    private String CNPJ;

    @Element(name = "CPF", required = false)
    private String CPF;

    @Element(name = "chNFe", required = false)
    private String chNFe;

    @Element(name = "dhEvento", required = false)
    private String dhEvento;

    @Element(name = "tpEvento", required = false)
    private String tpEvento;

    @Element(name = "nSeqEvento", required = false)
    private String nSeqEvento;

    @Element(name = "verEvento", required = false)
    private String verEvento = "1.00";

    @Element(name = "detEvento", required = false)
    private EnvEventoEventoInfEventoDetEvento detEvento;

    public EnvEventoEventoInfEvento() {}

    /**
     *
     * @param id
     * @param cOrgao
     * @param tpAmb
     * @param CNPJ
     * @param CPF
     * @param chNFe
     * @param dhEvento
     * @param tpEvento
     * @param nSeqEvento
     * @param verEvento
     * @param detEvento
     */
    public EnvEventoEventoInfEvento(String id, String cOrgao, String tpAmb, String CNPJ, String CPF, String chNFe, String dhEvento, String tpEvento, String nSeqEvento, String verEvento, EnvEventoEventoInfEventoDetEvento detEvento) {
        this.id = id;
        this.cOrgao = cOrgao;
        this.tpAmb = tpAmb;
        this.CNPJ = CNPJ;
        this.CPF = CPF;
        this.chNFe = chNFe;
        this.dhEvento = dhEvento;
        this.tpEvento = tpEvento;
        this.nSeqEvento = nSeqEvento;
        this.verEvento = verEvento;
        this.detEvento = detEvento;
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getcOrgao() {
		return cOrgao;
	}

	public void setcOrgao(String cOrgao) {
		this.cOrgao = cOrgao;
	}

	public String getTpAmb() {
		return tpAmb;
	}

	public void setTpAmb(String tpAmb) {
		this.tpAmb = tpAmb;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getChNFe() {
		return chNFe;
	}

	public void setChNFe(String chNFe) {
		this.chNFe = chNFe;
	}

	public String getDhEvento() {
		return dhEvento;
	}

	public void setDhEvento(String dhEvento) {
		this.dhEvento = dhEvento;
	}

	public String getTpEvento() {
		return tpEvento;
	}

	public void setTpEvento(String tpEvento) {
		this.tpEvento = tpEvento;
	}

	public String getnSeqEvento() {
		return nSeqEvento;
	}

	public void setnSeqEvento(String nSeqEvento) {
		this.nSeqEvento = nSeqEvento;
	}

	public String getVerEvento() {
		return verEvento;
	}

	public void setVerEvento(String verEvento) {
		this.verEvento = verEvento;
	}

	public EnvEventoEventoInfEventoDetEvento getDetEvento() {
		return detEvento;
	}

	public void setDetEvento(EnvEventoEventoInfEventoDetEvento detEvento) {
		this.detEvento = detEvento;
	}
    
    
}
