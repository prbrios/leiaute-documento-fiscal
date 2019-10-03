package com.github.prbrios.documentofiscal.cfe.cancelamento;

import lombok.Getter;
import lombok.Setter;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Grupo de identificação do Destinatário do CF-e
 *
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
@Root(name = "dest")
public class Dest {

    /**
     * AC - CNPJ do destinatário
     */
    @Getter
    @Setter
    @Element(name = "CNPJ", required = false)
    private String cnpj;

    /**
     * AC - CPF do destinatário
     */
    @Getter
    @Setter
    @Element(name = "CPF", required = false)
    private String cpf;

}
