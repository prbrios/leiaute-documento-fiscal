package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@JsonRootName("ipitrib")
@Data
@Root(name = "IPITrib")
public class NFeInfNFeDetImpostoIPIIPITrib {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cst")
    @Element(name = "CST", required = false)
    private String CST;


    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vbc")
    @Element(name = "vBC", required = false)
    private String vBC;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("pip")
    @Element(name = "pIPI", required = false)
    private String pIPI;


    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("qunid")
    @Element(name = "qUnid", required = false)
    private String qUnid;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vunid")
    @Element(name = "vUnid", required = false)
    private String vUnid;


    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vipi")
    @Element(name = "vIPI", required = false)
    private String vIPI;

    public NFeInfNFeDetImpostoIPIIPITrib() {}

    /**
     *
     * @param CST
     * @param vBC
     * @param pIPI
     * @param qUnid
     * @param vUnid
     * @param vIPI
     */
    public NFeInfNFeDetImpostoIPIIPITrib(String CST, String vBC, String pIPI, String qUnid, String vUnid, String vIPI) {
        this.CST = CST;
        this.vBC = vBC;
        this.pIPI = pIPI;
        this.qUnid = qUnid;
        this.vUnid = vUnid;
        this.vIPI = vIPI;
    }

}
