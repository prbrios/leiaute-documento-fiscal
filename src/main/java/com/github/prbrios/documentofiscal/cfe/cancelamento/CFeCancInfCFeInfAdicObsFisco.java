package com.github.prbrios.documentofiscal.cfe.cancelamento;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Grupo do campo de uso livre do Fisco
 *
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
@Root(name = "obsFisco")
public class CFeCancInfCFeInfAdicObsFisco {

    /**
     * SAT - Identificação do campo
     */
    @Attribute(name = "xCampo", required = false)
    private String xCampo;

    /**
     * SAT - Conteúdo do campo
     */
    @Element(name = "xTexto", required = false)
    private String xTexto;

    public CFeCancInfCFeInfAdicObsFisco() {}

    /**
     *
     * @param xCampo
     * @param xTexto
     */
    public CFeCancInfCFeInfAdicObsFisco(String xCampo, String xTexto) {
        this.xCampo = xCampo;
        this.xTexto = xTexto;
    }

	public String getxCampo() {
		return xCampo;
	}

	public void setxCampo(String xCampo) {
		this.xCampo = xCampo;
	}

	public String getxTexto() {
		return xTexto;
	}

	public void setxTexto(String xTexto) {
		this.xTexto = xTexto;
	}
    
}
