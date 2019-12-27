package com.github.prbrios.documentofiscal.nfe.evento.envio;

import lombok.Data;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "infEvento")
public class EnvEventoEventoInfEvento {

    @Attribute(name = "id", required = false)
    private String id;

    @Element(name = "cOrgao", required = false)
    private String cOrgao;

    @Element(name = "tpAmb", required = false)
    private String tpAmb;

    @Element(name = "CNPJ", required = false)
    private String CNPJ;

    @Element(name = "CPF", required = false)
    private String CPF;

    @Element(name = "chNFe", required = false)
    private String chNFe;

    @Element(name = "dhEvento", required = false)
    private String dhEvento;

    @Element(name = "tpEvento", required = false)
    private String tpEvento;

    @Element(name = "nSeqEvento", required = false)
    private String nSeqEvento;

    @Element(name = "verEvento", required = false)
    private String verEvento = "1.00";

    @Element(name = "detEvento", required = false)
    private EnvEventoEventoInfEventoDetEvento detEvento;

    public EnvEventoEventoInfEvento() {}

    /**
     *
     * @param id
     * @param cOrgao
     * @param tpAmb
     * @param CNPJ
     * @param CPF
     * @param chNFe
     * @param dhEvento
     * @param tpEvento
     * @param nSeqEvento
     * @param verEvento
     * @param detEvento
     */
    public EnvEventoEventoInfEvento(String id, String cOrgao, String tpAmb, String CNPJ, String CPF, String chNFe, String dhEvento, String tpEvento, String nSeqEvento, String verEvento, EnvEventoEventoInfEventoDetEvento detEvento) {
        this.id = id;
        this.cOrgao = cOrgao;
        this.tpAmb = tpAmb;
        this.CNPJ = CNPJ;
        this.CPF = CPF;
        this.chNFe = chNFe;
        this.dhEvento = dhEvento;
        this.tpEvento = tpEvento;
        this.nSeqEvento = nSeqEvento;
        this.verEvento = verEvento;
        this.detEvento = detEvento;
    }
}
