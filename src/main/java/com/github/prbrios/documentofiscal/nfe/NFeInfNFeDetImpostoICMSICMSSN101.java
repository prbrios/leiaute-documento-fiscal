package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@JsonRootName("icmssn101")
@Data
@Root(name = "ICMSSN101")
public class NFeInfNFeDetImpostoICMSICMSSN101 {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("orig")
    @Element(name = "orig", required = false)
    private String orig;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("csosn")
    @Element(name = "CSOSN", required = false)
    private String CSOSN;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("pcredsn")
    @Element(name = "pCredSN", required = false)
    private String pCredSN;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vcredicmssn")
    @Element(name = "vCredICMSSN", required = false)
    private String vCredICMSSN;

    public NFeInfNFeDetImpostoICMSICMSSN101() {}

    /**
     *
     * @param orig
     * @param CSOSN
     * @param pCredSN
     * @param vCredICMSSN
     */
    public NFeInfNFeDetImpostoICMSICMSSN101(String orig, String CSOSN, String pCredSN, String vCredICMSSN) {
        this.orig = orig;
        this.CSOSN = CSOSN;
        this.pCredSN = pCredSN;
        this.vCredICMSSN = vCredICMSSN;
    }

}
