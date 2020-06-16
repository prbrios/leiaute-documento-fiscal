package com.github.prbrios.documentofiscal.cfe.envio;

import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/**
 * Grupo de informações adicionais
 *
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
@Root(name = "infAdic")
public class CFeInfCFeInfAdic {

    /**
     * AC - Informações complementares de interesse do contribuinte
     */
    @Element(name = "infCpl", required = false)
    private String infCpl;

    /**
     * SAT - Informações complementares de interesse do fisco
     */
    @ElementList(name = "obsFisco", required = false, inline = true)
    private List<CFeInfCFeInfAdicObsFisco> obsFisco = new ArrayList<CFeInfCFeInfAdicObsFisco>();

    public CFeInfCFeInfAdic() {}

    /**
     *
     * @param infCpl
     * @param obsFisco
     */
    public CFeInfCFeInfAdic(String infCpl, List<CFeInfCFeInfAdicObsFisco> obsFisco) {
        this.infCpl = infCpl;
        this.obsFisco = obsFisco;
    }

	public String getInfCpl() {
		return infCpl;
	}

	public void setInfCpl(String infCpl) {
		this.infCpl = infCpl;
	}

	public List<CFeInfCFeInfAdicObsFisco> getObsFisco() {
		return obsFisco;
	}

	public void setObsFisco(List<CFeInfCFeInfAdicObsFisco> obsFisco) {
		this.obsFisco = obsFisco;
	}
    
}
