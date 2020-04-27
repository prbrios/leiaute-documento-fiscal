package com.github.prbrios.documentofiscal.nfe.retorno;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@JsonRootName("infprot")
@Data
@Root(name = "infProt")
public class RetEnviNFeProtNFeInfProt {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("id")
    @Attribute(name = "Id", required = false)
    private String id;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("tpamb")
    @Element(name = "tpAmb", required = false)
    private String tpAmb;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("veraplic")
    @Element(name = "verAplic", required = false)
    private String verAplic;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("chnfe")
    @Element(name = "chNFe", required = false)
    private String chNFe;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("dhrecbto")
    @Element(name = "dhRecbto", required = false)
    private String dhRecbto;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("nprot")
    @Element(name = "nProt", required = false)
    private String nProt;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("digval")
    @Element(name = "digVal", required = false)
    private String digVal;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cstat")
    @Element(name = "cStat", required = false)
    private String cStat;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("xmotivo")
    @Element(name = "xMotivo", required = false)
    private String xMotivo;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cmsg")
    @Element(name = "cMsg", required = false)
    private String cMsg;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("xmsg")
    @Element(name = "xMsg", required = false)
    private String xMsg;

    public RetEnviNFeProtNFeInfProt() {}

    /**
     *
     * @param id
     * @param tpAmb
     * @param verAplic
     * @param chNFe
     * @param dhRecbto
     * @param nProt
     * @param digVal
     * @param cStat
     * @param xMotivo
     * @param cMsg
     * @param xMsg
     */
    public RetEnviNFeProtNFeInfProt(String id, String tpAmb, String verAplic, String chNFe, String dhRecbto, String nProt, String digVal, String cStat, String xMotivo, String cMsg, String xMsg) {
        this.id = id;
        this.tpAmb = tpAmb;
        this.verAplic = verAplic;
        this.chNFe = chNFe;
        this.dhRecbto = dhRecbto;
        this.nProt = nProt;
        this.digVal = digVal;
        this.cStat = cStat;
        this.xMotivo = xMotivo;
        this.cMsg = cMsg;
        this.xMsg = xMsg;
    }

}
