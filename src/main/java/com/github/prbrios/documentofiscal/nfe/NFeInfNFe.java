package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;

@Data
@Root(name = "infNFe")
public class NFeInfNFe {

    @Attribute(name="versao", required = false)
    private String versao;

    @Attribute(name = "Id", required = false)
    private String id;

    @Element(name = "ide", required = false)
    private NFeInfNFeIde ide;

    @Element(name = "emit", required = false)
    private NFeInfNFeEmit emit;

    @Element(name = "avulsa", required = false)
    private NFeInfNFeAvulsa avulsa;

    @Element(name = "dest", required = false)
    private NFeInfNFeDest dest;

    @Element(name = "retirada", required = false)
    private NFeInfNFeRetirada retirada;

    @Element(name = "entrega", required = false)
    private NFeInfNFeEntrega entrega;

    @ElementList(name = "autXML", required = false, inline = true)
    private List<NFeInfNFeAutXML> autXML = new ArrayList<NFeInfNFeAutXML>();

    @ElementList(name = "det", required = false, inline = true)
    private List<NFeInfNFeDet> det = new ArrayList<NFeInfNFeDet>();

    @Element(name = "total", required = false)
    private NFeInfNFeTotal total;

    @Element(name = "transp", required = false)
    private NFeInfNFeTransp transp;

    @Element(name = "cobr", required = false)
    private NFeInfNFeCobr cobr;

    @Element(name = "pag", required = false)
    private NFeInfNFePag pag;

    @Element(name = "infAdic", required = false)
    private NFeInfNFeInfAdic infAdic;

    @Element(name = "exporta", required = false)
    private NFeInfNFeExporta exporta;

    @Element(name = "compra", required = false)
    private NFeInfNFeCompra compra;

    @Element(name = "cana", required = false)
    private NFeInfNFeCana cana;

    @Element(name = "infRespTec", required = false)
    private NFeInfNFeInfRespTec infRespTec;

    public NFeInfNFe() {}

    /**
     *
     * @param versao
     * @param id
     * @param ide
     * @param emit
     * @param avulsa
     * @param dest
     * @param retirada
     * @param entrega
     * @param autXML
     * @param det
     * @param total
     * @param transp
     * @param cobr
     * @param pag
     * @param infAdic
     * @param exporta
     * @param compra
     * @param cana
     * @param infRespTec
     */
    public NFeInfNFe(String versao, String id, NFeInfNFeIde ide, NFeInfNFeEmit emit, NFeInfNFeAvulsa avulsa, NFeInfNFeDest dest, NFeInfNFeRetirada retirada, NFeInfNFeEntrega entrega, List<NFeInfNFeAutXML> autXML, List<NFeInfNFeDet> det, NFeInfNFeTotal total, NFeInfNFeTransp transp, NFeInfNFeCobr cobr, NFeInfNFePag pag, NFeInfNFeInfAdic infAdic, NFeInfNFeExporta exporta, NFeInfNFeCompra compra, NFeInfNFeCana cana, NFeInfNFeInfRespTec infRespTec) {
        this.versao = versao;
        this.id = id;
        this.ide = ide;
        this.emit = emit;
        this.avulsa = avulsa;
        this.dest = dest;
        this.retirada = retirada;
        this.entrega = entrega;
        this.autXML = autXML;
        this.det = det;
        this.total = total;
        this.transp = transp;
        this.cobr = cobr;
        this.pag = pag;
        this.infAdic = infAdic;
        this.exporta = exporta;
        this.compra = compra;
        this.cana = cana;
        this.infRespTec = infRespTec;
    }

}
