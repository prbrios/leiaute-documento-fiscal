package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@JsonRootName("issqntot")
@Data
@Root(name = "ISSQNtot")
public class NFeInfNFeTotalISSQNtot {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vserv")
    @Element(name = "vServ", required = false)
    private String vServ;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vbc")
    @Element(name = "vBC", required = false)
    private String vBC;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("viss")
    @Element(name = "vISS", required = false)
    private String vISS;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vpis")
    @Element(name = "vPIS", required = false)
    private String vPIS;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vcofins")
    @Element(name = "vCOFINS", required = false)
    private String vCOFINS;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("dcompet")
    @Element(name = "dCompet", required = false)
    private String dCompet;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vdeducao")
    @Element(name = "vDeducao", required = false)
    private String vDeducao;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("voutro")
    @Element(name = "vOutro", required = false)
    private String vOutro;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vdescincond")
    @Element(name = "vDescIncond", required = false)
    private String vDescIncond;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vdesccond")
    @Element(name = "vDescCond", required = false)
    private String vDescCond;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vissret")
    @Element(name = "vISSRet", required = false)
    private String vISSRet;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cregtrib")
    @Element(name = "cRegTrib", required = false)
    private String cRegTrib;

    public NFeInfNFeTotalISSQNtot() {}

    /**
     *
     * @param vServ
     * @param vBC
     * @param vISS
     * @param vPIS
     * @param vCOFINS
     * @param dCompet
     * @param vDeducao
     * @param vOutro
     * @param vDescIncond
     * @param vDescCond
     * @param vISSRet
     * @param cRegTrib
     */
    public NFeInfNFeTotalISSQNtot(String vServ, String vBC, String vISS, String vPIS, String vCOFINS, String dCompet, String vDeducao, String vOutro, String vDescIncond, String vDescCond, String vISSRet, String cRegTrib) {
        this.vServ = vServ;
        this.vBC = vBC;
        this.vISS = vISS;
        this.vPIS = vPIS;
        this.vCOFINS = vCOFINS;
        this.dCompet = dCompet;
        this.vDeducao = vDeducao;
        this.vOutro = vOutro;
        this.vDescIncond = vDescIncond;
        this.vDescCond = vDescCond;
        this.vISSRet = vISSRet;
        this.cRegTrib = cRegTrib;
    }

}
