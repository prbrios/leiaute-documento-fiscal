package com.github.prbrios.documentofiscal.cfe.envio;

import lombok.Data;
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
@Data
@Root(name = "MP")
public class CFeInfCFePgtoMP {

    /**
     * AC - Código do Meio de Pagamento empregado para quitação do CF-e
     */
    @Element(name = "cMP", required = false)
    private String cMP;

    /**
     * AC - Valor do Meio de Pagamento empregado para quitação do CF-e
     */
    @Element(name = "vMP", required = false)
    private String vMP;

    /**
     * AC - Credenciadora de cartão de débito ou crédito
     */
    @Element(name = "cAdmC", required = false)
    private String cAdmC;

    public CFeInfCFePgtoMP() {}

    /**
     *
     * @param cMP
     * @param vMP
     * @param cAdmC
     */
    public CFeInfCFePgtoMP(String cMP, String vMP, String cAdmC) {
        this.cMP = cMP;
        this.vMP = vMP;
        this.cAdmC = cAdmC;
    }
}
