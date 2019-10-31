package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;

@Data
@Root(name = "cana")
public class NFeInfNFeCana {

    @Element(name = "safra", required = false)
    private String safra;

    @Element(name = "ref", required = false)
    private String ref;

    @ElementList(name = "forDia", required = false, inline = true)
    private List<NFeInfNFeCanaForDia> forDia = new ArrayList<NFeInfNFeCanaForDia>();

    @Element(name = "qTotMes", required = false)
    private String qTotMes;

    @Element(name = "qTotAnt", required = false)
    private String qTotAnt;

    @Element(name = "qTotGer", required = false)
    private String qTotGer;

    @ElementList(name = "deduc", required = false, inline = true)
    private List<NFeInfNFeCanaDeduc> deduc = new ArrayList<NFeInfNFeCanaDeduc>();

    @Element(name = "vFor", required = false)
    private String vFor;

    @Element(name = "vTotDed", required = false)
    private String vTotDed;

    @Element(name = "vLiqFor", required = false)
    private String vLiqFor;

    public NFeInfNFeCana() {}

    /**
     *
     * @param safra
     * @param ref
     * @param forDia
     * @param qTotMes
     * @param qTotAnt
     * @param qTotGer
     * @param deduc
     * @param vFor
     * @param vTotDed
     * @param vLiqFor
     */
    public NFeInfNFeCana(String safra, String ref, List<NFeInfNFeCanaForDia> forDia, String qTotMes, String qTotAnt, String qTotGer, List<NFeInfNFeCanaDeduc> deduc, String vFor, String vTotDed, String vLiqFor) {
        this.safra = safra;
        this.ref = ref;
        this.forDia = forDia;
        this.qTotMes = qTotMes;
        this.qTotAnt = qTotAnt;
        this.qTotGer = qTotGer;
        this.deduc = deduc;
        this.vFor = vFor;
        this.vTotDed = vTotDed;
        this.vLiqFor = vLiqFor;
    }

}
