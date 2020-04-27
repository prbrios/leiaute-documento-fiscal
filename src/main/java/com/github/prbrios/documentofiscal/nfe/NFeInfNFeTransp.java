package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;

@JsonRootName("transp")
@Data
@Root(name = "transp")
public class NFeInfNFeTransp {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("modfrete")
    @Element(name = "modFrete", required = false)
    private String modFrete;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("transporta")
    @Element(name = "transporta", required = false)
    private NFeInfNFeTranspTransporta transporta;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("rettransp")
    @Element(name = "retTransp", required = false)
    private NFeInfNFeTranspRetTransp retTransp;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("veictransp")
    @Element(name = "veicTransp", required = false)
    private NFeInfNFeTranspVeicTransp veicTransp;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("reboque")
    @ElementList(name = "reboque", required = false, inline = true)
    private List<NFeInfNFeTranspReboque> reboque = new ArrayList<NFeInfNFeTranspReboque>();

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vagao")
    @Element(name = "vagao", required = false)
    private String vagao;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("balsa")
    @Element(name = "balsa", required = false)
    private String balsa;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vol")
    @ElementList(name = "vol", required = false, inline = true)
    private List<NFeInfNFeTranspVol> vol = new ArrayList<NFeInfNFeTranspVol>();

    public NFeInfNFeTransp() {}

    /**
     *
     * @param modFrete
     * @param transporta
     * @param retTransp
     * @param veicTransp
     * @param reboque
     * @param vagao
     * @param balsa
     * @param vol
     */
    public NFeInfNFeTransp(String modFrete, NFeInfNFeTranspTransporta transporta, NFeInfNFeTranspRetTransp retTransp, NFeInfNFeTranspVeicTransp veicTransp, List<NFeInfNFeTranspReboque> reboque, String vagao, String balsa, List<NFeInfNFeTranspVol> vol) {
        this.modFrete = modFrete;
        this.transporta = transporta;
        this.retTransp = retTransp;
        this.veicTransp = veicTransp;
        this.reboque = reboque;
        this.vagao = vagao;
        this.balsa = balsa;
        this.vol = vol;
    }

}
