package com.github.prbrios.documentofiscal.cfe.envio;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Grupo do campo de uso livre do Fisco
 *
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
@Data
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
}
