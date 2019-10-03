package com.github.prbrios.documentofiscal.cfe.envio;

import lombok.Getter;
import lombok.Setter;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;

/**
 * Grupo que contém as informações do CF-e
 *
 * @author prbrios@gmail.com
 * @since 01/10/2019
 */
@Root(name = "infCFe")
public class InfCFe {

    /**
     * SAT - Versão do leiaute do CF-e
     */
    @Getter
    @Attribute(name = "Versao", required = false)
    private String versao;

    /**
     * AC - Versão do leiaute do arquivo de dados enviado pelo Aplicativo Comercial
     */
    @Getter
    @Setter
    @Attribute(name = "versaoDadosEnt", required = false)
    private String versaoDadosEnt;

    /**
     * SAT - Versão do Software Básico instalado no SAT
     */
    @Getter
    @Attribute(name = "versaoSB", required = false)
    private String versaoSB;

    /**
     * SAT - Informar a chave de acesso do CF-e precedida do literal ‘CFe’, acrescentada a validação do formato
     */
    @Getter
    @Attribute(name = "Id", required = false)
    private String id;

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
     * AC - Grupo de identificação do Local de entrega
     */
    @Getter
    @Setter
    @Element(name = "entrega", required = false)
    private Entrega entrega;

    /**
     * AC - Grupo do detalhamento de Produtos e Serviços do CF-e
     */
    @Getter
    @Setter
    @ElementList(name = "det", required = false, inline = true)
    private List<Det> det = new ArrayList<Det>();

    /**
     * AC- Grupo de Valores Totais do CF-e
     */
    @Getter
    @Setter
    @Element(name = "total", required = false)
    private Total total;

    /**
     * AC - Grupo de informações sobre Pagamento do CFe
     */
    @Getter
    @Setter
    @Element(name = "pgto", required = false)
    private Pgto pgto;

    /**
     * AC - Grupo de Informações Adicionais
     */
    @Getter
    @Setter
    @Element(name = "infAdic", required = false)
    private InfAdic infAdic;

}
