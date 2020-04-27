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

@JsonRootName("ide")
@Data
@Root(name = "ide")
public class NFeInfNFeIde {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cuf")
    @Element(name = "cUF", required = false)
    private String cUF;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cnf")
    @Element(name = "cNF", required = false)
    private String cNF;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("natop")
    @Element(name = "natOp", required = false)
    private String natOp;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("mod")
    @Element(name = "mod", required = false)
    private String mod;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("serie")
    @Element(name = "serie", required = false)
    private String serie;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("nnf")
    @Element(name = "nNF", required = false)
    private String nNF;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("dhemi")
    @Element(name = "dhEmi", required = false)
    private String dhEmi;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("dhsaient")
    @Element(name = "dhSaiEnt", required = false)
    private String dhSaiEnt;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("tpnf")
    @Element(name = "tpNF", required = false)
    private String tpNF;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("iddest")
    @Element(name = "idDest", required = false)
    private String idDest;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cmunfg")
    @Element(name = "cMunFG", required = false)
    private String cMunFG;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("tpimp")
    @Element(name = "tpImp", required = false)
    private String tpImp;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("tpemis")
    @Element(name = "tpEmis", required = false)
    private String tpEmis;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cdv")
    @Element(name = "cDV", required = false)
    private String cDV;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("tpamb")
    @Element(name = "tpAmb", required = false)
    private String tpAmb;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("finnfe")
    @Element(name = "finNFe", required = false)
    private String finNFe;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("indfinal")
    @Element(name = "indFinal", required = false)
    private String indFinal;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("indpres")
    @Element(name = "indPres", required = false)
    private String indPres;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("procemi")
    @Element(name = "procEmi", required = false)
    private String procEmi;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("verproc")
    @Element(name = "verProc", required = false)
    private String verProc;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("dhcont")
    @Element(name = "dhCont", required = false)
    private String dhCont;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("xjust")
    @Element(name = "xJust", required = false)
    private String xJust;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("nfref")
    @ElementList(name = "NFref", required = false, inline = true)
    private List<NFeInfNFeIdeNFref> nFref = new ArrayList<NFeInfNFeIdeNFref>();

    public NFeInfNFeIde() {}

    /**
     *
     * @param cUF
     * @param cNF
     * @param natOp
     * @param mod
     * @param serie
     * @param nNF
     * @param dhEmi
     * @param dhSaiEnt
     * @param tpNF
     * @param idDest
     * @param cMunFG
     * @param tpImp
     * @param tpEmis
     * @param cDV
     * @param tpAmb
     * @param finNFe
     * @param indFinal
     * @param indPres
     * @param procEmi
     * @param verProc
     * @param dhCont
     * @param xJust
     * @param nFref
     */
    public NFeInfNFeIde(String cUF, String cNF, String natOp, String mod, String serie, String nNF, String dhEmi, String dhSaiEnt, String tpNF, String idDest, String cMunFG, String tpImp, String tpEmis, String cDV, String tpAmb, String finNFe, String indFinal, String indPres, String procEmi, String verProc, String dhCont, String xJust, List<NFeInfNFeIdeNFref> nFref) {
        this.cUF = cUF;
        this.cNF = cNF;
        this.natOp = natOp;
        this.mod = mod;
        this.serie = serie;
        this.nNF = nNF;
        this.dhEmi = dhEmi;
        this.dhSaiEnt = dhSaiEnt;
        this.tpNF = tpNF;
        this.idDest = idDest;
        this.cMunFG = cMunFG;
        this.tpImp = tpImp;
        this.tpEmis = tpEmis;
        this.cDV = cDV;
        this.tpAmb = tpAmb;
        this.finNFe = finNFe;
        this.indFinal = indFinal;
        this.indPres = indPres;
        this.procEmi = procEmi;
        this.verProc = verProc;
        this.dhCont = dhCont;
        this.xJust = xJust;
        this.nFref = nFref;
    }

}
