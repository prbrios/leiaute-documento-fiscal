package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@JsonRootName("lacres")
@Data
@Root(name = "lacres")
public class NFeInfNFeTranspVolLacres {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("nlacre")
    @Element(name = "nLacre", required = false)
    private String nLacre;

    public NFeInfNFeTranspVolLacres() {}

    /**
     *
     * @param nLacre
     */
    public NFeInfNFeTranspVolLacres(String nLacre) {
        this.nLacre = nLacre;
    }

}
