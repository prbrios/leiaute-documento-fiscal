package com.github.prbrios.documentofiscal.cfe.envio;

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
@Root(name = "obsFiscoDet")
public class ObsFiscoDet {

    /**
     * AC - Identificação do campo
     */
    @Getter
    @Setter
    @Attribute(name = "xCampoDet", required = false)
    private String xCampoDet;

    /**
     * AC - Conteúdo do campo
     */
    @Getter
    @Setter
    @Element(name = "xTextoDet", required = false)
    private String xTextoDet;

}
