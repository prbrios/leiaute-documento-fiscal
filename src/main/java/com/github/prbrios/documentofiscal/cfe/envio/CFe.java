package com.github.prbrios.documentofiscal.cfe.envio;

import com.github.prbrios.documentofiscal.assinatura.Signature;
import lombok.Data;
import lombok.Getter;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * AC - TAG raiz do CF-e
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
@Data
@Root(name = "CFe")
public class CFe
{
    /**
     * AC - Grupo das informações do CF-e
     */
    @Element(name = "infCFe", required = false)
    private InfCFe infCFe;

    /**
     * SAT - Assinatura XML do CF-e Segundo o Padrão XML Digital Signature
     */
    @Getter
    @Element(name = "Signature", required = false)
    private Signature signature;

}
