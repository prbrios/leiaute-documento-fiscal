package com.github.prbrios.documentofiscal.cfe.envio;

import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/**
 * Grupo de informações sobre pagamento do CF-e
 *
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
@Root(name = "pgto")
public class CFeInfCFePgto {

    /**
     * AC - Grupo de informações dos Meios de Pagamento empregados na quitação do CF-e
     */
    @ElementList(name = "MP", required = false, inline = true)
    private List<CFeInfCFePgtoMP> MP = new ArrayList<CFeInfCFePgtoMP>();

    /**
     * SAT - Valor do troco
     */
    @Element(name = "vTroco", required = false)
    private String vTroco;

    public CFeInfCFePgto() {}

    /**
     *
     * @param mp
     * @param vTroco
     */
    public CFeInfCFePgto(List<CFeInfCFePgtoMP> mp, String vTroco) {
        this.MP = mp;
        this.vTroco = vTroco;
    }

	public List<CFeInfCFePgtoMP> getMP() {
		return MP;
	}

	public void setMP(List<CFeInfCFePgtoMP> mP) {
		MP = mP;
	}

	public String getvTroco() {
		return vTroco;
	}

	public void setvTroco(String vTroco) {
		this.vTroco = vTroco;
	}
    
}
