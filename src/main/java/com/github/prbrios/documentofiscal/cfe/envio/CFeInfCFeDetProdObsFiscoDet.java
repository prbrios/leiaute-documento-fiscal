package com.github.prbrios.documentofiscal.cfe.envio;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Grupo do campo de uso livre do Fisco
 *
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
@Root(name = "obsFiscoDet")
public class CFeInfCFeDetProdObsFiscoDet {

    /**
     * AC - Identificação do campo
     */
    @Attribute(name = "xCampoDet", required = false)
    private String xCampoDet;

    /**
     * AC - Conteúdo do campo
     */
    @Element(name = "xTextoDet", required = false)
    private String xTextoDet;

    public CFeInfCFeDetProdObsFiscoDet() {}

    /**
     *
     * @param xCampoDet
     * @param xTextoDet
     */
    public CFeInfCFeDetProdObsFiscoDet(String xCampoDet, String xTextoDet) {
        this.xCampoDet = xCampoDet;
        this.xTextoDet = xTextoDet;
    }

	public String getxCampoDet() {
		return xCampoDet;
	}

	public void setxCampoDet(String xCampoDet) {
		this.xCampoDet = xCampoDet;
	}

	public String getxTextoDet() {
		return xTextoDet;
	}

	public void setxTextoDet(String xTextoDet) {
		this.xTextoDet = xTextoDet;
	}
    
}
