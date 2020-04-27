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

@JsonRootName("prod")
@Data
@Root(name = "prod")
public class NFeInfNFeDetProd {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cprod")
    @Element(name = "cProd", required = false)
    private String cProd;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cean")
    @Element(name = "cEAN", required = false)
    private String cEAN;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("xprod")
    @Element(name = "xProd", required = false)
    private String xProd;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("ncm")
    @Element(name = "NCM", required = false)
    private String NCM;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("nve")
    @ElementList(name = "NVE", required = false, inline = true)
    private List<String> NVE = new ArrayList<String>();

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cest")
    @Element(name = "CEST", required = false)
    private String CEST;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("indescala")
    @Element(name = "indEscala", required = false)
    private String indEscala;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cnpjfab")
    @Element(name = "CNPJFab", required = false)
    private String CNPJFab;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cbenef")
    @Element(name = "cBenef", required = false)
    private String cBenef;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("extipi")
    @Element(name = "EXTIPI", required = false)
    private String EXTIPI;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cfop")
    @Element(name = "CFOP", required = false)
    private String CFOP;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("ucom")
    @Element(name = "uCom", required = false)
    private String uCom;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("qcom")
    @Element(name = "qCom", required = false)
    private String qCom;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vuncom")
    @Element(name = "vUnCom", required = false)
    private String vUnCom;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vprod")
    @Element(name = "vProd", required = false)
    private String vProd;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("ceantrib")
    @Element(name = "cEANTrib", required = false)
    private String cEANTrib;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("utrib")
    @Element(name = "uTrib", required = false)
    private String uTrib;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("qtrib")
    @Element(name = "qTrib", required = false)
    private String qTrib;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vuntrib")
    @Element(name = "vUnTrib", required = false)
    private String vUnTrib;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vfrete")
    @Element(name = "vFrete", required = false)
    private String vFrete;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vseg")
    @Element(name = "vSeg", required = false)
    private String vSeg;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vdesc")
    @Element(name = "vDesc", required = false)
    private String vDesc;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("voutro")
    @Element(name = "vOutro", required = false)
    private String vOutro;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("indtot")
    @Element(name = "indTot", required = false)
    private String indTot;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("di")
    @Element(name = "DI", required = false)
    private NFeInfNFeDetProdDI DI;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("detexport")
    @ElementList(name = "detExport", required = false, inline = true)
    private List<NFeInfNFeDetProdDetExport> detExport = new ArrayList<NFeInfNFeDetProdDetExport>();

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("xped")
    @Element(name = "xPed", required = false)
    private String xPed;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("nitemped")
    @Element(name = "nItemPed", required = false)
    private String nItemPed;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("nfci")
    @Element(name = "nFCI", required = false)
    private String nFCI;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("rastro")
    @ElementList(name = "rastro", required = false, inline = true)
    private List<NFeInfNFeDetProdRastro> rastro = new ArrayList<NFeInfNFeDetProdRastro>();

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("veicprod")
    @Element(name = "veicProd", required = false)
    private NFeInfNFeDetProdVeicProd veicProd;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("med")
    @Element(name = "med", required = false)
    private NFeInfNFeDetProdMed med;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("arma")
    @ElementList(name = "arma", required = false, inline = true)
    private List<NFeInfNFeDetProdArma> arma = new ArrayList<NFeInfNFeDetProdArma>();

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("comb")
    @Element(name = "comb", required = false)
    private NFeInfNFeDetProdComb comb;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("nrecopi")
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
