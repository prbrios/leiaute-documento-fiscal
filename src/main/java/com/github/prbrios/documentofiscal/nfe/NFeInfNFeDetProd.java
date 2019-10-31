package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;

@Data
@Root(name = "prod")
public class NFeInfNFeDetProd {

    @Element(name = "cProd", required = false)
    private String cProd;

    @Element(name = "cEAN", required = false)
    private String cEAN;

    @Element(name = "xProd", required = false)
    private String xProd;

    @Element(name = "NCM", required = false)
    private String NCM;

    @ElementList(name = "NVE", required = false, inline = true)
    private List<String> NVE = new ArrayList<String>();

    @Element(name = "CEST", required = false)
    private String CEST;

    @Element(name = "indEscala", required = false)
    private String indEscala;

    @Element(name = "CNPJFab", required = false)
    private String CNPJFab;

    @Element(name = "cBenef", required = false)
    private String cBenef;

    @Element(name = "EXTIPI", required = false)
    private String EXTIPI;

    @Element(name = "CFOP", required = false)
    private String CFOP;

    @Element(name = "uCom", required = false)
    private String uCom;

    @Element(name = "qCom", required = false)
    private String qCom;

    @Element(name = "vUnCom", required = false)
    private String vUnCom;

    @Element(name = "vProd", required = false)
    private String vProd;

    @Element(name = "cEANTrib", required = false)
    private String cEANTrib;

    @Element(name = "uTrib", required = false)
    private String uTrib;

    @Element(name = "qTrib", required = false)
    private String qTrib;

    @Element(name = "vUnTrib", required = false)
    private String vUnTrib;

    @Element(name = "vFrete", required = false)
    private String vFrete;

    @Element(name = "vSeg", required = false)
    private String vSeg;

    @Element(name = "vDesc", required = false)
    private String vDesc;

    @Element(name = "vOutro", required = false)
    private String vOutro;

    @Element(name = "indTot", required = false)
    private String indTot;

    @Element(name = "DI", required = false)
    private NFeInfNFeDetProdDI DI;

    @ElementList(name = "detExport", required = false, inline = true)
    private List<NFeInfNFeDetProdDetExport> detExport = new ArrayList<NFeInfNFeDetProdDetExport>();

    @Element(name = "xPed", required = false)
    private String xPed;

    @Element(name = "nItemPed", required = false)
    private String nItemPed;

    @Element(name = "nFCI", required = false)
    private String nFCI;

    @ElementList(name = "rastro", required = false, inline = true)
    private List<NFeInfNFeDetProdRastro> rastro = new ArrayList<NFeInfNFeDetProdRastro>();

    @Element(name = "veicProd", required = false)
    private NFeInfNFeDetProdVeicProd veicProd;

    @Element(name = "med", required = false)
    private NFeInfNFeDetProdMed med;

    @ElementList(name = "arma", required = false, inline = true)
    private List<NFeInfNFeDetProdArma> arma = new ArrayList<NFeInfNFeDetProdArma>();

    @Element(name = "comb", required = false)
    private NFeInfNFeDetProdComb comb;

    @Element(name = "nRECOPI", required = false)
    private String nRECOPI;

    public NFeInfNFeDetProd() {}

    /**
     *
     * @param cProd
     * @param cEAN
     * @param xProd
     * @param NCM
     * @param NVE
     * @param CEST
     * @param indEscala
     * @param CNPJFab
     * @param cBenef
     * @param EXTIPI
     * @param CFOP
     * @param uCom
     * @param qCom
     * @param vUnCom
     * @param vProd
     * @param cEANTrib
     * @param uTrib
     * @param qTrib
     * @param vUnTrib
     * @param vFrete
     * @param vSeg
     * @param vDesc
     * @param vOutro
     * @param indTot
     * @param DI
     * @param detExport
     * @param xPed
     * @param nItemPed
     * @param nFCI
     * @param rastro
     * @param veicProd
     * @param med
     * @param arma
     * @param comb
     * @param nRECOPI
     */
    public NFeInfNFeDetProd(String cProd, String cEAN, String xProd, String NCM, List<String> NVE, String CEST, String indEscala, String CNPJFab, String cBenef, String EXTIPI, String CFOP, String uCom, String qCom, String vUnCom, String vProd, String cEANTrib, String uTrib, String qTrib, String vUnTrib, String vFrete, String vSeg, String vDesc, String vOutro, String indTot, NFeInfNFeDetProdDI DI, List<NFeInfNFeDetProdDetExport> detExport, String xPed, String nItemPed, String nFCI, List<NFeInfNFeDetProdRastro> rastro, NFeInfNFeDetProdVeicProd veicProd, NFeInfNFeDetProdMed med, List<NFeInfNFeDetProdArma> arma, NFeInfNFeDetProdComb comb, String nRECOPI) {
        this.cProd = cProd;
        this.cEAN = cEAN;
        this.xProd = xProd;
        this.NCM = NCM;
        this.NVE = NVE;
        this.CEST = CEST;
        this.indEscala = indEscala;
        this.CNPJFab = CNPJFab;
        this.cBenef = cBenef;
        this.EXTIPI = EXTIPI;
        this.CFOP = CFOP;
        this.uCom = uCom;
        this.qCom = qCom;
        this.vUnCom = vUnCom;
        this.vProd = vProd;
        this.cEANTrib = cEANTrib;
        this.uTrib = uTrib;
        this.qTrib = qTrib;
        this.vUnTrib = vUnTrib;
        this.vFrete = vFrete;
        this.vSeg = vSeg;
        this.vDesc = vDesc;
        this.vOutro = vOutro;
        this.indTot = indTot;
        this.DI = DI;
        this.detExport = detExport;
        this.xPed = xPed;
        this.nItemPed = nItemPed;
        this.nFCI = nFCI;
        this.rastro = rastro;
        this.veicProd = veicProd;
        this.med = med;
        this.arma = arma;
        this.comb = comb;
        this.nRECOPI = nRECOPI;
    }

}
