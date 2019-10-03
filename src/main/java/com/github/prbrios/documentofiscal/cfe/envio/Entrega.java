package com.github.prbrios.documentofiscal.cfe.envio;

import lombok.Getter;
import lombok.Setter;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Grupo de identificação do Local de entrega
 *
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
@Root(name = "entrega")
public class Entrega {

    /**
     * AC - Logradouro
     */
    @Getter
    @Setter
    @Element(name = "xLgr", required = false)
    private String xLgr;

    /**
     * AC - Número
     */
    @Getter
    @Setter
    @Element(name = "nro", required = false)
    private String nro;

    /**
     * AC - Complemento
     */
    @Getter
    @Setter
    @Element(name = "xCpl", required = false)
    private String xCpl;

    /**
     * AC - Bairro
     */
    @Getter
    @Setter
    @Element(name = "xBairro", required = false)
    private String xBairro;

    /**
     * AC - Município
     */
    @Getter
    @Setter
    @Element(name = "xMun", required = false)
    private String xMun;

    /**
     * AC - UF
     */
    @Getter
    @Setter
    @Element(name = "UF", required = false)
    private String uf;

}
