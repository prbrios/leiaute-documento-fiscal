package com.github.prbrios.documentofiscal.cfe.cancelamento;

import lombok.Data;
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
@Data
@Root(name = "infAdic")
public class CFeCancInfCFeInfAdic {

    /**
     * SAT - Grupo do campo de uso livre do Fisco
     */
    @ElementList(name = "obsFisco", required = false, inline = true)
    private List<CFeCancInfCFeInfAdicObsFisco> obsFisco;

    public CFeCancInfCFeInfAdic() {}

    /**
     *
     * @param obsFisco
     */
    public CFeCancInfCFeInfAdic(List<CFeCancInfCFeInfAdicObsFisco> obsFisco) {
        this.obsFisco = obsFisco;
    }
}
