package com.github.prbrios.documentofiscal.nfe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@JsonRootName("reboque")
@Root(name = "reboque")
public class NFeInfNFeTranspReboque {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("placa")
    @Element(name = "placa", required = false)
    private String placa;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("uf")
    @Element(name = "UF", required = false)
    private String UF;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("rntc")
    @Element(name = "RNTC", required = false)
    private String RNTC;

    public NFeInfNFeTranspReboque() {}

    /**
     *
     * @param placa
     * @param UF
     * @param RNTC
     */
    public NFeInfNFeTranspReboque(String placa, String UF, String RNTC) {
        this.placa = placa;
        this.UF = UF;
        this.RNTC = RNTC;
    }

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getUF() {
		return UF;
	}

	public void setUF(String uF) {
		UF = uF;
	}

	public String getRNTC() {
		return RNTC;
	}

	public void setRNTC(String rNTC) {
		RNTC = rNTC;
	}

}
