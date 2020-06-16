package com.github.prbrios.documentofiscal.nfe.evento.envio;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "detEvento")
public class EnvEventoEventoInfEventoDetEvento {

    @Attribute(name = "versao", required = false)
    private String versao;

    @Element(name = "descEvento", required = false)
    private String descEvento;

    @Element(name = "nProt", required = false)
    private String nProt;

    @Element(name = "xJust", required = false)
    private String xJust;

    @Element(name = "xCorrecao", required = false)
    private String xCorrecao;

    @Element(name = "xCondUso", required = false)
    private String xCondUso;

    public EnvEventoEventoInfEventoDetEvento() {}

    /**
     *
     * @param versao
     * @param descEvento
     * @param nProt
     * @param xJust
     */
    public EnvEventoEventoInfEventoDetEvento(String versao, String descEvento, String nProt, String xJust) {
        this.versao = versao;
        this.descEvento = descEvento;
        this.nProt = nProt;
        this.xJust = xJust;
    }

    /**
     *
     * @param versao
     * @param descEvento
     * @param nProt
     * @param xJust
     * @param xCorrecao
     * @param xCondUso
     */
    public EnvEventoEventoInfEventoDetEvento(String versao, String descEvento, String nProt, String xJust, String xCorrecao, String xCondUso) {
        this.versao = versao;
        this.descEvento = descEvento;
        this.nProt = nProt;
        this.xJust = xJust;
        this.xCorrecao = xCorrecao;
        this.xCondUso = xCondUso;
    }

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public String getDescEvento() {
		return descEvento;
	}

	public void setDescEvento(String descEvento) {
		this.descEvento = descEvento;
	}

	public String getnProt() {
		return nProt;
	}

	public void setnProt(String nProt) {
		this.nProt = nProt;
	}

	public String getxJust() {
		return xJust;
	}

	public void setxJust(String xJust) {
		this.xJust = xJust;
	}

	public String getxCorrecao() {
		return xCorrecao;
	}

	public void setxCorrecao(String xCorrecao) {
		this.xCorrecao = xCorrecao;
	}

	public String getxCondUso() {
		return xCondUso;
	}

	public void setxCondUso(String xCondUso) {
		this.xCondUso = xCondUso;
	}

}
