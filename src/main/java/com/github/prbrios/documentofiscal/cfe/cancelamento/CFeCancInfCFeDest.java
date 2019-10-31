package com.github.prbrios.documentofiscal.cfe.cancelamento;

import lombok.Data;
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
@Data
@Root(name = "dest")
public class CFeCancInfCFeDest {

    /**
     * AC - CNPJ do destinatário
     */
    @Element(name = "CNPJ", required = false)
    private String cnpj;

    /**
     * AC - CPF do destinatário
     */
    @Element(name = "CPF", required = false)
    private String cpf;

    public CFeCancInfCFeDest() {}

    /**
     *
     * @param cnpj
     * @param cpf
     */
    public CFeCancInfCFeDest(String cnpj, String cpf) {
        this.cnpj = cnpj;
        this.cpf = cpf;
    }
}