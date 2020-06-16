package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@JsonRootName("encerrante")
@Root(name = "encerrante")
public class NFeInfNFeDetProdCombEncerrante {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("nbico")
    @Element(name = "nBico", required = false)
    private String nBico;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("nbomba")
    @Element(name = "nBomba", required = false)
    private String nBomba;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("ntanque")
    @Element(name = "nTanque", required = false)
    private String nTanque;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vencini")
    @Element(name = "vEncIni", required = false)
    private String vEncIni;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vencfin")
    @Element(name = "vEncFin", required = false)
    private String vEncFin;

    public NFeInfNFeDetProdCombEncerrante() {}

    /**
     *
     * @param nBico
     * @param nBomba
     * @param nTanque
     * @param vEncIni
     * @param vEncFin
     */
    public NFeInfNFeDetProdCombEncerrante(String nBico, String nBomba, String nTanque, String vEncIni, String vEncFin) {
        this.nBico = nBico;
        this.nBomba = nBomba;
        this.nTanque = nTanque;
        this.vEncIni = vEncIni;
        this.vEncFin = vEncFin;
    }

	public String getnBico() {
		return nBico;
	}

	public void setnBico(String nBico) {
		this.nBico = nBico;
	}

	public String getnBomba() {
		return nBomba;
	}

	public void setnBomba(String nBomba) {
		this.nBomba = nBomba;
	}

	public String getnTanque() {
		return nTanque;
	}

	public void setnTanque(String nTanque) {
		this.nTanque = nTanque;
	}

	public String getvEncIni() {
		return vEncIni;
	}

	public void setvEncIni(String vEncIni) {
		this.vEncIni = vEncIni;
	}

	public String getvEncFin() {
		return vEncFin;
	}

	public void setvEncFin(String vEncFin) {
		this.vEncFin = vEncFin;
	}

}
