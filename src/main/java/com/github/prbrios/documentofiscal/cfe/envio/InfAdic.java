package com.github.prbrios.documentofiscal.cfe.envio;

import lombok.Getter;
import lombok.Setter;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;

/**
 * Grupo de informações adicionais
 *
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
@Root(name = "infAdic")
public class InfAdic {

    /**
     * AC - Informações complementares de interesse do contribuinte
     */
    @Getter
    @Setter
    @Element(name = "infCpl", required = false)
    private String infCpl;

    /**
     * SAT - Informações complementares de interesse do fisco
     */
    @Getter
    @ElementList(name = "obsFisco", required = false, inline = true)
    private List<ObsFisco> obsFisco = new ArrayList<ObsFisco>();

}
