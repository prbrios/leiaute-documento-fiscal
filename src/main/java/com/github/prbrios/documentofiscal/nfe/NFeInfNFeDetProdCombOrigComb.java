package com.github.prbrios.documentofiscal.nfe;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("origComb")
@Root(name = "origcomb")
public class NFeInfNFeDetProdCombOrigComb {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("indimport")
    @Element(name = "indImport", required = false)
    private String indImport;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cuforig")
    @Element(name = "cUFOrig", required = false)
    private String cUFOrig;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("porig")
    @Element(name = "pOrig", required = false)
    private String pOrig;

    public String getIndImport() {
        return indImport;
    }

    public void setIndImport(String indImport) {
        this.indImport = indImport;
    }

    public String getcUFOrig() {
        return cUFOrig;
    }

    public void setcUFOrig(String cUFOrig) {
        this.cUFOrig = cUFOrig;
    }

    public String getpOrig() {
        return pOrig;
    }

    public void setpOrig(String pOrig) {
        this.pOrig = pOrig;
    }
    
}
