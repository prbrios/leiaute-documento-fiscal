package com.github.prbrios.documentofiscal.cfe.cancelamento;

import java.util.List;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/**
 * Grupo de Informações Adicionais
 *
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
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

	public List<CFeCancInfCFeInfAdicObsFisco> getObsFisco() {
		return obsFisco;
	}

	public void setObsFisco(List<CFeCancInfCFeInfAdicObsFisco> obsFisco) {
		this.obsFisco = obsFisco;
	}
    
}
