package com.github.prbrios.documentofiscal.cfe.cancelamento;

import lombok.Getter;
import lombok.Setter;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Grupo das informações do CF-e
 *
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
@Root(name = "infCFe")
public class InfCFe {

    /**
     * SAT - Versão do leiaute do CF-e cancelamento
     */
    @Getter
    @Attribute(name = "versao", required = false)
    private String versao;

    /**
     * SAT - Identificador da TAG a ser assinada
     */
    @Getter
    @Attribute(name = "Id", required = false)
    private String id;

    /**
     * AC - Chave de acesso do CF-e a ser cancelado
     */
    @Getter
    @Setter
    @Element(name = "chCanc", required = false)
    private String chCanc;

    /**
     * SAT - Data de emissão do CF-e a ser cancelado
     */
    @Getter
    @Element(name = "dEmi", required = false)
    private String dEmi;

    /**
     * SAT - Hora de emissão do CF-e a ser cancelado
     */
    @Getter
    @Element(name = "hEmi", required = false)
    private String hEmi;

    /**
     * AC - Grupo das informações de identificação do CF-e
     */
    @Getter
    @Setter
    @Element(name = "ide", required = false)
    private Ide ide;

    /**
     * AC - Grupo de identificação do emitente do CF-e
     */
    @Getter
    @Setter
    @Element(name = "emit", required = false)
    private Emit emit;

    /**
     * AC - Grupo de identificação do Destinatário do CF-e
     */
    @Getter
    @Setter
    @Element(name = "dest", required = false)
    private Dest dest;

    /**
     * AC - Grupo de Valores Totais do CF-e
     */
    @Getter
    @Setter
    @Element(name = "total", required = false)
    private Total total;

    /**
     * AC - Grupo de Informações Adicionais
     */
    @Getter
    @Setter
    @Element(name = "infAdic", required = false)
    private InfAdic infAdic;
}
