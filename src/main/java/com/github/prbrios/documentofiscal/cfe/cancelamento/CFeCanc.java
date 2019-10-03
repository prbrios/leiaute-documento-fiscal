package com.github.prbrios.documentofiscal.cfe.cancelamento;

import com.github.prbrios.documentofiscal.assinatura.Signature;
import lombok.Getter;
import lombok.Setter;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * TAG raiz do CF-e
 *
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
@Root(name = "CFeCanc")
public class CFeCanc {

    /**
     * AC - Grupo das informações do CF-e
     */
    @Getter
    @Setter
    @Element(name = "infCFe", required = false)
    private InfCFe infCFe;

    /**
     * SAT - Assinatura XML do CF-e de cancelamento segundo o Padrão XML Digital Signature
     */
    @Getter
    @Element(name = "Signature", required = false)
    private Signature signature;

}
