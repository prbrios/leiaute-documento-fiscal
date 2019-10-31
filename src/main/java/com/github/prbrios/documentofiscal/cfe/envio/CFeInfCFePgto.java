package com.github.prbrios.documentofiscal.cfe.envio;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;

/**
 * Grupo de informações sobre pagamento do CF-e
 *
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
@Data
@Root(name = "pgto")
public class CFeInfCFePgto {

    /**
     * AC - Grupo de informações dos Meios de Pagamento empregados na quitação do CF-e
     */
    @ElementList(name = "MP", required = false, inline = true)
    private List<CFeInfCFePgtoMP> mp = new ArrayList<CFeInfCFePgtoMP>();

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
        this.mp = mp;
        this.vTroco = vTroco;
    }
}
