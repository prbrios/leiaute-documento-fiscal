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

@JsonRootName("vol")
@Data
@Root(name = "vol")
public class NFeInfNFeTranspVol {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("qvol")
    @Element(name = "qVol", required = false)
    private String qVol;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("esp")
    @Element(name = "esp", required = false)
    private String esp;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("marca")
    @Element(name = "marca", required = false)
    private String marca;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("nvol")
    @Element(name = "nVol", required = false)
    private String nVol;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("pesol")
    @Element(name = "pesoL", required = false)
    private String pesoL;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("pesob")
    @Element(name = "pesoB", required = false)
    private String pesoB;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("lacres")
    @ElementList(name = "lacres", required = false, inline = true)
    private List<NFeInfNFeTranspVolLacres> lacres = new ArrayList<NFeInfNFeTranspVolLacres>();

    public NFeInfNFeTranspVol() {}

    /**
     *
     * @param qVol
     * @param esp
     * @param marca
     * @param nVol
     * @param pesoL
     * @param pesoB
     * @param lacres
     */
    public NFeInfNFeTranspVol(String qVol, String esp, String marca, String nVol, String pesoL, String pesoB, List<NFeInfNFeTranspVolLacres> lacres) {
        this.qVol = qVol;
        this.esp = esp;
        this.marca = marca;
        this.nVol = nVol;
        this.pesoL = pesoL;
        this.pesoB = pesoB;
        this.lacres = lacres;
    }

}
