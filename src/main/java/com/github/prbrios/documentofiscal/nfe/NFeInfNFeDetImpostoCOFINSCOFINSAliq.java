package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@JsonRootName("cofinsaliq")
@Data
@Root(name = "COFINSAliq")
public class NFeInfNFeDetImpostoCOFINSCOFINSAliq {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cst")
    @Element(name = "CST", required = false)
    private String CST;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vbc")
    @Element(name = "vBC", required = false)
    private String vBC;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("pcofins")
    @Element(name = "pCOFINS", required = false)
    private String pCOFINS;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vcofins")
    @Element(name = "vCOFINS", required = false)
    private String vCOFINS;

    public NFeInfNFeDetImpostoCOFINSCOFINSAliq() {}

    /**
     *
     * @param CST
     * @param vBC
     * @param pCOFINS
     * @param vCOFINS
     */
    public NFeInfNFeDetImpostoCOFINSCOFINSAliq(String CST, String vBC, String pCOFINS, String vCOFINS) {
        this.CST = CST;
        this.vBC = vBC;
        this.pCOFINS = pCOFINS;
        this.vCOFINS = vCOFINS;
    }

}
