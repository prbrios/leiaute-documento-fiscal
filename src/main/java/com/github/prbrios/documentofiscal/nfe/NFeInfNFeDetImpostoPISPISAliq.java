package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@JsonRootName("pisaliq")
@Data
@Root(name = "PISAliq")
public class NFeInfNFeDetImpostoPISPISAliq {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cst")
    @Element(name = "CST", required = false)
    private String CST;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vbc")
    @Element(name = "vBC", required = false)
    private String vBC;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("ppis")
    @Element(name = "pPIS", required = false)
    private String pPIS;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vpis")
    @Element(name = "vPIS", required = false)
    private String vPIS;

    public NFeInfNFeDetImpostoPISPISAliq() {}

    /**
     *
     * @param CST
     * @param vBC
     * @param pPIS
     * @param vPIS
     */
    public NFeInfNFeDetImpostoPISPISAliq(String CST, String vBC, String pPIS, String vPIS) {
        this.CST = CST;
        this.vBC = vBC;
        this.pPIS = pPIS;
        this.vPIS = vPIS;
    }

}
