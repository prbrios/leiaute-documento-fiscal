package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@JsonRootName("obsfisco")
@Data
@Root(name = "obsFisco")
public class NFeInfNFeInfAdicObsFisco {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("xtexto")
    @Element(name = "xTexto", required = false)
    private String xTexto;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("xcampo")
    @Element(name = "xCampo", required = false)
    private String xCampo;

    public NFeInfNFeInfAdicObsFisco() {}

    /**
     *
     * @param xTexto
     * @param xCampo
     */
    public NFeInfNFeInfAdicObsFisco(String xTexto, String xCampo) {
        this.xTexto = xTexto;
        this.xCampo = xCampo;
    }

}
