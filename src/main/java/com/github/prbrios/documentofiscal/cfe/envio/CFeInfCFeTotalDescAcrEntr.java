package com.github.prbrios.documentofiscal.cfe.envio;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Grupo de valores de entrada de Desconto/Acrésci mo sobre Subtotal
 *
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
@Data
@Root(name = "DescAcrEntr")
public class CFeInfCFeTotalDescAcrEntr {

    /**
     * AC - Valor de entrada de desconto sobre o subtotal
     */
    @Element(name = "vDescSubtot", required = false)
    private String vDescSubtot;

    /**
     * AC - Valor de entrada de acréscimo sobre o subtotal
     */
    @Element(name = "vAcresSubtot", required = false)
    private String vAcresSubtot;

    /**
     * AC - Valor aproximado dos tributos do CFe- SAT – Lei 12741/12.
     */
    @Element(name = "vCFeLei12741", required = false)
    private String vCFeLei12741;

    public CFeInfCFeTotalDescAcrEntr() {}

    /**
     *
     * @param vDescSubtot
     * @param vAcresSubtot
     * @param vCFeLei12741
     */
    public CFeInfCFeTotalDescAcrEntr(String vDescSubtot, String vAcresSubtot, String vCFeLei12741) {
        this.vDescSubtot = vDescSubtot;
        this.vAcresSubtot = vAcresSubtot;
        this.vCFeLei12741 = vCFeLei12741;
    }
}
