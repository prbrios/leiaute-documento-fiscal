package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@JsonRootName("imposto")
@Data
@Root(name = "imposto")
public class NFeInfNFeDetImposto {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vtottrib")
    @Element(name = "vTotTrib", required = false)
    private String vTotTrib;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("icms")
    @Element(name = "ICMS", required = false)
    private NFeInfNFeDetImpostoICMS ICMS;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("ipi")
    @Element(name = "IPI", required = false)
    private NFeInfNFeDetImpostoIPI IPI;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("ii")
    @Element(name = "II", required = false)
    private NFeInfNFeDetImpostoII II;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("issqn")
    @Element(name = "ISSQN", required = false)
    private NFeInfNFeDetImpostoISSQN ISSQN;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("pis")
    @Element(name = "PIS", required = false)
    private NFeInfNFeDetImpostoPIS PIS;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("pisst")
    @Element(name = "PISST", required = false)
    private NFeInfNFeDetImpostoPISST PISST;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cofins")
    @Element(name = "COFINS", required = false)
    private NFeInfNFeDetImpostoCOFINS COFINS;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cofinsst")
    @Element(name = "COFINSST", required = false)
    private NFeInfNFeDetImpostoCOFINSST COFINSST;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("icmsufdest")
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
