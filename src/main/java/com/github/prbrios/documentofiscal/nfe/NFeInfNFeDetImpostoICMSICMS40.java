package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@JsonRootName("icms40")
@Data
@Root(name = "ICMS40")
public class NFeInfNFeDetImpostoICMSICMS40 {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("orig")
    @Element(name = "orig", required = false)
    private String orig;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cst")
    @Element(name = "CST", required = false)
    private String CST;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vicmsdeson")
    @Element(name = "vICMSDeson", required = false)
    private String vICMSDeson;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("motdesicms")
    @Element(name = "motDesICMS", required = false)
    private String motDesICMS;

    public NFeInfNFeDetImpostoICMSICMS40() {}

    /**
     *
     * @param orig
     * @param CST
     * @param vICMSDeson
     * @param motDesICMS
     */
    public NFeInfNFeDetImpostoICMSICMS40(String orig, String CST, String vICMSDeson, String motDesICMS) {
        this.orig = orig;
        this.CST = CST;
        this.vICMSDeson = vICMSDeson;
        this.motDesICMS = motDesICMS;
    }

}
