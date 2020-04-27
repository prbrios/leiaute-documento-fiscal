package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@JsonRootName("ii")
@Data
@Root(name = "II")
public class NFeInfNFeDetImpostoII {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vbc")
    @Element(name = "vBC", required = false)
    private String vBC;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vdespadu")
    @Element(name = "vDespAdu", required = false)
    private String vDespAdu;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vii")
    @Element(name = "vII", required = false)
    private String vII;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("viof")
    @Element(name = "vIOF", required = false)
    private String vIOF;

    public NFeInfNFeDetImpostoII() {}

    /**
     *
     * @param vBC
     * @param vDespAdu
     * @param vII
     * @param vIOF
     */
    public NFeInfNFeDetImpostoII(String vBC, String vDespAdu, String vII, String vIOF) {
        this.vBC = vBC;
        this.vDespAdu = vDespAdu;
        this.vII = vII;
        this.vIOF = vIOF;
    }

}
