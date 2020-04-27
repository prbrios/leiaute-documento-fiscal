package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@JsonRootName("icms")
@Data
@Root(name = "ICMS")
public class NFeInfNFeDetImpostoICMS {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("icms00")
    @Element(name = "ICMS00", required = false)
    private NFeInfNFeDetImpostoICMSICMS00 ICMS00;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("icms10")
    @Element(name = "ICMS10", required = false)
    private NFeInfNFeDetImpostoICMSICMS10 ICMS10;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("icms20")
    @Element(name = "ICMS20", required = false)
    private NFeInfNFeDetImpostoICMSICMS20 ICMS20;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("icms30")
    @Element(name = "ICMS30", required = false)
    private NFeInfNFeDetImpostoICMSICMS30 ICMS30;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("icms40")
    @Element(name = "ICMS40", required = false)
    private NFeInfNFeDetImpostoICMSICMS40 ICMS40;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("icms51")
    @Element(name = "ICMS51", required = false)
    private NFeInfNFeDetImpostoICMSICMS51 ICMS51;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("icms60")
    @Element(name = "ICMS60", required = false)
    private NFeInfNFeDetImpostoICMSICMS60 ICMS60;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("icms70")
    @Element(name = "ICMS70", required = false)
    private NFeInfNFeDetImpostoICMSICMS70 ICMS70;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("icms90")
    @Element(name = "ICMS90", required = false)
    private NFeInfNFeDetImpostoICMSICMS90 ICMS90;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("icmspart")
    @Element(name = "ICMSPart", required = false)
    private NFeInfNFeDetImpostoICMSICMSPart ICMSPart;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("icmsst")
    @Element(name = "ICMSST", required = false)
    private NFeInfNFeDetImpostoICMSICMSST ICMSST;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("icmssn101")
    @Element(name = "ICMSSN101", required = false)
    private NFeInfNFeDetImpostoICMSICMSSN101 ICMSSN101;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("icmssn102")
    @Element(name = "ICMSSN102", required = false)
    private NFeInfNFeDetImpostoICMSICMSSN102 ICMSSN102;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("icmssn201")
    @Element(name = "ICMSSN201", required = false)
    private NFeInfNFeDetImpostoICMSICMSSN201 ICMSSN201;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("icmssn202")
    @Element(name = "ICMSSN202", required = false)
    private NFeInfNFeDetImpostoICMSICMSSN202 ICMSSN202;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("icmssn500")
    @Element(name = "ICMSSN500", required = false)
    private NFeInfNFeDetImpostoICMSICMSSN500 ICMSSN500;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("icmssn900")
    @Element(name = "ICMSSN900", required = false)
    private NFeInfNFeDetImpostoICMSICMSSN900 ICMSSN900;

    public NFeInfNFeDetImpostoICMS() {}

    /**
     *
     * @param ICMS00
     * @param ICMS10
     * @param ICMS20
     * @param ICMS30
     * @param ICMS40
     * @param ICMS51
     * @param ICMS60
     * @param ICMS70
     * @param ICMS90
     * @param ICMSPart
     * @param ICMSST
     * @param ICMSSN101
     * @param ICMSSN102
     * @param ICMSSN201
     * @param ICMSSN202
     * @param ICMSSN500
     * @param ICMSSN900
     */
    public NFeInfNFeDetImpostoICMS(NFeInfNFeDetImpostoICMSICMS00 ICMS00, NFeInfNFeDetImpostoICMSICMS10 ICMS10, NFeInfNFeDetImpostoICMSICMS20 ICMS20, NFeInfNFeDetImpostoICMSICMS30 ICMS30, NFeInfNFeDetImpostoICMSICMS40 ICMS40, NFeInfNFeDetImpostoICMSICMS51 ICMS51, NFeInfNFeDetImpostoICMSICMS60 ICMS60, NFeInfNFeDetImpostoICMSICMS70 ICMS70, NFeInfNFeDetImpostoICMSICMS90 ICMS90, NFeInfNFeDetImpostoICMSICMSPart ICMSPart, NFeInfNFeDetImpostoICMSICMSST ICMSST, NFeInfNFeDetImpostoICMSICMSSN101 ICMSSN101, NFeInfNFeDetImpostoICMSICMSSN102 ICMSSN102, NFeInfNFeDetImpostoICMSICMSSN201 ICMSSN201, NFeInfNFeDetImpostoICMSICMSSN202 ICMSSN202, NFeInfNFeDetImpostoICMSICMSSN500 ICMSSN500, NFeInfNFeDetImpostoICMSICMSSN900 ICMSSN900) {
        this.ICMS00 = ICMS00;
        this.ICMS10 = ICMS10;
        this.ICMS20 = ICMS20;
        this.ICMS30 = ICMS30;
        this.ICMS40 = ICMS40;
        this.ICMS51 = ICMS51;
        this.ICMS60 = ICMS60;
        this.ICMS70 = ICMS70;
        this.ICMS90 = ICMS90;
        this.ICMSPart = ICMSPart;
        this.ICMSST = ICMSST;
        this.ICMSSN101 = ICMSSN101;
        this.ICMSSN102 = ICMSSN102;
        this.ICMSSN201 = ICMSSN201;
        this.ICMSSN202 = ICMSSN202;
        this.ICMSSN500 = ICMSSN500;
        this.ICMSSN900 = ICMSSN900;
    }

}
