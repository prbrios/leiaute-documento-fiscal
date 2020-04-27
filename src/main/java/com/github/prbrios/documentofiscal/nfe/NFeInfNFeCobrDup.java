package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@JsonRootName("dup")
@Data
@Root(name = "dup")
public class NFeInfNFeCobrDup {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("ndup")
    @Element(name = "nDup", required = false)
    private String nDup;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("dvenc")
    @Element(name = "dVenc", required = false)
    private String dVenc;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vdup")
    @Element(name = "vDup", required = false)
    private String vDup;

    public NFeInfNFeCobrDup() {}

    /**
     *
     * @param nDup
     * @param dVenc
     * @param vDup
     */
    public NFeInfNFeCobrDup(String nDup, String dVenc, String vDup) {
        this.nDup = nDup;
        this.dVenc = dVenc;
        this.vDup = vDup;
    }

}
