package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@JsonRootName("deduc")
@Data
@Root(name = "deduc")
public class NFeInfNFeCanaDeduc {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("xded")
    @Element(name = "xDed", required = false)
    private String xDed;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vded")
    @Element(name = "vDed", required = false)
    private String vDed;

    public NFeInfNFeCanaDeduc() {}

    /**
     *
     * @param xDed
     * @param vDed
     */
    public NFeInfNFeCanaDeduc(String xDed, String vDed) {
        this.xDed = xDed;
        this.vDed = vDed;
    }

}
