package com.github.prbrios.documentofiscal.cfe.envio;

import lombok.Getter;
import lombok.Setter;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Grupo de informações dos Meios de Pagamento empregados na quitação do CF-e
 *
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
@Root(name = "MP")
public class MP {

    /**
     * AC - Código do Meio de Pagamento empregado para quitação do CF-e
     */
    @Getter
    @Setter
    @Element(name = "cMP", required = false)
    private String cMP;

    /**
     * AC - Valor do Meio de Pagamento empregado para quitação do CF-e
     */
    @Getter
    @Setter
    @Element(name = "vMP", required = false)
    private String vMP;

    /**
     * AC - Credenciadora de cartão de débito ou crédito
     */
    @Getter
    @Setter
    @Element(name = "cAdmC", required = false)
    private String cAdmC;
}
