package com.github.prbrios.documentofiscal.cfe.envio;

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
@Root(name = "pgto")
public class Pgto {

    /**
     * AC - Grupo de informações dos Meios de Pagamento empregados na quitação do CF-e
     */
    @Getter
    @Setter
    @ElementList(name = "MP", required = false, inline = true)
    private List<MP> mp = new ArrayList<MP>();

    /**
     * SAT - Valor do troco
     */
    @Getter
    @Element(name = "vTroco", required = false)
    private String vTroco;

}
