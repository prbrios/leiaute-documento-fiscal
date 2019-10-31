package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;

@Data
@Root(name = "transp")
public class NFeInfNFeTransp {

    @Element(name = "modFrete", required = false)
    private String modFrete;

    @Element(name = "transporta", required = false)
    private NFeInfNFeTranspTransporta transporta;

    @Element(name = "retTransp", required = false)
    private NFeInfNFeTranspRetTransp retTransp;

    @Element(name = "veicTransp", required = false)
    private NFeInfNFeTranspVeicTransp veicTransp;

    @ElementList(name = "reboque", required = false, inline = true)
    private List<NFeInfNFeTranspReboque> reboque = new ArrayList<NFeInfNFeTranspReboque>();

    @Element(name = "vagao", required = false)
    private String vagao;

    @Element(name = "balsa", required = false)
    private String balsa;

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
