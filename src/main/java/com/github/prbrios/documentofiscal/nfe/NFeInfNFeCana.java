package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;

@JsonRootName("cana")
@Data
@Root(name = "cana")
public class NFeInfNFeCana {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("safra")
    @Element(name = "safra", required = false)
    private String safra;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("ref")
    @Element(name = "ref", required = false)
    private String ref;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("fordia")
    @ElementList(name = "forDia", required = false, inline = true)
    private List<NFeInfNFeCanaForDia> forDia = new ArrayList<NFeInfNFeCanaForDia>();

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("qtotmes")
    @Element(name = "qTotMes", required = false)
    private String qTotMes;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("qtotant")
    @Element(name = "qTotAnt", required = false)
    private String qTotAnt;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("qtotger")
    @Element(name = "qTotGer", required = false)
    private String qTotGer;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("deduc")
    @ElementList(name = "deduc", required = false, inline = true)
    private List<NFeInfNFeCanaDeduc> deduc = new ArrayList<NFeInfNFeCanaDeduc>();

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vfor")
    @Element(name = "vFor", required = false)
    private String vFor;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vtotded")
    @Element(name = "vTotDed", required = false)
    private String vTotDed;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vliqfor")
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
