package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@Root(name = "imposto")
public class NFeInfNFeDetImposto {

    @Element(name = "vTotTrib", required = false)
    private String vTotTrib;

    @Element(name = "ICMS", required = false)
    private NFeInfNFeDetImpostoICMS ICMS;

    @Element(name = "IPI", required = false)
    private NFeInfNFeDetImpostoIPI IPI;

    @Element(name = "II", required = false)
    private NFeInfNFeDetImpostoII II;

    @Element(name = "ISSQN", required = false)
    private NFeInfNFeDetImpostoISSQN ISSQN;

    @Element(name = "PIS", required = false)
    private NFeInfNFeDetImpostoPIS PIS;

    @Element(name = "PISST", required = false)
    private NFeInfNFeDetImpostoPISST PISST;

    @Element(name = "COFINS", required = false)
    private NFeInfNFeDetImpostoCOFINS COFINS;

    @Element(name = "COFINSST", required = false)
    private NFeInfNFeDetImpostoCOFINSST COFINSST;

    @Element(name = "ICMSUFDest", required = false)
    private NFeInfNFeDetImpostoICMSUFDest ICMSUFDest;

    public NFeInfNFeDetImposto() {}

    /**
     *
     * @param vTotTrib
     * @param ICMS
     * @param IPI
     * @param II
     * @param ISSQN
     * @param PIS
     * @param PISST
     * @param COFINS
     * @param COFINSST
     * @param ICMSUFDest
     */
    public NFeInfNFeDetImposto(String vTotTrib, NFeInfNFeDetImpostoICMS ICMS, NFeInfNFeDetImpostoIPI IPI, NFeInfNFeDetImpostoII II, NFeInfNFeDetImpostoISSQN ISSQN, NFeInfNFeDetImpostoPIS PIS, NFeInfNFeDetImpostoPISST PISST, NFeInfNFeDetImpostoCOFINS COFINS, NFeInfNFeDetImpostoCOFINSST COFINSST, NFeInfNFeDetImpostoICMSUFDest ICMSUFDest) {
        this.vTotTrib = vTotTrib;
        this.ICMS = ICMS;
        this.IPI = IPI;
        this.II = II;
        this.ISSQN = ISSQN;
        this.PIS = PIS;
        this.PISST = PISST;
        this.COFINS = COFINS;
        this.COFINSST = COFINSST;
        this.ICMSUFDest = ICMSUFDest;
    }

}
