package com.github.prbrios.documentofiscal.cfe.cancelamento;

import lombok.Getter;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

/**
 * Grupo de Informações Adicionais
 *
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
@Root(name = "infAdic")
public class InfAdic {

    /**
     * SAT - Grupo do campo de uso livre do Fisco
     */
    @Getter
    @ElementList(name = "obsFisco", required = false, inline = true)
    private List<ObsFisco> obsFisco;

}
