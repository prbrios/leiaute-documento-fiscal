package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;

@Data
@Root(name = "ide")
public class NFeInfNFeIde {

    @Element(name = "cUF", required = false)
    private String cUF;

    @Element(name = "cNF", required = false)
    private String cNF;

    @Element(name = "natOp", required = false)
    private String natOp;

    @Element(name = "mod", required = false)
    private String mod;

    @Element(name = "serie", required = false)
    private String serie;

    @Element(name = "nNF", required = false)
    private String nNF;

    @Element(name = "dhEmi", required = false)
    private String dhEmi;

    @Element(name = "dhSaiEnt", required = false)
    private String dhSaiEnt;

    @Element(name = "tpNF", required = false)
    private String tpNF;

    @Element(name = "idDest", required = false)
    private String idDest;

    @Element(name = "cMunFG", required = false)
    private String cMunFG;

    @Element(name = "tpImp", required = false)
    private String tpImp;

    @Element(name = "tpEmis", required = false)
    private String tpEmis;

    @Element(name = "cDV", required = false)
    private String cDV;

    @Element(name = "tpAmb", required = false)
    private String tpAmb;

    @Element(name = "finNFe", required = false)
    private String finNFe;

    @Element(name = "indFinal", required = false)
    private String indFinal;

    @Element(name = "indPres", required = false)
    private String indPres;

    @Element(name = "procEmi", required = false)
    private String procEmi;

    @Element(name = "verProc", required = false)
    private String verProc;

    @Element(name = "dhCont", required = false)
    private String dhCont;

    @Element(name = "xJust", required = false)
    private String xJust;

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
