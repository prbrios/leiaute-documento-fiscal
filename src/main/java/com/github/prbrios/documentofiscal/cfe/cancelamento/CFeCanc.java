package com.github.prbrios.documentofiscal.cfe.cancelamento;

import com.github.prbrios.documentofiscal.assinatura.Signature;
import lombok.Data;
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
@Data
@Root(name = "CFeCanc")
public class CFeCanc {

    /**
     * AC - Grupo das informações do CF-e
     */
    @Element(name = "infCFe", required = false)
    private CFeCancInfCFe infCFe;

    /**
     * SAT - Assinatura XML do CF-e de cancelamento segundo o Padrão XML Digital Signature
     */
    @Element(name = "Signature", required = false)
    private Signature signature;

    public CFeCanc() {}

    /**
     *
     * @param infCFe
     * @param signature
     */
    public CFeCanc(CFeCancInfCFe infCFe, Signature signature) {
        this.infCFe = infCFe;
        this.signature = signature;
    }
}
