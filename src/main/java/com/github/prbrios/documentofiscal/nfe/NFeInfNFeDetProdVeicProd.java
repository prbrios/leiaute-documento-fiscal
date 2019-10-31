package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "veicProd")
public class NFeInfNFeDetProdVeicProd {

    @Element(name = "tpOp", required = false)
    private String tpOp;

    @Element(name = "chassi", required = false)
    private String chassi;

    @Element(name = "cCor", required = false)
    private String cCor;

    @Element(name = "xCor", required = false)
    private String xCor;

    @Element(name = "pot", required = false)
    private String pot;

    @Element(name = "cilin", required = false)
    private String cilin;

    @Element(name = "pesoL", required = false)
    private String pesoL;

    @Element(name = "pesoB", required = false)
    private String pesoB;

    @Element(name = "nSerie", required = false)
    private String nSerie;

    @Element(name = "tpComb", required = false)
    private String tpComb;

    @Element(name = "nMotor", required = false)
    private String nMotor;

    @Element(name = "CMT", required = false)
    private String CMT;

    @Element(name = "dist", required = false)
    private String dist;

    @Element(name = "anoMod", required = false)
    private String anoMod;

    @Element(name = "anoFab", required = false)
    private String anoFab;

    @Element(name = "tpPint", required = false)
    private String tpPint;

    @Element(name = "tpVeic", required = false)
    private String tpVeic;

    @Element(name = "espVeic", required = false)
    private String espVeic;

    @Element(name = "VIN", required = false)
    private String VIN;

    @Element(name = "condVeic", required = false)
    private String condVeic;

    @Element(name = "cMod", required = false)
    private String cMod;

    @Element(name = "cCorDENATRAN", required = false)
    private String cCorDENATRAN;

    @Element(name = "lota", required = false)
    private String lota;

    @Element(name = "tpRest", required = false)
    private String tpRest;

    public NFeInfNFeDetProdVeicProd() {}

    /**
     *
     * @param tpOp
     * @param chassi
     * @param cCor
     * @param xCor
     * @param pot
     * @param cilin
     * @param pesoL
     * @param pesoB
     * @param nSerie
     * @param tpComb
     * @param nMotor
     * @param CMT
     * @param dist
     * @param anoMod
     * @param anoFab
     * @param tpPint
     * @param tpVeic
     * @param espVeic
     * @param VIN
     * @param condVeic
     * @param cMod
     * @param cCorDENATRAN
     * @param lota
     * @param tpRest
     */
    public NFeInfNFeDetProdVeicProd(String tpOp, String chassi, String cCor, String xCor, String pot, String cilin, String pesoL, String pesoB, String nSerie, String tpComb, String nMotor, String CMT, String dist, String anoMod, String anoFab, String tpPint, String tpVeic, String espVeic, String VIN, String condVeic, String cMod, String cCorDENATRAN, String lota, String tpRest) {
        this.tpOp = tpOp;
        this.chassi = chassi;
        this.cCor = cCor;
        this.xCor = xCor;
        this.pot = pot;
        this.cilin = cilin;
        this.pesoL = pesoL;
        this.pesoB = pesoB;
        this.nSerie = nSerie;
        this.tpComb = tpComb;
        this.nMotor = nMotor;
        this.CMT = CMT;
        this.dist = dist;
        this.anoMod = anoMod;
        this.anoFab = anoFab;
        this.tpPint = tpPint;
        this.tpVeic = tpVeic;
        this.espVeic = espVeic;
        this.VIN = VIN;
        this.condVeic = condVeic;
        this.cMod = cMod;
        this.cCorDENATRAN = cCorDENATRAN;
        this.lota = lota;
        this.tpRest = tpRest;
    }

}
