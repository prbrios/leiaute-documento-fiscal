package com.github.prbrios.documentofiscal.nfe;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;

@Data
@Root(name = "vol")
public class NFeInfNFeTranspVol {

    @Element(name = "qVol", required = false)
    private String qVol;

    @Element(name = "esp", required = false)
    private String esp;

    @Element(name = "marca", required = false)
    private String marca;

    @Element(name = "nVol", required = false)
    private String nVol;

    @Element(name = "pesoL", required = false)
    private String pesoL;

    @Element(name = "pesoB", required = false)
    private String pesoB;

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
