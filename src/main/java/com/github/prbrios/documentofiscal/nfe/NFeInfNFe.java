package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.*;
import lombok.Data;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;

@JsonRootName("infnfe")
@Data
@Root(name = "infNFe")
public class NFeInfNFe {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("versao")
    @Attribute(name="versao", required = false)
    private String versao;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("id")
    @Attribute(name = "Id", required = false)
    private String id;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("ide")
    @Element(name = "ide", required = false)
    private NFeInfNFeIde ide;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("emit")
    @Element(name = "emit", required = false)
    private NFeInfNFeEmit emit;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("avulsa")
    @Element(name = "avulsa", required = false)
    private NFeInfNFeAvulsa avulsa;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("dest")
    @Element(name = "dest", required = false)
    private NFeInfNFeDest dest;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("retirada")
    @Element(name = "retirada", required = false)
    private NFeInfNFeRetirada retirada;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("entrega")
    @Element(name = "entrega", required = false)
    private NFeInfNFeEntrega entrega;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("autxml")
    @ElementList(name = "autXML", required = false, inline = true)
    private List<NFeInfNFeAutXML> autXML = new ArrayList<NFeInfNFeAutXML>();

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("det")
    @ElementList(name = "det", required = false, inline = true)
    private List<NFeInfNFeDet> det = new ArrayList<NFeInfNFeDet>();

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("total")
    @Element(name = "total", required = false)
    private NFeInfNFeTotal total;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("transp")
    @Element(name = "transp", required = false)
    private NFeInfNFeTransp transp;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cobr")
    @Element(name = "cobr", required = false)
    private NFeInfNFeCobr cobr;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("pag")
    @Element(name = "pag", required = false)
    private NFeInfNFePag pag;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("infadic")
    @Element(name = "infAdic", required = false)
    private NFeInfNFeInfAdic infAdic;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("exporta")
    @Element(name = "exporta", required = false)
    private NFeInfNFeExporta exporta;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("compra")
    @Element(name = "compra", required = false)
    private NFeInfNFeCompra compra;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cana")
    @Element(name = "cana", required = false)
    private NFeInfNFeCana cana;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("infresptec")
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
