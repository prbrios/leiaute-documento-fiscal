package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@JsonRootName("fat")
@Data
@Root(name = "fat")
public class NFeInfNFeCobrFat {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("nfat")
    @Element(name = "nFat", required = false)
    private String nFat;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vorig")
    @Element(name = "vOrig", required = false)
    private String vOrig;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vdesc")
    @Element(name = "vDesc", required = false)
    private String vDesc;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vliq")
    @Element(name = "vLiq", required = false)
    private String vLiq;

    public NFeInfNFeCobrFat() {}

    /**
     *
     * @param nFat
     * @param vOrig
     * @param vDesc
     * @param vLiq
     */
    public NFeInfNFeCobrFat(String nFat, String vOrig, String vDesc, String vLiq) {
        this.nFat = nFat;
        this.vOrig = vOrig;
        this.vDesc = vDesc;
        this.vLiq = vLiq;
    }

}
