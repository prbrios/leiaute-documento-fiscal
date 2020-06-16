package com.github.prbrios.documentofiscal.cfe.envio;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Grupo de identificação do Local de entrega
 *
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
@Root(name = "entrega")
public class CFeInfCFeEntrega {

    /**
     * AC - Logradouro
     */
    @Element(name = "xLgr", required = false)
    private String xLgr;

    /**
     * AC - Número
     */
    @Element(name = "nro", required = false)
    private String nro;

    /**
     * AC - Complemento
     */
    @Element(name = "xCpl", required = false)
    private String xCpl;

    /**
     * AC - Bairro
     */
    @Element(name = "xBairro", required = false)
    private String xBairro;

    /**
     * AC - Município
     */
    @Element(name = "xMun", required = false)
    private String xMun;

    /**
     * AC - UF
     */
    @Element(name = "UF", required = false)
    private String UF;

    public CFeInfCFeEntrega() {}

    /**
     *
     * @param xLgr
     * @param nro
     * @param xCpl
     * @param xBairro
     * @param xMun
     * @param uf
     */
    public CFeInfCFeEntrega(String xLgr, String nro, String xCpl, String xBairro, String xMun, String uf) {
        this.xLgr = xLgr;
        this.nro = nro;
        this.xCpl = xCpl;
        this.xBairro = xBairro;
        this.xMun = xMun;
        this.UF = uf;
    }

	public String getxLgr() {
		return xLgr;
	}

	public void setxLgr(String xLgr) {
		this.xLgr = xLgr;
	}

	public String getNro() {
		return nro;
	}

	public void setNro(String nro) {
		this.nro = nro;
	}

	public String getxCpl() {
		return xCpl;
	}

	public void setxCpl(String xCpl) {
		this.xCpl = xCpl;
	}

	public String getxBairro() {
		return xBairro;
	}

	public void setxBairro(String xBairro) {
		this.xBairro = xBairro;
	}

	public String getxMun() {
		return xMun;
	}

	public void setxMun(String xMun) {
		this.xMun = xMun;
	}

	public String getUF() {
		return UF;
	}

	public void setUF(String uF) {
		UF = uF;
	}
    
}
