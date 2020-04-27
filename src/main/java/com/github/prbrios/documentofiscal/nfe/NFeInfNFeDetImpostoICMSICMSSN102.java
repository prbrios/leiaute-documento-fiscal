package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@JsonRootName("icmssn102")
@Data
@Root(name = "ICMSSN102")
public class NFeInfNFeDetImpostoICMSICMSSN102 {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("orig")
    @Element(name = "orig", required = false)
    private String orig;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("csosn")
    @Element(name = "CSOSN", required = false)
    private String CSOSN;

    public NFeInfNFeDetImpostoICMSICMSSN102() {}

    /**
     *
     * @param orig
     * @param CSOSN
     */
    public NFeInfNFeDetImpostoICMSICMSSN102(String orig, String CSOSN) {
        this.orig = orig;
        this.CSOSN = CSOSN;
    }

}
